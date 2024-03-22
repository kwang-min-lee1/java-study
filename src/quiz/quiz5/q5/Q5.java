package quiz.quiz5.q5;

import java.util.function.Function;

/*
요구사항:
    주어진 날짜 문자열(예: "20240320")을 "2024-03-20" 형태로 변환합니다.
    함수형 인터페이스 Function<String, String>과 문자열 substring 을 사용하여 구현하세요.

    출력예시
    ===
    2024-03-20
 */
public class Q5 {
    public static void main(String[] args) {
        //변환할 날짜를 나타내는 문자열을 선언하고 초기화
        String dateStr = "20240320";

        // 문자열을 입력으로 받아 원하는 형식으로 변환하는 Function 함수형 인터페이스를 정의
        Function<String,String> dateFormatter = dateString -> {

            // 입력된 날짜 문자열에서 연도, 월, 일을 추출하여 "-"를 이용해 문자열을 조합
            // dateString 에서 0부터 4번 인덱스 직전까지의 문자열을 추출
            // dateString 에서 4부터 6번 인덱스 직전까지의 문자열을 추출
            // dateString 에서 6번 인덱스부터 문자열의 끝까지의 부분 문자열을 추출
            String formattedDate = dateString.substring(0,4) + "-" + dateString.substring(4,6) + "-" + dateString.substring(6);

            // 변환된 문자열을 반환
            return formattedDate;
        };

        // 입력된 날짜 문자열에 대해 정의한 함수를 적용하여 변환된 문자열을 얻는다
        String formattedDate = dateFormatter.apply(dateStr);
        // 변환된 날짜 문자열을 출력
        System.out.println(formattedDate);
    }
}
