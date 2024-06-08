package generic.ex3;

import generic.animal.Animal;

public class AnimalHospital {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물이름: " + animal.getName());
        System.out.println("동물사이즈: " + animal.getSize());
    }

    public Animal biggerAnimal(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
