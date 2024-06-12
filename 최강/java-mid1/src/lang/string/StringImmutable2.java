package lang.string;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat("java");
        System.out.println("str= " + str2);
        // 기존 값 변경 x 새로운 결과 만들어서 반환
    }
}
