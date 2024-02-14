package loop;

import java.util.Scanner;

public class Ex4_2 {
    public static void main(String[] args) {
        // 별의 패턴을 반대로 출력하기
        // ****
        // ***
        // **
        // *
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
