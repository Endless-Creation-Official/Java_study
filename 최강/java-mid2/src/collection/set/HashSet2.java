package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashSet2 {
    static final int CAPACITY = 16;

    private int capacity = CAPACITY;
    private int size;

    LinkedList<Object>[] buckets;

    public HashSet2()
    {
        initBuckets();
    }

    public HashSet2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    public boolean add(Object value) {
        LinkedList<Object> bucket = buckets[hashIndex(value)];
        if (!bucket.contains(value)) {
            bucket.add(value);
            size++;
            return true;
        }
        return false;
    }

    public boolean contains(Object value) {
        LinkedList<Object> bucket = buckets[hashIndex(value)];
        if (bucket.contains(value)) {
            return true;
        }
        return false;
    }

    public boolean remove(Object value) {
        LinkedList<Object> bucket = buckets[hashIndex(value)];
        boolean result = bucket.remove(value);
        if (result) {
            size--;
            return true;
        }
        return false;
    }

    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) % capacity;
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
        return "HashSet2{" +
                "capacity=" + capacity +
                ", size=" + size +
                ", buckets=" + Arrays.toString(buckets) +
                '}';
    }
}
