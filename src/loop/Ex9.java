package loop;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        // 이름과 나이를 입력받고 출력하는 앱
        Scanner scanner = new Scanner(System.in);

        // while문 실행 여부를 담고 있는 flag
        boolean isRun = true;

        while (isRun) {
            // 이름을 입력받고
            System.out.print("이름을 입력하세요(q는 종료) : ");
            String name = scanner.next();
            // (이름을 입력받을 때 'q'라고 입력을 받으면 종료된다.)
            if (name.equals("q")) {
                isRun = false;      // 반복 조건을 없앤다.
                continue;           // 조건문으로 이동
                // break; 반복문을 탈출한다.
            }
            // 나이를 입력받고
            System.out.print("나이를 입력하세요 : ");
            int age = scanner.nextInt();
            // 입력받은 이름과 나이를 출력한다.
            System.out.printf("%s는 %d세 입니다.\n", name, age);
        }
    }
}
