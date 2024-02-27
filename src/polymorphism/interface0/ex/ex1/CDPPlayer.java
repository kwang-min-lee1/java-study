package polymorphism.interface0.ex.ex1;

public class CDPPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("CDP 재생 시작");
    }

    @Override
    public void pause() {
        System.out.println("CDP 일시 정지");
    }

    @Override
    public void stop() {
        System.out.println("CDP 재생 중지");
    }
}
