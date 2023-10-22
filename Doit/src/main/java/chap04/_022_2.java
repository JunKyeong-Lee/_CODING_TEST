package chap04;

import java.util.Scanner;

public class _022_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[10001];
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            count[sc.nextInt()]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            while (count[i] > 0) {
                sb.append(i + "\n");
                count[i]--;
            }
        }
        System.out.print(sb);
    }
}
/*아예 신박한 방법도 있었다.
 * 예를 들어 8 7 2 3 1 4 5 라고 주어진다고 하자.
 * 횟수로 쓰면 다음과 같다.
 * 0
 * 1
 * 1
 * 1
 * 1
 * 1
 * 0
 * 1
 * 1
 * 0
 *
 * 이걸 그냥 인덱스 번호 차례대로 0이 될때까지 작성해주면 끝이다...
 * 이걸 왜 생각 못했지.
 * 기수정렬을 구현하기 제일 쉬운 방식이다.
 * 뭔 Queue 여
 * */
