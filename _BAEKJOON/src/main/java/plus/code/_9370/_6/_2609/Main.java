package plus.code._9370._6._2609;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = f(a, b);
        System.out.println(gcd);
        System.out.println(a * b / gcd);
    }

    public static int f(int a, int b) {
        if (b == 0)
            return a;
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return f(b, a % b);
    }
}
