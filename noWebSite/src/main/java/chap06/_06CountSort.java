package chap06;

public class _06CountSort {
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
    int[] counts = new int[1000];
    for (int i = 0; i < arr.length; i++) {
        counts[arr[i]]++;
    }
    for (int i = 0; i < counts.length; i++) {
        for (int j = 0; j < counts[i]; j++) {
            System.out.print(i + " ");
        }
    }
    System.out.println();
}

private static void print() {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
