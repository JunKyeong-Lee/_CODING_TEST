package chap06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _11Practice {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> A = new ArrayList<>();
    List<Integer> B = new ArrayList<>();
    String[] inputs = sc.nextLine().split(" ");
    int N = Integer.parseInt(inputs[0]);
    int K = Integer.parseInt(inputs[1]);
    long sum = 0;
    inputs = sc.nextLine().split(" ");
    for (int i = 0; i < N; i++) {
        A.add(Integer.parseInt(inputs[i]));
        sum += A.get(i);
    }
    inputs = sc.nextLine().split(" ");
    for (int i = 0; i < N; i++) {
        B.add(Integer.parseInt(inputs[i]));
    }
    Collections.sort(A);
    Collections.sort(B, (i1, i2) -> i2 - i1);
    for (int i = 0; i < K; i++) {
        int a = A.get(i);
        int b = B.get(i);
        if (a < b) {
            sum += (b - a);
        }
    }
    System.out.println(sum);
}
}

