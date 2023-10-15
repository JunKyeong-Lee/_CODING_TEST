package chap03;

import java.util.Scanner;

public class _07_1940_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int count = 0;
        arr[0] = sc.nextInt();
        if (N == 1) {
            System.out.println(0);
            return;
        }
        for (int i = 1; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] + arr[j] == M)
                    count++;
            }
        }
        System.out.println(count);
    }
}
