package chap07;

import java.util.*;

public class _03Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs;
        String input = sc.nextLine();
        int N = Integer.parseInt(input);
        Set<Integer> setN = new HashSet<>();
        inputs = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            setN.add(Integer.parseInt(inputs[i]));
        }
        input = sc.nextLine();
        int M = Integer.parseInt(input);
        List<Integer> listM = new ArrayList<>();
        inputs = sc.nextLine().split(" ");
        for (int i = 0; i < M; i++) {
            listM.add(Integer.parseInt(inputs[i]));
        }
        for (int i = 0; i < M; i++) {
            if (setN.contains(listM.get(i))) {
                System.out.print("yes ");
            }else{
                System.out.print("no ");
            }
        }
    }
}
