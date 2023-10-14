package plus.code._9371._1._2309;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        for (int i = 0; i < 9 - 1; i++) {
            for (int j = 0; j < 9 - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int a = 0;
        int b = 0;
        label:
        for (a = 0; a < 9 - 1; a++) {
            for (b = a + 1; b < 9; b++) {
                if (sum - arr[a] - arr[b] == 100) {
                    break label;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i != a && i != b)
                System.out.println(arr[i]);
        }
    }
}
