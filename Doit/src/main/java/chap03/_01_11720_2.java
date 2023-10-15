package chap03;

import java.util.Scanner;

public class _01_11720_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        sc.nextLine();
        String numStr = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (int) (numStr.charAt(i) - '0');
        }
        System.out.println(sum);
    }
}