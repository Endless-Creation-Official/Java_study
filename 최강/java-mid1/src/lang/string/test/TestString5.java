package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int i = str.indexOf(".txt");
        String filename = str.substring(0, i);
        String extname = str.substring(i, 9);

        System.out.println(filename);
        System.out.println(extname);

    }
}
