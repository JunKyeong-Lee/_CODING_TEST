package chap03;

import java.util.Scanner;

public class _01_11720_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        sc.nextLine();
        String numStr = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }
        System.out.println(sum);
    }
}