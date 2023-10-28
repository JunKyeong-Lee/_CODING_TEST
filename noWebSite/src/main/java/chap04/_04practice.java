package chap04;

import java.util.Scanner;

public class _04practice {
    public static void main(String[] args) {
        String[] inputs;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        Scanner sc = new Scanner(System.in);
        inputs = sc.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int[][] arr = new int[N][M]; // 육지 0, 바다 1, 방문했는가 2
        inputs = sc.nextLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int d = Integer.parseInt(inputs[2]);

        for (int i = 0; i < N; i++) {
            inputs = sc.nextLine().split(" ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(inputs[j]);
            }
        }
        arr[A][B] = 2;
        int count = 1;
        int turnCount = 0;
        int tempX;
        int tempY;
        while (true) {
            if (turnCount >= 4) {
                tempX = A - dx[d];
                tempY = B - dx[d];
                if (arr[tempX][tempY] == 1) {
                    break;
                }
            }
            turnCount++;
            d -= 1;
            if (d < 0)
                d += 4;
            tempX = A + dx[d];
            tempY = B + dy[d];
            if (arr[tempX][tempY] == 0) {
                arr[tempX][tempY] = 2;
                turnCount = 0;
                count++;
                A = tempX;
                B = tempY;
            }
        }
        System.out.println(count);
    }
}
