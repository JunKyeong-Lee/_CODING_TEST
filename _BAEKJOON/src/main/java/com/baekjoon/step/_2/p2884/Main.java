package com.baekjoon.step._2.p2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        // 현재 알람 시간

        if (M < 45) {
            H -= 1;
            M += 15;
        } else {
            M -= 45;
        }

        if (H < 0) {
            H += 24;
        }
        System.out.println(H + " " + M);
    }
}
