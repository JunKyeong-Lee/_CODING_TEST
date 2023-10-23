package chap05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _029_1 {
    static ArrayList<Long> list;

    public static void main(String[] args) {
        list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            if (binarySearch(0, n, sc.nextLong()) < 0) {
                sb.append("0\n");
            } else {
                sb.append("1\n");
            }
        }
        System.out.print(sb);
    }

    public static int binarySearch(int start, int end, long find) {
        int s = start;
        int e = end;
        long f = find;
        while (true) {
            if (e - s < 1) {
                return -1;
            }
            int m = (s + e) / 2;
            if (list.get(m) > find) {
                e = m;
            } else if (list.get(m) < find) {
                s = m + 1;
            } else {
                return m;
            }
        }
    }
}