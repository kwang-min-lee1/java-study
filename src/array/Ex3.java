package array;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // 점수를 입력받을 학생수를 입력받고
        // 입력받은 수만큼 학생들의 점수를 입력받은 후, 합계와 평균을 출력해주세요
        /*
        예시
        학생수는 몇명인가요? 3
        점수를 입력하세요
        10
        20
        30
        >> 합계 : 60, 평균 : 20.0
         */

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("학생수는 몇명인가요?");

        int studentNumber = scanner.nextInt();
        int[] scores = new int[studentNumber];

        // 배열 요소를 입력받기
        for ( int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        // 점수의 합계 구하기
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        System.out.println(">> 합계:" + sum);
        System.out.println("평균 :" + (double) sum / scores.length);
    }
}
