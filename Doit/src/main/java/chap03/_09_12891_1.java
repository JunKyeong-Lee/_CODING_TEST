package chap03;

import java.util.Scanner;

public class _09_12891_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt(); // 문자열 길이
        int P = sc.nextInt(); // 부분문자열 길이

        int[] find = new int[5]; // A C G T others

        String str = sc.next();

        int minA = sc.nextInt();
        int minC = sc.nextInt();
        int minG = sc.nextInt();
        int minT = sc.nextInt();

        for (int i = 0; i < P; i++) {
            switch (str.charAt(i)) {
                case 'A':
                    find[0]++;
                    break;
                case 'C':
                    find[1]++;
                    break;
                case 'G':
                    find[2]++;
                    break;
                case 'T':
                    find[3]++;
                    break;
                default:
                    find[4]++;
                    break;
            }
        }
        int i = 0;
        int j = P;
        int count = 0;
        while (true) {
            if (find[4] == 0 &&
                    find[0] >= minA &&
                    find[1] >= minC &&
                    find[2] >= minG &&
                    find[3] >= minT) {
                count++;
            }
            if (j == S)
                break;
            switch (str.charAt(i)) {
                case 'A':
                    find[0]--;
                    break;
                case 'C':
                    find[1]--;
                    break;
                case 'G':
                    find[2]--;
                    break;
                case 'T':
                    find[3]--;
                    break;
                default:
                    find[4]--;
                    break;
            }
            i++;
            switch (str.charAt(j)) {
                case 'A':
                    find[0]++;
                    break;
                case 'C':
                    find[1]++;
                    break;
                case 'G':
                    find[2]++;
                    break;
                case 'T':
                    find[3]++;
                    break;
                default:
                    find[4]++;
                    break;
            }
            j++;
        }
        System.out.println(count);
    }
}
