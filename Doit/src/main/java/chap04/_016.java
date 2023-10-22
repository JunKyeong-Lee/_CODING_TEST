package chap04;

import java.util.Scanner;

public class _016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 1이상 500,000미만
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean changed = false;
        for (int i = 1; i <= n + 1; i++) {
            changed = false;
            for (int j = 1; j <= n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    changed = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (changed == false) {
                System.out.println(i);
                break;
            }
        }
    }
}
