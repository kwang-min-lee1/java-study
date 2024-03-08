package library.lang.util;
// java.util 패키지
// 날짜와 시간 관련, Dare, Calender

import static0.Data;

import java.util.Calendar;
import java.util.Date;

public class CalenderClass {
    // Data 클래스는 시간대 정보가 없는 timestamp 를 관리
    // timestamp: 197001010000 => 0으로 시작한 정수값
    // 대부분의 생성자와 메서드가 deprecated 상태
    public static void main(String[] args) {
        Date data = new Date(2024,3,8);
        Date dataNow = new Date();

        // Calender 클래스는 날짜와 시간을 표현하고, 시간대 지원
        // new 연산자를 통해
        // 정적 메서드 getInstance 를 통한 사용 가능(싱글턴 패턴)
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; //0~11까지 리턴
        int dayOfMonth  = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.printf("d년 %d월 %d일 %d시 %d분 %d초", year, month, dayOfMonth, hour, minute, second);




    }
}
