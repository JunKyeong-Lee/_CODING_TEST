package chap06;

public class _02InsertionSort1 {
static int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

public static void main(String[] args) {
    for (int i = 1; i < arr.length; i++) {
        for (int j = i; j > 0; j--) {
            if (arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            } else {
                break;
            }
        }
    }
    print();
}

private static void print() {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
