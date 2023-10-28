package chap07;

import java.util.Scanner;

public class _045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long gcd = gcd(a,b);
        if(c%gcd!=0){
            System.out.println(-1);
            return;
        }else{

        }
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }
}
