package collection.set;

import java.util.Arrays;
import java.util.LinkedList;


public class HashStart3 {
    private static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckests = new LinkedList[CAPACITY];
        System.out.println(Arrays.toString(buckests));
        for (int i = 0; i < CAPACITY; i++) {
            buckests[i] = new LinkedList<>();
        }
        System.out.println(Arrays.toString(buckests));

        add(buckests, 1);
        add(buckests, 2);
        add(buckests, 5);
        add(buckests, 8);
        add(buckests, 14);
        add(buckests, 99);
        add(buckests, 9);
        System.out.println(Arrays.toString(buckests));

        // 검색
        int findVal = 9;
        boolean result = extracted(findVal, buckests);
        System.out.println("bucket.contains(" + findVal + ") = " + result);


    }

    private static boolean extracted(int findVal, LinkedList<Integer>[] buckests) {
        int hashIndex = hashIndex(findVal);
        LinkedList<Integer> bucket = buckests[hashIndex];
        return bucket.contains(findVal);
    }

    private static void add(LinkedList<Integer>[] buckests, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckests[hashIndex];
        if (!bucket.contains(value)) {
            bucket.add(value);
        }

    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}

