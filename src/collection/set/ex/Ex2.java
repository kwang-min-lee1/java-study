package collection.set.ex;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Ex2 {
     /*
    연습문제. 고유 도시 이름 집합 만들기

    사용자로부터 여러 도시 이름을 입력받아,
    입력된 도시 이름 중 고유한 도시 이름만을 저장하고 출력하는,
    간단한 콘솔 프로그램을 작성합니다

    요구 사항
    - 사용자로부터 도시 이름을 계속해서 입력받습니다. 사용자가 "종료"라고 입력하면 입력을 중단합니다.
    - 입력받은 도시 이름 중 고유한 이름만을 저장하기 위해 HashSet 을 사용합니다.
    - 모든 입력이 끝나면, 입력된 고유한 도시 이름들을 출력합니다.
    - 프로그램은 대소문자를 구분하지 않아야 합니다. 예를 들어, "Seoul"과 "seoul"은 동일한 도시로 간주합니다.

    출력 예시
    ===
    도시 이름을 입력하세요 (종료하려면 '종료' 입력):
    Seoul
    도시 이름을 입력하세요 (종료하려면 '종료' 입력):
    New York
    도시 이름을 입력하세요 (종료하려면 '종료' 입력):
    London
    도시 이름을 입력하세요 (종료하려면 '종료' 입력):
    seoul
    도시 이름을 입력하세요 (종료하려면 '종료' 입력):
    Tokyo
    도시 이름을 입력하세요 (종료하려면 '종료' 입력):
    종료
    고유한 도시 이름 목록:
    Seoul
    New York
    London
    Tokyo

     */
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         // 중복 제거 도시
         Set<String> citySet = new HashSet<>();


         while (true) {
             System.out.println("도시 이름을 입력하세요 (종료하려면 '종료' 입력):");
             String city = scanner.nextLine();

             if (city.equals("종료")) break;

             citySet.add(city.toLowerCase());
         }

         for (String city : citySet) {
             System.out.println(city.substring(0, 1).toUpperCase()
                             // 첫 글자는 대문자로 출력
                             + city.substring(1).toLowerCase()
                     // 두번째 글자부터는 소문자
             );
         }
     }
}
