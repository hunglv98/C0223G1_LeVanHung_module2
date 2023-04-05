package ss3_array.extra_ex;

import java.util.Scanner;

public class Ex3IsLeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào năm cần kiểm tra");
        int input = Integer.parseInt(sc.nextLine());
        System.out.println(isLeap(input));
    }

    public static boolean isLeap(int n) {
        if (n % 400 == 0 || n % 4 == 0 && n % 100 != 0) {
            return true;
        }
        return false;
    }
}
