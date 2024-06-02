package poly.ex7;

public class PracticeAbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();
       /* dog.move();
        dog.sound();
        bird.fly();*/

        animalsSound(dog);
        animalsSound(bird);
        animalsSound(chicken);

        animalFly(bird);
        animalFly(chicken);

    }

    private static void animalsSound(AbstractAnimal animal) {
        animal.sound();
    }

    private static void animalFly(Fly animal) {
        animal.fly();
    }
}
