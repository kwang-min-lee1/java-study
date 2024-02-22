package inheritance.ex;

public class PopMusicTrack extends MusicTrack {
    private String album;

    public PopMusicTrack(String title, String artist, int duration, String album) {
        super(title, artist, duration);
        this.album = album;
    }

    @Override
    public void play() {
        super.play();
        System.out.println(", Album : " + album);
    }
}
