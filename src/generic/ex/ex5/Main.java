package generic.ex.ex5;

import java.util.ArrayList;
import java.util.List;

// 각각의 미디어 라이브러리를 생성하고, 책과 영화를 추가한 후 제목을 출력
// 각 라이브러리는 MediaLibrary 클래스를 사용하여 다양한 미디어 항목을 관리
// 미디어 항목의 구체적인 타입은 제네릭으로 지정된다.
public class Main {
    public static void main(String[] args) {

        List<Media> myMediaList = new ArrayList<>();
        myMediaList.add(new Book("1984", "George Orwell"));
        myMediaList.add(new Movie("The Matrix", "Lana and Lilly Wachowski"));

        List<Book> myBookList = new ArrayList<>();
        myBookList.add(new Book("메밀꼿 필 무렵","황순원"));
        myBookList.add(new Book("노인과 바다", "헤밍웨이"));

        printMediaDetails(myMediaList);
        printMediaDetails(myBookList);
    }

    private static void printMediaDetails(List<? extends Media> myMediaList) {

        // 객체 지향적인 방법
        for (Media media : myMediaList) {
            System.out.println("Title: = " + media.getTitle());
            System.out.println(media.getDetails());
            System.out.println();

        }
        /*
        // instanceof 로 타입 체크하는 방법
        for (Media media : myMediaList) {
            System.out.println("Title = " + media.getTitle());
            // 책이면 author
            if (media instanceof Book) {
                System.out.println("Author : " + ((Book)media).author); // 영화면 director
            } else if (media instanceof Movie) {
                System.out.println("Director: = " + ((Movie) media).director);
            }
            System.out.println();
            */

    }

}
