package thread.ex;

import java.util.Random;

/*
   연습문제: 우주 탐사선 발사 카운트다운

   문제 설명:
   우주 탐사선을 발사하기 위한 카운트다운을 진행하는 프로그램을 작성합니다.
   카운트다운은 10초부터 시작하며, 각 초마다 카운트다운 숫자를 출력합니다.
   그러나, 발사 준비 과정 중에 기술적인 문제가 발생할 수 있으며,
   문제가 발생하면 카운트다운을 즉시 중단하고 "발사 중단: 기술적 문제 발생!" 메시지를 출력해야 합니다.
   문제가 발생하지 않고 카운트다운이 0에 도달하면 "발사 성공!" 메시지를 출력합니다.

   요구사항:
   - Countdown 클래스를 정의하여 카운트다운 로직을 구현합니다. 이 클래스는 Runnable 인터페이스를 구현합니다.
   - 카운트다운 중 기술적 문제를 시뮬레이션하기 위해 무작위 시간(1초에서 10초 사이) 후에 현재 진행 중인 카운트다운 스레드를 interrupt() 메소드를 이용하여 중단시킵니다.
   - interrupt() 메소드 호출 시, 카운트다운을 즉시 중단하고 "발사 중단: 기술적 문제 발생!" 메시지를 출력합니다.
   - 카운트다운이 성공적으로 0에 도달하면 "발사 성공!" 메시지를 출력합니다.
   - 힌트 : 무작위 기술적 문제 시간 Thread.sleep(new Random().nextInt(10) * 1000 + 2);

   출력예시
   ===
   카운트다운: 10
   카운트다운: 9
   ...
   카운트다운: 1
   발사 성공!

   또는

   카운트다운: 10
   카운트다운: 9
   발사 중단: 기술적 문제 발생!

    */
public class Ex3 {

    static class CountDown implements Runnable {
        int count = 10;
        @Override
        public void run() {
            while (count > 0) {
                System.out.println("카운트다운:" + count);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("발사 중단: 기술적 문제 발생");
                    return;
                }
                count--;
            }
            System.out.println("발사 성공!");

//            다른 방법
//            for (int i = 1; i <= 10; i--) {
//                System.out.println("카운트다운: " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    System.out.println(" 발사 중단: 기술적 문제 발생!");
//                    return;
//                }
//
//            }
//            System.out.println("발사 성공!");
        }
    }
    public static void main(String[] args) {
        // 카운트 다운 스레드 실행
        Thread thread = new Thread(new CountDown());

//        다른방법
//        CountDown countdown = new CountDown();
//        Thread thread = new Thread(countdown);

        thread.start();

        // 메인 스레드에서 카운트 다운 스레드에 인터럽트
        try {
            Thread.sleep(new Random().nextInt(10)*1000 +2); // 메인 스레드에 랜덤한 시간을 부여
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.interrupt();

//        다른 풀이
//        무작위로 기술적 문제 시뮬레이션
//        int randomTIme = new Random().nextInt(10)*1000 +2;
//        try {
//            Thread.sleep(randomTIme);
//            // 무작위 시간 후에 스레드를 interrupt 하여 기술적 문제 발생 시뮬레이션
//            thread.interrupt();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        thread.start();
    }
}
