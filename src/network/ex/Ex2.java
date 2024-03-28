package network.ex;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/*
    연습문제 : 웹 페이지 제목 추출기

    주어진 URL 의 웹 페이지로부터 HTML <title> 태그 내의 텍스트를 추출하는 자바 프로그램을 작성하세요.
    이 프로그램은 웹 페이지를 다운로드하고, HTML 내용에서 <title> 태그의 텍스트를 찾아 출력해야 합니다.

    - 웹 페이지의 HTML 내용을 가져옵니다.
    - HTML 내용에서 <title> 시작 태그와 </title> 종료 태그 사이의 텍스트를 추출합니다.
    - 추출한 텍스트를 출력합니다.

    - 입력 예시: https://www.example.com
    - 출력 예시 (웹 페이지의 제목에 따라 다름): Example Domain
     */
public class Ex2 {
    public static void main(String[] args) throws IOException {

        // 주소에 대한 URL 객체 url 을 생성
        URL url = new URL("https://entertain.naver.com/read?oid=076&aid=0004127078#news");

        // 생성된 URL 객체를 통해 웹 서버와의 연결을 나타내는 URLConnection 객체 connection 을 생성
        URLConnection connection = url.openConnection();

        // connection 에서 데이터를 읽기 위한 입력 스트림 inputStream 을 가져옴
        InputStream inputStream = connection.getInputStream();
        // 바이트 스트림을 문자 스트림으로 변환하는 InputStreamReader 객체 inputStreamReader 를 생성
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        // 문자 스트림을 효율적으로 읽기 위한 BufferedReader 객체 bufferedReader 를 생성
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // 파일에 문자를 기록하는 FileWriter 객체 writer 를 생성하고
        // "src/network/news.html" 경로에 해당하는 파일을 만든다.
        FileWriter writer = new FileWriter("src/network/ex/news.html");
        // 문자 스트림을 효율적으로 쓰기 위한 BufferedWriter 객체 bw를 생성
        BufferedWriter bw = new BufferedWriter(writer);

        while (true){
            // bufferedReader 를 사용하여 한 줄씩 읽어오기
            String line = bufferedReader.readLine();
            if (line == null) break;
            System.out.println(line);

            bw.write(line);
            bw.newLine();
        }
        bufferedReader.close();
        inputStreamReader.close();
        inputStream.close();

    }
}
