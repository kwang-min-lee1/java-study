package solid.ocp.after;

public class NavePayPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("네이브 페이 결제");

    }
}
