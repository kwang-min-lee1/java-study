package inheritance.ex;

public class ClassicalMusicTrack extends MusicTrack {
    private String composer;    // 작곡가

    public ClassicalMusicTrack(String title, String artist, int duration, String composer) {
        super(title, artist, duration);
        this.composer = composer;
    }

    @Override
    public void play() {
        super.play();
        System.out.println(", Composer: " + composer);
    }

}
