package method;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // 두 정수와 연산기호를 매개변수로 받아 연산 결과를 리턴하는 메서드를 작성하세요.
        // 메서드 이름 : calculate
        /* 호출 예시
        첫 번째 정수를 입력하세요: 10
        두 번째 정수를 입력하세요: 20
        연산 기호를 입력하세요: +
        연산 결과: 30
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 정수를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int b = scanner.nextInt();
        System.out.print("연산 기호를 입력하세요: ");
        String operator = scanner.next();

        System.out.println("연산 결과 : " + calculate(a, b, operator));
    }


    public static int calculate(int a , int b, String operator) {
        switch (operator) {
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/": return a/b;
            default : return 0;
        }
    }
}
