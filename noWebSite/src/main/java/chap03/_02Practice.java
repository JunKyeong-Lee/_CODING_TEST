package chap03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _02Practice {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs;
        inputs = sc.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int K = Integer.parseInt(inputs[2]);
        ArrayList<Integer> list = new ArrayList<>();
        inputs = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(inputs[i]));
        }
        Collections.sort(list);
        int max1 = list.get(N - 1);
        int max2 = list.get(N - 2);
        int sum = 0;
        int j = 0;
        for (int i = 0; i < M; i++) {
            if (j == K) {
                j = 0;
                sum += max2;
            } else {
                j++;
                sum += max1;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] inputs;
        inputs = sc.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int K = Integer.parseInt(inputs[2]);
        ArrayList<Integer> list = new ArrayList<>();
        inputs = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(inputs[i]));
        }
        Collections.sort(list);
        int max1 = list.get(N - 1);
        int max2 = list.get(N - 2);

        /* 예를 들어 max1 이 6 max2 가 5 이면
         * 666665
         * 666665
         * 이런식으로 묶음 형식으로 될 거 같다는 느낌이 온다.
         * 쭉 가다가
         * 마지막에 나머지에 대해서만 6을 추가해서 더해주면 된다.*/
        int group = max1 * K + max2;
        int sum = (M / (K + 1)) * group;
        sum += (M % (K + 1)) * max1;
        System.out.println(sum);
    }
}
