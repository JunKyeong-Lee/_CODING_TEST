package chap04;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2750
/*버블 선택 삽입 퀵(분할) 변할 기수*/
/*N개의 수가 주어졌을 때 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * */
public class _015_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSortStart(arr);
        print(arr);
    }

    private static void quickSortStart(int[] arr) {
        quickSort(arr, 0, arr.length);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (end - start <= 1) {
            return;
        }
        int left = start;
        int pivot = end - 1;
        int right = pivot - 1;
        while (left <= right) {
            if (arr[left] <= arr[pivot]) {
                left++;
            } else if (arr[pivot] <= arr[right]) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        int temp = arr[left];
        arr[left] = arr[pivot];
        arr[pivot] = temp;
        pivot = left;
        quickSort(arr, start, pivot);
        quickSort(arr, pivot + 1, end);

    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
