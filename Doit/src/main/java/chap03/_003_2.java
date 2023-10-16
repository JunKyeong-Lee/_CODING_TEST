package chap03;
// https://www.acmicpc.net/problem/11659

import java.util.Scanner;

public class _003_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] S = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            S[i] = S[i - 1] + sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(S[b] - S[a - 1]);
        }
    }
}
