package chap04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2750
/*버블 선택 삽입 퀵(분할) 변할 기수*/
/*N개의 수가 주어졌을 때 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * */
public class _015_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        radixSort(arr);
        print(arr);
    }

    private static void radixSort(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        Queue<Integer>[] queues = new Queue[10];
        for (int i = 0; i < queues.length; i++) {
            queues[i] = new LinkedList<>();
        }
        for (int d = 1; max / d > 0; d *= 10) {
            for (int i = 0; i < arr.length; i++) {
                queues[(arr[i] / d) % 10].add(arr[i]);
            }
            int i = 0;
            for (var x : queues) {
                if (!x.isEmpty()) {
                    arr[i++] = x.poll();
                }
            }
        }
    }


    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
