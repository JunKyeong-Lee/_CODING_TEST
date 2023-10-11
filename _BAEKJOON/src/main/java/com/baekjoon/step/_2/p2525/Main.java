package com.baekjoon.step._2.p2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();

        h += time / 60;
        m += time % 60;

        if (m >=60) {
            m -= 60;
            h += 1;
        }
        if (h >= 24) {
            h -= 24;
        }
        System.out.println(h + " " + m);
    }
}
