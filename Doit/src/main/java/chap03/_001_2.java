package chap03;
// https://www.acmicpc.net/problem/11720

import java.util.Scanner;

public class _001_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        sc.nextLine();
        String numStr = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += numStr.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}