package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("ModelY");
        Dog dog1 = new Dog("강아지1", 3);
        Dog dog2 = new Dog("강아지2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        //println 내부에서 toString 호출
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        // ObjectPrinter 클래스의 static 함수인 print를 바로 사용할 수 있음
        // static 함수이기 때문에
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        String ref = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("ref=" + ref);
    }
}
