package access.a;

public class AccessInnnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        //private 호출 불가
        //'privateField' has private access in 'access.a.AccessData'
        //data.privateField = 3;
        //'privateMethod()' has private access in 'access.a.AccessData'
        //data.privateMethod();

        //class내부에서는 모두 접근 가능
        data.innerAccess();
    }
}
