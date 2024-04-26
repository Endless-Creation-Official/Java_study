package static2.ex;

public class MathArrayUtils {
    static int[] array;

    private MathArrayUtils(int[] array) {}

    public static int sum(int[] array) {
        MathArrayUtils.array = array;
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static double average(int[] array) {
        return (double)sum(array)/array.length;
    }

    public static int min(int[] array) {
        MathArrayUtils.array = array;
        int min = array[0];
        for (int i = 1; i<array.length; i++) {
            if (min>array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        MathArrayUtils.array = array;
        int max = array[0];
        for (int i = 1; i<array.length; i++) {
            if (max<array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
