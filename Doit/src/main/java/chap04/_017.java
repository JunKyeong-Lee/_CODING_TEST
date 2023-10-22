package chap04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        Character[] boxingChars = new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            boxingChars[i] = chars[i];
        }

        Arrays.sort(boxingChars, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2 - o1;
            }
        });
        for (char ch : boxingChars) {
            System.out.print(ch);
        }
    }
}
/*char는 Character 값으로 자동 박싱이 안됨.*/