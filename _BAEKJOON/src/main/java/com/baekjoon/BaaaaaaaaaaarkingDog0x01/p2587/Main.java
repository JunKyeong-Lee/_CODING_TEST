package com.baekjoon.BaaaaaaaaaaarkingDog0x01.p2587;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Main.sort(arr, 5);
        System.out.println(sum / 5);
        System.out.println(arr[5 / 2]);
    }

    public static void sort(int[] arr, int size) {
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
