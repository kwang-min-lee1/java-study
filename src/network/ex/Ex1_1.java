package network.ex;

import java.net.MalformedURLException;
import java.net.URL;

// 강사 풀이
public class Ex1_1 {
    public static void main(String[] args) {
        String str = "https://www.example.com:8080/path/to/resource?name=John&age=30#section";

        try {
            URL url = new URL(str);

            System.out.println("프로토콜: " + url.getProtocol());
            System.out.println("호스트: " + url.getHost());
            System.out.println("포트: " + (url.getPort() == -1 ? url.getDefaultPort() : url.getPort()));
            System.out.println("경로: " + url.getPath());
            System.out.println("쿼리: ");
            String[] queryPair = url.getQuery().split("&");
            for (String s : queryPair) {
                System.out.println(" - " + s.replace("=", " : "));
            }
            System.out.println("참조: " + ((url.getRef() == null) ? "참조 없음" : url.getRef()));

        } catch (MalformedURLException e) {
            System.out.println("정상적인 포맷이 아닙니다.");

        }
    }
}