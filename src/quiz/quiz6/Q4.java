package quiz.quiz6;


import java.util.Arrays;
import java.util.List;

/*
여행 일정 관리

       여러분은 여행 일정을 계획하고 있습니다.
       각 여행지는 도시 이름과 방문하려는 관광지 리스트로 구성되어 있습니다.
       여러분의 목표는 중복되는 관광지를 제거하고,
       모든 도시의 관광지 리스트를 합친 뒤,
       알파벳 순으로 정렬하여 최종 여행지 리스트를 만드는 것입니다.
       스트림 API 를 사용해서 요구사항의 문제를 해결하세요.

    City 클래스의 필드와 주어지는 데이터는 다음과 같습니다.
        String name;
        List<String> attractions;

    List<City> itinerary = Arrays.asList(
    new City("서울", Arrays.asList("경복궁", "남산타워", "북촌한옥마을")),
    new City("부산", Arrays.asList("해운대", "광안리", "태종대", "남산타워")),
    new City("제주", Arrays.asList("성산일출봉", "만장굴", "북촌한옥마을"))

    요구사항:
    - 모든 도시의 관광지 리스트를 합칩니다.
    - 중복되는 관광지를 제거합니다.
    - 관광지 이름을 알파벳 순으로 정렬합니다.
    - 최종 여행지 리스트를 출력합니다.

    출력예시:
    경복궁
    광안리
    남산타워
    만장굴
    북촌한옥마을
    성산일출봉
    해운대
    태종대
 */
public class Q4 {

    static class City {
        String name;
        List<String> attractions;

        public City(String name, List<String> attractions) {
            this.name = name;
            this.attractions = attractions;
        }
    }
    public static void main(String[] args) {
        List<City> itinerary = Arrays.asList(
                new City("서울", Arrays.asList("경복궁", "남산타워", "북촌한옥마을")),
                new City("부산", Arrays.asList("해운대", "광안리", "태종대", "남산타워")),
                new City("제주", Arrays.asList("성산일출봉", "만장굴", "북촌한옥마을"))
        );

        // 모든 도시의 관광지 리스트를 합친 뒤 중복 제거
        List<String> finalList = itinerary.stream()
                .flatMap(city -> city.attractions.stream()) // 각 도시의 관광지 리스트를 스트림으로 변환하고 합침
                .distinct()  // 중복 제거
                .sorted()  // 알파벳 순으로 정렬
                .toList(); // 최종 리스트로 변환

        // 최종 여행지 리스트 출력
        finalList.forEach(System.out::println);
    }
}


