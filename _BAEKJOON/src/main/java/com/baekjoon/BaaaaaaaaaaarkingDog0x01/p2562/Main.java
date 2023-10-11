package com.baekjoon.BaaaaaaaaaaarkingDog0x01.p2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[9];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        int maxIndex = 0;
        for (int i = 1; i < 9; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex + 1);

    }
}
