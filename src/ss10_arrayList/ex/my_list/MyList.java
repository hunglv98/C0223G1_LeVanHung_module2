package ss10_arrayList.ex.my_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void remove(E e) {
        if (indexOf(e) < 0) {
            System.out.println("Không có " + e + " trong Array");
        } else {
            for (int i = indexOf(e); i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            System.out.println(Arrays.toString(elements));

        }

    }

    public int indexOf(E e) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == e) {
                index = i;
                break;
            }
        }
        return index;
    }
}

