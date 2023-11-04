package chap06;

import java.util.*;

public class _08SortingLibrary {
public static void main(String[] args) {
    int[] arr = new int[10000000];
    randomArrayGenerator(arr);
    long start = System.currentTimeMillis();
    Arrays.sort(arr);
    long end = System.currentTimeMillis();
    System.out.println("Arrays.sort 가 걸리는 시간 : " + (end - start) + "ms");

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
        list.add(arr[i]);
    }
    start = System.currentTimeMillis();
    Collections.sort(list);
    end = System.currentTimeMillis();
    System.out.println("Collections.sort 가 걸리는 시간 : " + (end - start) + "ms");
}

static void randomArrayGenerator(int[] arr) {
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
        arr[i] = random.nextInt(150000) + 5000;
    }
}
}
