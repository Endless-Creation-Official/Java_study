package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        //stringList.add(3);
        String string = stringList.get(1);
        System.out.println(string);

        MyArrayListV4<Integer> integerList = new MyArrayListV4<>();
        integerList.add(3);
        integerList.add(1);
        integerList.add(2);

        Integer i = integerList.get(0);
        System.out.println(i);
    }
}
