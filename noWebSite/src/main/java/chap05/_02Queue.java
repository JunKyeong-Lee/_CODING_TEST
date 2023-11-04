package chap05;

import java.util.LinkedList;
import java.util.Queue;

public class _02Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        queue.add(arr[0]);
        queue.add(arr[1]);
        queue.add(arr[2]);
        queue.add(arr[3]);
        System.out.print(queue.poll() + " "); // 3
        System.out.print(queue.poll() + " "); // 2
        queue.add(arr[4]);
        queue.add(arr[5]);
        queue.add(arr[6]);
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " "); // 6 5 4 1 0
        }
    }
}
