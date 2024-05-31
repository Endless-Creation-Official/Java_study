package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        //InterfaceB = new InterfaceB(); 생성 불가
        InterfaceB b = new Child();
        b.methodCommon();
        b.methodB();

        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();
    }
}
