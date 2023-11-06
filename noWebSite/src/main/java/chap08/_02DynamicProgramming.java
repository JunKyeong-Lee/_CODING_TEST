package chap08;

public class _02DynamicProgramming {
    static int n = 10;
    static int[] d = new int[n+1];
    public static void main(String[] args) {
        System.out.println(Dynamic_fib(n));
        System.out.println(Memoization_fib(n));
        System.out.println();
    }

    private static int Memoization_fib(int n) {
        System.out.print("d["+n+"] ");
        if(n==1||n==2)
            return 1;
        if(d[n]!=0)
            return d[n];
        d[n]=Memoization_fib(n-1)+Memoization_fib(n-2);
        return d[n];
    }

    private static int Dynamic_fib(int n) {
        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
