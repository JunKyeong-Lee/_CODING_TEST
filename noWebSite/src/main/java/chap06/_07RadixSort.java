package chap06;

import java.util.Arrays;

public class _07RadixSort {
static int[] arr = {
        573, 235, 890, 678, 123, 422, 345, 789, 134, 756,
        987, 234, 556, 332, 879, 456, 267, 678, 123, 453,
        120, 567, 789, 346, 980, 654, 322, 789, 456, 878,
        100, 555, 890, 234, 789, 999, 345, 123, 654, 789,
        678, 122, 444, 777, 345, 234, 678, 987, 467, 543,
        890, 999, 345, 111, 765, 222, 334, 888, 333, 456,
        321, 666, 333, 888, 444, 999, 123, 432, 564, 789,
        876, 234, 567, 345, 678, 999, 456, 555, 654, 111,
        890, 765, 987, 345, 666, 876, 123, 444, 234, 567,
        888, 333, 432, 789, 654, 345, 222, 467, 111, 456
};

public static void main(String[] args) {
    int max = Arrays.stream(arr).max().getAsInt();

    for (int exp = 1; max / exp > 0; exp *= 10) {
        radixSort(exp);
    }
    print();
}

private static void radixSort(int exp) {
    int n = arr.length;
    int result[] = new int[n];
    int count[] = new int[10];
    for (int i = 0; i < n; i++) {
        count[(arr[i] / exp) % 10]++; // 각각 자릿수에 대한 counting을 진행
    }
    for (int i = 1; i < 10; i++) {
        count[i] += count[i - 1]; // 그 counting 자체를 인덱스로 만들기 위한 누적합
    }
    for (int i = n - 1; i >= 0; i--) {
        result[--count[(arr[i] / exp) % 10]] = arr[i];
        // 핵심은 누적합 때문인데
        // 누적합에서 적절한 값을 1 빼면서 자리를 찾는 것이기 때문에
        // arr 배열의 맨 뒤에서부터 진행한다.
    }
    System.arraycopy(result, 0, arr, 0, n);
}

private static void print() {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
