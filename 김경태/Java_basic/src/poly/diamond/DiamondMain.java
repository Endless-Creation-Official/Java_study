package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {
        //InterfaceA interface = new InterfaceA(); 인터페이스는 인스턴스 생성x

        //오버라이딩된 자식 클래스 메서드 호출
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        //오버라이딩된 자식 클래스 메서드 호출
        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        //오버라이딩된 자식 클래스 메서드 호출
        Child c = new Child();
        c.methodA();
        c.methodB();
        c.methodCommon();

    }
}
