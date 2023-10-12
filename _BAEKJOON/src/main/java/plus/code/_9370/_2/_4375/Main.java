package plus.code._9370._2._4375;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();

            long result = 1;
            int count = 1;
            while (true) {
                if (result % n == 0) {
                    break;
                }
                result = result % n;
                result = result * 10 + 1;
                count++;
            }
            System.out.println(count);

        }
    }
}