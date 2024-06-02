package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Cat(), new Cow()};

        animalSound(animals);
    }

    private static void animalSound(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println("동물 소리 시작");
            animal.sound();
            System.out.println("동물 소리 종료");

        }
    }
}
