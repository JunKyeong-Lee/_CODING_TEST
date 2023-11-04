package chap05;

import java.util.ArrayList;
import java.util.List;

public class _07AdjacencyList {
public static void main(String[] args) {
    List<int[]>[] list = new ArrayList[3];
    for (int i = 0; i < 3; i++) {
        list[i] = new ArrayList<>();
    }
    list[0].add(new int[]{1, 7});
    list[0].add(new int[]{2, 5});
    list[1].add(new int[]{0, 7});
    list[2].add(new int[]{0, 5});
    for (int i = 0; i < 3; i++) {
        System.out.print(i + ": ");
        for (var x : list[i]) {
            System.out.print("노드" + x[0] + "/거리" + x[1] + " ");
        }
        System.out.println();
    }
}
}

