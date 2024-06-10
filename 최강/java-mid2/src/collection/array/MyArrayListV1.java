package collection.array;

import javax.swing.plaf.SplitPaneUI;
import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1(Object[] elementData) {
        this.elementData = elementData;
    }

    public MyArrayListV1(int initalCapacity) {
        elementData = new Object[initalCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object object) {
        elementData[size] = object;
        size++;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size))
                +"size="+size+", capacity=" + elementData.length;

    }
}
