package plus.code._9370._3._1037;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int divisorCount = sc.nextInt(); // 약수의 개수 (1 과 자기자신을 제외한)

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < divisorCount; i++) {
            int num = sc.nextInt();
            if (min > num)
                min = num;
            if (max < num)
                max = num;
        }
        System.out.println(min * max);

    }
}