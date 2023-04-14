package ss11_stack_queue.ex.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MyStack2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi bất kỳ");
        String str = sc.nextLine();
        String[] arr = str.split("");
        for (int i = arr.length - 1; i >= 0; i--) {
            stack.push(arr[i]);
        }
        System.out.println(stack);
        String finalString = String.join("", stack) + str;
        System.out.println(finalString);
    }
}
