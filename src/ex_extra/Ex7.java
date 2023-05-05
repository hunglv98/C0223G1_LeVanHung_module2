package ex_extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex7 {
    public static boolean checkSoNguyenTo(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng");
        int n = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào phần tử hàng " + i);
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phần tử thứ " + j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (checkSoNguyenTo(arr[i][j])) {
                    if (!list.contains(arr[i][j]))
                        list.add(arr[i][j]);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
