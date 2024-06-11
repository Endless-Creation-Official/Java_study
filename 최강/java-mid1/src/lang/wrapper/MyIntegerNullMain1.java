package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {

        MyInteger[] arr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(arr, -1));
        System.out.println(findValue(arr, -0));
        System.out.println(findValue(arr, -100));


    }

    private static MyInteger findValue(MyInteger[] myIntegers, int target) {
        for (MyInteger arr : myIntegers) {
            if (arr.getValue() == target) {
                return arr;
            }
        }
        return null;
    }
}
