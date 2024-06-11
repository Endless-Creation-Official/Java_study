package lang.object.equals;

public class EqualsMain2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2();
        UserV2 user2 = new UserV2();

        System.out.println("동일성 = " + (user1 == user2));
        System.out.println("동등성 = " + user1.equals(user2));

    }
}
