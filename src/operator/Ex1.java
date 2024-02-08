package operator;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // 산술 연산자
        // 두 개의 정수 a와 b를 사용자로부터 입력받습니다.
        // 이 두 수에 대해 더하기, 빼기, 곱하기, 나누기, 나머지 연산을 수행하고
        // 결과를 출력하는 프로그램을 작성하시오.
        Scanner scanner = new Scanner(System.in); // 입력받는 스캐너

        System.out.println("첫번째 정수를 입력하시오");
        int a = scanner.nextInt(); //입력받는 타입을 정수로 반환

        System.out.println("두번째 정수를 입력하시오");
        int b = scanner.nextInt(); //입력받는 타입을 정수로 반환

        int sum = a+b;
        System.out.println("더하기 결과:"+ sum);
        int sub = a-b;
        System.out.println("빼기 결과:"+ sub);
        int mul = a*b;
        System.out.println("곱하기 결과:" + mul);
        int div = a/b;
        System.out.println("나누기 결과:"+ div);
        int rem = a%b;
        System.out.println("나머지 결과:" + rem);





    }
}
