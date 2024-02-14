package array;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // 5개의 정수를 입력받아서, 배열에 저장하고, 입력 순서대로 출력해보세요.
        /* 예시
        정수를 5개 입력하세요.
        1
        2
        3
        4
        5
        >> 1, 2, 3, 4, 5
         */

        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 5개의 정수를 저장할 배열 선언 및 초기화
        int[] scores =new int[5];

        // 사용자로부터 정수 입력 받기
        System.out.println("정수를 5개 입력하세요");
//        scanner[0] = scanner.nextInt();
//        scanner[1] = scanner.nextInt();
//        scanner[2] = scanner.nextInt();
//        scanner[3] = scanner.nextInt();
//        scanner[4] = scanner.nextInt();

        for ( int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }
//        System.out.println(">>");
//        System.out.println(scores[0] + ",");
//        System.out.println(scores[1] + ",");
//        System.out.println(scores[2] + ",");
//        System.out.println(scores[3] + ",");
//        System.out.println(scores[4]);
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
            if (i != scores.length - 1) {
                System.out.println(",");
            }
        }






    }
}
