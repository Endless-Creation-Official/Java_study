package collection.set;

public class HashSetMain3 {
    public static void main(String[] args) {
        HashSet2 set = new HashSet2(10);
        Member hi = new Member("hi");
        Member jpa = new Member("JPA"); //대문자 주의!
        Member java = new Member("java");
        Member spring = new Member("spring");

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        System.out.println(set);

        Member findValue = new Member("hi");
        boolean result = set.contains(findValue);
        System.out.println(result);

    }
}
