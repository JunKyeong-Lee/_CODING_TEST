package chap06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][2];
        for (int i = 0; i < N; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        }

        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int count = 0;
        int end = -1;
        for (int i = 0; i < N; i++) {
            if (A[i][0] >= end) {
                end = A[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
/*회의실 배정.
 * 한개의 회의실에 N개의 회의가 있어서 이를 회의실 사용표로 만드려 한다.
 *
 * 각 회의 I에 대해 시작시간과 끝나는 시간.
 * 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수
 *
 * 한번 시작하면 중단할 수 없고
 * 회의가 끝나자마자 다른 회의를 시작할 수 있고.
 * 회의 시작시간과 끝나는시간이 같을 수도 있음.
 *
 * 아이디어는
 * 끝나는 시간 순서대로 배열한 다음에
 * 시간이 겹치지 않는 회의를 찾기*/