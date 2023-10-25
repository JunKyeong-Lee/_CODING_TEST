package chap07;

import java.util.Scanner;

public class _037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean[] isNotPrime = new boolean[n + 1];
        // true 이면 소수가 아니다.
        // false 이면 소수다.
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!isNotPrime[i]) {
                for (int j = 2; i * j <= n; j++) {
                    isNotPrime[i * j] = true;
                }
            }
        }

        for (int i = m; i <= n; i++) {
            if (!isNotPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
