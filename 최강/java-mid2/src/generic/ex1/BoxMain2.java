package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer integer = (Integer) integerBox.getValue();
        System.out.println(integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        String str = (String) stringBox.getValue();
        System.out.println(str);

        integerBox.setValue("heloo");
        // Integer result = (Integer) integerBox.getValue(); // 예외발생 오류
        // 코드 재사용성으 높지만 타입 안정성이 떨어짐
    }
}
