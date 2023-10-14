package plus.code._9370._4._17427;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long result = 0;

        for (int i = 1; i <= N; i++) {
            result += i * (N / i);
        }
        System.out.println(result);
    }
}
/*
 * 아예 접근 방식을 달리해야 한다. 약수의 모습을 하고 있지만 사실 다른 느낌
 *
 * 예를 들어
 * 1 : 1
 * 2 : 1 2
 * 3 : 1   3
 * 4 : 1 2   4
 * 5 : 1       5
 * 6 : 1 2 3     6
 * 7 : 1           7
 * 8 : 1 2   4       8
 *
 * 위와 같이 약수가 세팅됨
 *
 * 약수의 개수는 ( // 은 몫임)
 * 1 : 8 // 1 = 8
 * 2 : 8 // 2 = 4
 * 3 : 8 // 3 = 3
 * 4 : 8 // 4 = 2
 * 5 : 8 // 5 = 1
 * 6 : 8 // 6 = 1
 * 7 : 8 // 7 = 1
 *
 * productSum 하면
 * 8 + 8 + 9 + 4 + 5 + 6 + 7
 * */