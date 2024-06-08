package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMain1 {
    public static void main(String[] args) {
        AnimalHospital dogHospital = new AnimalHospital();
        AnimalHospital catHospital = new AnimalHospital();

        Dog dog = new Dog("멍멍1", 100);
        Cat cat = new Cat("고양이1", 50);

        dogHospital.setAnimal(dog);
        dogHospital.checkup();
        Dog dog2 = (Dog) dogHospital.biggerAnimal(new Dog("멍멍2", 50));
        System.out.println("biggerDog" + dog2);

        //dogHospital.setAnimal(cat); // 매개변수 체크 실패: 컴파일 오류가 발생하지 않음
        catHospital.setAnimal(cat);
        catHospital.checkup();


    }
}
