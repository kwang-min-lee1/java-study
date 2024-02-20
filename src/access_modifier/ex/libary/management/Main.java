package access_modifier.ex.libary.management;

public class Main {
    public static void main(String[] args) {
//        Library 객체 생성
        Library library = new Library(10);
//        Book 객체 여러 개 생성
        Book book1 = new Book("노인과바다", "어니스트 헤밍웨이");
        Book book2 = new Book("클린코드", "로버트 C. 마틴");
//        생성된 Book 객체들을 Library에 추가
        library.addBook(book1);
        library.addBook(book2);
//        Library에 있는 모든 도서 목록 출력
        library.listBooks();
    }
}
