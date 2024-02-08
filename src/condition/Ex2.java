package condition;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        /* 계절 판별하기
        사용자로부터 월을 나타내는 숫자(1~12)를 입력받아,
        해당 월이 어느 계절에 속하는지를 출력하는 프로그램을 작성하세요.
        예를 들어, 3월부터 5월까지는 "봄", 6월부터 8월까지는 "여름",
        9월부터 11월까지는 "가을", 12월, 1월, 2월은 "겨울"입니다.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("몇월 인가요?");

        int month = scanner.nextInt();

        if (month >= 3 && month < 6) {
            System.out.println("봄 입니다.");
        } else if (month >=6 && month <9) {
            System.out.println("여름 입니다.");
        } else if (month >=9 && month <12) {
            System.out.println("가을 입니다.");
        } else if (month >=12 && month <3){
            System.out.println("겨울 입니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }


    }
}
