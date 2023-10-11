package com.baekjoon.BaaaaaaaaaaarkingDog0x01.p2577;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numCounts = new int[10]; // 0 1 2 3 4 5 6 7 8 9;

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String result = Integer.toString(a * b * c);

        for (int i = 0; i < result.length(); i++) {
            numCounts[result.charAt(i) - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numCounts[i]);
        }
    }
}
