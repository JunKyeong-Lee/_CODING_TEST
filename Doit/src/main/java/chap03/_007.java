package chap03;
// https://www.acmicpc.net/problem/1940

import java.util.Arrays;
import java.util.Scanner;

public class _007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int i = 0;
        int j = N - 1;
        int count = 0;
        while (i < j) {
            if (A[i] + A[j] < M) {
                i++;
            } else if (A[i] + A[j] == M) {
                count++;
                i++;
                j--;
            } else {
                j--;
            }
        }
        System.out.println(count);
    }
}
