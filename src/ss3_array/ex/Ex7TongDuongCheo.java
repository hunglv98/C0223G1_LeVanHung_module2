package ss3_array.ex;

import java.util.Scanner;

public class Ex7TongDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước của ma trận vuông");
        int size = Integer.parseInt(sc.nextLine());
        double[][] array = new double[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Phần tử thứ " + j + " của dòng " + i);
                array[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i + j == array.length - 1) {
                    total += array[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo bằng " + total);
    }
}

