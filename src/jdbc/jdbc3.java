package jdbc;

import java.sql.*;

public class jdbc3 {
    // 데이터베이스 조회
    public static void main(String[] args) {
        // SQL 문 사용하기
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";     // 사용자이름
        String password = "1234"; // 비밀번호

        // 연결 객체
        Connection conn = null;
        // 실행문 객체
        Statement stmt = null;;
        // 결과문 객체
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url,user,password);

            // SQL 쿼리 실행문
            stmt = conn.createStatement();

            String sql = "SELECT * FROM emp";
            // 실행문을 실행 => 결과 셋이 반환
            rs = stmt.executeQuery(sql);

            // rs.next(): 읽어 올 행의 정보가 있으면 true, 커서를 한 행 이동
            // 없으면 false
            while (rs.next()) {
                // 결과 셋에서 ename 컬럼의 데이터를 가져옴(데이터타입이 일치해야 함)
                String ename = rs.getString("ename");
                System.out.println(ename);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 자원정리
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
