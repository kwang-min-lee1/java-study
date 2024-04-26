package jdbc.ex.book_teacher;

import java.util.List;
import java.util.Scanner;

public class BookMain {
    private static Scanner scanner = new Scanner(System.in); // 사용자 입력
    private static BookDao bookDao;                          // DB 접근
    private static boolean isRun = true;                     // 실행 여부

    public static void main(String[] args) {
        // DB 연결
        bookDao = new BookDaoImpl(DatabaseUtil.getConnection());

        while (isRun) {
            System.out.println("""
                            ### 도서 관리 시스템 ###
                            1. 도서 추가
                            2. 도서 삭제
                            3. 도서 수정
                            4. 도서 조회
                            5. 종료
                            """
            );
            System.out.print("메뉴선택: ");
            String menu = scanner.nextLine();
            switch (menu) {
                case "1" -> insert();
                case "2" -> delete();
                case "3" -> update();
                case "4" -> find();
                case "5" -> isRun = false;
            }
        }

        // DB 연결 종료
        DatabaseUtil.close();
    }

    private static void find() {
        System.out.print("1. 도서 목록 조회 | 2. ISBN 조회 | 3. 저자 또는 제목 조회 > ");
        String menu = scanner.nextLine();
        switch (menu) {
            case "1" -> bookDao.findByAll().forEach(System.out::println);
            case "2" -> {
                System.out.print("검색할 ISBN을 입력하세요 : ");
                String id = scanner.nextLine();
                BookDto book = bookDao.findByIsbn(id);
                System.out.println(book);
            }
            case "3" -> {
                System.out.print("검색할 저자를 입력하세요 : ");
                String keyword = scanner.nextLine();
                List<BookDto> books = bookDao.findByAuthorOrTitle(keyword);
                if (books.isEmpty()) {
                    System.out.println("도서를 찾을 수 없습니다.");
                } else {
                    books.forEach(System.out::println);
                }
            }
        }


    }

    private static void update() {
        System.out.println("[도서 수정]");

        System.out.print("수정할 도서 ISBN 입력: ");
        String isbn = scanner.nextLine();
        BookDto book = bookDao.findByIsbn(isbn);

        if (book == null) {
            System.out.println("존재하지 않는 도서입니다.");
        } else {

            System.out.print("새 제목 입력: ");
            String title = scanner.nextLine();
            if (!title.isEmpty()) book.setTitle(title);

            System.out.print("새 저자 입력: ");
            String author = scanner.nextLine();
            if (!author.isEmpty()) book.setAuthor(author);

            System.out.print("새 출판년도 입력: ");
            String publishYear = scanner.nextLine();
            if (!publishYear.isEmpty()) book.setPublishYear(Integer.parseInt(publishYear));

            System.out.print("새 장르 입력: ");
            String genre = scanner.nextLine();
            if (!genre.isEmpty()) book.setGenre(genre);

            BookDto bookDto = new BookDto(isbn, title, author, Integer.parseInt(publishYear), genre);

            if (bookDao.update(bookDto) > 0) {
                System.out.println("도서 정보가 업데이트되었습니다.");
            } else {
                System.out.println("업데이트에 실패하였습니다.");
            }
        }

    }

    private static void delete() {
        System.out.print("삭제할 도서의 ISBN 입력: ");
        String isbn = scanner.nextLine();
        if (bookDao.delete(isbn) == 1) {
            System.out.println("도서가 삭제되었습니다.");
        } else {
            System.out.println("삭제할 도서를 찾을 수 없습니다.");
        }
    }

    private static void insert() {
        System.out.println("[도서 추가]");

        System.out.print("ISBN 입력: ");
        String isbn = scanner.nextLine();
        System.out.print("제목 입력: ");
        String title = scanner.nextLine();
        System.out.print("저자 입력: ");
        String author = scanner.nextLine();
        System.out.print("출판년도 입력: ");
        int publishYear = Integer.parseInt(scanner.nextLine());
        System.out.print("장르 입력: ");
        String genre = scanner.nextLine();

        BookDto bookDto = new BookDto(isbn, title, author, publishYear, genre);

        if (bookDao.insert(bookDto) > 0) {
            System.out.println("도서가 추가되었습니다.");
        }
    }
}
