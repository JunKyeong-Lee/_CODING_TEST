package chap04;

import java.util.LinkedList;
import java.util.Queue;

public class Radix {
    public static void main(String[] args) {
        int[] arr = {42, 32, 24, 60, 15, 5, 90, 45, 18, 30};

        print(arr);
        radixSort(arr);
        print(arr);
    }

    static void radixSort(int[] arr) {
        int max = 0;
        for (var x : arr) {
            max = Math.max(x, max);
        }

        Queue<Integer>[] queues = new LinkedList[10];
        for (int i = 0; i < 10; i++) {
            queues[i] = new LinkedList<>();
        }

        for (int d = 1; max / d > 0; d *= 10) {
            for (int num : arr) {
                int index = (num / d) % 10;
                queues[index].add(num);
            }

            int i = 0;
            for (var queue : queues) {
                while (!queue.isEmpty()) {
                    arr[i++] = queue.poll();
                }
            }
        }
    }

    public static void print(int[] arr) {
        for (var x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
