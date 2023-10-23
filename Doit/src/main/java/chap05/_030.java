package chap05;

import java.util.Scanner;

/* 아이디어
 * 블루레이 담는 사이즈가 얼마부터 얼마 사이여야 가능성 있는가.
 * 이렇게 생각할 수 있다.
 * 제일 작은 사이즈는 영상 크기가 제일 큰 경우
 * 제일 큰 사이즈는 모든 영상 크기의 합.
 *
 * 그 사이에 답이 있는건 분명하다.
 * 그러면 이분탐색으로
 * (9 + 45) / 2 는 분명 27 인데. 이걸로 확인해보는 거다.
 * 만약 이거로 갯수가 작다면 공간을 덜 쓴거므로 오른쪽 배열에
 * 만약 이거로 갯수가 많다면 공간을 많이 쓴거므로 왼쪽 배열에서
 * 최종적인 값을 찾는다. 이때 최종적인 값은 start 와 end가 서로 반대가 될 때
 *
 */
public class _030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            end += arr[i];
            if (start < arr[i]) {
                start = arr[i];
            }
        }
        while (start <= end) {
            int middle = (start + end) / 2;
            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (sum + arr[i] > middle) {
                    count++;
                    sum = 0;
                }
                sum += arr[i];
            }
            if (sum != 0)
                count++;
            if (count > m)
                start = middle + 1;
            else
                end = middle - 1;
        }
        System.out.println(start);
    }
}
/*N개의 강의가 들어있고
 * i번 강의와 j번 강의를 같은 블루레이에 녹화하면
 * i와 j 사이에 있는 강의들 모두 들어있어야 한다.
 *
 * 이러한 블루레이를 M개만큼만 제한해서 만든다.
 * 또한 이러한 블루레이는 모두 같은 크기여야 한다.
 *
 *
 * 예를 들어 9개 강의가 있고
 * 이를 블루레이 3개로 나누고 싶다면.
 * 1 2 3 4 5
 * 6 7
 * 8 9
 * 이런식으로 나누면 17이 되긴 한다.
 *
 * 일단 강의 별로 크기가 다를 순 있지만
 * 오름차순으로 주어진다 -> 이진 탐색의 힌트
 *
 *
 * 아이디어.
 * 모든 레슨 길이를 더해본다.
 * 1 2 3 4 5 6 7 8 9
 * 이것을 더하면
 * 45.
 * 이를 3으로 나누면
 * 15
 * 최소한 15 짜리 3개로 나눠야 한다.
 * 적어도 이것보단 커야 한다.
 *
 *
 * 아니면
 * 4로 나눈 경우와 2로 나눈경우.
 * 11.25 와 22.5
 * 이 사이에 있는 값이 답일 가능성으로 봐도 되지 않을까?
 * */