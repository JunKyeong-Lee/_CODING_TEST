package chap05;

import java.util.*;

public class _03PriorityQueue {
public static void main(String[] args) {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(
new Comparator<Integer>() {
    public int compare(Integer i1, Integer i2) {
        return i2 - i1;
    }
});
    priorityQueue.add(5);
    priorityQueue.add(3);
    priorityQueue.add(2);
    priorityQueue.add(4);
    System.out.print(priorityQueue.poll() + " ");
    System.out.print(priorityQueue.poll() + " ");
    priorityQueue.add(7);
    priorityQueue.add(1);
    priorityQueue.add(4);
    while (!priorityQueue.isEmpty()) {
        System.out.print(priorityQueue.poll() + " ");
    }
}

    public static void main1(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(4);
        System.out.print(priorityQueue.poll() + " ");
        System.out.print(priorityQueue.poll() + " ");
        priorityQueue.add(7);
        priorityQueue.add(1);
        priorityQueue.add(4);
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }
    }
}
