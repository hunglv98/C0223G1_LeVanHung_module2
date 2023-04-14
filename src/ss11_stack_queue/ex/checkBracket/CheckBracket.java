package ss11_stack_queue.ex.checkBracket;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String str[] = input.split("");
        boolean flag = true;
        for (int i = 0; i < str.length; i++) {
            if (Objects.equals(str[i], "(")) {
                stack1.push(str[i]);
            }
            if (Objects.equals(str[i], ")")) {
                stack2.push(str[i]);
            }
            if (stack1.size() < stack2.size()) {
                flag = false;
                break;
            }
        }
        if (flag && stack1.size() == stack2.size()) {
            System.out.println("true");
        } else System.out.println("false");
    }
}
