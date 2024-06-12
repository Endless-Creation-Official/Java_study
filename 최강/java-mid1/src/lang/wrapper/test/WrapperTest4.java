package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
       // 오토박싱 오토 언박싱 사용 변환
        String str = "100";
        Integer integer1 = Integer.valueOf(str);
        int intValue = integer1;
        Integer integer2 = intValue;
    }
}
