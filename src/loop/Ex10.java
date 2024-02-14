package loop;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // 은행 앱
        /*
        ------------------------------------
        1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        ------------------------------------
        선택>
        1. 번을 선택할 경우
        예금액> 10000    => 잔고에 10000원이 입금
        2. 번을 선택할 경우
        출금액> 1000     => 잔고에서 1000원이 출금
        3. 번
        잔고액> 9000     => 잔고액 확인가능
        4. 번
        "프로그램이 종료됩니다"
         */

        Scanner scanner = new Scanner(System.in);

        // 실행여부를 판단하는 flag
        boolean isRun = true;
        long balance = 0;        // 은행 잔고

        while (isRun) {
            // 프롬프트를 출력
            System.out.println("------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
            System.out.println("------------------------------------");
            System.out.print("번호를 선택해주세요 > ");
            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.print("예금액> ");
                    long amount = scanner.nextLong();
                    balance += amount;      // 잔고에 금액을 추가
                    break;
                case 2:
                    System.out.print("출금액> ");
                    long money = scanner.nextLong();   // 잔고에 금액을 인출
                    if (money > balance) {
                        System.out.println("예금액 이상의 금액은 인출할 수 없습니다.");
                    }
                    balance -= money;
                    break;
                case 3:
                    System.out.println("잔고> " + balance);
                    break;
                case 4:     // 종료
                    isRun = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;

            }
        }
    }
}
