package com.baekjoon.BaaaaaaaaaaarkingDog0x01.p2752;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b) { // a b
            if (b < c) { // a b c
                System.out.println(a + " " + b + " " + c);
            } else { // a b // c b
                if (a < c) { // a c b
                    System.out.println(a + " " + c + " " + b);
                } else { // c a b
                    System.out.println(c + " " + a + " " + b);
                }
            }
        } else { // b a
            if (b < c) { // b a // b c
                if (a < c) { // b a c
                    System.out.println(b + " " + a + " " + c);
                } else { // b c a
                    System.out.println(b + " " + c + " " + a);
                }
            } else { // c b a
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
