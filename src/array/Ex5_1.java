package array;

import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        // 2차원 배열을 활용한 점수 계산 문제
        // 3명의 학생, 과목은 국어, 영어, 수학
        // 의 점수를 입력 받아, 각 학생의 총점과 평균을 구하는 프로그램을 작성하세요.
        // +) 문자열 배열을 활용하여 해당 과목의 점수를 입력받기
        // +) 학생의 수를 입력받아서 n명 만큼의 총점과 평균을 구하기
        Scanner scanner = new  Scanner(System.in);
        System.out.println("학생수를 입력하세요:");
        int studentNumber = scanner.nextInt();

        // 코드
        int[][] socres = new int[studentNumber][3]; // 행: 학생 , 열: 과목점수
        String[] subjects = {"국어", "영어", "수학"};

        //다른코드 (확장)
//        String[] subjects = {"국어", "영어", "수학", "생물"};
//        int[][] socres = new int[studentNumber][subjects.length]; // 행: 학생 , 열: 과목점수


        //점수 입력
        for (int[] students : socres) {
            System.out.println("성적을 입력하세요");
            for (int i = 0; i <3; i++) {
                System.out.println(subjects[i] + "점수:");
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
