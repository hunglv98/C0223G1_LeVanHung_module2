package ss3_array.ex;
import java.util.Scanner;
public class Ex_5_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phẩn tử của mảng");
        int size = Integer.parseInt(sc.nextLine());
        double [] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            array[i]= Double.parseDouble(sc.nextLine());
        }
        double min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min=array[i];
                index = i;
            }
        }
        System.out.println("Min bằng "+ min+ " ở vị trí thứ "+index);
    }
}
