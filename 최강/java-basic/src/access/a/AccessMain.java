package src.access.a;

public class AccessMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출
        data.publicField=1;
        data.publicMethod();
        // default 호출 // 같은 패키지라 가능
        data.defaultField=2;
        data.defaultMethod();
        // private 호출 불가 // private 접근자는 해당 클래스에서만 쓸 수 있음
        // data.privateField =3;
        // data.privateMethod();

        data.innerAccess();
    }
}
