package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Network5 {
    // JSON GET 메서드로 가져오기
    public static void main(String[] args) {
        String urlString = "https://jsonplaceholder.typicode.com/";
        StringBuilder response = new StringBuilder();

        try {
            // URL 로부터 HTTP 연결 객체 생성
            URL url = new URL(urlString + "albums/10");
            HttpURLConnection connection =(HttpURLConnection) url.openConnection();

            // 메서드 설정
            connection.setRequestMethod("GET");

            // 헤더 추가 설정: 받는 데이터의 타입의 JSON
            connection.setRequestProperty("Content-Type", "application/json");

            // 응답코드
            int responseCode = connection.getResponseCode();
            System.out.println("responseCode = " + responseCode);

            // 성공적으로 응답되었을 때 JSON 본문을 문자열에 넣어 저장
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                while (true) {
                    String line = in.readLine();
                    if (line == null) break;
                    response.append(line);
                }
                in.close();

            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("응답 본문");
        System.out.println(response);
    }
}
