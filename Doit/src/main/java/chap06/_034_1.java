package chap06;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _034_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int one = 0;
        int zero = 0;
        PriorityQueue<Integer> negative = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        PriorityQueue<Integer> positive = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                zero++;
            } else if (num == 1) {
                one++;
            } else if (num < 0) {
                negative.add(num);
            } else {
                positive.add(num);
            }
        }
        int sum = one;
        while (positive.size() > 1) {
            sum += positive.poll() * positive.poll();
        }
        if (!positive.isEmpty()) {
            sum += positive.poll();
        }
        while (negative.size() > 1) {
            sum += negative.poll() * negative.poll();
        }
        if (!negative.isEmpty()) {
            sum += negative.poll() * (zero > 0 ? 0 : 1);
        }
        System.out.println(sum);
    }
}
/* 사실 아이디어 자체는 괜찮았는데
 *
 * 다음과 같은 경우를 생각할 수 있다.
 *
 * -1 -8 2 1 3 6 -5 0 1
 *
 * 1. 음수끼리 곱하면 양수이다.
 * 2. 1은 따로 더하는게 더 커진다. (이 부분을 생각하지 못했음!!!!!!!)
 *   -> 4 3 2 1 에 대해 4 * 3 + 2 * 1 이 제일 클거 같지만. 4 * 3 + 2 + 1 이 더 크다.
 * 3. 1보다 큰 양수에 대한 PriorityQueue -> 내림차순으로 정렬하여 예를 들어 2 3 6 이면 6*3 + 2 로 되도록
 *   -> while문을 사용하여 0개가 남을 경우 1개가 남을경우까지 곱하고. 나머지를 더해준다.
 * 4. 1의 갯수를 구하기
 *   -> 마지막에 더해준다.
 * 5. 0의 갯수를 구하기
 *   -> 상황에 따라 음수에 곱해준다.
 * 6. 0보다 작은 음수에 대한 PriorityQueue
 *   -> 오름차순으로 정렬하여 예를 들어 -2 -3 -6 이면 (-6)*(-3) + (-2) 가 되도록.
 *   -> 0의 갯수가 존재한다면. -2는 0을 곱하고 더해준다. 아니면 그냥 더해야지 뭐.. 곱하는것보다는 더 크게 더하니깐
 * 코딩시작
 *
 * */


