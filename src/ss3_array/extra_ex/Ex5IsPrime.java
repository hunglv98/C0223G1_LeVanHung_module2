package ss3_array.extra_ex;

import java.util.Scanner;

public class Ex5IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra");
        int input = Integer.parseInt(sc.nextLine());
        System.out.println(isPrime(input));
    }

    public static boolean isPrime(int x) {
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                flag = false;
                break;
            } else flag = true;
        }
        return flag;
    }
}
