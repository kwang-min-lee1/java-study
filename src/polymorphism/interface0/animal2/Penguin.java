package polymorphism.interface0.animal2;

public class Penguin extends Animal implements Swimable, Flyable {

    @Override
    public void sound() {
        System.out.println("팽팽");
    }

    @Override
    public void swim() {
        System.out.println("팽귄이 수영합니다.");
    }

    @Override
    public void fly() {
        System.out.println("팽귄이 파다닥 날개짓을 합니다.");
    }
}
