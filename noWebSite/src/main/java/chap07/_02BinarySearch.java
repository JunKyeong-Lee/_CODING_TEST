package chap07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class _02BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = randomList();

        int start = 0;
        int end = list.size();
        int middle = (start + end) / 2;
        int find = 30;
        int findIndex = -1;
        System.out.println(list);
        while (end - start >= 1) {
            int temp = list.get(middle);
            if (find < temp) {
                end = middle;
            } else if (find == temp) {
                findIndex = middle;
                break;
            } else {
                start = middle + 1;
            }
            middle = (start + end) / 2;
        }
        System.out.println(findIndex);
    }

    private static List<Integer> randomList() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++)
            list.add(random.nextInt(100));
        Collections.sort(list);
        return list;
    }
}
