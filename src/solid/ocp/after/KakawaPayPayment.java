package solid.ocp.after;

public class KakawaPayPayment implements Payment{

    @Override
    public void processPayment() {
        System.out.println("카카와페이..");
    }
}
