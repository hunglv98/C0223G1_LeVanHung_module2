package ss2_loop.prac;

import java.util.Scanner;

public class Practise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số bất kỳ");
        int input = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        if (input < 2) {
            System.out.println(input + " Không phải là số nguyên tố");
        } else {
            for (int i = 2; i <= Math.sqrt(input); i++) {
                if (input % i == 0) {
                    flag = true;
                    break;
                } else flag = false;
            }
        }
        if (flag) {
            System.out.println(input + " Không phải là số nguyên tố");
        } else {
            System.out.println(input + " là một số nguyên tố");
        }
    }
}
