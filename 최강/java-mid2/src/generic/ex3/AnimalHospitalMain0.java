package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMain0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍1", 100);
        Cat cat = new Cat("고양이1", 50);

        dogHospital.set(dog);
        dogHospital.checkup();
        Dog dog2 = dogHospital.bigger(new Dog("멍멍2", 50));
        System.out.println("biggerDog" + dog2);

        //dogHospital.set(cat); //컴파일 오류: 다른 타입 입력
        catHospital.set(cat);
        catHospital.checkup();


    }
}
