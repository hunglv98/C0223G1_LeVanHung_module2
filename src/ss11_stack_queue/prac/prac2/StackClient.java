package ss11_stack_queue.prac.prac2;

import java.util.Arrays;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack(10);
        myStack.push(1);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        System.out.println(Arrays.toString(myStack.getArr()));
        System.out.println(myStack.pop());


    }
}
