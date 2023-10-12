package _1705;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] strList = str.split("[369]");


        int count = 0;
        for (int i = 0; i < strList.length; i++) {
            if (strList[i].equals("")) {
                continue;
            } else {
                count += strList[i].length();
            }
        }
        int length = str.length() - count;


        if (length == 0) {
            System.out.println(str);
        } else if (length == 1) {
            System.out.println("K");
        } else if (length == 2) {
            System.out.println("KK");
        } else {
            System.out.println("KKK");
        }

    }
}
