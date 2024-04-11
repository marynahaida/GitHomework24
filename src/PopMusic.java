public class PopMusic extends MusicStyles{
    public String name;
    public String song;

    public PopMusic(String name, String song) {
        this.name = name;
        this.song = song;
    }

    @Override
    public void playMusic() {
        System.out.printf("A song \"%s\" from %s is playing\n", song, name);
    }
}
