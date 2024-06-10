package generic.ex5;

import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.setValue(new Dog("멍멍1",100));

        WildcardEx.printWildcardV1(dogBox);
        WildcardEx.printGenericV1(dogBox);

        WildcardEx.printWildcardV2(dogBox);
        WildcardEx.printGenericV2(dogBox);
    }
}
