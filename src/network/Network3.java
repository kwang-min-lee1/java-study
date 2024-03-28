package network;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Network3 {
    public static void main(String[] args) throws IOException {

        // URL 객체
        // "https://entertain.naver.com" 주소에 대한 URL 객체 url 을 생성
        URL url = new URL("https://entertain.naver.com/ranking/read?oid=311&aid=0001707843");

        // URL 연결 객체 반환
        // 생성된 URL 객체를 통해 웹 서버와의 연결을 나타내는 URLConnection 객체 connection 을 생성
        URLConnection connection = url.openConnection();

        // URL 연결 정보에서 입력 스티림으로 데이터를 받음
        // connection 에서 데이터를 읽기 위한 입력 스트림 inputStream 을 가져옴
        InputStream inputStream = connection.getInputStream();
        // 바이트 스트림을 문자 스트림으로 변환하는 InputStreamReader 객체 inputStreamReader 를 생성
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        // 문자 스트림을 효율적으로 읽기 위한 BufferedReader 객체 bufferedReader 를 생성
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // 출력 스트림으로
        // 파일에 문자를 기록하는 FileWriter 객체 writer 를 생성하고,
        // "src/network/news.html" 경로에 해당하는 파일을 만든다.
        FileWriter writer = new FileWriter("src/network/news.html");
        // 문자 스트림을 효율적으로 쓰기 위한 BufferedWriter 객체 bw를 생성
        BufferedWriter bw = new BufferedWriter(writer);

        // 한 줄씩 출력하기
        // 입력 스트림에서 한 줄씩 읽어오는 무한 루프를 시작
        while (true) {
            // bufferedReader 를 사용하여 한 줄씩 읽어오기
            String line = bufferedReader.readLine();
            // 읽어온 줄이 null 인 경우 루프를 종료
            if (line == null) break;
            // 읽어온 한 줄을 파일에 쓰기
            System.out.println(line);

            // 입력스트림으로 받은 내용 쓰기
            // 읽어온 한 줄을 파일에 쓰기
            bw.write(line);
            // 새로운 줄을 파일에 쓰기
            bw.newLine();
        }

        // 닫기
        // 사용이 끝난 스트림과 연결을 닫기
        bufferedReader.close();
        inputStreamReader.close();
        inputStream.close();
    }
}
