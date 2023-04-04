package ss3_array.ex;
import java.util.Scanner;
public class Ex_6_total_column {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột");
        int column = Integer.parseInt(sc.nextLine());
        double [][] array = new double[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Dòng "+i + " phần tử thứ " +j);
                array[i][j]=Double.parseDouble(sc.nextLine());
            }
        }
        double total = 0;
        System.out.println("Nhập cột cần tính tổng");
        int indexColumn = Integer.parseInt(sc.nextLine());
        for (double[] doubles : array) {
            total += doubles[indexColumn];
        }
        System.out.println("Tổng các số ở cột " +indexColumn +" bằng "+total);
    }
}
