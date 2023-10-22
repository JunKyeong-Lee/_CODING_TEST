package chap04;
/*https://www.acmicpc.net/problem/10989*/

import java.util.*;

public class _022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 첫째줄. 수의 개수

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        radixSort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i] + "\n");
        }
        System.out.print(sb);
    }

    private static void radixSort(int[] arr) {
        int max = 0;
        for (var x : arr) {
            max = Math.max(max, x);
        }

        Queue<Integer>[] queues = new LinkedList[10];
        for (int i = 0; i < 10; i++) {
            queues[i] = new LinkedList<>();
        }

        for (int d = 1; (max / d) > 0; d *= 10) {
            for (int num : arr) {
                queues[(num / d) % 10].add(num);
            }
            int i = 0;
            for (var q : queues) {
                while (!q.isEmpty()) {
                    arr[i++] = q.poll();
                }
            }
        }
    }
//    static void radixSort(int[] arr) {
//        int max = 0;
//        for (var x : arr) {
//            max = Math.max(x, max);
//        }
//
//        Queue<Integer>[] queues = new LinkedList[10];
//        for (int i = 0; i < 10; i++) {
//            queues[i] = new LinkedList<>();
//        }
//
//        for (int d = 1; max / d > 0; d *= 10) {
//            for (int num : arr) {
//                int index = (num / d) % 10;
//                queues[index].add(num);
//            }
//
//            int i = 0;
//            for (var queue : queues) {
//                while (!queue.isEmpty()) {
//                    arr[i++] = queue.poll();
//                }
//            }
//        }
//    }
}