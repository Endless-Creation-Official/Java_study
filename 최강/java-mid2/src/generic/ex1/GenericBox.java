package generic.ex1;

public class GenericBox<t>{
    private t value;

    public t getValue() {
        return value;
    }

    public void setVlaue(t value) {
        this.value = value;
    }
}
