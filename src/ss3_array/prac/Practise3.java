package ss3_array.prac;
import java.util.Scanner;
public class Practise3 {
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
        System.out.println("Nhập lần lượt tài sản của các tỷ phú");
        for (int i = 0; i < array.length; i++) {
            array[i]= Integer.parseInt(sc.nextLine());
        }
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
                index = i;
            }
        }
        System.out.println("Max bằng "+max + " ở vị trí thứ "+(index+1));
    }
}
