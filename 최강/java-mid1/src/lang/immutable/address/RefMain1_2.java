package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;

        System.out.println("a= " + a);
        System.out.println("b= " + b);

        // b.setValue("부산"); 오류
         b = new ImmutableAddress("부산");

        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
}
