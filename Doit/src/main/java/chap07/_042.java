package chap07;

import java.util.Scanner;

public class _042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(lcm(a, b));
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        int A = Math.max(a, b);
        int B = Math.min(a, b);

        return gcd(B, A % B);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
