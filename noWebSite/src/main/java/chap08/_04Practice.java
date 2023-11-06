package chap08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.max;


public class _04Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        int[] dp = new int[N];
        dp[0] = list.get(0);
        dp[1] = max(dp[0], list.get(1));
        for (int i = 2; i < N; i++) {
            dp[i] = max(dp[i - 1], dp[i - 2] + list.get(i));
        }
        System.out.println(dp[N-1]);
    }
}

/*0 1 2 3 4 5*/