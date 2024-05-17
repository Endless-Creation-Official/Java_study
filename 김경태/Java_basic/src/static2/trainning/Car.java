package static2.trainning;

public class Car {
    String name;
    static int count;
    static Car[] list = new Car[20];

    public Car(String name) {
        this.name = name;
        System.out.println("차량 구입, 이름: " + name);
        count++;
    }

}
