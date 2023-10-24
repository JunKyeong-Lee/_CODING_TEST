package chap06;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> list = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int result = 0;
        while (list.size() > 1) {
            int sum = 0;
            sum += list.poll();
            sum += list.poll();
            result += sum;
            list.add(sum);
        }
        // 여기 오는건 size가 1인 경우 -> 이미 더해져 있다.
        System.out.println(result);
    }
}
/*
 * 10
 * 20
 * 30
 * 40
 *
 * 10
 * 10 20
 * 10 20 30
 * 10 20 30 40
 *
 *
 * 마지막에 10 뺴기*/
