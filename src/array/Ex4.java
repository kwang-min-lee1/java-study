package array;

public class Ex4 {
    public static void main(String[] args) {
        // 2차원 배열의 합계 구하기
        // 2차원 정수 배열을 선언하고 모든 요소의 합계를 계산하는 프로그램을 만드세요.

        int[][] matrixs = {
                {1, 2, 3, 4},
                {4, 5, 6, 8}
        };

        int sum = 0;

        for (int[] matrix : matrixs) {
            for (int i : matrix) {
                sum += i;
            }

        }

        System.out.println("2차원 배열의 모든 요소의 합계:" + sum );




    }
}
