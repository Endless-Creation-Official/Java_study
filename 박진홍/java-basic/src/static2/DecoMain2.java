package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);//static 메서드 이용

        System.out.println("before:" + s);
        System.out.println("after:" + deco);
    }
}
