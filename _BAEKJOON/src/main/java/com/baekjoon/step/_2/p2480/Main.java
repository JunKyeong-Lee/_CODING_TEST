package com.baekjoon.step._2.p2480;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        } else if (a != b && b != c && c != a) {
            System.out.println(Math.max(Math.max(a, b), c) * 100);
        } else {
            if (a == b || a == c) {
                System.out.println(1000 + a * 100);
            } else {
                System.out.println(1000 + b * 100);
            }
        }
    }
}
