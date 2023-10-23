package chap05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class BinarySearch {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        randomList();
        print();
        System.out.println(binarySearch1(0, list.size(), 25));
        System.out.println(binarySearch2(0, list.size(), 25));
    }

    static void randomList() {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100 - 10) + 10);
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }

    static void print() {
        for (var x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static int binarySearch1(int start, int end, int find) {
        if (end - start < 1) {
            return -1;
        }
        int middle = (start + end) / 2;
        if (list.get(middle) > find) {
            return binarySearch1(start, end - 1, find);
        } else if (list.get(middle) < find) {
            return binarySearch1(start + 1, end, find);
        } else {
            return middle;
        }
    }

    static int binarySearch2(int start, int end, int find) {
        int s = start;
        int e = end;
        int f = find;
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
