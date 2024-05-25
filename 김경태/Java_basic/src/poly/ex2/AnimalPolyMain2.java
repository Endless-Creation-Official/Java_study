package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        //배열의 인덱스를 이용하여 인라인 변수 선언
        Animal[] animals = {new Dog(), new Cat(), new Caw()};
        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }
    //추상적인 Animal을 부모로 가진 class들이므로 모두 부모 타입으로 저장할 수 있다. 이를 이용하여 타입을 통일하고 코드를 줄일 수 있다.
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
