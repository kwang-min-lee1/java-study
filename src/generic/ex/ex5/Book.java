package generic.ex.ex5;

/*
다양한 미디어 타입 클래스 구현:
Media 인터페이스를 구현하는 Book, Movie, Music 클래스를 각각 정의합니다.
각 클래스는 적절한 속성(예: 저자, 감독, 아티스트)과 메소드를 가집니다.
 */
public class Book implements Media {

    // 속성 (title, author)
    String title;
    String author;

    // 생성자를 통해 초기화
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // getTitle 메소드를 오버라이드하여 책의 제목을 반환
    @Override
    public String getTitle() {

        return title;
    }

    @Override
    public String getDetails() {
        return "Author: " + author;
    }

}
