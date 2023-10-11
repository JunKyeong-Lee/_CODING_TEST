package com.baekjoon.BaaaaaaaaaaarkingDog0x01.p2443;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(' ');
            for (int j = 0; j < num * 2 - i * 2 - 1; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
