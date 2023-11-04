package chap05;

import java.util.Deque;
import java.util.LinkedList;

public class _04Deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); // 1
        deque.addFirst(2); // 2 1
        deque.addFirst(3); // 3 2 1
        deque.addLast(4); // 3 2 1 4
        deque.addLast(5); // 3 2 1 4 5
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); // 3
        System.out.println("deque.pollFirst() = " + deque.pollLast()); // 5
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); // 2
        System.out.println("deque.pollFirst() = " + deque.pollLast()); // 4
        System.out.println("deque.pollFirst() = " + deque.pollLast()); // 1
    }
}
