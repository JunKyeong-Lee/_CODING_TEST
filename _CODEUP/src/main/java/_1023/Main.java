package _1023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] list = str.split("\\.");

        for (var e : list) {
            System.out.println(e);
        }
    }
}
