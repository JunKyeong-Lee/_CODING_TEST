package chap06;

public class _03InsertionSort2 {
static int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

public static void main(String[] args) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
    print();
}

private static void print() {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
