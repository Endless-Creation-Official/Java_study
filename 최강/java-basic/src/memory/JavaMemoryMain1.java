package src.memory;

public class JavaMemoryMain1 {
    // 자바는 스택 영역을 사용해서 메서드 호출과 지역변수를 관리
    // 메서드를 계속 호출하면 스택 프레임이 쌓인다
    // 지역 변수는 스택프레임에서 관리한다
    // 스택 프레임이 제거되면 지역 변수도 함꼐 제거
    // 스택 프레임이 모두 제거되면 프로그램도 종료
    public static void main(String[] args) {
        // main을 위한 스택프레임 생성
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1) {
        // method1 스택프레임 생성 지역변수 포함
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");

    }
}

