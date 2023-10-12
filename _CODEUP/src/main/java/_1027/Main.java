package _1027;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strList = sc.next().split("\\.");

        System.out.println(strList[2] + "-" + strList[1] + "-" + strList[0]);
    }
}
