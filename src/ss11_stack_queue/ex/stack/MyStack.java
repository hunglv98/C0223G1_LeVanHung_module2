package ss11_stack_queue.ex.stack;

import java.util.Arrays;
import java.util.Stack;
import java.util.Scanner;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập vào số lượng phần tử ");
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = size - 1; i >= 0; i--) {
            stack.push(arr[i]);
        }
        System.out.println("Mảng sau khi đảo" + stack);
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            int s = stack.pop();
            newArray[i] = s;
        }
        System.out.print("Mảng ban đầu");
        System.out.println(Arrays.toString(newArray));

    }
}