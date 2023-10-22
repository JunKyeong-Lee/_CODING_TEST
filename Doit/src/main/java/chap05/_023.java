package chap05;
/*https://www.acmicpc.net/problem/11724*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class _023 {
    static boolean[] visited;
    static List<Integer>[] arrays;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // 노드의 개수
        int M = Integer.parseInt(input[1]); // 에지의 개수
        arrays = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            arrays[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            arrays[Integer.parseInt(input[0])].add(Integer.parseInt(input[1]));
            arrays[Integer.parseInt(input[1])].add(Integer.parseInt(input[0]));
        }
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                f(i);
                count++;
            }
        }
        System.out.println(count);
    }

    static void f(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : arrays[v]) {
            if (!visited[i])
                f(i);
        }
    }
}
/*방향성에 대한 중요성.
* 기본적인 재귀dfs 형식
* 기억해두면 좋다. 너무 쓸만하다.*/
