package library.lang.ex.ex1;

public class BankAccount {
    // toString 연습문제
    // 은행 계좌 정보를 관리하는 BankAccount 클래스가 있습니다.
    // 계좌 번호와 소유자 이름, 현재 잔액을 포함하는
    // toString() 메소드를 오버라이드하여 구현해보세요.

    // 필드
    private String accountNumber;
    private   String name;
    private String balance;

    public BankAccount(String accountNumber, String name,String balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }




}


