package condition;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
         /* 주차요금 계산하는 프로그램
        응용 문제 3: 주차 요금 계산기
        주차장을 사용한 시간(시간 단위)을 사용자로부터 입력받아,
        주차 요금을 계산하는 프로그램을 작성하세요.
        기본 요금은 2시간까지 5000원이고, 이후부터는 30분마다 1000원씩
        추가 요금이 발생합니다.
        24시간을 초과하는 주차의 경우에는 일일 최대 요금인 30000원을 적용하세요.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("몇시간 이용 하셨나요?");

        int time = scanner.nextInt();

        if (time < 2) {
            System.out.println("이용 요금은 5000원 입니다.");
        } else if (time >=2 && time <=24) {
            System.out.println("이용 요금은" + (5000+ (time-2)*2*1000) + "입니다.");
        } else {
            System.out.println("30000원 입니다.");
        }


    }
}
