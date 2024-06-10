package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY]; // 이레이저 때문에 생성자에는 제너릭 도입 불가
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E obj) {
        // 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = obj;
        size++;
    }

    public void add(int index, E e) {
        if (size == elementData.length) {
            grow();
        }
        // 왼쪽에 있는 데이터를 오른쪽으로
        shiftRightfrom(index);
        elementData[index] = e;
        size++;
    }

    private void shiftRightfrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }


    // 코드 추가
    public E remove(int index) {
        E oldValue = get(index);
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size-1; i++) {
            elementData[i] = elementData[i+1];
        }
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


    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E)elementData[index];
    }

    public int indexOf(E obj) {
        for (int i = 0; i < size; i++) {
            if (obj.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public E set(int index, E obj) {
        E oldValue = get(index);
        elementData[index] = obj;
        return oldValue;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" +
                size + ", capacity=" + elementData.length;
    }

}
