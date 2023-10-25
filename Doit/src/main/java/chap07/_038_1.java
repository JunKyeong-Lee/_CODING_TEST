package chap07;

import java.util.ArrayList;
import java.util.Scanner;

public class _038_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(almostPrimeCount(a, b));
    }

    public static long almostPrimeCount(long a, long b) {
        long result = 0;
        boolean[] isNotPrime = new boolean[(int) Math.sqrt(b) + 1];
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        for (int i = 2; i <= Math.sqrt((int) Math.sqrt(b)); i++) {
            if (!isNotPrime[i]) {
                for (int j = 2; i * j <= (int) Math.sqrt(b); j++) {
                    isNotPrime[i * j] = true;
                }
            }
        }
        for (int i = 2; i <= Math.sqrt(b); i++) {
            if (!isNotPrime[i]) {
                int temp = i;
                while (true) {
                    temp *= i;
                    if (temp >= a && temp <= b) {
                        result++;
                    }
                    if (temp > b) {
                        break;
                    }
                }
            }
        }

        return result;
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
