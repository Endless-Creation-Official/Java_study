package generic.animal;

import javax.naming.NameNotFoundException;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 80);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog findDog = dogBox.getValue();
        System.out.println(findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.getValue();
        System.out.println(findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.getValue();
        System.out.println(findAnimal);
       /* Box 제네릭 클래스에 각각의 타입에 맞는 동물을 보관하고 꺼낸다.
                Box<Dog> dogBox:
        Dog 타입을 보관할 수 있다.
                Box<Cat> catBox:
        Cat 타입을 보관할 수 있다.
                Box<Animal> animalBox:
        Animal 타입을 보관할 수 있다.*/
    }
}
