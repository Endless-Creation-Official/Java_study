package poly.ex;


public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
        // 중복되는 부분 발생

        // 중복제거 시도
        soundCow(cow);
        // Cow[] animals = {cat, dog, cow}; //컴파일 오류 서로 다른 타입
        System.out.println("동물 소리 테스트 시작");
        /*for (Cow animal : animals) {
            animal.sound();
        }
        System.out.println("동물 소리 테스트 종료");*/
    }
    // 메서드로 중복 제거 시도
    public static void soundCow(Cow cow) {
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
