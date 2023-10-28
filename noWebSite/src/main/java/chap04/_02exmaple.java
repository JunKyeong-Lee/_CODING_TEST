package chap04;

import java.util.Scanner;

public class _02exmaple {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (i % 10 == 3 || j / 10 == 3 || j % 10 == 3 || k / 10 == 3 || k % 10 == 3) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int totalCount = (N + 1) * 60 * 60;
    int count = 1;
    count *= ((N + 1) - N / 10 - (N % 10 >= 3 ? 1 : 0)); // 시간
    // 2 는 3번
    // 7 는 7번 (8번 - 1번)
    // 12 는 12번 (13번 - 1번)
    // 15 는 14번 (16번 - 2번)
    // 21 은 20번 (22번 - 2번)
    // 23 은 21번 (24번 - 3번)
    // 즉, 기본 시간 갯수는 N+1
    // 그리고 N의 십의자리수를 빼고,
    // 만약 일의자리가 3보다 크거나 같으면 1을 더 빼주는 거로
    count *= 5 * 9; // 분
    count *= 5 * 9; // 초
    System.out.println(totalCount - count);
}
}
