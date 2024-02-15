package method;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int scores[] = new int[0];   // 비어있는 배열로 시작

        Scanner scanner = new Scanner(System.in);
        // 1. 동적인 배열의 증가
        while (true) {
            System.out.println("성적 입력하세요 (종료하려면 -1): ");
            int score = scanner.nextInt();
            if (score == -1) {
                break;
            }
            scores = addScore(scores, score);   // 1. 성적을 추가
        }

        // 2. 평균 계산
        System.out.println("평균 :" + calculateAverage(scores));

        // 3. 최고 성적
        System.out.println("최고점수 : " + findMaxScore(scores));

        // 4. 성적 분포
        printScoreDistribution(scores);


        // 성적을 관리하는 프로그램
        // 1. 새로운 성적을 배열에 추가
        // 2. 성적의 평균을 계산
        // 3. 최고 성적을 조회
        // 4. 성적 분포를 출력 (A, B, C, D, F) (90, 80, 70, 60, 60이하)
    }

    public static int[] addScore(int[] scores, int score) {
        // 성적을 추가하는 메서드
        int[] newScores = new int[scores.length + 1];  // 이전 배열보다 길이가 1만큼 긴 배열
        for (int i = 0; i < scores.length; i++) {
            newScores[i] = scores[i];
        }   // 기존의 배열을 순회하며 새로운 배열에 내용을 복사 한다.
        newScores[newScores.length - 1] = score;    // 배열의 마지막 인덱스에 새 값을 추가
        scores = newScores;         // 기존 배열을 새로운 배열로 대체한다.
        return scores;
    }

    public static double calculateAverage(int[] scores) {
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        // 평균을 계산하는 메서드
        return sum / scores.length;
    }

    public static int findMaxScore(int[] scores) {
        // 최고 성적 조회 메서드
        int max = (scores.length > 0) ? scores[0] : 0;    // 배열의 길이가 0일 경우 예외처리
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    public static void printScoreDistribution(int scores[]) {
        int[] distribution = new int[5];    // 성적 분포를 담는 배열

        // 성적 분포 출력 메서드
        for (int score : scores) {
            if (score >= 90) {
                distribution[0]++;  // A
            } else if (score >= 80) {
                distribution[1]++;  // B
            } else if (score >= 70) {
                distribution[2]++;  // C
            } else if (score >= 60) {
                distribution[3]++;  // D
            } else {
                distribution[4]++;  // F
            }
        }
        System.out.println("성적 분포도");
        System.out.println("A :" + distribution[0] + "명");
        System.out.println("B :" + distribution[1] + "명");
        System.out.println("C :" + distribution[2] + "명");
        System.out.println("D :" + distribution[3] + "명");
        System.out.println("F :" + distribution[4] + "명");

    }
}









