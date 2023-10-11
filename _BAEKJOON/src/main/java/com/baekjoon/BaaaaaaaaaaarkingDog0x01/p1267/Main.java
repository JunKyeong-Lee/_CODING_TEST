package com.baekjoon.BaaaaaaaaaaarkingDog0x01.p1267;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int Y = 0;
        int M = 0;

        for (int i = 0; i < size; i++) {
            int temp = sc.nextInt();
            Y += (temp / 30 + 1) * 10;
            M += (temp / 60 + 1) * 15;
        }
        if (Y < M)
            System.out.println("Y " + Y);
        else if (Y > M)
            System.out.println("M " + M);
        else {
            System.out.println("Y M " + Y);
        }
    }
}
