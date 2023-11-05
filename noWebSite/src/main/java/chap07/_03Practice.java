package chap07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _03Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs;
        String input = sc.nextLine();
        int N = Integer.parseInt(input);
        List<Integer> listN = new ArrayList<>();
        inputs = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            listN.add(Integer.parseInt(inputs[i]));
        }
        Collections.sort(listN);
        input = sc.nextLine();
        int M = Integer.parseInt(input);
        List<Integer> listM = new ArrayList<>();
        inputs = sc.nextLine().split(" ");
        for (int i = 0; i < M; i++) {
            listM.add(Integer.parseInt(inputs[i]));
        }
        for (int i = 0; i < M; i++) {
            search(listN, listM.get(i));
        }
    }

    private static void search(List<Integer> listN, int find) {
        int start = 0;
        int end = listN.size();
        int middle = (start + end) / 2;
        int findIndex = -1;
        while (end - start >= 1) {
            int temp = listN.get(middle);
            if (temp > find) {
                end = middle;
            } else if (temp < find) {
                start = middle + 1;
            } else {
                findIndex = middle;
                break;
            }
            middle = (start + end) / 2;
        }
        if (findIndex == -1) {
            System.out.print("no ");
        } else {
            System.out.print("yes ");
        }
    }
}
