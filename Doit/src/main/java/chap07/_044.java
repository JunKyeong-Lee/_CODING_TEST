package chap07;

import java.util.ArrayList;
import java.util.Scanner;

public class _044 {
    static ArrayList<Node>[] list;
    static long lcm;
    static boolean visited[];
    static long d[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs;
        inputs = sc.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        visited = new boolean[n];
        d = new long[n];
        list = new ArrayList[n];
        lcm = 1;
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            inputs = sc.nextLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            int p = Integer.parseInt(inputs[2]);
            int q = Integer.parseInt(inputs[3]);
            list[a].add(new Node(b, p, q));
            list[b].add(new Node(a, q, p));
            lcm *= (p * q / gcd(p, q));
        }
        d[0] = lcm;
        DFS(0); // DFS의 결과는 결국 모든 원소에 대해 비율 작업이 끝난 경우

        long mgcd = d[0]; // DFS의 결과는 아직 공약수가 존재하므로 모든 수의 공약수를 체크한다.
        for (int i = 1; i < n; i++) {
            mgcd = gcd(mgcd, d[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(d[i] / mgcd + " ");
        }
    }

    public static void DFS(int Node) {
        visited[Node] = true;
        for (Node i : list[Node]) {
            int next = i.b;
            if (!visited[next]) { // 다음값이 방문했는지 살펴보고 방문하는 것도 가능하다.
                d[next] = d[Node] * i.q / i.p; // 그냥 비율을 곱해버린다.
                DFS(next);
            }
        }
    }
    // Node 에 이어져 있는 모든 간선에 대해 그곳을 방문하지 않았으면
    // 그쪽으로 넘어간다.

    // 한편 비율로 하면 소수점이 나오지 않을까? 싶을 수 있는데
    // 그래서 맨 처음에 lcm을 엄청나게 곱해뒀다. 여기서 비율로 싹다 작업을 해두고
    // 마지막에 전체 gcd를 구해서 나눠주는 방식이다.
    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}

/* 일단 하나씩 각개 격파 하는 개념이 맞다.
 * 예를 들어 예제입력 4는
 * 4
 * 2 3 6 8
 * 0 1 9 3
 * 3 0 7 5 인데
 *
 * 2 -> 3 이면
 * 3 -> 0 을 하고
 * 0 -> 1 을 해서 답을 찾는다.
 *
 * 먼저 2->3
 * 0 0 3 4
 * 3 -> 0
 * 20 0 21 28
 * 0 -> 1
 * 60 20 63 84...*/
class Node {
    int b;
    int p;
    int q;

    public Node(int b, int p, int q) {
        this.b = b;
        this.p = p;
        this.q = q;
    }
}