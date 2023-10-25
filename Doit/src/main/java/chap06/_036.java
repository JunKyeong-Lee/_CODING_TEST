package chap06;

import java.util.ArrayList;
import java.util.Scanner;

public class _036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        /*String 타입의 ArrayList 를 만들어서 하나씩 보자. 그게 좀더 다루기 쉬울듯*/
        ArrayList<Integer> intArr = new ArrayList<>();
        ArrayList<String> opArr = new ArrayList<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                opArr.add(String.valueOf(str.charAt(i)));
                end = i;
                intArr.add(Integer.parseInt(str.substring(start, end)));
                start = i + 1;
            }
        }
        intArr.add(Integer.parseInt(str.substring(start)));
        int sum = 0;
        int sumTemp = 0;
        boolean isMinus = false;
        for (int i = 0; i < opArr.size(); i++) {
            // +를 만나면 계속 누적시킴.
            // -를 만나면 더한다.
            if (opArr.get(i).equals("+")) {
                sumTemp += intArr.get(i);
            }
            if (opArr.get(i).equals("-")) {
                sumTemp += intArr.get(i);
                if (isMinus)
                    sum -= sumTemp;
                else
                    sum += sumTemp;
                isMinus = true;
                sumTemp = 0;
            }
        }
        sumTemp += intArr.get(intArr.size() - 1);
        if (isMinus) {
            sum -= sumTemp;
        } else {
            sum += sumTemp;
        }
        System.out.println(sum);
    }
}
/*아이디어는 -를 만나고 다음 -를 만날때까지 쭉 더해주기.
 * 예를들어
 * 55+50+40-30-20+100+100+200-30 이라면
 * 55+50+40-30-(20+100+100+200)-30*/