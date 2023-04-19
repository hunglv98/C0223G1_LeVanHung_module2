package ss14_sort;

import java.util.Arrays;

public class SettingInsertSort {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 1, 10, 12};
        insertionSort(array);
        System.out.println("Mảng sau khi sắp xếp " + Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }
}
