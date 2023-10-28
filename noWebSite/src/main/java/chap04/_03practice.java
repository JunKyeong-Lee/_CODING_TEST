package chap04;

import java.util.Scanner;

public class _03practice {
    public static void main(String[] args) {
        int[] dx = {2, 2, -2, -2, -1, 1, -1, 1};
        int[] dy = {-1, 1, -1, 1, 2, 2, -2, -2};

        String input = new Scanner(System.in).nextLine();

        int x = (int) input.charAt(0) - 'a' + 1;
        int y = input.charAt(1) - '1' + 1;
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int tempX = x + dx[i];
            int tempY = y + dy[i];
            if (tempX > 0 && tempX < 8 + 1 && tempY > 0 && tempY < 8 + 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
