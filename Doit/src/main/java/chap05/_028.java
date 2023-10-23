package chap05;

import java.util.ArrayList;
import java.util.Scanner;

public class _028 {
    static ArrayList<Node>[] lists;
    static boolean[] visited;
    static int max = 0;
    static int node;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        lists = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            lists[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            while (true) {
                int e = sc.nextInt();
                if (e == -1)
                    break;
                int cost = sc.nextInt();
                lists[s].add(new Node(e, cost));
            }
        }
        visited = new boolean[n + 1];
        dfs(1, 0); // 임의의 노드에서 가장 먼 노드 찾기

        visited = new boolean[n + 1];
        dfs(node, 0); // 임의의 노드에서 가장 먼 노드에서 가장 먼 노드를 찾기

        System.out.println(max);
    }

    private static void dfs(int x, int len) {
        if (len > max) {
            max = len;
            node = x;
        }
        visited[x] = true;

        for (int i = 0; i < lists[x].size(); i++) {
            Node n = lists[x].get(i);
            if (!visited[n.e]) {
                dfs(n.e, n.cost + len);
                visited[n.e] = true;
            }
        }
    }
}

class Node {
    int e;
    int cost;

    public Node(int e, int cost) {
        this.e = e;
        this.cost = cost;
    }
}