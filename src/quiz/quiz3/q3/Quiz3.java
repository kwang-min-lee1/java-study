package quiz.quiz3.q3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 숫자 입력 받기
            System.out.print("숫자 1을 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("숫자 2를 입력하세요: ");
            int num2 = scanner.nextInt();

            // 나눗셈 결과 출력
            int result = divide(num1, num2);
            System.out.println("결과: " + result);
        } catch (InputMismatchException e) {
            // 숫자가 아닌 값을 입력한 경우 처리
            System.out.println("유효한 숫자를 입력해주세요.");
        } catch (ArithmeticException e) {
            // 0으로 나눈 경우 처리
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }

    // 나눗셈 메소드
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
