package chap03;
// https://www.acmicpc.net/problem/1546

import java.util.Scanner;

public class _002_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] scoreArr = new int[N + 1];
        int max = -1;
        double mean = 0;
        for (int i = 1; i <= N; i++) {
            scoreArr[i] = sc.nextInt();
            mean += scoreArr[i];
            max = Math.max(max, scoreArr[i]);
        }
        mean = mean / N;
        mean = mean / max * 100;

        System.out.println(mean);
    }
}