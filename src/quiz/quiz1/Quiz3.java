package quiz.quiz1;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {

//        배열 :   점수를 입력받을 학생수를 입력받아 배열에 저장하고
//        입력받은 수만큼 학생들의 점수를 입력받은 후, 합계와 평균을 출력해주세요


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
