package ss3_array.ex;

import java.util.Scanner;

public class Ex4Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột");
        int column = Integer.parseInt(sc.nextLine());
        double[][] array = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        double max = array[0][0];
        int indexRow = 0;
        int indexCol = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.println("Max bằng " + max + " chỉ số dòng " + indexRow + " chỉ số cột " + indexCol);
    }
}
