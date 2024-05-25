package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        //System.out.println("volume 필드 직접 접근 수정");
        //컴파일 에러: 'volume' has private access in 'access.Speaker'
        //speaker.volume = 200;
        speaker.showVolume();
    }
}
