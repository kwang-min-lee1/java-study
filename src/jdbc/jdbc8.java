package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class jdbc8 {
    public static void main(String[] args) {
        // 게시판 테이블에 INSERT

        // 접속정보(jdbc 스키마)
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";     // 사용자이름
        String password = "1234"; // 비밀번호

        // 여러줄 문자열을 줄바꿈 문자나 들여쓰기에 민감하지 않게 작성할 수 있는 문자열
        // 일반적인 이스케이프 문자를 사용하지 않아도 됨. (자바 구버전에는 사용불가)
        String sql = """
                INSERT INTO boards (title, content, writer, filename, filedata)
                VALUES (?,?,?,?,?)
                """;

        // 연결
        try (Connection conn = DriverManager.getConnection(url, user, password);){

            // 두번째 매개값에 생성된 Key 를 리턴
            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1,"눈 오는 날");
            pstmt.setString(2,"함박 눈이 내리네요");
            pstmt.setString(3,"winter");
            pstmt.setString(4,"snow.jpg");
            pstmt.setBlob (5, new FileInputStream("src/jdbc/snow.jpg"));

            // SQL 문 실행 => 실행 결과 행 수를 리턴
            int rows = pstmt.executeUpdate();

            // 성공적으로 수행되었을 경우
            if (rows == 1) {
                // 실행문 결과로 생성된 키값이 반환
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    int boardNO = rs.getInt(1);
                    System.out.println(boardNO  + "번 글이 입력되었습니다.");
                }
                rs.close();
            }

            pstmt.close();
        } catch (SQLException e) {
            System.out.println("예외발상 " + e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
