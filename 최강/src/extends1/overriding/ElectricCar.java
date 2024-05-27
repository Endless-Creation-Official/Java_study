package extends1.overriding;

public class ElectricCar extends Car {
    @Override
    public void move() {
        System.out.println("차가 빠르게 이동합니다");
    }
    public void charge() {
        System.out.println("차를 충전합니다");
    }
    // move 메서드를 따로 정의하진 않았지만 car로부터 상속받아 쓴다
}
