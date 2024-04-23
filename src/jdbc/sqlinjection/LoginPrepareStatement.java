package jdbc.sqlinjection;

import java.sql.*;
import java.util.Scanner;

public class LoginPrepareStatement {
    // 로그인 상황 만들기
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";
        Scanner scanner = new Scanner(System.in);
        System.out.println("[로그인");
        System.out.println("아이디를 입력하세요");
        String userId = scanner.nextLine();
        System.out.println("패스워드를 입력하세요");
        String userPassword = scanner.nextLine();

        // PrepareStatement 로 매개변수가 있는 쿼리문을 작성할 경우
        String sql = "SELECT * FROM users WHERE userId = '?' AND password = '?'";

        try(Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            // SQL 인젝션 공격
            // SELECT * FROM users WHERE userId = 'anythig' AND password = 'abcd' OR 'x'='x'
            // 비밀번호 입력란에 abcd' OR 'x'='x 을 입력해도 안전

            pstmt.setString(1, userId);
            pstmt.setString(2, userPassword);

            // 완성된 SQL 문을 실행하고,
            ResultSet rs = pstmt.executeQuery();

            // 결과 셋이 있을 경우(ID, PASSWORD 일치할 경우) 로그인
            // 아닐 경우 실패
            if (rs.next()) {
                System.out.println("성공적으로 로그인 되었습니다.");
            } else {
                System.out.println("로그인에 실패하였습니다.");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
