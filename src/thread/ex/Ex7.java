package thread.ex;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
   연습문제: 카페에서의 커피 주문 처리

   문제 설명:
   당신은 카페의 바리스타입니다.
   여러 손님들이 동시에 커피를 주문할 수 있으며,
   각 커피를 만드는 데에는 일정 시간이 소요됩니다.
   여러 손님의 주문을 효율적으로 처리하기 위해
   스레드 풀을 사용하여
   커피 주문을 병렬로 처리하는 시스템을 구현해야 합니다.

   요구사항:
   - 손님의 주문은 CoffeeOrder 태스크로 표현됩니다. 각 CoffeeOrder 는 커피의 이름과 준비 시간(초 단위)을 가집니다.
   - 스레드 풀을 사용하여 여러 개의 CoffeeOrder 를 동시에 처리합니다. 스레드 풀의 크기는 3으로 설정합니다.
   - 각 주문이 처리될 때, 콘솔에는 주문받은 커피의 이름과 "준비 완료!"가 출력되어야 합니다

   입력데이터:
           new CoffeeOrder("에스프레소", 2),
           new CoffeeOrder("아메리카노", 3),
           new CoffeeOrder("카푸치노", 5),
           new CoffeeOrder("라떼", 4),
           new CoffeeOrder("유자차", 6),
           new CoffeeOrder("프라푸치노", 7),
           new CoffeeOrder("딸기슬러시", 8)

   출력예시
   ===
   pool-1-thread-3> 카푸치노 준비 시작.
   pool-1-thread-1> 에스프레소 준비 시작.
   pool-1-thread-2> 아메리카노 준비 시작.
   pool-1-thread-1> 에스프레소 준비 완료!
   pool-1-thread-1> 라떼 준비 시작.
   pool-1-thread-2> 아메리카노 준비 완료!
   pool-1-thread-2> 유자차 준비 시작.
   pool-1-thread-3> 카푸치노 준비 완료!
   pool-1-thread-3> 프라푸치노 준비 시작.
   pool-1-thread-1> 라떼 준비 완료!
   pool-1-thread-1> 딸기슬러시 준비 시작.
   pool-1-thread-2> 유자차 준비 완료!
   pool-1-thread-3> 프라푸치노 준비 완료!
   pool-1-thread-1> 딸기슬러시 준비 완료!
    */
public class Ex7 {
    public static void main(String[] args) {

        // CoffeeOrder 객체들로 이루어진, 리스트 생성
        // 각 CoffeeOrder 객체는 커피 종류와 준비 시간을 가지고 있다.
        List<CoffeeOrder> coffeeOrderList = Arrays.asList(
                new CoffeeOrder("에스프레소", 2),
                new CoffeeOrder("아메리카노", 3),
                new CoffeeOrder("카푸치노", 5),
                new CoffeeOrder("라떼", 4),
                new CoffeeOrder("유자차", 6),
                new CoffeeOrder("프라푸치노", 7),
                new CoffeeOrder("딸기슬러시", 8)
        );

        // 스레드풀 생성
        // newFixedThreadPool(3)은 3개의 스레드를 갖는 고정 크기의 스레드풀을 생성
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // 스레드 풀 실행
        // coffeeOrderList 에 있는 각 CoffeeOrder 객체에 대해,
        // executorService.execute()를 호출하여 스레드풀에서 실행
        coffeeOrderList.forEach(executorService::execute);

        // 스레드 풀 종료
        executorService.shutdown();
    }

}

// CoffeeOrder 클래스
// Runnable 을 구현하여 각 주문에 대한 작업을 정의
class CoffeeOrder implements Runnable {
    String name;
    int second;

    public CoffeeOrder(String name, int second) {
        this.name = name;
        this.second = second;
    }

    // run() 메서드 안에서는 커피를 준비하는 시뮬레이션을 한다.
    // 스레드 이름과 준비 및 완료 메시지를 출력하고, 주어진 시간(초)만큼 스레드를 일시 정지
    // 만약 InterruptedException 이 발생하면 런타임 예외를 던진다.
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        String readyMsg = String.format("%s> %s 준비시작.", threadName, name);
        String completeMsg = String.format("%s> %s 준비완료.", threadName, name);

        try {
            System.out.println(readyMsg);
            Thread.sleep(second*1000);
            System.out.println(completeMsg);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 이렇게 구성된 코드는 커피 주문을 여러 개 받아서 각 주문을 병렬로 처리하며,
        // 각 주문의 준비 시간에 따라 스레드를 일시 정지시킨다.

    }
}