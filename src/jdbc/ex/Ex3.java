package jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex3 {
     /*
    연습문제 : 사용자 정보 업데이트
    요구사항: 사용자로부터 userId, username, password, age, email 을 입력받아
    해당 userId를 가진 사용자의 정보를 업데이트하세요. (userId 그대로 두고 다른 사항을 수정)

    사용자로부터 다음 정보를 입력받습니다:
    userId: 업데이트할 사용자 ID
    username: 새 사용자 이름
    password: 새 비밀번호
    age: 새 나이
    email: 새 이메일 주소
    입력받은 정보를 데이터베이스의 users 테이블에 업데이트합니다.
     */

     public static void main(String[] args) {

         // 접속정보(jdbc 스키마)
         String url = "jdbc:mysql://localhost:3306/jdbc";
         String user = "root";     // 사용자이름
         String password = "1234"; // 비밀번호
         Scanner scanner = new Scanner(System.in);

         // 사용자 정보 입력받기
         System.out.println("userId 를 입력하세요: ");
         String userId = scanner.nextLine();
         System.out.println("username 을 입력하세요: ");
         String username = scanner.nextLine();
         System.out.println("userPassword 를 입력하세요: ");
         String userPassword = scanner.nextLine();
         System.out.println("userAge 를 입력하세요: ");
         int userAge = scanner.nextInt();
         scanner.nextLine();   // 엔터를 입력하게 되어 자동으로 넘어가니, 개행을 임의로 넣어서 입력전에 넘어가는 것을 방지.
         System.out.println("userEmail 를 입력하세요: ");
         String userEmail = scanner.nextLine();

         // 쿼리문
         String sql = new StringBuilder()
                 .append("UPDATE users SET ")  // 고정적인 부분  -> userId 까지 변경할 경우는 'UPDATE' 가 아니라 'INSERT'
                 .append("userId = ?, " )      // 동적인 부분
                 .append("username = ?, " )
                 .append("password = ?, " )
                 .append("age = ?, " )
                 .append("email = ? " )
                 .append("WHERE userId = ? " )  // 최종조건 고정
                 .toString();  // sql 문장 준비

         System.out.println(sql);
         try(Connection conn = DriverManager.getConnection(url, user, password);){
             PreparedStatement pstmt = conn.prepareStatement(sql);

             // 동적인 값을 부여
             pstmt.setString(1,userId);
             pstmt.setString(2,username);
             pstmt.setString(3,userPassword);
             pstmt.setInt(4,userAge);
             pstmt.setString(5,userEmail);

             pstmt.setString(6, userId);     // 게시물번호 1번 수정

             // SQL 문 실행
             int rows = pstmt.executeUpdate();

             System.out.println("rows = " + rows);
             if (rows == 1) {
                 System.out.println(rows + "개 행이 수정되었습니다.");
             }

             pstmt.close();

         } catch (SQLException e) {
             throw new RuntimeException(e);
         }


     }
}
