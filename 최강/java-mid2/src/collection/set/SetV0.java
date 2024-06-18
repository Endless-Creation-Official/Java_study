package collection.set;

import java.util.Arrays;

public class SetV0 {
    private int[] setArray = new int[10];
    private int size;

    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }
        setArray[size] = value;
        size++;
        return true;
    }

    public boolean contains(int value) {
        for (int data : setArray) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "SetV0{" +
                "setArray=" + Arrays.toString(Arrays.copyOf(setArray, size)) +
                ", size=" + size +
                '}';
    }
}
