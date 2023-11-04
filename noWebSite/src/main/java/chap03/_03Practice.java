package chap03;

import java.util.*;

public class _03Practice {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]); // 행의 개수
        int m = Integer.parseInt(inputs[1]); // 열의 개수
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            inputs = sc.nextLine().split(" ");
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                int e = Integer.parseInt(inputs[j]);
                if (min > e) {
                    min = e;
                }
            }
            if (max < min) {
                max = min;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]); // 행의 개수
        int m = Integer.parseInt(inputs[1]); // 열의 개수
        ArrayList<Integer> list;
        ArrayList<Integer> min = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list = new ArrayList<>();
            inputs = sc.nextLine().split(" ");
            for (int j = 0; j < m; j++) {
                list.add(Integer.parseInt(inputs[j]));
            }
            min.add(Collections.min(list));
        }
        System.out.println(Collections.max(min));
    }
}
