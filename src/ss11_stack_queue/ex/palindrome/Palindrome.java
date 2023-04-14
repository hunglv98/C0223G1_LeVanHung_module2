package ss11_stack_queue.ex.palindrome;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ");
        String str = sc.nextLine();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] arr = str.split("");
        for (String s : arr) {
            stack.push(s);
            queue.add(s);
        }
        boolean flag = true;
        for (int i = 0; i < stack.size(); i++) {
            if (!stack.pop().equals(queue.poll())) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(str + " is Palindrome");
        } else System.out.println(str + " is not Palindrome");
    }
}
