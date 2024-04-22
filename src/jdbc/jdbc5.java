package jdbc;

import java.sql.*;

public class jdbc5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";     // 사용자이름
        String password = "1234"; // 비밀번호

        try
                (Connection conn = DriverManager.getConnection(url, user, password);  // 1. 연결
                 Statement stmt = conn.createStatement();                              // 2. 쿼리 생성
                 ResultSet rs = stmt.executeQuery("SELECT * FROM no_table")){           // 3. 실행

        } catch (SQLException e) {
            // 예외에 관한 상세한 메시지 반환
            String message = e.getMessage();
            System.out.println("예외 메세지 = " + message);
            // 표준 오류코드 문자열
            System.out.println("오류 상태:" + e.getSQLState());
            // 특정 DBMS 에러코드
            System.out.println("MySQL 에러코드: " + e.getErrorCode());

            System.out.println("여러 종류 에러가 있을 떄 다음 에러: " + e.getNextException());
        }
    }

}
