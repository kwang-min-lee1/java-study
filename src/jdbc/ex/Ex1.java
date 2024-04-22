package jdbc.ex;

import java.sql.*;

public class Ex1 {
    // 연습문제
    // scott DB 에서 10번 부서에 일하는 직원의 이름과 직무, 연봉을 조회하여 출력하세요

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";     // 사용자이름
        String password = "1234"; // 비밀번호

        String query = "SELECT ename,job,sal FROM emp " + "WHERE deptno = 10";  // emp " 뒤에 반드시 한칸 띄울것, + 는 반드시 붙일 필요 없음

        try( Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)){

            while (rs.next()){
                String ename = rs.getString(1);
                String job = rs.getString(2);
                int sal = rs.getInt(3);
                System.out.println("직원이름: " + ename + ", 직무:" + job + ", 연봉: " + sal);

                // 다른방법
                // while (rs.next()) {
                //                System.out.println("이름: " + rs.getString("ename")
                //                        + " 직무: " + rs.getString("job")
                //                        + " 연봉: " + rs.getInt("sal")
                //                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
