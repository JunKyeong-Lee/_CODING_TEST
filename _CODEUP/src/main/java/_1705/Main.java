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
/*
* 정규식으로 풀긴 했다.
* 먼저 문자열의 길이를 구하고.
* 정규식을 이용하여 split 하면.
* 그에 따른 여러가지 값들이 나올 것이다.
* 그러면 그 내부에는 정규식에서 3,6,9 를 제외한 부분의 문자열들이 리스트로 될텐데
* 모두 길이를 더해본다.
*
* 그러면 원래 문자열의 길이 와 3,6,9 가 없는 문자열의 길이.
* 이 두 개를 빼면 3,6,9가 들어있는 길이가 나온다.
* 그만큼 K를 출력하거나.
* 만약에 3,6,9의 길이가 0이면 원래 문자열을 출력한다.*/
