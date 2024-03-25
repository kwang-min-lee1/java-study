package thread.ex;
/*
   연습문제: 여행 준비

   문제 설명:
   세 명의 친구가 함께 여행을 가기로 했습니다.
   각자의 짐을 싸는 데에는 다른 시간이 소요되며,
   모두 짐을 싸야만 여행을 출발할 수 있습니다.
   친구 A는 2초, 친구 B는 3초, 친구 C는 5초가 걸립니다.
   각 친구가 짐을 다 싸면 "A의 짐 준비 완료!", "B의 짐 준비 완료!", "C의 짐 준비 완료!"와 같이
   출력되어야 하며, 모든 준비가 끝나면 "모두 준비 완료, 여행을 출발합니다!"라고 출력합니다.

   요구사항:
   - 각 친구를 대표하는 스레드 3개를 만듭니다(FriendA, FriendB, FriendC).
   - 각 스레드는 친구가 짐을 싸는 데 걸리는 시간(대기 시간)을 시뮬레이션합니다.
   - 메인 스레드는 모든 친구의 준비가 완료될 때까지 기다렸다가 여행 출발 메시지를 출력해야 합니다.


   출력예시
   A의 짐 준비 완료!
   B의 짐 준비 완료!
   C의 짐 준비 완료!
   모두 준비 완료, 여행을 출발합니다!

    */
public class Ex2 {
    public static void main(String[] args) {

        // Thread 클래스를 이용하여 새로운 스레드 friendA를 생성합니다.
        // 이때 람다 표현식을 사용하여 스레드의 동작을 정의합니다.
        // sleep 메소드를 사용하여 스레드를 2초 동안 일시 정지시킨 후에,
        // "A의 짐 준비 완료!" 메시지를 출력합니다.
        Thread friendA  = new Thread(()->{
            try {
                Thread.sleep(2000);
                System.out.println("A의 짐 준비 완료!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread friendB  = new Thread(()->{
            try {
                Thread.sleep(3000);
                System.out.println("B의 짐 준비 완료!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread friendC  = new Thread(()->{
            try {
                Thread.sleep(5000);
                System.out.println("C의 짐 준비 완료!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        // start() 메소드를 호출하여 friendA, friendB, friendC 스레드를 실행
        friendA.start();
        friendB.start();
        friendC.start();

        // 세 스레드가 모두 종료할 때까지
        // 메인스레드는 대기하고 있음
        // join() 메소드를 호출하여 메인 스레드가
        // friendA, friendB, friendC 스레드의 작업이 모두 완료될 때까지 대기

        try {
            friendA.join();
            friendB.join();
            friendC.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 모든 스레드 종료 후 메시지 출력
        System.out.println("모두 준비 완료, 여행을 출발합니다!");

        // 이 코드는 세 개의 스레드를 생성하여
        // 각각의 스레드가 일정 시간 동안 sleep 한 후에 메시지를 출력하도록 합니다.
        // 그리고 join() 메소드를 사용하여 모든 스레드의 작업이 완료될 때까지 기다린 후에
        // "모두 준비 완료, 여행을 출발합니다!" 메시지를 출력합니다.

    }
}
