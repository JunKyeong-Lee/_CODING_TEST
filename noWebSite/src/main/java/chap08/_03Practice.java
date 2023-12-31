package chap08;

import java.util.Scanner;

public class _03Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }

    private static int f(int n) {
        int[] dp = new int[n+1];
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            if(i%5==0){
                dp[i] = Math.min(dp[i],dp[i/5]+1);
            }
            if(i%3==0){
                dp[i] = Math.min(dp[i],dp[i/3]+1);
            }if(i%2==0){
                dp[i]=Math.min(dp[i],dp[i/2]+1);
            }
        }
        return dp[n];
    }
}
