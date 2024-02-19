package class0.ex;

public class BankAccount {
    // 속성: 계좌번호(accountNumber), 소유자 이름(ownerName), 잔액(balance)
    String accountNumber;
    String ownerName;
    long balance;

    // 입금(deposit): 잔액에 특정 금액을 추가합니다.
    long deposit(int amount) {
        balance += amount;
        System.out.println(amount+"원을 입금했습니다. 잔액은 " + balance + "원");
        return balance;
    }
    // 출금(withdraw): 잔액에서 특정 금액을 차감합니다. 잔액이 출금하려는 금액보다 적을 경우 출금을 할 수 없습니다.
    long withdraw(int amount) {
        if (balance < amount) {
            System.out.println("출금을 할 수 없습니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다. 잔액은 " + balance + "원");
        }
        return balance;
    }

    //  잔액 조회(getBalance): 현재 잔액을 출력합니다.
    long getBalance() {
        System.out.println("잔액은 " + balance + "원입니다.");
        return balance;
    }
}
