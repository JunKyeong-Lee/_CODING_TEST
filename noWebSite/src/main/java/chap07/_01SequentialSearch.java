package chap07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class _01SequentialSearch {
    public static void main(String[] args) {
        List<Integer> list = randomList();
        System.out.println(list);
        int find = 20;
        int i=0;
        for (; i < list.size(); i++) {
            if (find == list.get(i)) {
                break;
            }
        }
        if(i==list.size())
            System.out.println(-1);
        else
            System.out.println(i);
    }

    private static List<Integer> randomList() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++)
            list.add(random.nextInt(100));
        return list;
    }
}
