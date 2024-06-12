package lang.string;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str1 = "hello";
        str1.concat("java");
        System.out.println("str= " + str1);
        // String은 불변이기 때문에 str1 값이 변하지 않음
    }
}
