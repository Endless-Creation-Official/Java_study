package static2;

public class DecoMain2 {
    public static void main(String[] args) {

        String s = "hello java";
        //정적 메소드: 불필요한 인스턴스 생성 없이 class로 접근가능
        String deco = DecoUtill2.deco(s);
        System.out.println("before: " + s);
        System.out.println("after: " + deco);

    }
}
