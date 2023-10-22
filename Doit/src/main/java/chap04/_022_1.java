package chap04;

import java.util.Scanner;

public class _022_1 {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        radixSort(arr, 5);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i] + "\n");
        }
        System.out.print(sb);
    }

    private static void radixSort(int[] arr, int maxDigitLength) {
        int[] output = new int[arr.length];
        int digit = 1;
        int count = 0;
        while (count != maxDigitLength) {
            int[] bucket = new int[10];
            for (int i = 0; i < arr.length; i++) {
                bucket[(arr[i] / digit) % 10]++;
            }
            for (int i = 1; i < 10; i++) {
                bucket[i] += bucket[i - 1];
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                output[bucket[((arr[i] / digit) % 10)] - 1] = arr[i];
                bucket[(arr[i] / digit) % 10]--;
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = output[i];
            }
            digit *= 10;
            count++;
        }
        /*bucket 이라는 개념이 생소할 수 있는데
         * bucket[0] 이라는건 그 자릿수가 0인 경우의 인덱스를 표현 해준다.
         * bucket[1] 이라는건 그 자릿수가 0~1인 경우의 인덱스를 표현해준다.
         *
         * 맨 처음의 for문은 단순히 그 자릿수가 index 인 경우의 개수 이지만.
         * 두번째 for문을 지나면 이것이 누적이 된다.
         *
         * 예를 들어 25 32 63 51 24 32 13 45 51 27
         * 이 있다고 하자.
         * 그러면 bucket 은 다음과 같이 형성될 것이다.
         * 00 02 04 06 07 09 09 10 10 10
         *  0  1  2  3  4  5  6  7  8  9
         * 여기서 이제 값을 뺀다.
         * 25 -> 00 02 04 06 07 08 09 10 10 10 -> output[8]
         *        0  1  2  3  4  5  6  7  8  9
         * 32 -> 00 02 03 06 07 08 09 10 10 10 -> output[3]
         *        0  1  2  3  4  5  6  7  8  9
         * 63 -> 00 02 03 05 07 08 09 10 10 10 -> output[5]
         *        0  1  2  3  4  5  6  7  8  9
         * 51 -> 00 01 03 05 07 08 09 10 10 10 -> output[1]
         *        0  1  2  3  4  5  6  7  8  9
         * 24 -> 00 01 03 05 06 08 09 10 10 10 -> output[6]
         *        0  1  2  3  4  5  6  7  8  9
         * 32 -> 00 01 02 05 06 08 09 10 10 10 -> output[2]
         *        0  1  2  3  4  5  6  7  8  9
         * 13 -> 00 01 02 04 06 08 09 10 10 10 -> output[4]
         *        0  1  2  3  4  5  6  7  8  9
         * 45 -> 00 01 02 04 06 07 09 10 10 10 -> output[7]
         *        0  1  2  3  4  5  6  7  8  9
         * 51 -> 00 00 02 04 06 07 09 10 10 10 -> output[0]
         *        0  1  2  3  4  5  6  7  8  9
         * 27 -> 00 00 02 04 06 07 09 09 10 10 -> output[9]
         *        0  1  2  3  4  5  6  7  8  9
         * output 배열
         * 51 51 32 32 13 63 24 45 25 27.
         * 이후 자릿수도 동일하게 적용될 것이다.
         * */
    }
}
/*하지만 순수하게 큐를 가져오면 시간 제한을 넘어간다.
 * 그래서 개선된 기수정렬이 필요하다.*/
