package operator;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // 논리 연산자
        // 사용자로부터 두 개의 불리언 값을 입력받습니다.
        // 이 두 값에 대해 AND, OR, NOT 연산을 수행하고
        // 각 결과를 출력하는 프로그램을 작성하세요.

        // 활용해보세요.
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 불리언 값을 입력하세요 (true 또는 false):");
        boolean a = scanner.nextBoolean();  // 입력받은 변수를 불리언 값으로 저장

        System.out.println("두번째 불리언 값을 입력하세요 (true 또는 false):");
        boolean b = scanner.nextBoolean();  // 입력받은 변수를 불리언 값으로 저장

        boolean andResult = a && b;
        System.out.println("AMD 연산결과:"+andResult);

        boolean orResult = a || b;
        System.out.println("OR 연산결과:"+orResult);

        boolean notaResult = !a;
        boolean notbResult = !b;
        System.out.println("첫번째 값에 대한 NOT 연산 결과:"+ notaResult);
        System.out.println("두번째 값에 대한 NOT 연산 결과:"+ notbResult);
    }
}
