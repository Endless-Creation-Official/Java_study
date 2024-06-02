package extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("child hello");
    }

    public void call() {
        System.out.println("this value=" + value);
        System.out.println("parent value=" + super.value);

        hello();
        super.hello();
    }

}
