package oop1;
//데이터 묶기
public class MusicPlaterMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();



        //음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        // 볼륨 증가
        volumeUp(data);
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        // 볼륨 감소
        volumeDown(data);
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        //음악 플레이어 상태
        showStatus(data);
        //음악 플레이어 끄기
         off(data);
    }
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    static void volumeUp(MusicPlayerData data){
        data.volume++;
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
    }
    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        }else {
            System.out.println("음악 플레이어 OFF");
        }

    }
}
