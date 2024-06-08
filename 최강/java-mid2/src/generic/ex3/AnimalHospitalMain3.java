package generic.ex3;


import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMain3 {
    public static void main(String[] args) {
        AnimalHospital3<Dog> dogHospital = new AnimalHospital3<>();
        AnimalHospital3<Cat> catHospital = new AnimalHospital3<>();

        Dog dog = new Dog("멍멍1", 100);
        Cat cat = new Cat("냐옹1", 80);

        dogHospital.setAnimal(dog);
        dogHospital.checkup();
        //dogHospital.setAnimal(cat);

        catHospital.setAnimal(cat);
        catHospital.checkup();
        Cat cat2 = catHospital.biggerAnimal(new Cat("냐옹2", 50));
        System.out.println("bigger cat=" + cat2);

    }
}
