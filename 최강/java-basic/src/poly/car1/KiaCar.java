package poly.car1;

public class KiaCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("KiaCar.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("KiaCar.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("KiaCar.pressAccelerator");
    }
}
