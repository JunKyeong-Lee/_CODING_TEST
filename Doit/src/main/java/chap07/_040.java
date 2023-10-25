package chap07;

public class _040 {
    public static void main(String[] args) {
        f(1, 10);
    }

    public static int f(long min, long max) {
        int result = 0;
        long sqrtMin = (long) Math.sqrt(min);
        long sqrtMax = (long) Math.sqrt(max);
        System.out.println(sqrtMin);
        System.out.println(sqrtMax);
        return result;
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