package lambda.ex;

  /*
    문제 :  나이 계산기
    요구사항: 사용자의 생년월일(예: "19900315")을 입력받아 현재 나이를 계산합니다.
    현재 년도는 2024년으로 가정합니다. Function<String, Integer>을 사용하여 나이를 계산하고 출력하세요.

    입력 데이터
    "19900315"

    출력 예시:
    34
     */

import java.util.function.Function;

public class Ex3 {
    public static void main(String[] args) {
        // 입력 매개변수가 하나면 소괄호 생략
        // 본문이 리턴값 한 줄일때 중괄호, return 생략
        Function<String, Integer> function = birthDate ->
                2024 - Integer.parseInt(birthDate.substring(0, 4));

        System.out.println(function.apply("19900315"));
    }
}
