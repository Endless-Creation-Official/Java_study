package poly.ex5;

import poly.ex4.AbstractMain;

public class InterfaceMain {
    public static void main(String[] args) {
        //IntercaceAnimal intercaceAnimal = new IntercaceAnimal(); 인터페이스 생성 불가
        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();

        cat.sound();
        caw.sound();
        dog.sound();

        cat.move();
        caw.move();
        dog.move();

    }
    private static void soundAnimal(IntercaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(IntercaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
