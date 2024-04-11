public class MyApp {
    public static void main(String[] args) {
        PopMusic abba = new PopMusic("ABBA", "Gimme!");
        RockMusic acdc = new RockMusic("AC/DC", "Thunderstruck");
        ClassicMusic cellos = new ClassicMusic("2Cellos", "Benedictus");
        MusicStyles[] bands = {abba, acdc, cellos};

        for (MusicStyles band : bands){
            band.playMusic();
        }
    }
}
