package chap03;

import java.util.Scanner;

public class _01example {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coins = {500, 100, 50, 10};
        int[] coinCounts = new int[4];
        int N = sc.nextInt();
        int coinCount = 0;
        for (int i = 0; i < coins.length; i++) {
            while (N >= coins[i]) {
                N -= coins[i];
                coinCount++;
                coinCounts[i]++;
            }
        }
        System.out.println(coinCount);
        for (var x : coinCounts) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coins = {500, 100, 50, 10};
        int[] coinCounts = new int[4];
        int N = sc.nextInt();
        int coinCount = 0;
        for (int i = 0; i < coins.length; i++) {
            coinCounts[i] += N / coins[i];
            coinCount += coinCounts[i];
            N %= coins[i];
        }
        System.out.println(coinCount);
        for (var x : coinCounts) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
