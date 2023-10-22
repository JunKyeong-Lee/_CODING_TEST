package chap05;
/*https://www.acmicpc.net/problem/2178*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _027 {
    static int[][] arr;
    static boolean[][] visited;

    static int n, m;
    static int[][] move = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArr = sc.nextLine().split(" ");
        n = Integer.parseInt(inputArr[0]);
        m = Integer.parseInt(inputArr[1]);
        arr = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            inputArr = sc.nextLine().split("");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(inputArr[j]);
                if (arr[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }
        bfs(0, 0);
        System.out.println(arr[n - 1][m - 1]);
    }

    private static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int k = 0; k < 4; k++) {
                int x = now[0] + move[k][0];
                int y = now[1] + move[k][1];
                if (x >= 0 && y >= 0 && x < n && y < m) {
                    if (!visited[x][y]) {
                        visited[x][y] = true;
                        arr[x][y] = arr[now[0]][now[1]] + 1;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}
/*N*M 크기의 배열로 표현되는 미로
 * 1은 이동 가능한 칸
 * 0은 이동 불가능한 칸
 * 1,1 에서 n,m 으로 이동하려 할 때 지나야 하는 최소 칸 수*/