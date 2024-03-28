package network;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Network2 {
    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
        // 문자열로부터 URI 객체 생성
        URI uri = new URI("https://sports.news.naver.com/news?oid=144&aid=0000952086#news");

        String scheme = uri.getScheme();
        System.out.println("scheme = " + scheme);
        String host = uri.getHost();
        System.out.println("host = " + host);
        String path = uri.getPath();
        System.out.println("path = " + path);
        String query = uri.getQuery();
        System.out.println("query = " + query);
        String fragment = uri.getFragment();
        System.out.println("fragment = " + fragment);
        int port = uri.getPort();
        System.out.println("port = " + port);

        // URI 를 문자열 또는 URL 객체로 변환
        String string = uri.toString();
        System.out.println("string = " + string);
        URL tourl = uri.toURL();
        System.out.println("tourl = " + tourl);

        // URL 객체: URI 의 구조처럼 가지고 올 수 있음
        URL url = new URL("https://sports.news.naver.com/news?oid=144&aid=0000952086#news");
        // 형식에 맞지 않는 문자열을 사용할 경우: MalformedURLException

        String externalForm = url.toExternalForm();
        System.out.println("externalForm = " + externalForm);

        String protocol = url.getProtocol();
        System.out.println("protocol = " + protocol);

        int port1 = url.getPort();
        System.out.println("port1 = " + port1);    // 없으면 -1

        int defaultPort = url.getDefaultPort();
        System.out.println("defaultPort = " + defaultPort); // 없어도 기본 포트 반환

        String file = url.getFile();
        System.out.println("file = " + file);   // path + query 반환

        // URL 은 부분적으로 연결하여 생성 가능
        // "https://entertain.naver.com" 주소에 대한 URL 객체 naverEntUrl 을 생성
        URL naverEntUrl = new URL("https://entertain.naver.com");
        // naverEntUrl 을 기준으로 하여 "/ranking/read?oid=311&aid=0001707843" 경로에 대한 URL 객체 url 을 생성
        URL connectedUrl = new URL(naverEntUrl, "/ranking/read?oid=311&aid=0001707843");




    }
}
