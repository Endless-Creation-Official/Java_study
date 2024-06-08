package generic.ex3;


import generic.animal.Animal;

public class AnimalHospital3<T extends Animal> {
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물이름: " + animal.getName());
        System.out.println("동물사이즈: " + animal.getSize());
    }

    public T biggerAnimal(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
