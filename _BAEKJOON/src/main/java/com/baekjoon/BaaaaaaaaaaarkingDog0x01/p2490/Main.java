package com.baekjoon.BaaaaaaaaaaarkingDog0x01.p2490;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Character> temp = new Vector<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += sc.nextInt();
            }
            if (sum == 4)
                temp.add('E');
            else if (sum == 3)
                temp.add('A');
            else if (sum == 2)
                temp.add('B');
            else if (sum == 1)
                temp.add('C');
            else
                temp.add('D');
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(temp.get(i));
        }
    }
}
