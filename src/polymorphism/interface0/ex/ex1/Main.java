package polymorphism.interface0.ex.ex1;

public class Main {
    public static void main(String[] args) {
        // 방법1
        MP3Player mp3Player = new MP3Player();

        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();

        CDPPlayer cdpPlayer = new CDPPlayer();

        cdpPlayer.play();
        cdpPlayer.pause();
        cdpPlayer.stop();

//        // 방법2 배열을 사용한 경우
//        Playable[] players = { new MP3Player(), new CDPPlayer()};
//        for (Playable player : players) {
//            player.play();
//            player.pause();
//            player.stop();
//        }


    }
}
