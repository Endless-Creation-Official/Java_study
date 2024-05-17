package static2.trainning;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");

        System.out.println("구매한 차량 수: " + Car.count);

    }
}
