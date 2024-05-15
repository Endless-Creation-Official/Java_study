package access.trainning;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (isOver(count)) {
            System.out.println("최대 값입니다.");
        }else {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
    private boolean isOver(int cur) {
        return cur == max;
    }
}
