package jdbc.sqlinjection;

import java.sql.*;
import java.util.Scanner;

public class LoginStatement {
    // 로그인 상황 만들기
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";
        Scanner scanner = new Scanner(System.in);
        System.out.println("[로그인]");

        //  정상적인 로그인 시도, 비정상적인 로그인 anything
        System.out.println("아이디를 입력하세요");
        String userId = scanner.nextLine();
        // 비정상적인 SQL 인젝션: abcd' OR 'x'='x  => OR 조건 SQL 문으로 인식하고 로그인 성공
        System.out.println("패스워드를 입력하세요");
        String userPassword = scanner.nextLine();

        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement()
        ) {
            // PrepareStatement 가 아닌 Statement 로 매개변수가 있는 쿼리문을 작성할 경우
            // SELECT * FROM users WHERE userId = '?' AND password = '?'
            String sql = "SELECT * FROM users WHERE userId = '" +
                    userId + "' AND password = '" +
                    userPassword + "'";

            // 정상적 입력: SELECT * FROM users WHERE userId = 'winter' AND password = '12345'
            // 사용자가 비밀번호 입력란에 abcd' OR 'x'='x 라고 입력했을 경우
            // SQL 인젝션 공격
            // SELECT * FROM users WHERE userId = 'anythig' AND password = 'abcd' OR 'x'='x'

            // Statement 에서 매개변수를 받아 작성할 경우, SQL 인젝션 공격의 위험성이 높다.

            // 완성된 SQL 문을 실행하고,
            ResultSet rs = stmt.executeQuery(sql);

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
