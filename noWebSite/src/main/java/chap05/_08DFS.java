package chap05;

import java.util.ArrayList;
import java.util.List;

public class _08DFS {
    static boolean visited[];
    static List<Integer>[] lists;

    public static void main(String[] args) {
        int n = 8;
        lists = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            lists[i] = new ArrayList<>();
        }
        lists[1].add(2);
        lists[1].add(3);
        lists[1].add(8);
        lists[2].add(1);
        lists[2].add(7);
        lists[3].add(1);
        lists[3].add(4);
        lists[3].add(5);
        lists[4].add(3);
        lists[4].add(5);
        lists[5].add(3);
        lists[5].add(4);
        lists[6].add(7);
        lists[7].add(2);
        lists[7].add(6);
        lists[7].add(8);
        lists[8].add(1);
        lists[8].add(7);
        DFS(1);
    }

    public static void DFS(int v) {
        System.out.println(v);
        visited[v] = true;
        for (var e : lists[v]) {
            if (!visited[e]) {
                DFS(e);
            }
        }
    }
}
