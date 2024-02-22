package inheritance;

public class Inheritance2 {
    public static void main(String[] args) {
        PetroCar car = new PetroCar();
        car.move();

        // 메서드 오버라이딩
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
    }
}
