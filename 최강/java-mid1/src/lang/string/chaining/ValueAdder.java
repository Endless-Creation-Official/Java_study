package lang.string.chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int value) {
        this.value += value;
        return this; //참조값 반환
    }

    public int getValue() {
        return value;
    }
}
