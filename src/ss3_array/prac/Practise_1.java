package ss3_array.prac;

import java.util.Scanner;

public class Practise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Nhập vào kích thước của mảng");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20) {
                System.out.println("Mảng không được quá 20 phần tử");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào kí tự thứ "+ (i+1));
            array[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("mảng sau khi đảo mảng");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
