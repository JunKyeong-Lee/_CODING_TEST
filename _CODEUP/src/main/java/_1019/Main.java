package _1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] list = str.split("\\.");
        System.out.printf("%04d.%02d.%02d",
                Integer.parseInt(list[0]),
                Integer.parseInt(list[1]),
                Integer.parseInt(list[2]));
    }
}
/*
 * split 메소드는 정규표현식을 이용함.
 * 분할할때는 str.split("\\.") 으로 해야됨.
 *
 * 정규표현식의 . 자체는 특수문자로 해석되므로.
 * 이를 상쇄할만한 이스케이프 문자를 써야됨.
 * 다만, \ 그 자체를 넘겨줘야 되므로
 * "\\." 으로 작성한다.*/
