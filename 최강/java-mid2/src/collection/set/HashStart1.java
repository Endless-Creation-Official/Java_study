package collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        int[] input = new int[10];
        input[1] = 1;
        input[2] = 2;
        input[5] = 5;
        input[8] = 8;
        System.out.println(Arrays.toString(input));

        int findVal = 8;
        int result = input[findVal];
        System.out.println(result);
        // 데이터의 값을 인덱스를 이용해 사용
        // 그러나 낭비되는 공간이 많다는 단점
    }

}
