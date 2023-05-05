package ex_extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String str = sc.nextLine();
        String [] arr = str.split(",");
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s: arr) {
            if(!s.equals("-1")){
                arrayList.add(s);
            }
        }
        Collections.sort(arrayList);
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("-1"))
            arr[i] = arrayList.remove(0);
        }
        System.out.println(Arrays.toString(arr));
    }
}
