package ex_extra;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] arr = str.split(",");
        Map<String,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else map.put(arr[i], map.get(arr[i])+1);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer i: map.values()) {
            arrayList.add(i);
        }
        boolean flag = true;
        for (int i = 0; i < arrayList.size()-1; i++) {
            if(arrayList.get(i) != arrayList.get(i+1)){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
