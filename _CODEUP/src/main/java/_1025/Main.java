package _1025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            System.out.println("[" + Integer.parseInt(String.valueOf(str.charAt(i))) * (int) Math.pow(10, str.length() - i - 1) + "]");
        }
    }
}