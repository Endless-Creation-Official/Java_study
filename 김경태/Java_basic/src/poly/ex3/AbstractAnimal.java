package poly.ex3;

//추상 클래스
abstract class AbstractAnimal {

    public abstract void sound(); //오버라이딩 목적 함수

    public void move() {
        System.out.println("동물이 움직입니다."); //실제 사용 함수
    }
}
