package src.memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10); //지역변수 data1
        method2(data1); // 참조값 받아서 매개변수로 넘겨줌 , 힙영역에 인스턴스 생성
        System.out.println("method1 end");
    }

    static void method2(Data data2) { //x001이라는 같은 인스턴스 참조
        System.out.println("method2 start");
        System.out.println("data.value=" + data2.getValue());

    }
}
