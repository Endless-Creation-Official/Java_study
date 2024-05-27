package extends1.ex2;

public class ElectricCar extends Car {

    public void charge() {
        System.out.println("차를 충전합니다");
    }
    // move 메서드를 따로 정의하진 않았지만 car로부터 상속받아 쓴다
}
