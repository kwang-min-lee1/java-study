package array;

public class Array5 {
    public static void main(String[] args) {
        // 다차원 배열
        int[][] matrix = {
                {1,2},
                {3,4},
                {5,6}
        }; //3행2열



        for (int row = 0; row < 3; row++) {
            for (int colum = 0; colum < 2; colum++) {
                System.out.println(matrix[row][colum] + " ");
            }
            System.out.println();
        }

    }
}
