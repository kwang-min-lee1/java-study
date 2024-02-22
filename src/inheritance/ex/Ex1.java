package inheritance.ex;

public class Ex1 {
    /*
    1.  온라인 도서관 시스템 구현

    요구사항
    온라인 도서관 시스템을 위해 여러 유형의 도서를 관리하는 자바 프로그램을 작성합니다.
    이 시스템은 일반 도서(Book)와 참고서(ReferenceBook)를 다루며,
    도서의 본 정보를 상속받아야 합니다.

    Book 클래스:
    공통 필드: title (도서 제목), author (저자), year (출판 연도)
    메소드: displayInfo() - 도서 정보(제목, 저자, 출판 연도)를 출력

    ReferenceBook(참고서) 클래스:
    Book 클래스로부터 상속받습니다.
    추가 필드: field (참고서 분야, 예: "과학", "수학")
    displayInfo() 메소드를 오버라이딩하여, 참고서의 경우 추가적으로 분야도 출력합니다.

    Main 클래스:
    main 메소드에서 다음을 수행합니다:
    일반 도서와 참고서 객체를 각각 생성합니다.
    생성된 모든 도서의 정보를 출력합니다.

    출력 예시
    ===
    Title: The Lord of the Rings, Author: J.R.R. Tolkien, Year: 1954
    Title: Math Handbook, Author: John Doe, Year: 1999, Field: Mathematics
     */
    public static void main(String[] args) {
        Book book = new Book("반지의 제왕", "톨킨", 1954);
        ReferenceBook referenceBook = new ReferenceBook("수학 참고서", "존 도", 1999, "수학");

        book.displayInfo();
        referenceBook.displayInfo();
    }
}
