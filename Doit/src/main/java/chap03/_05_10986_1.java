package chap03;

import java.util.Scanner;

public class _05_10986_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] S = new long[N + 1];
        long[] count = new long[M];
        long answer = 0;
        for (int i = 1; i <= N; i++) {
            S[i] += S[i - 1] + sc.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            if (S[i] % M == 0) answer++;
            count[(int) (S[i] % M)]++;
        }
        for (int i = 0; i < M; i++) {
            answer += count[i] * (count[i] - 1) / 2;
        }
        System.out.println(answer);
    }
}
