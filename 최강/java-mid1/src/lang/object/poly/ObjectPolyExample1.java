package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();

    }

    private static void action(Object object) {
        //object.move();
        //object.sound(); 컴파일 오류 object가 move와 sound가 없기 때문에

        //객체에 맞는 다운캐스팅 필요
        if (object instanceof Car car) {
            car.move();
        } else if (object instanceof Dog dog) {
            dog.sound();
        }

    }
}
