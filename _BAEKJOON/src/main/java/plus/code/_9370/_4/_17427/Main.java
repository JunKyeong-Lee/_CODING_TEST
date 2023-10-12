package plus.code._9370._4._17427;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dp = new int[1000001];
        /*
        * 1 = 1
        * 2 = 3
        * 3 = 4
        *           2 * 2 = 4 = 7
        * 5 = 6
        *           2 * 3 = 6 = 12
        * 7 = 8
        *           2 * 2 * 2 = 8 = 15
        *           3 * 3 = 9 = 13
        *           2 * 5 = 10 = 18
        * 11 = 12
        *           2 * 2 * 3 = 12 = 28
        * 13 = 14
        * 17 = 18
        * 19 = 20
        *
        * */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(g(n));
    }

    public static int f(int n) {
        int result = 0;
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                result += i;
                if (n / i != i)
                    result += n / i;
            }
        }
        return result;
    }

    public static int g(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + f(i);
        }
        return result;
    }
}
