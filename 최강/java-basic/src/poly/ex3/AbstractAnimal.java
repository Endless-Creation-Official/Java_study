package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound(); //바디가 있으면 안됨, 자식이 오버라이딩 해야 함

    public void move() {
        System.out.println("동물이 움직입니다");
    }
}
