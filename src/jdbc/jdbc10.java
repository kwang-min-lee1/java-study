package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// 삭제 DELETE
public class jdbc10 {
    public static void main(String[] args) {
        // 접속정보(jdbc 스키마)
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";     // 사용자이름
        String password = "1234"; // 비밀번호

        String sql = "DELETE FROM boards WHERE boardNO = ?";

        try(Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setInt(1, 2);

            // 실행 및 행 개수 반환
            int rows = pstmt.executeUpdate();

            if (rows == 1) {
                System.out.println(rows + "개 행이 삭제되었습니다.");
            }


        } catch (SQLException e) {
            System.out.println("SQL 예외 발생 : " + e.getMessage());
        }

    }

}
