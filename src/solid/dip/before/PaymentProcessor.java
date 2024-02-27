package solid.dip.before;

import inheritance.Parent;

public class PaymentProcessor {
    // 고수준 모율인 paymentProcessor 가
    // 저수준 모듈 CreditCard, DebitCard 에 직접 의존하는 상황
    // DIP 위배
    //필드
    private CreaditCard creaditCard;
    private DebitCard debitCard;

    // 구체적인(Detail) 클래스에 직접 의존
    void processCreditPayment (double amount) {
        creaditCard.processPayment(amount);
    }
    void processDebitPayment (double amount) {
        debitCard.processPayment(amount);
    }
}
