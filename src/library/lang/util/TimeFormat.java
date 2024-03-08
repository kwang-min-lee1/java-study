package library.lang.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
    public static void main(String[] args) {
        // 날짜와 시간을 원하는 형식으로 지정하기
        LocalDateTime now = LocalDateTime.now();

        System.out.println("now = " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 날짜 시간에 미리 만들어둔 포매터에 적용
        String formatted = now.format(formatter);
        System.out.println("formatted = " + formatted);

        // 날짜와 시간 형식의 문자열을 DateTime 타입으로 변환(파싱)
        LocalDateTime parsedDateTime = LocalDateTime.parse(formatted, formatter);
        System.out.println("parsedDateTime = " + parsedDateTime);


        String str = "2024년 3월 8일";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        LocalDateTime parsedDt = LocalDateTime.parse(str, fmt);
        System.out.println("parsedDt = " + parsedDt);
        System.out.println(parsedDt.getMonth());


    }
}
