package com.baekjoon.step._3.p25314;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        for (int i = 0; i < size / 4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
