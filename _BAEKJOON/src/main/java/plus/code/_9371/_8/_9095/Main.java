package plus.code._9371._8._9095;

import java.util.Scanner;

public class Main {
    public static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            count = 0;
            f(n);
            System.out.println(count);
        }
    }

    public static void f(int n) {
        if (n == 0)
            count++;
        if (n >= 1)
            f(n - 1);
        if (n >= 2)
            f(n - 2);
        if (n >= 3)
            f(n - 3);
    }
}
