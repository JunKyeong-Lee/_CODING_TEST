package chap03;

import java.util.Scanner;

public class _04practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);
        int count = 0;
        while (N != 1) {
            int r = N % K;
            if (r == 0) {
                N /= K;
                count++;
            } else {
                count += r;
                N -= r;
            }
        }
        System.out.println(count);
    }
}
