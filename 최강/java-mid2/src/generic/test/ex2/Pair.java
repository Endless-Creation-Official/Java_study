package generic.test.ex2;

public class Pair <T,V>{
    private T firstValue;
    private V secondValue;

    public void setFirst(T firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecond(V secondValue) {
        this.secondValue = secondValue;
    }

    public T getFirst() {
        return firstValue;
    }

    public V getSecond() {
        return secondValue;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                '}';
    }
}
