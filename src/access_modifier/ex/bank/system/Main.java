package access_modifier.ex.bank.system;

public class Main {
    public static void main(String[] args) {
        /* Main 클래스에서 테스트
        - Account 객체 생성
        - 잔액 조회, 입금, 출금 테스트
        - 각 단계 후 잔액 출력
         */
        Account account = new Account();

        long balance = account.getBalance();
        System.out.println("잔액 : " + balance);

        account.deposit(5000);
        System.out.println("입금하였습니다.");
        System.out.println("잔액 : " + account.getBalance());

        account.withdraw(4000);
        System.out.println("출금하였습니다.");
        System.out.println("잔액 : " + account.getBalance());  // 1000

        account.withdraw(2000);  // 제약사항
    }
}
