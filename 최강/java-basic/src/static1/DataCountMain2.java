package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("a", counter);
        System.out.println("a count=" + counter.count);
        Data2 data2 = new Data2("b", counter);
        System.out.println("a count=" + counter.count);
        Data2 data3 = new Data2("c", counter);
        System.out.println("a count=" + counter.count);

    }
}

