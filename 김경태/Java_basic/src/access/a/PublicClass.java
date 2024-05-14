package access.a;

//public class는 파일명과 class이름이 같아야 한다.
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

//default class는 같은 패키지 안에서는 접근 가능
class  DefaultClass1 {

}

class DefaultClass2 {

}

