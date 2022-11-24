package AdapterPattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        var player = new AudioPlayer();

        player.play("mp3", "beyond the horizon.mp3");
        player.play("mp4", "alone.mp4");
        player.play("vlc", "far away.vlc");
        player.play("avi", "mind.avi");
    }
}
