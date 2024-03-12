package generic.ex.ex5;

/*
다양한 미디어 타입 클래스 구현:
Media 인터페이스를 구현하는 Book, Movie, Music 클래스를 각각 정의합니다.
각 클래스는 적절한 속성(예: 저자, 감독, 아티스트)과 메소드를 가집니다.
 */


public class Music implements Media {
    private String title;
    String artist;



    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDetails() {
        return "Artist : " + artist;
    }

}
