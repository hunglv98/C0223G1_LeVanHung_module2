package ss3_array.ex;

import java.util.Scanner;

public class Ex8CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "CODEGYMCODEGYM";
        char c = 'C';
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (c == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện là " + count);
    }
}
