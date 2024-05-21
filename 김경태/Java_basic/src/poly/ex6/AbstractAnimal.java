package poly.ex6;

public abstract class AbstractAnimal {
    public abstract void sound();//추상 메서드
    public void move() {
        System.out.println("동물이 이동합니다.");//상속 목적 메서드
    }
}
