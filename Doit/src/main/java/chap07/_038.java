package chap07;

import java.util.ArrayList;
import java.util.Scanner;

public class _038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(almostPrimeCount(a, b));
    }

    public static int almostPrimeCount(long a, long b) {
        int count = 0;
        long[] A = new long[10000001];
        for (int i = 2; i < A.length; i++) {
            A[i] = i;
        }
        for (int i = 2; i <= Math.sqrt(A.length); i++) {
            if (A[i] == 0) {
                continue;
            }
            for (int j = i + i; j < A.length; j = j + i) {
                A[j] = 0;
            }
        }
        for (int i = 2; i < 10000001; i++) {
            if (A[i] != 0) {
                long temp = A[i];
                while ((double) A[i] <= (double) b / (double) temp) {
                    if ((double) A[i] >= (double) a / (double) temp) {
                        count++;
                    }
                    temp = temp * A[i];
                }
            }
        }
        return count;
    }
}
/*어떤 수가 소수의 N제곱 꼴일때 그 수를 거의 소수라고 한다.
 *
 *
 * 일단 B가 10^14 까지 되니깐
 * 최소한 10^7 까지 소수를 카운팅 해야되는데
 * 너무 크지 않나?
 * 이거의 루트니깐
 * 10^3.5 수준이라고 하더라도.
 * 1000회
 * 어? 할만할지도*/
