package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        // 확장 용이
        KiaCar kiaCar = new KiaCar();
        driver.setCar(kiaCar);
        driver.drive();
    }
}
