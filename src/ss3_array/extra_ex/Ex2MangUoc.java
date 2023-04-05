package ss3_array.extra_ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2MangUoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra");
        int input = Integer.parseInt(sc.nextLine());
        System.out.println(Arrays.toString(addToArray(input)));
    }

    public static int[] addToArray(int n) {
        int count = 0;
        int[] array = new int[n];
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                array[count] = i;
                count++;
            }
        }
        int[] array1 = new int[count];
        for (int i = 0; i < count; i++) {
            array1[i] = array[i];
        }
        return array1;
    }
}
