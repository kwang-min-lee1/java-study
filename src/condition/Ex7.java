package condition;


import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("자연수 숫자를 입력해 주세요: ");
        int input = scanner.nextInt();

        System.out.println(input % 2 == 0 ? "짝수" : "홀수");
        /*
         삼항연산자를 사용해서 짝수와 홀수를 구별하는 프로그램을 작성해주세요.
         Hint : num % 2
         */
    }
}
