package chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _021 {
    static long[] tmp;
    static long[] arr;
    static long result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new long[N];
        tmp = new long[N];
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        mergeSort(0, N - 1);
        System.out.println(result);
    }

    private static void mergeSort(int start, int end) {
        // 시작 인덱스와 끝 인덱스
        if (end - start < 1) {
            return;
        }
        int middle = start + (end - start) / 2;
        mergeSort(start, middle);
        mergeSort(middle + 1, end);
        // 여기부터는 배열의 크기가 최소 1인 부분
        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }
        int i = start; // 앞부분의 첫번쨰
        int j = middle + 1; // 뒷부분의 첫번째
        int k = start; // 앞부분과 뒷부분을 합치기 위한 부분의 첫번째
        while (i <= middle && j <= end) {
            if (tmp[i] > tmp[j]) {
                arr[k] = tmp[j];
                result += j - k;
                k++;
                j++;
            } else {
                arr[k] = tmp[i];
                k++;
                i++;
            }
        }
        while (i <= middle) {
            arr[k] = tmp[i];
            k++;
            i++;
        }
        while (j <= end) {
            // 마찬가지 이 순간이면 k와 j의 위치는 동일할거입니다.
            arr[k] = tmp[j];
            k++;
            j++;
        }
    }

    static void print(long[] arr) {
        StringBuilder sb = new StringBuilder();
        for (var x : arr) {
            sb.append(x + " ");
        }
        System.out.println(sb);
    }
}
/*새로운 mergeSort 를 가져와야 될 듯 하다.
 * 우리가 지금까지 배웠던거는 일반적으로 배열을 넘기는 mergeSort
 * 여기서는 숫자값 두가지를 이용한다.
 * 원래 배열을 복사한 다음.
 * 복사한 배열끼리 비교해서 원래 배열로 넣는다.*/