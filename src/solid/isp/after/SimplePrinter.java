package solid.isp.after;

// ISP를 적용하여 불필요한 인터페이스를 구현하지 않는다.
public class SimplePrinter implements Printer {
    @Override
    public void print() {
        //프린트 로직
    }


}
