package com.baekjoon.BaaaaaaaaaaarkingDog0x01.p10804;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            swapArr(arr, 20, a - 1, b - 1);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void swapArr(int[] arr, int size, int a, int b) {
        for (int i = 0; i <= (b - a) / 2; i++) {
            int temp = arr[a + i];
            arr[a + i] = arr[b - i];
            arr[b - i] = temp;
        }
    }
}
