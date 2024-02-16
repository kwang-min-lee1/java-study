package class0.ex;

public class Ex2 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "삼성";
        car1.model = "SM5";
        car1.year = 2021;

        Car car2 = new Car();
        car2.brand = "현대";
        car2.model = "아반떼";
        car2.year = 2023;

        Car[] cars = {car1, car2};

        for (Car car : cars) {
            System.out.println("브랜드: " +car.brand +  ", 모델 : " + car.model + ", 연도: " + car.year);

        }

    }
}
