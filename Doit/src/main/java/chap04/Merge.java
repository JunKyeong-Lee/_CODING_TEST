package chap04;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {42, 32, 24, 60, 15, 5, 90, 45, 18, 30};

        print(arr);
        mergeSort(arr);
        print(arr);
    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }
        for (int i = middle; i < arr.length; i++) {
            right[i - middle] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i++];
            } else {
                arr[k] = right[j++];
            }
            k++;
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < left.length) {
            arr[k++] = right[j++];
        }
    }

    public static void print(int[] arr) {
        for (var x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
