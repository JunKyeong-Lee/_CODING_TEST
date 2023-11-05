package chap07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _04Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        String[] inputs = sc.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        inputs = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(inputs[i]);
            list.add(temp);
            if (end < temp) {
                end = temp;
            }
        }
        int result = 0;
        while (start <= end) {
            long total = 0;
            int mid = (start + end) / 2;
            for (var x : list) {
                if(x>mid)
                    total += x - mid;
            }
            if (total < M) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }
        System.out.println(result);
    }
}
