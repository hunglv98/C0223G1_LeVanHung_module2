package ss3_array.prac;
import java.util.Scanner;
public class Practise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Nhập vào tên cần tìm");
        String input = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if(input.equals(students[i])){
                System.out.println(input + " nằm trong list và có vị trí là " + i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(input +" không nằm trong list");
        }
    }
}
