package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));

    }

    private static int findValue(int[] intArr, int target) {
        for (int arr : intArr) {
            if (arr == target) {
                return target;
            }
        }
        return -1;
    }
}
