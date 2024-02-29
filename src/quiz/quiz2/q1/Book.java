package quiz.quiz2.q1;

/*
Book 클래스:
    공통 필드: title (도서 제목), author (저자), year (출판 연도)
    메소드: displayInfo() - 도서 정보(제목, 저자, 출판 연도)를 출력
 */
public class Book {

    // 공통 필드
    protected String title;
    protected  String author;
    protected int year;

    // 생성자
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // 출력 메소드
    public  void displayInfo(){
        System.out.println("제목: " + title + "저자:" + author + "출판연도: " + year);
    }
}
