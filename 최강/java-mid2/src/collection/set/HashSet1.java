package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashSet1 {
    static final int CAPACITY = 16;

    private int capacity = CAPACITY;
    private int size;

    LinkedList<Integer>[] buckets;

    public HashSet1() {
        initBuckets();
    }

    public HashSet1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    public boolean add(int value) {
        LinkedList<Integer> bucket = buckets[hashIndex(value)];
        if (!bucket.contains(value)) {
            bucket.add(value);
            size++;
            return true;
        }
        return false;
    }

    public boolean contains(int value) {
        LinkedList<Integer> bucket = buckets[hashIndex(value)];
        if (bucket.contains(value)) {
            return true;
        }
        return false;
    }

    public boolean remove(int value) {
        LinkedList<Integer> bucket = buckets[hashIndex(value)];
        boolean result = bucket.remove(Integer.valueOf(value));
        if (result) {
            size--;
            return true;
        }
        return false;
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "HashSet1{" +
                "capacity=" + capacity +
                ", size=" + size +
                ", buckets=" + Arrays.toString(buckets) +
                '}';
    }
}
