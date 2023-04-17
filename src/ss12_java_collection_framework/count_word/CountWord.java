package ss12_java_collection_framework.count_word;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi bất kỳ");
        String input = sc.nextLine();
        Map<String, Integer> map = new TreeMap<>();
        String[] array = input.split(" ");
        for (String s : array) {
            String convertInput = s.toUpperCase();
            if (!map.containsKey(convertInput)) {
                map.put(convertInput, 1);
            } else {
                map.put(convertInput, map.get(convertInput) + 1);
            }
        }
        System.out.println(map);
    }
}

