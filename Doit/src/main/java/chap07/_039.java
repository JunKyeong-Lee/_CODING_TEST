package chap07;

import java.util.Scanner;

public class _039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(primeAndPalindrome(sc.nextInt()));
    }

    public static int primeAndPalindrome(int a) {
        int n = 1003001;
        boolean[] isNotPrime = new boolean[n + 1];
        isNotPrime[1] = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!isNotPrime[i]) {
                for (int j = 2; i * j <= n; j++) {
                    isNotPrime[i * j] = true;
                }
            }
        }
        int i;
        for (i = a; ; i++) {
            if (!isNotPrime[i]) {
                String str = String.valueOf(i);
                int count = 0;
                for (int j = 0; j < str.length() / 2; j++) {
                    if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                        break;
                    }
                    count++;
                }
                if(count==str.length()/2){
                    break;
                }
            }
        }
        return i;
    }
}
