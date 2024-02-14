package array;

public class Ex1 {
    public static void main(String[] args) {

        // 학생들 점수가 10,20,30,40,50점
        // 배열을 선언하고, 모든 학생의 합계점수와 평균점수를 구해보세요.

        // 학생들의 점수 배열 선언
        int[] scores = {10,20,30,40,50};


        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }


        // 결과 출력
        System.out.println("학생들의 합계 점수" + sum);
        System.out.println("학생들의 평균 점수" + sum / (double)scores.length);

    }
}
