package chap07;

import java.util.Scanner;

public class _040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        long max = sc.nextLong();

        System.out.println(f(min, max));
    }

    public static int f(long min, long max) {
        boolean[] check = new boolean[(int) (max - min + 1)];

        for (long i = 2; i * i <= max; i++) {
            long pow = i * i;
            long start_index = min / pow;
            // 예를 들어 9.xxx 이면 9
            // 10 이면 10일 것. 9.xxxx 를 위해서 나머지가 0이 아니면 1 더해줘야 한다.
            if (min % pow != 0) {
                start_index++;
            }
            for (long j = start_index; pow * j <= max; j++) {
                // 제곱수를 곱한부분은 나누어 떨어지는 곳이므로 true로
                check[(int) ((pow * j) - min)] = true;
                // min 부분이 check[min-min] 이고
                // max 부분이 check[max-min] 이므로
            }
        }
        int count = 0;
        for (var x : check) {
            if (!x) {
                count++;
            }
        }
        return count;
    }
}
/*
 * 나누어 떨어지지 않는다면 예를 들어보자.
 *
 * 100%25 = 0 이므로 나누어 떨어진다.
 * 101%4 = 1
 * 101%9 = 2
 * 101%25 = 1
 * 101%36 = -7+36
 * 101%49 = 3
 * 101%64 = 101-64
 * 절반을 넘어가면 계산에 의미가 없다.
 * 절반의 루트까지만 생각해도 되지 않을까?*/