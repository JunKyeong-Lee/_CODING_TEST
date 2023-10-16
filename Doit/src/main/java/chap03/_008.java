package chap03;
// https://www.acmicpc.net/problem/1253

import java.util.Scanner;
import java.util.Arrays;

public class _008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        int count = 0;
        for (int k = 0; k < N; k++) {
            int i = 0;
            int j = N - 1;
            while (i < j) {
                long sum = arr[i] + arr[j];
                if (arr[k] > sum) {
                    i++;
                } else if (arr[k] < sum) {
                    j--;
                } else {
                    if (i != k && j != k) {
                        count++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else {
                        j--;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
