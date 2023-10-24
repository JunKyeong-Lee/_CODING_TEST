package chap06;

import java.util.Scanner;

public class _032 {
    public static void main(String[] args) {
        int[] coin;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        int i = n - 1;
        int count = 0;
        while (i >= 0) {
            while (k >= coin[i]) {
                count++;
                k -= coin[i];
            }
            i--;
        }
        System.out.println(count);
    }
}
/* N종류의 동전을 매우 많이 가지고 있다.
 * 동전을 적절히 사용하여 그 가치의 합을 K로 하고 싶다면
 * 개수의 최솟값은?
 *
 *
 * 예를 들어 100 300 500 원 짜리 동전이 있다고 하자.
 *
 * 그러면 각각 필요한 최소 개수는 다음과 같다.
 * 100
 * 100 100
 * 300
 * 100 300 / 200 200
 * 500
 * 100 500 / 300 300
 * 200 500
 * 300 500
 * 그러면 큰 동전 순서대로 가져가는게
 * 답인가? 예외는 없나?
 * 배수가 아닌 경우.
 * */
