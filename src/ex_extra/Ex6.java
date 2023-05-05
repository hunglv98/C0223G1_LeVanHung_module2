package ex_extra;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một mảng");
        String str = sc.nextLine();
        String [] arr = str.split("");
        Map<String,Integer> map = new LinkedHashMap<>();
        for (String value : arr) {
            if (!map.containsKey(value)) {
                map.put(value, 1);
            } else map.put(value, map.get(value) + 1);
        }
        ArrayList<String> list = new ArrayList<>();
        for (String s: map.keySet()) {
            if(map.get(s)>1){
                list.add(s);
            }
        }
        System.out.println(list);
    }
}
