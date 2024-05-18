package extends1.ex3.overriding;

public class ElectricCar extends Car {
    public void charge() {
        System.out.println("충전합니다.");
    }
    //애노테이션 : 오버라이딩되었는지 확인
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
}
