package src.access;

public class Speaker {
    private int volume;
    
    // 생성자
    public Speaker(int volume) {
        this.volume=volume;
    }
    // 볼륨 업
    void volumeUp() {
        if (volume >= 100) {
            System.out.println("볼륨을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("볼륨 10 증가");
        }
    }
    // 볼륨 다운
    void volumeDown() {
        volume-=volume-10;
    }
    // 볼륨 상태
    void showStatus() {
        System.out.println("현재 볼륨은: " + volume);
    }
}
