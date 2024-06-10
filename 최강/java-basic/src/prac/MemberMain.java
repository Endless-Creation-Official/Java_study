package prac;

public class MemberMain {
    public static void main(String[] args) {
        Address address = new Address("서울");
        MemberV1 a = new MemberV1("회원A", address);
        MemberV1 b = new MemberV1("회원B", address);

        System.out.println("회원a의 주소:" + a);
        System.out.println("회원b의 주소:" + b);

        // b의 주소를 부산으로 바꿔보자
        /*Address address2 = new Address("부산");
        b.setAddress(address2);
*/
        // b.getAddress().setName("부산");
        a.setAddress(new Address("부산"));

        System.out.println("회원a의 주소:" + a);
        System.out.println("회원b의 주소:" + b);

    }
}
