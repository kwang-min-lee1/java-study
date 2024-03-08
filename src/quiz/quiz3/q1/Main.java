package quiz.quiz3.q1;

public class Main {
    public void main(String[] args) {
        Payment[] payments = {new  CreaditCard(), new  BankTransfer(), new  MobilePay()};
        int amount = 10000;

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayments(payments,amount);

        System.out.println(paymentProcessor);

    }

    static class PaymentProcessor {
        void processPayments(Payment[] payments, int amount) {
            for (Payment payment : payments) {
                payment.pay(amount);
            }
        }
    }
}
