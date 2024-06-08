package generic.ex3;

import generic.animal.Cat;

public class CatHospital {
    private Cat animal;

    public void set(Cat cat) {
        animal = cat;
    }

    public void checkup() {
        System.out.println("동물 이름:" + animal.getName());
        System.out.println("동물 사이즈: " + animal.getSize());
    }

    public Cat bigger(Cat target)
    {
        return animal.getSize() > target.getSize() ? animal : target;
    }



}
