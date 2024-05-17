package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역 변수 - 할당되면 바꿀 수 없다.
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        //data1 = 20; Error: Variable 'data1' might already have been assigned to

        final int data2;
        data2 = 15;

        method(30);
    }

    static void method(final int parameter) {
        // parameter = 20; 파라미터로 받아도 바꿀 수 없다.
    }
}
