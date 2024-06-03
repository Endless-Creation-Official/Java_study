package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;

        System.out.println("a= " + a);
        System.out.println("b= " + b);

        changeValue(b, "부산");

        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }

    private static void changeValue(Address address, String changeAddress) {
        System.out.println("주소값을 변경합니다:" + changeAddress);
        address.setValue("부산");
    }
}
