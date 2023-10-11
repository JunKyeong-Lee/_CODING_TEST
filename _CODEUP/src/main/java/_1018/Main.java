package _1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();

        String times[] = time.split(":");

        System.out.println(times[0] + ":" + times[1]);
    }
}
