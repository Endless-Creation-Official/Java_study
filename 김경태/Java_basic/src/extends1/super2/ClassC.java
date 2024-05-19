package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        //C의 부모인 B에는 생성자가 정의되어 있으므로 기본생성자 생성 x -> super 생성자 직접 정의
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
