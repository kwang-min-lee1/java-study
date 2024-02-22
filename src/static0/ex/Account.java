package static0.ex;

import org.w3c.dom.ls.LSOutput;

public class Account {
    final String accountNumber;
    String ownerName;
    long balance;
    static final double INTEREST_RATE = 0.04;

    // 생성자 : 3가지 필드 사용
    public Account(String accountNumber, String ownerName, long balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // 메서드 : 필드 내용을 출력하는 정보 출력 메서드
    public void printAccount() {
        System.out.println("accountNumber = " + accountNumber);
        System.out.println("ownerName = " + ownerName);
        System.out.println("balance = " + balance);
        System.out.println("INTEREST_RATE = " + INTEREST_RATE);
    }
}
