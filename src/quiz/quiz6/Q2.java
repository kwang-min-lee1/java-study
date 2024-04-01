package quiz.quiz6;

import java.util.Map;
import java.util.function.BiFunction;

/*

사용자 입력 처리하기

    요구사항:
     Map 으로 입력된 사용자의 이름과 점수를 입력받아 합격 여부를 결정합니다.
     점수가 50점 이상이면 "합격", 그렇지 않으면 "불합격"입니다.
     사용자의 이름과 점수는 Map<String, Integer>로 관리되며,
     BiFunction 을 사용하여 각 사용자의 이름과 합격 여부를 출력하세요.

    입력 데이터
    Map<String, Integer> userScores = Map.of("Alice", 75, "Bob", 45, "Charlie", 85);

    출력예시
    ===
    Alice: 합격
    Bob: 불합격
    Charlie: 합격
 */
public class Q2 {
    public static void main(String[] args) {

        // 입력 데이터: 사용자의 이름과 점수를 포함하는 Map
        Map<String, Integer> userScores = Map.of("Alice", 75, "Bob", 45, "Charlie", 85);

        // BiFunction 을 사용하여 각 사용자의 이름과 합격 여부를 결정하는 함수를 정의
        // 함수는 두 개의 입력 매개변수인 이름(String)과 점수(Integer)를 받아서 합격 여부(String)를 반환
        BiFunction<String, Integer, String> determinePassOrFail = (name, score) -> {
            // 삼항 연산자를 사용하여 점수가 50 이상인 경우 "합격", 그렇지 않은 경우 "불합격"을 결정하여 반환
            return (score >= 50) ? "합격" : "불합격";
        };

        // userScores 의 각 요소에 대해 반복문을 실행
        for (Map.Entry<String, Integer> entry : userScores.entrySet()) {
            // 현재 요소의 키와 값을 가져온다.
            String name = entry.getKey();
            Integer score = entry.getValue();
            // determinePassOrFail 함수를 사용하여 각 사용자의 합격 여부를 결정
            String result = determinePassOrFail.apply(name, score);
            System.out.println(name + ": " + result);
        }

        // 이 코드는 입력으로 주어진 Map 에서 각 사용자의 이름과 점수를 받아와 합격 여부를 결정하고,
        // BiFunction 을 사용하여 각 사용자의 이름과 합격 여부를 출력

        // BiFunction 은 함수형 인터페이스(Functional Interface) 중 하나로,
        // 두 개의 입력 매개변수를 받아서 하나의 결과를 반환하는 함수를 표현
    }
}
