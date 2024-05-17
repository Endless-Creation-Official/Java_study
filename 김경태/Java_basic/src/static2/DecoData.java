package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++;//정적 변수 접근
        staticMethod(); //정적 메서드 접근

        //instanceMethod(); //Non-static method 'instanceMethod()' cannot be referenced from a static context
        //인스턴스 변수는 인스턴스가 생성 된 후에 힙 영역에 메모리 할당 -> 따라서 JVM실행 단계에서 인스턴스 변수에 접근할 수 없다.
    }
    public void instanceCall() {
        instanceValue++;
        //인스턴스를 통해서는 정적 변수, 정적 메서드에 모두 접근 가능
        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
