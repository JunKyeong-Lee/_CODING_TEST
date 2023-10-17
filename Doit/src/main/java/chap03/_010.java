package chap03;
// https://www.acmicpc.net/problem/11003

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class _010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        Deque<Node> deque = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int now = sc.nextInt();
            while (!deque.isEmpty() && deque.getLast().value > now) {
                // 덱이 무언가 차있고
                // 동시에 값 비교해서 현재 값보다 크면
                // 필요없는 값
                deque.removeLast();
            }
            deque.addLast(new Node(i, now));
            if (i - deque.getFirst().index >= L) {
                deque.removeFirst();
            }
            System.out.print(deque.getFirst().value + " ");
        }
    }

    static class Node {
        public int index;
        public long value;

        public Node(int index, long value) {
            this.index = index;
            this.value = value;
        }
    }
}