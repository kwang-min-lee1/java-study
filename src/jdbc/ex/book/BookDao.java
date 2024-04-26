package jdbc.ex.book;

import java.awt.*;
import java.util.List;

public interface BookDao {
    // 책과 관련된 DB 연산 정의
    // 책의 정보를 가지고 있는 BookDto 를 넘겨받아서
    // DB 테이블에 추가, 조회, 수정, 삭제등을 진행

    // CRUD
    void insert (BookDto book);  // 데이터 생성  -> 결과값이 없다
    BookDto getBookByIsbn(String isbn); // ISBN (국제표준도서번호)로 조회  ->  결과값이 있고, 결과값이 하나

    void update(BookDto book);  // 데이터 수정

    void delete(String isbn); // 식별자로 삭제   ->  결과값이 없다. / 식별자만 있으면 지울수 있으므로  매개변수를 isbn
    List<BookDto> getAllBooks(); // 도서 젠체 목록  -> 결과값이 있고, 결과값이 여러개 (리스트)
}
