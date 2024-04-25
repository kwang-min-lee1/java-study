package jdbc.ex.book;


import java.util.List;
import java.util.Scanner;

// 메인 실행계층에서는 데이터 접근과 관련된 모든 코드를 DAO 에 위임
// 전체 구조:   사용자 <-> DTO <-> DAO <-> 데이터베이스
public class BookMain {
    private static Scanner scanner = new java.util.Scanner(System.in);
    private static BookDao bookDao;

    public static void main(String[] args) {

        // DAO 연결 객체 초기화
        bookDao = new BookDaoImpl(DatabaseUtil.getconnection());

        // 데이터베이스 접근 객체 생성
        while (true) {
            System.out.println("### 도서 관리 시스템 ###");
            System.out.print(" 1. 도서 추가 \n 2. 도서 삭제 \n 3. 도서 수정 \n 4. 도서 조회 \n 5. 종료  > ");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1" -> insert();
                case "2" -> delete();
                case "3" -> update();
                case "4" -> select();
                case "5" -> {
                    DatabaseUtil.close();
                    ;
                    return;
                }  //연결자원 정리

            }
        }


//            // 전제 조회
//            List<BookDto> allBooks = bookDao.getAllBooks();
//            System.out.printf("%-10s %-15s %-30s %-45s %-60 \n","ISBN", "제목", "저자","출판년도","장르");
//            System.out.println("----------------------------------------------");
//            for (BookDto book : allBooks) {
//                System.out.printf("%-10s %-15s %-30s %-45s %-60\n",
//                        book.getIsbn(), book.getTitle(), book.getAuthor()), book.getPublish_year(), book.getGenre());
//            }
//
//        }
    }

    private static void select() {
        // Select 메서드 구현
        // 도서 조회
        System.out.println("[도서 조회]");
        System.out.println("조회할 도서의 ISBN 입력: ");
        String isbn = scanner.nextLine();
        BookDto book = bookDao.getBookByIsbn(isbn);
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("title: " + book.getTitle());
        System.out.println("author: " + book.getAuthor());
        System.out.println("publish_year: " + book.getPublish_year());
        System.out.println("genre: " + book.getGenre());
    }

    private static void update() {
        // Update 메서드 구현
        // 도서 수정
        System.out.println("[도서 수정]");
        System.out.println("수정할 도서의 ISBN 입력: ");
        String isbn = scanner.nextLine();
        // 수정하기 위해서는 기존 정보가 필요 => SELECT 로 조회
        BookDto book = bookDao.getBookByIsbn(isbn);

        if (book != null) {
            System.out.println("수정할 도서의 제목을 입력하세요: ");
            String title = scanner.nextLine();
            if (!title.isEmpty()) book.setTitle(title);

            System.out.println("수정할 도서의 저자를 입력하세요: ");
            String author = scanner.nextLine();
            if (!author.isEmpty()) book.setAuthor(author);

            System.out.println("수정할 도서의 출판년도를 입력하세요: ");
            String publish_year = scanner.nextLine();
            if (!publish_year.isEmpty()) book.setPublish_year(Integer.parseInt(publish_year));

            System.out.println("수정할 도서의 장르를 입력하세요: ");
            String genre = scanner.nextLine();
            if (!genre.isEmpty()) book.setGenre(genre);

            bookDao.update(book); // 데이터베이스 접근 위임

            System.out.println("도서 정보가 변경되었습니다.");

        } else {
            System.out.println("존재하지 않는 도서입니다. ");
        }
    }

    private static void delete() {
        // delete 메서드 구현
        // 도서 삭제
        System.out.println("[도서 삭제]");
        System.out.println("삭제할 도서의 ISBN 입력: ");
        String isbn = scanner.nextLine();

        if (bookDao.getBookByIsbn(isbn) != null) {
            bookDao.delete(isbn);
            System.out.println("도서가 삭제되었습니다.");
        } else {
            System.out.println("존재하지 않는 도서입니다.");
        }
    }


    private static void insert() {
        // insert 메서드 구현
        // 도서 추가
        System.out.println("[도서추가]");
        System.out.println("ISBN 입력: ");
        String isbn = scanner.nextLine();
        System.out.println("제목 입력: ");
        String title = scanner.nextLine();
        System.out.println("저자 입력: ");
        String author = scanner.nextLine();
        System.out.println("출판년도 입력: ");
        int publish_year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("장르 입력: ");
        String genre = scanner.nextLine();
        System.out.println("도서가 추가되었습니다.");

        //DTO 갹채 생성
        BookDto bookDto = new BookDto(isbn, title, author, publish_year, genre);

        // 데이터 접근은 DAO 에게 위임
        bookDao.insert(bookDto);
    }

}
