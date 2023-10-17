package chap03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// https://www.acmicpc.net/problem/2164
// 큐를 2개 쓰려고 했음. 이거는 체크해야 하는 부분
// 충분히 압축 가능할 거다
public class _013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            queue.poll();
            queue.offer(queue.poll());
        }
        System.out.println(queue.poll());
    }
}