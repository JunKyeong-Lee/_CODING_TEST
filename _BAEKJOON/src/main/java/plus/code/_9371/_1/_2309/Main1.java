package plus.code._9371._1._2309;

import java.util.Scanner;
import java.util.Vector;

public class Main1 {
    public static void main(String[] args) {
        int[] arr = new int[9];
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        sort(arr, 9);

        Vector<Integer> except = new Vector<>();

        boolean flag = false;
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    except.add(i);
                    except.add(j);
                    flag = true;
                    break;
                }

            }
            if (flag)
                break;
        }
        for (int i = 0; i < 9; i++) {
            if (i == except.get(0) || i == except.get(1))
                continue;
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr, int size) {
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
