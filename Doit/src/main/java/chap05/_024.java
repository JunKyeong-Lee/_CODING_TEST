package chap05;

import java.util.Scanner;

public class _024 {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);
    }

    private static void dfs(int num, int digit) {
        if (digit >= n) {
            if (isPrime(num))
                System.out.println(num);
            return; // 종단점
        }
        int[] temp = {1, 3, 7, 9};
        for (var i : temp) {
            if (isPrime(num * 10 + i)) {
                dfs(num * 10 + i, digit + 1);
            }
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
/*왼쪽에서
 * 첫자리는 2 3 5 7
 * 두번째 자리부터는 1 3 7 9
 * */