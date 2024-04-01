package quiz.quiz6;

import java.util.Arrays;
import java.util.List;

/*
숫자 점수 변환

    스트림 API 를 사용하여 주어진 정수 리스트에서 양수만 필터링한 후,
    각 숫자의 제곱근을 구하여 결과를 출력하세요.

    List<Integer> scores = Arrays.asList(16, -9, 4, 1, -16, 9, 25);

    출력 결과:
    4.0
    2.0
    1.0
    3.0
    5.0
 */
public class Q3 {
    public static void main(String[] args) {

        List<Integer> scores = Arrays.asList(16, -9, 4, 1, -16, 9, 25);

        // 양수를 필터링하고 제곱근을 구하여 출력
        // 리스트를 스트림으로 변환
        scores.stream()
                // 각 요소를 필터링하여 양수인지 확인
                .filter(x -> x>0)
                // 양수인 요소들에 대해 제곱근을 계산
                // Math::sqrt 는 Math 클래스의 sqrt() 메서드를 가리키며,
                // 스트림의 각 요소에 대해 이 메서드를 호출하여 제곱근을 계산
                .map(Math::sqrt)
                .forEach(System.out::println); // 각 숫자 출력

        // 리스트를 스트림으로 변환하면 코드를 더 간결하고 유연하게 작성할 수 있으며,
        // 병렬 처리와 지연된 실행과 같은 성능 이점
    }
}
