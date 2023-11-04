package chap05;

import java.util.Stack;

public class _01Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        stack.push(arr[0]);
        stack.push(arr[1]);
        stack.push(arr[2]);
        stack.push(arr[3]);
        System.out.print(stack.pop() + " "); // 3
        System.out.print(stack.pop() + " "); // 2
        stack.push(arr[4]);
        stack.push(arr[5]);
        stack.push(arr[6]);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // 6 5 4 1 0
        }
    }
}
