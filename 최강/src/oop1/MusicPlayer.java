package oop1;

public class MusicPlayer {
    int volume=0;
    boolean isOn = false;

     void on() { // 자신의 멤버변수에 있는 속성을 바꾸는 것
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
     void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
     void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume );
    }
     void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume );
    }

     void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" +volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }


}
