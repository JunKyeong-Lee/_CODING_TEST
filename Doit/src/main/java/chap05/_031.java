package chap05;

import java.util.Scanner;

public class _031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        long start = 1;
        long end = k;

        while (start <= end) {
            long middle = (start + end) / 2;
            long sum = 0;
            for (int i = 1; i <= N; i++) {
                sum += Math.min(middle / i, N);
            }
            if (sum < k) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        System.out.println(start);
    }
}

/* 01 02 03 04 05 06
 * 02 04 06 08 10 12
 * 03 06 09 12 15 18
 * 04 08 12 16 20 24
 * 05 10 15 20 25 30
 * 06 12 18 24 30 36*/
// k번째 수는 k를 넘지 못한다.
// 그러면 1 ~ k 에서 찾아보는거로 하면 생각보다 연산량이 많이 줄어든다.
// 게다가 이진탐색까지
// 이제 1 ~ k 에서 중앙값인 (1+k) / 2 를 기준으로
// 이것보다 작은 값의 갯수를 파악한다.
// 만약 갯수가 더 크면 중앙값을 줄여야 되니깐 end = middle -1
// 만약 갯수가 더 작으면 중앙값을 키워야 되니깐. start = middle + 1
// 그러다보면 start > end 가 되는 시점이 찾아오는데. (즉, start<=end 동안 반복) 그러면 start를 반환한다.