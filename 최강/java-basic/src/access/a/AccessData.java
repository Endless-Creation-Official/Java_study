package src.access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("public함수호출 "+publicField);
    }

    void defaultMethod() {
        System.out.println("default함수호출 " + defaultField);
    }

    private void privateMethod() {
        System.out.println("private함수호출 "+ privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField=100;
        defaultField=200;
        privateField=300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
