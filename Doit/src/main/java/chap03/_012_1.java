package chap03;

import java.util.Scanner;
import java.util.Stack;

public class _012_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int[] inputArr = new int[N];
        int[] resultArr = new int[N];
        for (int i = 0; i < N; i++) {
            inputArr[i] = sc.nextInt();
        }
        stack.push(0);

        for (int i = 1; i < N; i++) {
            while (!stack.isEmpty() && inputArr[stack.peek()] < inputArr[i]) {
                resultArr[stack.pop()] = inputArr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            resultArr[stack.pop()] = -1;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(resultArr[i] + " ");
        }
    }
}
