package chap07;

import java.util.*;

public class _03Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs;
        String input = sc.nextLine();
        int N = Integer.parseInt(input);
        int[] arr = new int[1000001];
        inputs = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(inputs[i])]++;
        }
        input = sc.nextLine();
        int M = Integer.parseInt(input);
        List<Integer> listM = new ArrayList<>();
        inputs = sc.nextLine().split(" ");
        for (int i = 0; i < M; i++) {
            listM.add(Integer.parseInt(inputs[i]));
        }
        for (int i = 0; i < M; i++) {
            if (arr[listM.get(i)] > 0) {
                System.out.print("yes ");
            } else {
                System.out.print("no ");
            }
        }
    }
}
