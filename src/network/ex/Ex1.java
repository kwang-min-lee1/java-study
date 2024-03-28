package network.ex;

import java.net.URI;
import java.net.URISyntaxException;

/*

   연습문제 1: URL 구조 분석기
   URL 의 각 구성 요소(프로토콜, 호스트, 포트, 경로, 쿼리 파라미터, 참조)를 분석하고 출력하는 자바 프로그램을 작성하세요.
   입력된 URL 에 대해 다음 정보를 출력해야 합니다:

   요구사항
   - 프로토콜(Protocol)
   - 호스트(Host)
   - 포트 번호(Port) - 명시되지 않은 경우 "기본 포트"라고 출력
   - 경로(Path)
   - 쿼리(Query) - 각 쿼리 파라미터를 별도로 분석하여 출력
   - 참조(Reference) - 없는 경우 "참조 없음"이라고 출력

   입력 예시: https://www.example.com:8080/path/to/resource?name=John&age=30#section

   출력 예시
   ===
   프로토콜: https
   호스트: www.example.com
   포트: 8080
   경로: /path/to/resource
   쿼리:
     - name=John
     - age=30
   참조: section
    */
public class Ex1 {
    public static void main(String[] args) throws URISyntaxException {

        // 입력된 URL
        URI uri = new URI("https://www.example.com:8080/path/to/resource?name=John&age=30#section");

        String scheme = uri.getScheme();
        String host = uri.getHost();
        int port = uri.getPort();
        String path = uri.getPath();
        String query = uri.getQuery();
        String fragment = uri.getFragment();

        System.out.println("프로토콜: " + scheme);
        System.out.println("호스트: " + host);
        System.out.println("포트: " + port);
        System.out.println("경로: " + path);

        // '&'를 기준으로 쿼리를 파싱하여 각 키-값 쌍을 분리
        String[] querySplits= query.split("&");
        System.out.println("쿼리:");
        // querySplits 배열의 각 요소를 반복하여 처리하는 for-each 루프를 시작
        for (String querySplit : querySplits) {
            // 각 쿼리의 키-값 쌍을 '=' 기준으로 분리
            String[] keyValue = querySplit.split("=");
            // 각 키-값 쌍을 새로운 줄에 출력
            // '-'로 시작하여 값이 들여쓰기되고, 키와 값 사이에는 '='가 있습니다
            System.out.println("\t- " + keyValue[0] + "=" + keyValue[1]);
        }

        System.out.println("참조: " + fragment);
    }

}
