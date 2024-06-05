package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.setVlaue(10);
        //integer.setVlaue("hello");
        Integer integerValue = integerBox.getValue();
        System.out.println(integerValue);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setVlaue("hello");
        String stringBoxValue = stringBox.getValue();
        System.out.println(stringBoxValue);

    }
}
