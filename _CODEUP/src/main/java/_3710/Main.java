package _3710;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] dp = new int[10];
        for (int i = a; i <= b; i++) {
            int temp = i;
            while (temp != 0) {
                dp[temp % 10]++;
                temp /= 10;
            }
        }
        System.out.println(dp[3] + dp[6] + dp[9]);
    }
}
/*
 * dp의 핵심은. 중복부분이 있으면 이것의 연산 횟수를 대폭 감소하는 것.
 *
 * 일반적으로 dp가 어려운 이유는
 * 일반식을 구하기 때문
 *
 * 문제 자체가 엄격하지 않아서 풀렸지만 의도한것은 아닐 것
 */


