package ex_extra;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result += arr[i].toLowerCase();
            } else if (arr[i].equals(arr[i].toUpperCase())) {
                result += " " + arr[i].toLowerCase();
            } else result += arr[i];
        }
        System.out.println(result);
    }
}
