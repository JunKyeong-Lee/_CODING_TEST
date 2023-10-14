package plus.code._9371._3._1476;

/*
 * 이상한 연도
 *
 * 15 진수의 E (단, 0대신 15를 취급)
 * 28 진수의 S (단, 0은 28로 취급)
 * 19 진수의 M (단, 0은 19로 취급)
 *
 * 첫번째 아이디어
 * 일단 단순하게 생각했을때는
 * while문 써도 막 큰 연산횟수는 아닐 가능성이 높음.
 * */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        int count = 1;
        while (true) {
            if (E == 1 && S == 1 && M == 1) {
                break;
            }
            E--;
            S--;
            M--;
            count++;
            if (E == 0) E += 15;
            if (S == 0) S += 28;
            if (M == 0) M += 19;
        }
        System.out.println(count);
    }
}
