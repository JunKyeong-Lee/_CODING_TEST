package chap03;

import java.util.Scanner;

public class _02_1546_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int max = -1;
        double mean = 0;
        for (int i = 1; i <= N; i++) {
            int num = sc.nextInt();
            mean += num;
            max = Math.max(max, num);
        }
        mean = mean / N;
        mean = mean / max * 100;

        System.out.println(mean);
    }
}
