package chap03;
// https://www.acmicpc.net/problem/11003

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _010_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Long> queue = new LinkedList<>();

        int N = sc.nextInt(); // 숫자의 개수
        int L = sc.nextInt(); // 슬라이딩 윈도우 크기
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        long min = A[0];
        for (int i = 0; i < N; i++) {
            if (queue.size() < L) {
                queue.offer(A[i]);
            }
            System.out.print(Collections.min(queue) + " ");
            if (queue.size() >= L) {
                queue.poll();
            }
        }
        System.out.println();
    }
}
