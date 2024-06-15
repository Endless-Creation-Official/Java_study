package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String[] split = str.split("\\.");
        System.out.println(split[0]);

        /*String filename = str.substring(0, 5);
        String extName = str.substring(5, 9);
        */
    }
}
