package access.trainning;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println("현재 숫자:  " + counter.getCount());
        counter.increment();
    }
}
