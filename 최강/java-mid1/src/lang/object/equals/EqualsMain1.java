package lang.object.equals;

public class EqualsMain1 {
    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("id100");
        UserV1 userV2 = new UserV1("id100");

        System.out.println("동일성 비교 = " + (userV1 == userV2));
        System.out.println("동등성 비교= " + userV1.equals(userV2));
    }
}
