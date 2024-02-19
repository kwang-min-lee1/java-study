package class1.ex;

public class Book {
    //    Book 클래스를 설계해주세요.
//
//            필드:
//    title (제목): String 타입
//    author (저자): String 타입
//    isbn (국제표준도서번호): String 타입
//    isAvailable (대여 가능 여부): boolean 타입

    String title;
    String author;
    String isbn;
    boolean isAvailable;

    //    생성자:
//    모든 필드를 매개변수로 받아 초기화하는 생성자를 작성하세요.
//            title, author만 매개변수로 받아 초기화하는 생성자를 작성하세요.
//
    public Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    //    메서드:
    //    borrowBook(): 이 메서드는 도서의 대여 가능 여부(isAvailable)를 확인하고, 도서를 대여할 수 있다면 isAvailable을 false로 변경하고 true를 반환합니다. 이미 대여 중이라면 false를 반환합니다.
    //            returnBook(): 도서를 반납하고 isAvailable을 true로 변경합니다.
    //            printInfo(): 현재 도서의 상태정보를 출력하는 메서드를 만들어보세요.
    void borrowBook() {

    }
    void returnBook() {

    }
    void printInfo() {

    }
}
