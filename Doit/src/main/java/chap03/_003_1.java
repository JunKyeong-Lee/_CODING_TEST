package chap03;
// https://www.acmicpc.net/problem/11659

import java.util.Scanner;

public class _003_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N + 1];
        long[] S = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
            S[i] = S[i - 1] + A[i];
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(S[b] - S[a - 1]);
        }
    }
}
