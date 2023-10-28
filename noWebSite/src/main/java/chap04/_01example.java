package chap04;

import java.util.Scanner;

public class _01example {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] dx = {0, 0, -1, 1};
    int[] dy = {1, -1, 0, 0};
    char[] moveType = {'R', 'L', 'U', 'D'};
    String[] inputs = sc.nextLine().split(" ");
    int N = Integer.parseInt(inputs[0]);
    int[] points = {1, 1};
    int[] tempPoint = new int[2];
    inputs = sc.nextLine().split(" ");
    for (var x : inputs) {
        char ch = x.charAt(0);
        for (int i = 0; i < moveType.length; i++) {
            if (ch == moveType[i]) {
                tempPoint[0] = points[0] + dx[i];
                tempPoint[1] = points[1] + dy[i];
            }
        }
        if (tempPoint[0] < 1 || tempPoint[0] > N || tempPoint[1] < 1 || tempPoint[1] > N) {
            continue;
        }
        points[0] = tempPoint[0];
        points[1] = tempPoint[1];
    }
    System.out.println(points[0] + " " + points[1]);
}

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int[] points = {1, 1};
        inputs = sc.nextLine().split(" ");
        for (var x : inputs) {
            char ch = x.charAt(0);
            if (ch == 'R') {
                if (points[1] < N) {
                    points[1]++;
                }
            } else if (ch == 'L') {
                if (points[1] > 1) {
                    points[1]--;
                }
            } else if (ch == 'D') {
                if (points[0] < N) {
                    points[0]++;
                }
            } else if (ch == 'U') {
                if (points[0] > 1) {
                    points[0]--;
                }
            }
        }
        System.out.println(points[0] + " " + points[1]);
    }
}
