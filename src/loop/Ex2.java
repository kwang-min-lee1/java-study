package loop;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // 팩토리얼 계산하기
        // 사용자로부터 정수 n을 입력받아,
        // n! (팩토리얼)의 값을 계산하는 프로그램을 작성하세요.
        // while 반복문을 사용하여 구현합니다
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n = scanner.nextInt();
        int factorial = 1;  // 초기값 1 : 곱셈

        // code
        while (n > 0) {
            factorial *= n;
            n--;
        }
        System.out.println("factorial = " + factorial);
        // code
    }
}
