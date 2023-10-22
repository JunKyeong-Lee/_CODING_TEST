package chap05;
/*https://www.acmicpc.net/problem/13023*/


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _025 {
    static List<Integer>[] arr;
    static boolean[] visited;
    static boolean clear;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        arr = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            arr[Integer.parseInt(input[0])].add(Integer.parseInt(input[1]));
            arr[Integer.parseInt(input[1])].add(Integer.parseInt(input[0]));
        }
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            dfs(i, 1);
            if (clear) {
                break;
            }
        }
        System.out.println(clear ? 1 : 0);
    }

    static void dfs(int v, int count) {
        if (count == 5 || clear) {
            clear = true;
            return;
        }
        visited[v] = true;
        for (var x : arr[v]) {
            if (!visited[x])
                dfs(x, count + 1);
        }
        visited[v] = false;
    }
}