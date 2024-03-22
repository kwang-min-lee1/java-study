package thread;

public class TazanSong implements Runnable{
    int max;

    public TazanSong(int max) {
        this.max = max;
    }
    @Override
    public void run() {
        String song ="%s : 타잔이 %d원짜리 팬티를 입고, %d원짜리 칼을 차고 노래를 한다, 아아아~\n";

        for (int i = 0; i < max; i++) {
            try{
                Thread.sleep(3000);
                System.out.printf(song,
                        Thread.currentThread().getName(),
                        (i+1)*10,
                        (i+2)*10 );
                //  인터럽트가 발생했을 때 해당 스레드가 할 일을 정함.
            } catch (InterruptedException e) {
                System.out.println("네 그만할께요");
                return;
            }
        }

    }


}
