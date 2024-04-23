package jdbc.object;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BoardSelect {
    // Board 객체와 boards 테이블에서
    // 'winter' 작성자가 쓴 글들을 가져와,
    // 객체로 콘솔에 출력하는 Java 코드를 작성하시오.

    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/jdbc";
        String user ="root";
        String password = "1234";

        // 동적 SQL
        String sql = "SELECT boardNO, title, content, writer, date, filename, filedata FROM boards WHERE writer = ?";

        // String sql = """
        //                SELECT boardNo, title, content, writer, date, filename, filedata
        //                FROM boards
        //                where writer = ?
        //                """;

        List<Board> boardList = new ArrayList<>();

        // 연결객체
        try (Connection conn = DriverManager.getConnection(url, user, password);) {



            // SQL 문 얻고, ? 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"winter");

            // SQL 문 실행하여 resultSet 를 통한 데이터 접근
            ResultSet rs = pstmt.executeQuery();

            // 결과 셋의 행 수가 여러개인 경우 while (rs.next())
            while (rs.next()) {
                Board board = new Board(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getString(6),
                        rs.getBlob("fileData")
                );

                // IO 스트림을 통해 파일로 저장하기
                Blob filedata = board.getFiledata();
                InputStream inputStream = filedata.getBinaryStream();
                OutputStream outputStream = new FileOutputStream("src/jdbc/object/" + board.getFilename());
                inputStream.transferTo(outputStream);
                outputStream.flush();
                outputStream.close();
                inputStream.close();


                boardList.add(board);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 출력
        boardList.forEach(System.out::println);
    }

}
