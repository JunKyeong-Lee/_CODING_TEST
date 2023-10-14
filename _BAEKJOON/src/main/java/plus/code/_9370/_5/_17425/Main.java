/*
* java로는 시간초과!
* C로 푸세요!
* */

package plus.code._9370._5._17425;

import java.util.Scanner;

public class Main {
//    static final int MAX = 1000000;
//
//    public static void main(String[] args) {
//        long[][] dp = new long[MAX + 1][2];
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 1; i <= MAX; i++) {
//            for (int j = 1; i * j <= MAX; j++) {
//                if (dp[i * j][0] > Long.MAX_VALUE - i) {
//                    dp[i * j][1]++;
//                    dp[i * j][0] -= Long.MAX_VALUE;
//                    dp[i * j][0] += i;
//                } else {
//                    dp[i * j][0] = dp[i * j][0] + i;
//                }
//            }
//            dp[i][1] = dp[i][1] + dp[i - 1][1];
//            if (dp[i][0] > Long.MAX_VALUE - dp[i - 1][0]) {
//                dp[i][1]++;
//                dp[i][0] -= Long.MAX_VALUE;
//                dp[i][0] += dp[i - 1][0];
//            } else {
//                dp[i][0] += dp[i - 1][0];
//            }
//        }
//
//        int T = sc.nextInt();
//        for (int i = 0; i < T; i++) {
//            int N = sc.nextInt();
//            if (dp[N][1] != 0) {
//                System.out.print(dp[N][1]);
//            }
//            System.out.println(dp[N][0]);
//        }
//    }
}
/*
 * 여기도 또한 접근방법을 달리 해야한다.
 * 크기가 1 * 100001 인 배열 dp를 만들고.
 * 1을 약수로 가지는 값들은 +1
 * 2를 약수로 가지는 값들을 +2
 * ...
 * N을 약수로 가지는 값들을 +N
 *
 * 또한, 앞에거까지 지속적으로 누적해줌
 * (누적안하면 그냥 f임
 * */