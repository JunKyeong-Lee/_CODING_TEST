package chap08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* N가지 종류의 화폐가 있다. 이 화폐들의 개수를 최소한으로 이용해서 그 가치의 합이 M원이 되도록 하여야 한다.
 * 이때 각 화폐는 무한개 있으며, 사용된 화폐의 구성은 같지만 순서만 다른것은 같은 경우로 구분한다.
 * 예를 들어 2원, 3원 단위의 화폐가 있을때는 15원을 만들기 위해 3원을 5개 사용하는게 제일 최적의 답안이다.
 *
 * | 입력 조건
 * 첫째 줄에 N, M 이 주어진다. (1 <= N <= 100, 1 <= M <= 10,000)
 * 이후 N개의 줄에는 각 화폐의 가치가 주어진다. 화폐 가치는 10,000보다 작거나 같은 자연수이다.
 * | 출력 조건
 * 첫째 줄에 M원을 만들기 위한 최소한의 화폐 개수를 출력한다.
 * 불가능할 때는 -1을 출력한다.
 *
 * | 입력 예시 1
 * 2 15
 * 2
 * 3
 * | 출력 예시 1
 * 5
 *
 * | 입력 예시 2
 * 3 4
 * 3
 * 5
 * 7
 * | 출력 예시 2
 * -1
 *
 **********************
 * | 아이디어
 * dp[n]을 n원일때 화폐의 개수의 최소값이라고 하자.
 * 예를 들어 2원짜리 3원짜리 5원 짜리가 있을때
 * dp[0] = 0 으로 해두는게 편하다. 말그대로 아무것도 안집은 상태
 * dp[1] = -1 만드는것 자체가 불가능하기 때문
 * dp[2] = 1
 * dp[3] = 1 (dp[1]은 -1로 존재하지 않지만 3이므로)
 * dp[4] = 2 (dp[2]가 1로 존재하므로 여기서 1개 추가, dp[1]은 -1이므로 3을 더해도 소용없다.
 * dp[5] = 1 (dp[3] 에서 1개 더하는 경우, dp[2] 에서 1개 더하는 경우, dp[0]에서 1개 더하는 경우. 이 세개중에 최소값을 구한다.)
 * ...
 * dp[i] = min(dp[i-2]+1, dp[i-3]+1, dp[i-5]+1)*/
public class _06Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> coin = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            coin.add(sc.nextInt());
        }
        Collections.sort(coin);
        int[] dp = new int[M + 1];
        for (int i = 1; i <= M; i++) {
            dp[i] = 10001; // 현재 사용할 수 있는 최대 갯수.(1원짜리 10000개보다 1 큰 값)
        }
        for (int i = 0; i < N; i++) {
            int temp = coin.get(i);
            for (int j = temp; j <= M; j++) {
                dp[j] = Math.min(dp[j], dp[j - temp] + 1); // 계속해서 현재 최소 갯수와 어떤 금액에서 temp원 만큼 늘어났을때의 갯수를 계산한다.)
            }
        }
        System.out.println(dp[M]==10001?-1:dp[M]);
    }
}
/* 다른 답안으로는 dp[i]를 확인할 때 모든 코인의 경우의 수를 확인해서 */
