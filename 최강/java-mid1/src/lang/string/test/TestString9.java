package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] split = fruits.split(",");
        String join = String.join("->", split);
        System.out.println(join);

    }
}
