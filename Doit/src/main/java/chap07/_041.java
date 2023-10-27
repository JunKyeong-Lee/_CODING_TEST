package chap07;

import java.util.Scanner;

public class _041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result = result - result / i;
                while (n % i == 0) {
                    // 이제 i의 배수로 갯수를 구했으므로. 다 나눠준다,
                    n /= i;
                }
            }
        }
        if (n > 1) {
            // 그래도 소인수가 남아있으면. 마지막 소인수이므로 한번더 연산해준다.
            result = result - result / n;
        }
        System.out.println(result);
    }
}
/* 10^12 = 1,000,000,000,000
 *
 * 일단 이를 2로 나눠줘야 함.
 * 500,000,000,000
 * -> 이거 사실 root 까지만 진행하면 됨.
 * 왜지?
 * 아 마찬가지 11^2 처럼 커봤자 소수의 제곱 형태일테니깐 루트까지만 보면 된다는 건가
 *
 * 나의 숫자와 서로소인 수의 개수.
 * (나보다 작거나 같은 수.)*/