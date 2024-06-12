package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        int value = 7;
        Integer integer = Integer.valueOf(value);
        Integer integer1 = value; // 오토박싱

        int intValue = integer.intValue();
        int intValue1 = integer; // 오토박싱


        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(intValue1);
        System.out.println(intValue);

    }
}
