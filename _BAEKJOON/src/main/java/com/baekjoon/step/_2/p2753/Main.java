package com.baekjoon.step._2.p2753;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year = (new Scanner(System.in)).nextInt();

        System.out.println(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 1 : 0);
    }
}
