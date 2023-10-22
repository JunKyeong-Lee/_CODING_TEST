package chap05;

import java.util.*;

public class _026 {
    static List<Integer>[] arrays;
    static boolean[] visitedDFS;
    static boolean[] visitedBFS;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정점의 개수
        int m = sc.nextInt(); // 간선의 개수
        int v = sc.nextInt(); // 탐색을 시작할 번호
        arrays = new ArrayList[n + 1];
        visitedDFS = new boolean[n + 1];
        visitedBFS = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            arrays[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();
            arrays[node1].add(node2);
            arrays[node2].add(node1);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(arrays[i]);
        }
        dfs(v);
        System.out.println();
        bfs(v);
        System.out.println();
    }

    private static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visitedBFS[v] = true;
        System.out.print(v+" ");
        while (!q.isEmpty()) {
            int node = q.poll();
            for (var x : arrays[node]) {
                if (!visitedBFS[x]) {
                    q.add(x);
                    visitedBFS[x] = true;
                    System.out.print(x+" ");
                }
            }
        }
    }

    static void dfs(int v) {
        System.out.print(v + " ");
        if (visitedDFS[v]) {
            return;
        }
        visitedDFS[v] = true;
        for (var x : arrays[v]) {
            if (!visitedDFS[x]) {
                dfs(x);
            }
        }
    }
}
