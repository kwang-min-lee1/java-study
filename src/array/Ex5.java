package array;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // 2차원 배열을 활용한 점수 계산 문제
        // 3명의 학생, 과목은 국어, 영어, 수학
        // 의 점수를 입력 받아, 각 학생의 총점과 평균을 구하는 프로그램을 작성하세요.

        //scanner 객체 생성
        Scanner scanner = new  Scanner(System.in);

        // 2차원 배열 선언 및 초기화
        int[][] socres = new int[3][3];

        //점수 입력
        for (int[] students : socres) {
            System.out.println("성적을 입력하세요");
            for (int i: students) {
                System.out.println("점수:");
                students[i] = scanner.nextInt();
            }

        }

        //총점과 평균 구하기
        for (int i = 0; i < socres.length; i++) {
            int sum = 0;
            for (int j = 0; j < socres.length; j++) {
                sum += socres[i][j];
            }
            System.out.println(i + "번 학생의 합계는 = " + sum);
            System.out.println(i + "번 학생의 평균은 = " + sum/ socres[i].length);
        }


    }
}
