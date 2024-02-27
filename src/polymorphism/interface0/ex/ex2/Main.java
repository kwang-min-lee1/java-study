package polymorphism.interface0.ex.ex2;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        Payment[] payments = { new BankTransfer(), new MobilePay(), new CreditCard() };

        processor.process(payments, 10000);
    }
}
