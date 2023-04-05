package ss3_array.extra_ex;

import java.util.Scanner;

public class Ex1IsOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra");
        int input = Integer.parseInt(sc.nextLine());
        System.out.println(isOdd(input));
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }
}
