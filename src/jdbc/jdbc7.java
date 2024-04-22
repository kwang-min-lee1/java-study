package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc7 {
    // Insert 삽입   -> 이 경우는 ResultSet 사용하지 않음
    public static void main(String[] args) {
        // 접속정보(jdbc 스키마)
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";     // 사용자이름
        String password = "1234"; // 비밀번호

        // 연결
        try (Connection conn = DriverManager.getConnection(url, user, password);){
            String sql = """
                    INSERT INTO users (userId, userName, password, age, email)
                    VALUES(?,?,?,?,?)
                    """;                    // -> """ 문자열 ? """ 방식은, 한줄씩 내려써도 한줄의 문자열로 인식되도록 작성하는 방법  -
                                            // -> " 문자열 " 방식으로, 한줄로 이어서 쓰는것도 가능
                                            // ->  ? 부분을 동적으로 표현, setString 을 이용하여 순서대로 넣는 것 가능

            // ? 위치 =  Index, 값은 타입에 맞게 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"spring");
            pstmt.setString(2,"봄");
            pstmt.setString(3,"12345");
            pstmt.setInt(4,30);
            pstmt.setString(5,"spring@abc.com");

            // 쿼러 실행 + 쿼리가 실행되었을 떄, 행 수를 리턴
            // 정상적으로 실행될 경우 1을 리턴
            int rows =  pstmt.executeUpdate();
            System.out.println("rows = " + rows);
            
            pstmt.close();  // 자원 정리

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
