package lang.object.tostring;

public class Dog {
    private int age;
    private String name;

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
