package access.b;

import access.a.PublicClass;
//컴파일 에러: 'access.a.DefaultClass1' is not public in 'access.a'. Cannot be accessed from outside package
//import access.a.DefaultClass1; a.DefaultClass1은 default이므로 import해도 사용할 수 없음.

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        //컴파일 에러: Cannot resolve symbol 'DefaultClass1'
        //DefaultClass1 class1= new DefaultClass1();
        //컴파일 에러: Cannot resolve symbol 'DefaultClass2'
        //DefaultClass2 class2 = new DefaultClass2();
    }
}
