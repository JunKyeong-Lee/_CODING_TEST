package chap04;

import java.util.Arrays;
import java.util.Scanner;

public class _018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        int[] S = new int[n];
        S[0] = A[0];
        for (int i = 1; i < n; i++) {
            S[i] = S[i - 1] + A[i];
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += S[i];
        }
        System.out.println(sum);
    }
}
/*인출시간이 가장 적은 사람이 먼저 하도록
 * 즉, 인출시간의 대기시간을 놓고보면
 * 오름차순으로 배열한뒤 합배열 쓰라는 뜻
 * 합 배열 쓰라는 이유는.
 * 첫번째 사람이 a분 사용하면
 * 두번째 사람이 b분 사용
 * ...
 * 마지막 사람이
 * a + b + c ... + z 분 사용 하므로. 이때 알파벳은 각 사람의 사용시간
 * */