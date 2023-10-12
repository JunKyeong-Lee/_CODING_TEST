package _2011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            String str = String.valueOf(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '3' ||
                        str.charAt(j) == '6' ||
                        str.charAt(j) == '9') {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(str);
            } else {
                for (int j = 0; j < count; j++) {
                    System.out.print('K');
                }
                System.out.println();
            }
        }
    }
}
/*
* Integer -> String 으로 바꾸는 연습. 심하게 어렵진 않다. 코드가 조금 길어서 그렇지*/
