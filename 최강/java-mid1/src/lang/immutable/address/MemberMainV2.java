package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");
        MemberV2 member1 = new MemberV2("고객1", address);
        MemberV2 member2 = new MemberV2("고객2", address);

        System.out.println("member1의 주소:" + member1);
        System.out.println("member2의 주소:" + member2);

        // 멤버2의 주소를 부산으로 변경
        System.out.println("멤버2의 주소를 부산으로 변경");
        // member2.getAddress().setValue("부산");컴파일 오류
        member2.setAddress(new ImmutableAddress("부산"));

        System.out.println("member1의 주소:" + member1);
        System.out.println("member2의 주소:" + member2);

    }
}
