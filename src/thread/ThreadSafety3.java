package thread;

import static0.Static1;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafety3 {
    // Atomic 변수 (원자 변수) 클래스
    // 멀티 스레딩 환경에서 동기화 없어도, 스레드 안전 참조 가능 + 동시성 + 성능

    static int normalCount = 0;

    // int 값에 대해서 원자성을 가진 업데이트 지원

    // AtomicInteger 객체 생성
    static AtomicInteger atomicCount = new AtomicInteger(0);


    public static void main(String[] args) throws InterruptedException {

        // Runnable 은 Java 에서 스레드를 생성하기 위한 인터페이스
        // Runnable 을 구현한 객체는 스레드가 실행할 작업을 정의할 수 있다.
        // Runnable 은 run() 메서드를 가지고 있으며, 이 메서드 안에 스레드가 실행할 코드를 작성
        // 여기서 task 는 Runnable 을 구현한 객체, 이 객체는 run() 메서드 안에 반복문을 통해 작업을 수행

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                normalCount ++;
                // 1씩 증가하는 메서드
                atomicCount.getAndIncrement();
                // task 는 두 번의 반복문을 실행하며,
                // 각 반복문에서 normalCount 와 atomicCount 를 1000번씩 증가시킨다.
                // 여기서 atomicCount 는 AtomicInteger 의 getAndIncrement() 메서드를 사용하여 증가
            }
        };

        // 두 개의 스레드 생성: 각각의 스레드는 task 를 실행
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        // 스레드 실행
        thread1.start();
        thread2.start();

        // 스레드 종료 대기
        thread1.join();
        thread2.join();


        // 일반 타입 필드는 스레드가 동시 접근하여, 안전하지 않은 예측 불가 카운트가 되지만
        // 원자 타입 필드는 항상 예측 가능한 스레드 안전 상태를 갖는다.
        // java.util.concurrent 에서 참고할 것
        System.out.println("normalCount = " + normalCount);
        System.out.println("atomicCount = " + atomicCount);

    }
}




