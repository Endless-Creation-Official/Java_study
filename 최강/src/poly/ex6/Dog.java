package poly.ex6;

public class Dog extends AbstractAnimal {
    // move는 상속 받았고
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
