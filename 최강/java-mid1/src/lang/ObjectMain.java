package lang;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString 은 object 클래스의 메서드
        String string = child.toString();
        System.out.println(string);

    }
}
