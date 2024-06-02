package src.access.ex;

public class MaxCounter {
    private int count=0;
    private int max;
    // 다른 패키지에서도 쓸 수 있도록 public
    public MaxCounter(int max) {
        this.max = max;
    }

    void increment() {
        // 검증로직
        if (count>=max) {
            System.out.println("최대값 초과 불가능");
            return;
        }
        count++;
        // 실행로직
    }

    public int gerCount() {
        return count;
    }
}
