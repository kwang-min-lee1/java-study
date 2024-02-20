package access_modifier.ex.libary.management;

public class Book {
    //    Step 1: Book 클래스 정의
//    필드:
    String title; // 도서 제목
    String author; // 저자
    //    생성자:
//    초기화 메서드
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //    메서드:
//    게터 메서드 제공
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
