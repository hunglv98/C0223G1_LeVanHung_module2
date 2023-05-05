package ex_extra;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mảng cha");
        String str1 = sc.nextLine();
        String[] arr1 = str1.split(",");
        System.out.println("Nhập vào mảng con");
        String str2 = sc.nextLine();
        String [] arr2 = str2.split(",");
        Map<String,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            int count =0;
            for (int j = 0; j < arr1.length; j++) {
                if(arr2[i].equals(arr1[j])){
                    count ++;
                }
                map.put(arr2[i], count);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer s: map.values()) {
            list.add(s);
        }

        int result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i)==0){
                result=0;
                break;
            }else if(list.get(i)<result){
                result = list.get(i);
            }
        }
        System.out.println(result);
        }
    }

