package thread;

public class Thread11 {
    public static void main(String[] args) {
        // 하나의 계좌자원에서 동시에 여러 스레드가 접근할 때
        // 경쟁상태 발생 -> synchronized 로 해결
        Account account = new Account(10000);

        Thread thread1 = new Thread(() ->{
            account.deposit(5000);
            account.withdraw(7000);
            account.withdraw(10000);
        }, "철수" );

        Thread thread2 = new Thread(() ->{
            account.deposit(3000);
            account.withdraw(9000);
            account.withdraw(5000);
        }, "영희" );

        thread1.start();
        thread2.start();
    }
}
