package chap07;

import java.util.Scanner;

public class _043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long result = gcd(a, b);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result; i++) {
            sb.append(1);
        }
        System.out.println(sb);
    }


    public static long gcd(long a, long b) {
        long A = Math.max(a, b);
        long B = Math.min(a, b);
        if (B == 0) {
            return A;
        }
        return gcd(B, A % B);
    }
}