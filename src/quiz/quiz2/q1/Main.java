package quiz.quiz2.q1;

public class Main {
    public static void main(String[] args) {

        // 일반 도서 객체 생성
        Book book = new Book("The Lord of the Rings, Author","J.R.R.Tolkien",1954);

        // 참고서 객체 생성
        ReferenceBook referenceBook = new ReferenceBook("Math Handbook","John Doe",1999,"Mathematics");

        // 도서 정보 출력
        book.displayInfo();
        referenceBook.displayInfo();
    }
}
