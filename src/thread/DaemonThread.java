package thread;

public class DaemonThread {
    // 주 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
    // 주 스레드가 종료되면, 데몬 스레드는 자동으로 따라 종료죔.
    public static void main(String[] args) {
        // 노래 스레드를 돕는 보조 리듬 스레드
        Runnable rhythm = () -> {
          int index = 0;
          String rhyme = "덩기덕쿵더러러";

          while (true) {
              System.out.print(rhyme.charAt(index++)+ " ");
              index %= rhyme.length();

              try {
                  Thread.sleep(200);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }

        };




        // 가사를 출력하는 주 스레드
        Thread singThread = new Thread(() -> {
            String [] lyrics = {
                    "깊은 산 속 옹달샘", "누가와서 먹나요",
                    "새벽에 토끼가", "눈비비며 일어나",
                    "세수하러 왔다가", "물만 먹고 가지요"

            };

            // 리듬 스레드를 노래스레드의 데몬스레드(보조스레드)로 설정
            // 노래 스레드(주스레드)가 종료되었을 때 리듬 스레드(대몬스레드)도 함께 종료

            Thread rhythmThread = new Thread(rhythm);
            rhythmThread.setDaemon(true);
            rhythmThread.start();

            for (int i = 0; i < lyrics.length; i++) {
                System.out.println("\n" + lyrics[i]);
                try {
                    Thread.sleep(1400);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        singThread.start();
    }


}
