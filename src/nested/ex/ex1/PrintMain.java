package nested.ex.ex1;

public class PrintMain {
    public static void main(String[] args) {

        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        };

        printable.print();

    }

}
