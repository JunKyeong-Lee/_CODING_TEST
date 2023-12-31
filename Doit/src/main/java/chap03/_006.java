package chap03;
// https://www.acmicpc.net/problem/2018

import java.util.Scanner;

public class _006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int startIndex = 1;
        int endIndex = 1;
        int sum = endIndex;
        int count = 0;
        while (startIndex <= N) {
            if (sum < N) {
                endIndex++;
                sum += endIndex;
            } else if (sum > N) {
                sum -= startIndex;
                startIndex++;
            } else {
                count++;
                endIndex++;
                sum += endIndex;
            }
        }
        System.out.println(count);
    }
}
