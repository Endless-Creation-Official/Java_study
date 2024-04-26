package ref;

public class initMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); // 멤버 번수는 0으로 자동 초기화됨
        System.out.println("value2 = " + data.value2);
    }
}
