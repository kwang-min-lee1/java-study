package generic.ex.ex5;


import generic.ex.ex4.Book;
import generic.ex.ex4.MediaLibrary;
import generic.ex.ex4.Movie;
import generic.ex.ex4.Music;

// 각각의 미디어 라이브러리를 생성하고, 책과 영화를 추가한 후 제목을 출력
// 각 라이브러리는 MediaLibrary 클래스를 사용하여 다양한 미디어 항목을 관리
// 미디어 항목의 구체적인 타입은 제네릭으로 지정된다.
public class Main {
    public static void main(String[] args) {
        MediaLibrary<generic.ex.ex4.Book> bookLibrary = new MediaLibrary<>();
        bookLibrary.addMedia(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        MediaLibrary<Movie> movieLibrary = new MediaLibrary<>();
        movieLibrary.addMedia(new Movie("Inception", "Christopher Nolan"));

        MediaLibrary<Music> musicLibrary = new MediaLibrary<>();
        musicLibrary.addMedia(new Music("밤양갱", "비비"));

        System.out.println("Books:");
        bookLibrary.printMediaTitles();

        System.out.println("Movies:");
        movieLibrary.printMediaTitles();

        System.out.println("Music:");
        musicLibrary.printMediaTitles();
    }
}
