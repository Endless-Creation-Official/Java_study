package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        Model3Car model3Car = new Model3Car();

        driver.setK3Car(k3Car);// 외부에서 차의 참조값이 넘어와서
        driver.drive(); // 기능 수행이 가능해짐

        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
