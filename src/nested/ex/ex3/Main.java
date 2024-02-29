package nested.ex.ex3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        // 타이어 생성
        Car.Tire tire = car.new Tire();

        // 엔진 생성
        Car.Engine engine = new Car.Engine();

    }
}
