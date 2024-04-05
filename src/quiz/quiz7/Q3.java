package quiz.quiz7;

import java.util.Random;

/*
스레드 경주 게임 시뮬레이션

    3대의 차량(스레드)이 경주를 합니다.
    각 차량은 출발 후
    랜덤하게 0~1초 사이에 한 번씩 "차량 [번호]가 [거리m] 달렸습니다!" 메시지를 번 출력한 후,
    경주를 마칩니다.

    출력 예시:
    차량 1이 출발했습니다.
    차량 2이 출발했습니다.
    차량 3이 출발했습니다.
    차량 3이 100m를 달렸습니다.
    차량 2이 100m를 달렸습니다.
    차량 1이 100m를 달렸습니다.
    차량 2이 200m를 달렸습니다.
    ...
    차량 3이 800m를 달렸습니다.
    차량 3이 900m를 달렸습니다.
    차량 3이 결승선을 통과했습니다!
    차량 2이 결승선을 통과했습니다!
 */
public class Q3 {
    public static void main(String[] args) {
        // 차량 1, 2, 3의 객체를 생성
        Car car1 = new Car(1);
        Car car2 = new Car(2);
        Car car3 = new Car(3);

        // 각각의 차량 스레드를 실행
        car1.start();
        car2.start();
        car3.start();
    }
}
    // Car 클래스를 정의
    // Thread 클래스를 상속받아 스레드로 동작할 수 있다.
    class Car extends Thread {

        // distance 와 carNumber 라는 두 개의 인스턴스 변수를 선언
        private int distance = 0;
        private int carNumber;

        // Car 클래스의 생성자를 정의
        // 차량 번호를 매개변수로 받아 해당 차량의 번호를 초기화
        public Car(int carNumber) {
            this.carNumber = carNumber;
        }

        // run 메서드를 오버라이드하여 스레드가 실행할 작업을 정의
        @Override
        public void run() {
            System.out.println("차량 " + carNumber + "이 출발했습니다.");

            // Random 클래스의 인스턴스를 생성, 이를 통해 랜덤한 값을 생성할 수 있다
            Random random = new Random();

            // 차량이 1000m를 달릴 때까지 반복
            while (distance < 1000) {

                // 0부터 1000ms 사이의 랜덤한 시간만큼 스레드를 대기시킨 후,
                // 100m를 달린 것으로 가정하고 거리를 갱신하고 이를 출력
                try {
                    Thread.sleep(random.nextInt(1001));
                    distance += 100;
                    System.out.println("차량" + carNumber + "이 " + distance + "m 를 달렸습니다.");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            System.out.println("차량 " + carNumber + "이 결승선을 통과했습니다.");
        }

    }




