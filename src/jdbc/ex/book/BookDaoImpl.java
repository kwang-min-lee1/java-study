package jdbc.ex.book;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


// DAO 인터페이스 구현 객체
public class BookDaoImpl implements BookDao{
    // 필드
    Connection conn;

    // DAO 생성과 동시에 접근 객체 생성
    // 생성자
    public BookDaoImpl(Connection conn) {
        this.conn = DatabaseUtil .getconnection();
    }

    // 메서드 : SQL과 연산하는 접근 메서드
    @Override
    public void insert(BookDto book) {
        String sql ="INSERT INTO books (isbn,title,author,publish_year,genre) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, book.getIsbn());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());
            pstmt.setInt(4,book.getPublish_year());
            pstmt.setString(5, book.getGenre());
            pstmt.executeUpdate();

            // 리소스 정리
            pstmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public BookDto getBookByIsbn(String isbn) {
        String sql ="SELECT isbn,title,author,publish_year,genre FROM books WHERE isbn =?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,isbn);
            ResultSet rs = pstmt.executeQuery();

            // 결과가 1개 행일때는 if
            if (rs.next()) {
                return new BookDto(
                        rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );
            }
            pstmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void update(BookDto book) {
        String sql ="UPDATE books SET title = ?, author = ?, publish_year = ?, genre = ? WHERE isbn = ?";
        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getAuthor());
            pstmt.setInt(3,book.getPublish_year());
            pstmt.setString(4, book.getGenre());
            pstmt.setString(5, book.getIsbn());
            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    @Override
    public void delete(String isbn) {
        String sql = "DELETE FROM books WHERE isbn = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,isbn);
            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<BookDto> getAllBooks() {
        // 데이터를 전달할 객체 리스트(빈 컬렉션) 생성
        List<BookDto> books = new ArrayList<>();
        String sql ="SELECT * FROM books";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            // 여러개의 SQL 문 결과 셋 반복(커서이동)
            // 결과가 여러행일때는 while문
            while (rs.next()) {
                BookDto book = new BookDto(
                        rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );
                books.add(book);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //  결과 셋을 담은 컬렉션을 반환

        return books;
    }
}
