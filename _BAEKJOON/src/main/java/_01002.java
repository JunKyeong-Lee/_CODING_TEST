/*
 * A 조규현
 * B 백승환
 * C 이석원
 * D 류재명
 *
 * C는 A와 B에게 D의 위치를 계산하라고 명령.
 * A와 B는 각각 자신의 위치에서
 * D까지의 거리를 계산했다.
 *
 * 좌표는 x1,y1 -> A
 * x2,y2 -> B
 *
 * 이제 거리를 계산하면
 * r1, r2 가 있는데 이건 주어짐.
 *
 * 그러면 이제 있을 수 있는 좌표의 수를 출력하라...
 * */

import java.util.Scanner;

public class _01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();


//            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//            if (distance > r1 + r2 || distance < Math.abs(r1 - r2)) {
//                System.out.println(0);
//            }else if(distance  Math.abs(r1-r2) || )
        }
    }
}
