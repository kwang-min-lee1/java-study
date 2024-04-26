package jdbc.ex.book_teacher;

import java.util.List;

public interface BookDao {
    int insert(BookDto book);       // Create : 리턴타입 정수 (결과 행수)
    int update(BookDto book);
    int delete(String isbn);
    BookDto findByIsbn(String isbn);        // SELECT (ID, 식별자) => 1행
    List<BookDto> findByTitle(String title);    // 제목 => 1행 or 여러행
    List<BookDto> findByAuthorOrTitle(String keyword);
    List<BookDto> findByAll();              // 여러행
}
