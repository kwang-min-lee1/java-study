package polymorphism.interface0.ex.ex2;

public class PaymentProcessor {

    public void process(Payment[] payments, int amount) {
        for (Payment payment : payments) {
            payment.pay(amount);
        }

    }
}
