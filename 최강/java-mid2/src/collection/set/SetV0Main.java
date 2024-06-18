package collection.set;

public class SetV0Main {
    public static void main(String[] args) {
        SetV0 set = new SetV0();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        boolean result = set.add(5);
        System.out.println("중복 데이터 저장결과="+result);

        System.out.println(set);
        boolean contains = set.contains(4);
        System.out.println("4를 포함하는가?" + contains);

    }
}
