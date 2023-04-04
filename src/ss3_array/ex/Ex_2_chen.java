package ss3_array.ex;
import java.util.Scanner;
public class Ex_2_chen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng");
        int size = Integer.parseInt(sc.nextLine());
        int [] array = new int[size];
        int [] array1 = new int[size+1];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ"+ i);
            array[i]= Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhập vào số cần chèn");
        int input = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào vị trí cần chèn");
        int index = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < array1.length; i++) {
            if(i<index){
                array1[i]=array[i];
            }else if(i==index){
                array1[i] = input;
            }else{
                array1[i]=array[i-1];
            }
        }
        System.out.println("Mảng sau khi đã chèn là");
        for (int j : array1) {
            System.out.print(j + " ");
        }
    }
}
