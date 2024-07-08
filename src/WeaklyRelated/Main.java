package WeaklyRelated;

public class Main {
    public static void main(String[] args){
        MusicPlayer mp3Player = new MP3Player();
        MusicApp app1 = new MusicApp(mp3Player);
        app1.playMusic(); // MP3 파일을 재생합니다.

        MusicPlayer wavPlayer = new WavPlayer();
        MusicApp app2 = new MusicApp(wavPlayer);
        app2.playMusic(); // wav파일을 재생합니다.
    }
}
