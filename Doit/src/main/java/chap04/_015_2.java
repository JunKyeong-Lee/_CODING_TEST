package chap04;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2750
/*버블 선택 삽입 퀵(분할) 변할 기수*/
/*N개의 수가 주어졌을 때 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * */
public class _015_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);
        print(arr);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    for (int k = i; k > j; k--) {
                        arr[k - 1] = arr[k];
                    }
                    arr[j] = temp;
                }
            }
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
