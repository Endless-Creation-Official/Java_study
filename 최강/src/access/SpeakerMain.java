package src.access;

public class SpeakerMain {
    public static void main(String[] args) {

        Speaker speaker = new Speaker(90);

        speaker.volumeUp();
        speaker.showStatus();
        speaker.volumeUp();
        speaker.showStatus();

        // 새로운 개발자가 볼륨을 200으로 올리고 싶어 필드에 직접 접근
        // speaker.volume=200;
        speaker.showStatus();
        // volumeup 메서드를 통해서 100을 넘지 못하도록 하였는데 위 코드로 위반
        // 이를 해결하기 위해 volume 멤버변수를 접근자 private으로 변경하여 제약
        // 접근자의 종류는 4가지 private-default-protected-public

    }
}
