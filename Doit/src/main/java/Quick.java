public class Quick {
    public static void main(String[] args) {
        int[] arr = {42, 32, 24, 60, 15, 5, 90, 45, 18, 30};
        for (var x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        f(0, arr.length, arr);

        for (var x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void f(int start, int end, int[] arr) {
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
        f(start, pivot, arr);
        f(pivot + 1, end, arr);
    }
}
