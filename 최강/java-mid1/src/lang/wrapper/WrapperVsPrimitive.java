package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        Long endTime, startTime;
        int iteration = 1_000_000_000;

        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();

        for (int i = 0; i < iteration; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("기본 자료형 long 실행시간:" + (endTime - startTime));


        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();

        for (int i = 0; i < iteration; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("래퍼 클래스 long 실행시간:" + (endTime - startTime));



    }
}
