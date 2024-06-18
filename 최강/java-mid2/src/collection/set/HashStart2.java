package collection.set;

import java.util.Arrays;

public class HashStart2 {
    static final int capacity = 10;

    public static void main(String[] args) {
        System.out.println(hashIndex(1));
        System.out.println(hashIndex(2));
        System.out.println(hashIndex(5));
        System.out.println(hashIndex(8));
        System.out.println(hashIndex(14));
        System.out.println(hashIndex(99));

        int[] arr = new int[capacity];
        add(arr, 1);
        add(arr, 2);
        add(arr, 5);
        add(arr, 8);
        add(arr, 14);
        add(arr, 99);
        System.out.println(Arrays.toString(arr));

        // 검색
        int findval = 14;
        int result = arr[hashIndex(14)];
        System.out.println(result);
    }

    private static void add(int[] arr, int value) {
        int hashIndex = hashIndex(value);
        arr[hashIndex] = value;
    }

    private static int hashIndex(int value) {
        return value % capacity;
    }

}

