package chap05;

public class _05Recursive {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(factorial1(i) + " : " + factorial2(i));
        }
    }

    public static int factorial1(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial1(n - 1);
    }

    public static int factorial2(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }
}
