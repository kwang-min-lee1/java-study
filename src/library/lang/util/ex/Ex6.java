package library.lang.util.ex;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ex6 {
 /*
    연습 문제 6: 회의 시간대 변환하기
    요구사항: 뉴욕에서 오후 3시에 시작하는 온라인 회의가 있다고 할 때,
     이 회의가 서울과 런던에서 몇 시에 시작하는지 계산하여 출력하세요.
    ZonedDateTime 과 ZoneId를 사용하여 시간대 변환을 수행하세요.

    출력예시:
    회의는 뉴욕 기준 오후 3시에 시작합니다.
    서울에서는 회의가 오전 5시에 시작합니다.
    런던에서는 회의가 오후 8시에 시작합니다.

    * 참고:  DateTimeFormatter 클래스
    https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html

     */
 public static void main(String[] args) {
     // "America/New_York", "Europe/London", "Asia/Seoul"
     LocalDateTime localTime = LocalDateTime.of(2024,3,8,15,0,0);

     // 1. 기준 시간 뉴욕
     ZonedDateTime newYorkTime = ZonedDateTime.of(localTime, ZoneId.of("America/New_York"));
     System.out.println("회의는 뉴욕 기준으로 오후 3시에 시작합니다.");

     // 날짜 형식에 패턴 문자를 맞춘다. a(AM/PM) h(시간)
     DateTimeFormatter fmt = DateTimeFormatter.ofPattern("a h시"); // 출력 포멧

     // 2. 서울 시간
     ZoneId SeoulZoneId = ZoneId.of("Asia/Seoul");  // withZoneSameInstant 해당 시간대와 동일한 다른 지역의 시간을 리턴하는 메서드
     ZonedDateTime SeoulZonedDateTime = newYorkTime.withZoneSameInstant(SeoulZoneId);

     String seoulFormattedTime = SeoulZonedDateTime.format(fmt); // 포맷 적용
     System.out.printf("서울에서는 회의가 %s에 시작합니다.\n",seoulFormattedTime);

     // 3. 런던 시간
     ZoneId londonZoneId = ZoneId.of("Europe/London");
     ZonedDateTime londonZonedDateTime = newYorkTime.withZoneSameInstant(londonZoneId);

     String londonFormattedTime = londonZonedDateTime.format(fmt);
     System.out.printf("런던에서는 회의가 %s에 시작합니다.\n", londonFormattedTime);
 }

}
