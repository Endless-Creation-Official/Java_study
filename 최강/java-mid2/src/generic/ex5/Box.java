package generic.ex5;

public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T t) {
        value = t;
    }
}
