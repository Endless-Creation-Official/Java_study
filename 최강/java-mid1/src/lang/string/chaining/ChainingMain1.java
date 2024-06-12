package lang.string.chaining;

public class ChainingMain1 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(1);
        adder.add(2);
        adder.add(3);

        int value = adder.getValue();
        System.out.println(value);
    }
}
