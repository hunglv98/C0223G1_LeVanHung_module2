package ss3_array.ex;

import java.util.Scanner;

public class Ex_1_xoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1));
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhập vào phần tử cần xóa");
        int input = Integer.parseInt(sc.nextLine());
        while (checkInList(input,array)!=(-1)){
            replace(checkInList(input,array),array);
        }
        System.out.println("Mảng sau khi xóa là");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static int checkInList(int a, int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if(a==array[i]){
                index = i ;
                break;
            }
        }
        return index;
    }
    public static void replace(int index, int[]array){
        if (index == array.length - 1) {
            array[index] = 0;
        } else {
            for (int i = index; i < array.length - 1; i++) {
                int temp = 0;
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
    }
}
