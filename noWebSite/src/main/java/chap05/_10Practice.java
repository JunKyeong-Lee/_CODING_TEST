package chap05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _10Practice {
    static int[][] arr;
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        arr = new int[N + 2][M + 2];
        for (int i = 0; i < N + 2; i++) {
            for (int j = 0; j < M + 2; j++) {
                arr[i][j] = 1;
            }
        }
        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            for (int j = 0; j < M; j++) {
                arr[i + 1][j + 1] = (int) (input.charAt(j) - '0');
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (arr[i][j] == 0)
                    BFS(i, j);
            }
        }
        System.out.println(count);
    }

    private static void BFS(int i, int j) {
        count++;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            arr[temp[0]][temp[1]] = 1;
            if (arr[temp[0] + 1][temp[1]] == 0)
                queue.add(new int[]{temp[0] + 1, temp[1]});
            if (arr[temp[0] - 1][temp[1]] == 0)
                queue.add(new int[]{temp[0] - 1, temp[1]});
            if (arr[temp[0]][temp[1] + 1] == 0)
                queue.add(new int[]{temp[0], temp[1] + 1});
            if (arr[temp[0]][temp[1] - 1] == 0)
                queue.add(new int[]{temp[0], temp[1] - 1});
        }
    }
}
