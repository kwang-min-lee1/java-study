package network.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Ex2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("웹페이지 URL을 입력하세요 : ");
        String urlString = scanner.nextLine();

        // String urlString = "https://www.iana.org/";

        try {
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();

            // URL 연결에서 기반 InputStream 을 반환하여
            // 보조 스트림 연결
            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(
                                    connection.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {

                if (line.contains("<title>")) {

                    int startIndex = line.indexOf("<title>") + 7;   // startIndex 는 '<' 부분을 가리킴, 따라서 < + 7 는 '>'부분
                    int endIndex = line.indexOf("</title>");        // endIndex 는 '<' 부분을 가리킴



                    String title = line.substring(startIndex, endIndex);
                    System.out.println("웹페이지 제목 : " + title);
                }
            }


        } catch (MalformedURLException e) {
            System.out.println("잘못된 URL 형식입니다.");
        } catch (IOException e) {
            System.out.println("입출력에 문제가 발생하였습니다.");
        }
    }
}
