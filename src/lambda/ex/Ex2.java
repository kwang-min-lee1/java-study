package lambda.ex;
 /*
    문제 2: 날짜 변환기
    요구사항: 주어진 날짜 문자열(예: "20240320")을 "2024-03-20" 형태로 변환합니다.
    Function<String, String>을 사용하여 구현하세요.

    출력예시
    ===
    2024-03-20

    힌트 : 문자열 메서드(substring) 사용
     */

import java.util.function.Function;

public class Ex2 {
    // 입력값이 문자열, 반환값이 문자열
    // return 포함 한 줄이면, { }, return 생략
    public static void main(String[] args) {


        Function<String, String> function = date ->
                date.substring(0, 4) + "-"
                        + date.substring(4, 6) + "-"
                        + date.substring(6, 8);

        String dateStr = function.apply("20240320");
        System.out.println("dateStr = " + dateStr);

        System.out.println(function.apply("20240706"));
    }
}


