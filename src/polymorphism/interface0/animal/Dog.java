package polymorphism.interface0.animal;

public class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 꼬리치며 다가옵니다.");
    }
}
