package poly.ex5;

public class InterfaceAnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        animalSound(dog);
        animalSound(cat);
        animalSound(cow);

        animalMove(dog);
        animalMove(cat);
        animalMove(cow);

    }

    public static void animalSound(InterfaceAnimal animal) {
        animal.sound();
    }
    public static void animalMove(InterfaceAnimal animal) {
        animal.move();
    }

}
