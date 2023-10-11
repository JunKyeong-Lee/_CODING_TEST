package _2842;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, y1, d1;
        int x2, y2, d2;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        d1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        d2 = sc.nextInt();

        double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));


        if (distance > (double) (d1 + d2)) {// 1. 완전히 멀리 떨어진 경우.
            System.out.println("not overlapped");
        } else if (distance == (double) (d1 + d2)) {// 2. 외부에서 접한 경우
            System.out.println("tangent");
        } else { // 3. 겹치기 시작. 마치 월식 일어나는것 처럼
            if (distance > (double) Math.abs(d1 - d2)) { // 3-1. 접점 2개
                System.out.println("overlapped");
            } else if (distance == (double) Math.abs(d1 - d2)) { // 3-2. 내부에서 접한 경우
                System.out.println("tangent");
            } else { // 3-3. 내부에 들어가 있는 경우
                System.out.println("not overlapped");
            }
        }

    }
}
