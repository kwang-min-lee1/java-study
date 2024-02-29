package quiz.quiz1;

import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {
//        조건문 : 달러를 원으로 환전하는 간단한 프로그램을 만들어주세요.
//        - Scanner 클래스를 사용하여 사용자 입력을 받습니다.
//                - if 문을 사용하여 분기를 나눕니다.
//        1. 달러를 0원 입금 받으면 => "환전할 금액이 없습니다."
//        2. 양수일 때 환전금액은 "00000원 입니다."
//        3. 음수일 때 "잘못 입력하셨습니다"


        Scanner scanner = new Scanner(System.in);

        System.out.print("환전할 달러 금액을 입력하세요: ");

        int dollar = scanner.nextInt();

        if (dollar > 0) {
            System.out.println("환전금액은:" + dollar*1336 + "원이다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else  {
            System.out.println("잘못 입력하셨습니다.");
        }

    }
}
