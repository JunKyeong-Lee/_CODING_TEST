package chap05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _09BFS {
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
        BFS(1);
    }

    private static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            System.out.println(temp);
            visited[temp] = true;
            for (var x : lists[temp]) {
                if (!visited[x])
                    queue.add(x);
            }
        }
    }

}
