package collection.map;

import java.io.IOException;

import java.util.Properties;

public class Map6 {
    // Properties: Hashtable 의 자식 클래스
    // Key, Value 를 문자열(String) 타입으로 제한한 컬렉션
    // 주로 확장자가 properties 인 파일을 읽을 때 활용

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        // Properties 컬력션에 이 파일과 같은 위치에 있는 파일 로드하기
        properties.load(Map6.class.getResourceAsStream
                ("database.properties"));
        // 'database.properties 파일'을 로드함
        // map 폴더 안에 생성된 파일임
        // 파일내용: username=scoot, password=tiger, driver=oracle.jdbc.OracleDriver

        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");

        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("driver = " + driver);

        // 출력
//        username = scoot
//        password = tiger
//        driver = oracle.jdbc.OracleDriver
    }
}
