package ss13_search.ex;

import java.util.*;

public class SearchValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng");
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            array[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(array);
        System.out.println("Nhập giá trị cần tìm");
        int value = Integer.parseInt(sc.nextLine());
        int result = binarySearch(array, 0, n, value);
        if (result == -1) {
            System.out.println("Không tìm thấy giá trị");
        } else System.out.println("Giá trị nằm ở vị trí thứ " + (result + 1));
    }

    static int binarySearch(int[] array, int low, int high, int value) {
        if (high >= low) {
            int mid = (high + low) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (array[mid] > mid) {
                return binarySearch(array, mid + 1, high, value);
            }
            return binarySearch(array, low, mid - 1, value);
        }
        return -1;
    }
}
