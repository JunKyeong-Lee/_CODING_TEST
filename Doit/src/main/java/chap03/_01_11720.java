package chap03;

import java.util.Scanner;

public class _01_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}
