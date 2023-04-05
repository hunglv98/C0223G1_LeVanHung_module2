package ss2_loop.prac;
import java.util.Scanner;
public class Practise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số b");
        int b = Integer.parseInt(sc.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        }else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
        }
        System.out.println("Ước chung lớn nhất là " + a);
    }
}
