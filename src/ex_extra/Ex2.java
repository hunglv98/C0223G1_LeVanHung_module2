package ex_extra;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Nhập vào chuỗi 1");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Nhập vào chuỗi 2");
        String str2 = sc.nextLine();
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        ArrayList arrayList2 = new ArrayList();
        for (String s : arr2) {
            arrayList2.add(s);
        }
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            int index = arrayList2.indexOf(arr1[i]);
            if (index != -1) {
                count++;
                arrayList2.remove(index);
            }
        }
        System.out.println(count);
    }
}
