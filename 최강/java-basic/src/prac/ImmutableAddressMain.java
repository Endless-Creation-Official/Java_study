package prac;

public class ImmutableAddressMain {
    public static void main(String[] args) {
        ImmutableAddress address1 = new ImmutableAddress("서울");
        ImmutableAddress address2 = address1;
        System.out.println("address1=" + address1);
        System.out.println("address2=" + address2);

        //ImmutableAddress address2 = new ImmutableAddress("부산");
         address2 = new ImmutableAddress("부산");
        //address2.setValue();
        System.out.println("address1=" + address1);
        System.out.println("address2=" + address2);


    }
}
