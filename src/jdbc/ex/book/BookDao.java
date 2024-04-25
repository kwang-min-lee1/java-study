package jdbc.ex.book;

import java.awt.*;
import java.util.List;

public interface BookDao {
    // 책과 관련된 DB 연산 정의
    // 책의 정보를 가지고 있는 BookDto 를 넘겨받아서
    // DB 테이블에 추가, 조회, 수정, 삭제등을 진행

    // CRUD
    void insert (BookDto book);  // 데이터 생성
    BookDto getBookByIsbn(String isbn); // ISBN (국제표준도서번호)로 조회

    void update(BookDto book);  // 데이터 수정

    void delete(String isbn); // 식별자로 삭제
    List<BookDto> getAllBooks(); // 도서 젠체 목록
}
