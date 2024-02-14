package array;

public class Array6 {
    public static void main(String[] args) {
        // 다차원 배열
        int[][] matrix = new int[3][2];

        int i = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = i++; //행렬의 위치에 1씩 증가하여 대입

            }
        }
        // 2차원 배열 출력 : 향상된 for문 사용
        for (int[] rows : matrix) {
            for (int element : rows) {
                System.out.println(element + " ");
            }
            System.out.println();

        }
    }
}
