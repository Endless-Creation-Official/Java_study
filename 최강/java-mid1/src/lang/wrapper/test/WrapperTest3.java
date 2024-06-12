package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        // Integer 변환
        Integer integer = Integer.valueOf(str);
        // Integer - int로 변환
        int intValue = integer.intValue();
        // int를 다시 Integer로 변환
        Integer integer1 = Integer.valueOf(intValue);


    }
}
