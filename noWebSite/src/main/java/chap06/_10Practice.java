package chap06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _10Practice {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Element> list = new ArrayList<>();
    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
        String name = sc.next();
        int score = sc.nextInt();
        list.add(new Element(name, score));
    }
    Collections.sort(list, (e1, e2) -> e1.score - e2.score);
    for (var e : list) {
        System.out.print(e.name + " ");
    }
    System.out.println();
}

static class Element {
    String name;
    int score;

    public Element(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
}

