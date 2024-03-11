package generic.ex.ex5;

public class Ex5 {
     /*
    연습 문제: 제네릭 와일드카드를 활용한 미디어 정보 출력

    미디어 라이브러리에 저장된 다양한 타입의 미디어(예: 책, 영화) 정보를 출력하는 유틸리티 메소드를 구현합니다.
    이 메소드는 제네릭 와일드카드를 사용하여, Media 인터페이스를 구현하는 어떠한 타입의 객체 컬렉션도 처리할 수 있어야 합니다.

    미디어 인터페이스 및 구현체 정의:
    Media 인터페이스와 이를 구현하는 Book 및 Movie 클래스는
    이전 문제에서 작성한 것을 활용합니다.

    미디어 정보 출력 메소드 구현:
    printMediaDetails 라는 이름의 static 메소드를 구현합니다.
    이 메소드는 List<? extends Media> 타입의 매개변수를 받고,
    리스트 내의 모든 미디어 정보를 출력합니다.

    Media 인터페이스에는 getTitle() 메소드가 정의되어 있으며,
    Book과 Movie 클래스는 각각의 추가 정보(예: 저자, 감독)를
     출력할 수 있는 메소드를 가지고 있습니다


    /main
        public static void main(String[] args) {
            List<Media> myMediaList = new ArrayList<>();
            myMediaList.add(new Book("1984", "George Orwell"));
            myMediaList.add(new Movie("The Matrix", "Lana and Lilly Wachowski"));

            printMediaDetails(myMediaList);
        }
    }


    출력예시
    ===
    Title: 1984
    Author: George Orwell

    Title: The Matrix
    Director: Lana and Lilly Wachowski

    // 힌트 : 두가지 방법
    1. 조건문과 instanceof 를 활용하는 방법
    2. 인터페이스 추상 메서드와 오버라이딩 메서드을 추가하는 방법
     */
}
