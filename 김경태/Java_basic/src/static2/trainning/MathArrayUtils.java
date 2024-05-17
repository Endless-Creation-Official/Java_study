package static2.trainning;



public class MathArrayUtils {

    private MathArrayUtils() {
        //private 인스턴스 생성을 막는다.
    }
    public static int sum(int[] array) {
        int ret = 0;
        for(int e : array) {
            ret += e;
        }
        return ret;
    }

    public static double average(int[] array) {
        int ret = 0;
        for(int e : array) {
            ret += e;
        }
        return ret / array.length;
    }

    public static int min(int[] array) {
        int ret = array[0];
        for(int i=0; i<array.length; i++) {
            if(array[i] < ret) ret = array[i];
        }
        return ret;
    }
    public static int max(int[] array) {
        int ret = array[0];

        for(int i=0; i<array.length; i++) {
            if(array[i] > ret) ret = array[i];
        }
        return ret;
    }
}
