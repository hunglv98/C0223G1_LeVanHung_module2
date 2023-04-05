package ss3_array.extra_ex;

import java.util.Arrays;

public class Ex4Fibonacci {
    public static void main(String[] args) {
        int[] array = new int[100];
        array[0] = 0;
        array[1] = 1;
        int count = 2;
        for (int i = 2; i < 100; i++) {
            array[i] = array[i - 1] + array[i - 2];
            if (array[i] > 100) {
                break;
            } else count++;
        }
        int[] array1 = new int[count];
        for (int i = 0; i < count; i++) {
            array1[i] = array[i];
        }
        System.out.println(Arrays.toString(array1));
    }
}
