package collection.set;

public class HashSetMain1 {
    public static void main(String[] args) {
        HashSet1 set = new HashSet1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(99);
        set.add(9);

        System.out.println(set);;

        int findValue = 9;
        boolean contains = set.contains(findValue);
        System.out.println("set contains(" + findValue + ") = " + contains);

        boolean remove = set.remove(1);
        System.out.println(set);

    }
}
