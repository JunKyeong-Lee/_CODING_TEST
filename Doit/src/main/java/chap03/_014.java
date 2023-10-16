package chap03;

/*
 * 절댓값 힙
 *
 * 배열에 정수 x를 넣는다. (x는 0이 아닌 정수)
 *
 * 배열에서 절대값이 가장 작은 값을 출력하고
 * 그 값을 배열에서 제거한다.
 * 절대값이 가장 작은 값이 여러개 일때는 가장 작은수를 출력하고 그 값을 제거해라.
 * */

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _014 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) < Math.abs(o2)) {
                    return -1;
                } else if (Math.abs(o1) > Math.abs(o2)) {
                    return 1;
                } else {
                    return Integer.compare(o1, o2);
                }
            }
        });
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num == 0 && !priorityQueue.isEmpty()) {
                System.out.println(priorityQueue.poll());
            } else if (num == 0 && priorityQueue.isEmpty()) {
                System.out.println(0);
            } else {
                priorityQueue.add(num);
            }
        }
    }
}
/*
 * 우리 생각을 해보자.
 *
 * x가 0이면
 * 큐가 비어있는 경우 -> 0을 출력한다.
 * 큐가 있으면 -> 절대값이 제일 작은(즉 -1 or 1) 값을 출력한다.
 *           -> 만약 둘이 절대값이 동일하다면 더 작은 값(즉, -1) 을 출력한다.
 *
 * 그러면 어떻게 해야 하는가.
 * 우선순위 큐를 활용한다.
 *
 * */