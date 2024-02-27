package polymorphism.ex.ex2;

public class Bicycle extends Transport {
    @Override
    void move() {
        System.out.println("자전거가 길을 따라 페달을 밟습니다.");
    }
}
