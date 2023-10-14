package plus.code._9370._7._1978;

import java.util.Scanner;

/*
 * 주어진 수 N개 중에서 소수가 몇 개 인지 찾아서 출력하는 프로그램
 *
 * 첫줄에 수의 개수 N*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N은 100 이하

        int[] dp = new int[1001];
        // 입력값은 1000 이하의 자연수.
        // 소수인경우 0, 아닌경우 1 으로
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= 1000; i++) {
            if (dp[i] == 0) {
                for (int j = 2; i * j <= 1000; j++) {
                    dp[i * j] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            if (dp[input] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
