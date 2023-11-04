package chap05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _11Practice {
    static int[][] arr;
    static int N;
    static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        String[] inputs;
        inputs = sc.nextLine().split(" ");
        N = Integer.parseInt(inputs[0]);
        M = Integer.parseInt(inputs[1]);
        arr = new int[N + 2][M + 2];
        for (int i = 0; i < N; i++) {
            input = sc.nextLine();
            for (int j = 0; j < M; j++) {
                arr[i + 1][j + 1] = (int) (input.charAt(j) - '0');
            }
        }
        System.out.println(bfs(1, 1));
    }

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    private static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = temp[0] + dx[i];
                int ny = temp[1] + dy[i];
                if (arr[nx][ny] == 0) {
                    continue;
                }
                if (arr[nx][ny] == 1) {
                    arr[nx][ny] = arr[temp[0]][temp[1]] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        return arr[N][M];
    }
}