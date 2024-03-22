package thread;

public class Thread6 {
    // 스레드의 우선순위
    static class PrintThread extends Thread {

        public PrintThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 20 ; i++) {
                System.out.print(getName());
            }
        }
    }

    public static void main(String[] args) {
        PrintThread Thread0 = new PrintThread("0");
        PrintThread Thread1 = new PrintThread("1");
        PrintThread Thread2 = new PrintThread("2");

        // 우선순위 부여하기 ( 범위는 1~10, 기본값은 5(NORM_PRIORITY) )
        // 스레드 스케줄러가 스레드들 사이에서 실행순서를 결정하는데 사용되는 힌트만 제공
        // OS(운영체제)에 있는 수케줄링 정책에 따라, CPU 의 자원을 할당받음.
        // 어느정도 빈도의 영향을 가지게 됨.
        // 숫자가 클수록 높은 우선순위를 가짐 => 보장된 것은 아니라 OS 에게 힌트만 줌.(무시당할 수 있음)

        Thread0.setPriority(1);  // 최소 우선순위
        Thread1.setPriority(5);  // 중간 우선순위
        Thread2.setPriority(10); // 최대 우선순위
        Thread0.setPriority(Thread.MIN_PRIORITY);  // 최소 우선순위
        Thread1.setPriority(Thread.NORM_PRIORITY);  // 중간 우선순위
        Thread2.setPriority(Thread.MAX_PRIORITY); // 최대 우선순위

        Thread0.start();
        Thread1.start();
        Thread2.start();

        /*
         주의사항
        -프로그램의 행동을 예측가능하게 만드는데 사용해서는 안됨 (우선순위 무시당할 수 있음)
        -낮은 우선 순위의 스레드가 실행기회를 박탈당할 수 있으므로, 리소스 관리 필요에 따라 신중하게 사용
         */

        // yield: 같은 우선순위인 경우에, 다른 스레드에 양보
        // OS의 스케줄러에 힌트만 주고 상황에 따라 다름. 최종결정은 OS의 스케줄러가 내리게 됨.

        // 우선순위가 5인 새로운 스레드 n
        new Thread(()-> {
            for (int i = 0; i < 20; i++) {
                System.out.print("n");
                Thread.yield(); // 우선순위가 같을 경우 양보

            }
        }).start();

        // 우선순위가 5인 메인 스레드 m
        for (int i = 0; i < 20; i++) {
            System.out.print("m");
        }

    }
}


