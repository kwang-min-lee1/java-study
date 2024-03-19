package stream.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    문제 2: 숫자 게임 점수 변환
    주어진 정수 리스트에서 양수만 필터링한 후, 각 숫자의 제곱근을 구하여 결과를 출력하세요.

    List<Integer> scores = Arrays.asList(16, -9, 4, 1, -16, 9, 25);

    출력 결과:
    4.0
    2.0
    1.0
    3.0
    5.0

     */
public class Ex2 {
    public static void main(String[] args) {

        // 정수 리스트 생성
        List<Integer> scores = Arrays.asList(16, -9, 4, 1, -16, 9, 25);

        // 리스트를 스트림으로 변환
        List<Double> filteredScore = scores.stream()
                // 양수만 필터링
                .filter(score -> score >0)
                // 각 숫자의 제곱근
                .map(Math::sqrt)
                //.map(score -> Math.sqrt(score))
                // 스트림의 요소들을 다시 리스트로 수집
                .toList();
                //.collect(Collectors.toList());

        // 결과 출력
        filteredScore.forEach(System.out::println);
    }
}
