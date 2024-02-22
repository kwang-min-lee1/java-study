package static0.ex;

public class Ex5 {
    /* 은행 시스템
    계좌 Account 클래스
    필드는
    accountNumber 고유한 계좌번호
    ownerName 소유자 이름
    balance 잔액
    interestRate 불변 고정 이자 (변경되지 않음)

    // 생성자 : 3가지 필드 사용

    // 메서드 : 필드 내용을 출력하는 정보 출력 메서드
     */
    public static void main(String[] args) {
        Account account = new Account("111-111-2222", "홍길동", 100000);

        // account.accountNumber = "111-222-3333";

        account.printAccount();
    }
}
