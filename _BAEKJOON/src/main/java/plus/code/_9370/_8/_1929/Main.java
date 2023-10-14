package plus.code._9370._8._1929;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 1000000;
        int[] dp = new int[SIZE + 1];
        // 입력값은 1000 이하의 자연수.
        // 소수인경우 0, 아닌경우 1 으로
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= SIZE; i++) {
            if (dp[i] == 0) {
                for (int j = 2; i * j <= SIZE; j++) {
                    dp[i * j] = 1;
                }
            }
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (dp[i] == 0)
                System.out.println(i);
        }
    }
}
