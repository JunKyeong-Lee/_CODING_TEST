package chap06;

public class _04QuickSort {
static int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

public static void main(String[] args) {
    quickSort(0, arr.length);
    print();
}

private static void print() {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}

private static void quickSort(int start, int end) {
    if (end - start <= 1) {
        return;
    }
    int pivot = start;
    int left = pivot + 1;
    int right = end - 1;
    while (left <= right) {
        if (arr[left] < arr[pivot]) {
            left++;
        } else if (arr[pivot] < arr[right]) {
            right--;
        } else {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    int temp = arr[right];
    arr[right] = arr[pivot];
    arr[pivot] = temp;
    pivot = right; // 이 작업 필수. pivot은 현재 맨 왼쪽.
    // 아니면 right를 기준으로 해도 됩니다.
    quickSort(start, pivot);
    quickSort(pivot + 1, end);
}
}
