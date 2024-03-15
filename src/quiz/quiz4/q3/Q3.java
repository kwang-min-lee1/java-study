package quiz.quiz4.q3;
/*
월드컵 개최일까지 남은 시간 계산하기

    요구사항: 특정 월드컵 개최일까지 남은 년, 월, 일을 계산하세요.
     예를 들어, 다음 월드컵이 2026년 6월 14일에 시작한다고 할 때,
     오늘 날짜로부터 개최일까지 남은 시간을 Period 를 사용하여 계산하세요.

    출력 예시:
    다음 월드컵은 2년 3개월 1일 후에 개최됩니다
 */

import java.time.LocalDate;
import java.time.Period;

public class Q3 {
    public static void main(String[] args) {

        // 월드컵 개최일
        LocalDate worldCupDate = LocalDate.of(2026, 6, 14);

        // 현재일
        LocalDate currentDate = LocalDate.now();

        // 남은 시간 계산
        Period period = Period.between(currentDate, worldCupDate);

        // 남은 년, 월, 일 출력
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("다음 월드컵은 " + years + "년 "+ months + " 개월" + days +" 일 후에 개최됩니다.");
    }


}
