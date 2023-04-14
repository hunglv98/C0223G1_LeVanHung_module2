package ss11_stack_queue.ex.exchange;

import java.util.Arrays;
import java.util.Stack;
import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập vào 1 số nguyên");
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        while (input != 0) {
            stack.push(input % 2);
            input /= 2;
        }
        System.out.println(stack);
        int[] array = new int[stack.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
        StringBuilder str = new StringBuilder();
        for (int j : array) {
            str.append(j);
        }
        System.out.println("hệ nhị phận của số vừa nhập là " + str);
    }
}
