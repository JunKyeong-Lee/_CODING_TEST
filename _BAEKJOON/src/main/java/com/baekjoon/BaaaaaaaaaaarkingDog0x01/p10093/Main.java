package com.baekjoon.BaaaaaaaaaaarkingDog0x01.p10093;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }
        long count = b - a - 1;

        count = count < 0 ? 0 : count;
        System.out.println(count);
        for (long i = a + 1; i < b; i++) {
            System.out.print(i + " ");
        }
    }
}
