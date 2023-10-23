package chap05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class _029 {
    public static void main(String[] args) {


        Random random = new Random();
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            int z = random.nextInt(100);
            points.add(new Point(x, y, z));
        }

        for (var x : points) {
            System.out.println(x);
        }
        points.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.x != o2.x) {
                    return o1.x - o2.x;
                } else {
                    if (o1.y != o1.y) {
                        return o1.y - o2.y;
                    } else {
                        return o1.z - o2.z;
                    }
                }
            }
        });
        System.out.println("------------------");
        for (var x : points) {
            System.out.println(x);
        }
    }
}

class Point {
    int x, y, z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
