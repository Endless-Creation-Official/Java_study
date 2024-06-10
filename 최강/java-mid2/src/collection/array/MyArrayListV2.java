package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object obj) {
        // 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = obj;
        size++;
    }

    //코드 추가
    public void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        // 배열을 만들고, 기존 배열을 새로운 배열에 복사
      /*  Object[] newArr = new Object[newCapacity]; // 배열의 크기 설정
        for (int i = 0; i < elementData.length; i++) {
            newArr[i] = elementData[i];
        }
        */
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < size; i++) {
            if (obj.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public Object set(int index, Object obj) {
        Object oldValue = get(index);
        elementData[index] = obj;
        return oldValue;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" +
                size + ", capacity=" + elementData.length;
    }

}
