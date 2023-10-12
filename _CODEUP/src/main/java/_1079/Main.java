package _1079;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        while (true) {
            ch = sc.next().charAt(0);
            System.out.println(ch);
            if (ch == 'q') {
                break;
            }
        }
    }
}
