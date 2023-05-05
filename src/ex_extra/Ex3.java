package ex_extra;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một mảng");
        String str = sc.nextLine();
        String[] arr = str.split(",");
        boolean flag = false;
        for (int i = 1; i < arr.length - 1; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += Integer.parseInt(arr[j]);
            }
            for (int k = i + 1; k < arr.length; k++) {
                sum2 += Integer.parseInt(arr[k]);
            }
            if (sum1 == sum2) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}
