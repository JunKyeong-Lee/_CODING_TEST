package com.baekjoon.BaaaaaaaaaaarkingDog0x01.p2576;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOdd = 0;
        int minOdd = Integer.MAX_VALUE;

        for (int i = 0; i < 7; i++) {
            int temp = sc.nextInt();
            if (temp % 2 == 1) {
                sumOdd += temp;
                minOdd = Math.min(temp, minOdd);
            }
        }
        if (minOdd == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(sumOdd);
            System.out.println(minOdd);
        }

    }
}
