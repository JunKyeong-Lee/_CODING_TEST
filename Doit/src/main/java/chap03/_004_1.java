package chap03;
// https://www.acmicpc.net/problem/11660

import java.util.Scanner;

public class _004_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 표의 크기
        int M = sc.nextInt(); // 합을 구해야할 횟수
        long[][] S = new long[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int num = sc.nextInt();
                S[i][j] = S[i - 1][j] + S[i][j - 1] - S[i - 1][j - 1] + num;
            }
        }
        for (int i = 0; i < M; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            System.out.println(S[x2][y2] - S[x2][y1 - 1] - S[x1 - 1][y2] + S[x1 - 1][y1 - 1]);
        }
    }
}
