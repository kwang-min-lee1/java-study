package nested.nested_interface;

import polymorphism.interface0.ex.ex2.BankTransfer;

public class CallListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("통화를 연결합니다.");
    }

}
