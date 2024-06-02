package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        // 음악 플레이어 켜기
        musicPlayer.on();
        musicPlayer.volumeUp();
        musicPlayer.volumeDown();
        musicPlayer.showStatus();
        musicPlayer.off();

    }

}
