package generic.ex.ex5;


/*
다양한 미디어 타입 클래스 구현:
Media 인터페이스를 구현하는 Book, Movie, Music 클래스를 각각 정의합니다.
각 클래스는 적절한 속성(예: 저자, 감독, 아티스트)과 메소드를 가집니다.
 */

public class Movie implements Media {

    // 속성 (title, director)
    String title;
    String director;


    // 생성자를 통해 초기화
    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    // getTitle 메소드를 오버라이드하여 영화의 제목을 반환
    @Override
    public String getTitle()
    {
        return title;
    }

    @Override
    public String getDetails() {
        return "Direct: " + director;
    }

}
