package chap08;

public class _01Recursive {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(recursive_fib(n));
        System.out.println();
    }

    private static int recursive_fib(int n) {
        System.out.print("d["+n+"] ");
        if (n == 1 || n == 2)
            return 1;
        return recursive_fib(n - 1) + recursive_fib(n - 2);
    }
}
