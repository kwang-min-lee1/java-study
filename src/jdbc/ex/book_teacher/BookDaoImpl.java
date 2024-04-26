package jdbc.ex.book_teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {
    // 필드 : 연결 객체
    Connection conn;

    // 생성자 : 연결 객체 초기화
    public BookDaoImpl(Connection conn) {
        this.conn = conn;
    }

    // 메서드 : SQL과 연산하는 접근 메서드
    @Override
    public int insert(BookDto book) {
        String sql = "INSERT INTO books (isbn, title, author, publish_year, genre) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, book.getIsbn());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());
            pstmt.setInt(4, book.getPublishYear());
            pstmt.setString(5, book.getGenre());

            return pstmt.executeUpdate();   // 실행 후 결과 행수를 리턴

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public int update(BookDto book) {
        String sql = "UPDATE books SET title = ?, author = ?, publish_year = ?, genre = ? WHERE isbn = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getAuthor());
            pstmt.setInt(3, book.getPublishYear());
            pstmt.setString(4, book.getGenre());
            pstmt.setString(5, book.getIsbn());


            return pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public int delete(String isbn) {
        String sql = "DELETE FROM books WHERE isbn = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, isbn);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public BookDto findByIsbn(String isbn) {
        String sql = "SELECT isbn, title, author, publish_year, genre FROM books WHERE isbn = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, isbn);
            ResultSet rs = pstmt.executeQuery();

            // 1개 행일 때 if
            if (rs.next()) {
                return new BookDto(
                        rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public List<BookDto> findByTitle(String title) {
        List<BookDto> books = new ArrayList<>();
        String sql = "SELECT isbn, title, author, publish_year, genre FROM books WHERE title LIKE ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setString(1, "%" + title + "%");
            ResultSet rs = pstmt.executeQuery();
            // 결과가 여러 행일 때는 while 문으로 list에 담아줌.
            while (rs.next()) {
                BookDto book = new BookDto(
                        rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );
                books.add(book);    // 추가
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return books;       // List를 반환
    }

    @Override
    public List<BookDto> findByAuthorOrTitle(String keyword) {
        List<BookDto> books = new ArrayList<>();
        String sql = "SELECT isbn, title, author, publish_year, genre FROM books WHERE author LIKE ? OR title LIKE ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "%" + keyword + "%");
            pstmt.setString(2, "%" + keyword + "%");
            ResultSet rs = pstmt.executeQuery();
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

        return books;
    }

    @Override
    public List<BookDto> findByAll() {
        List<BookDto> books = new ArrayList<>();
        String sql = "SELECT isbn, title, author, publish_year, genre FROM books";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
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
        return books;
    }
}
