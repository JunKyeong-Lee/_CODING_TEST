package chap07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class _02BinarySearch2 {
    static int findIndex = -1;

    public static void main(String[] args) {
        List<Integer> list = randomList();
        int find = 30;
        System.out.println(list);
        BinarySearch(find, list, 0, list.size());
        System.out.println(findIndex);
    }

    private static void BinarySearch(int find, List<Integer> list, int start, int end) {
        if (end - start < 1)
            return;
        int middle = (start + end) / 2;
        int temp = list.get(middle);
        if (find < temp) {
            BinarySearch(find, list, start, middle);
        } else if (find == temp) {
            findIndex = middle;
            return;
        } else {
            BinarySearch(find, list, middle + 1, end);
        }
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
