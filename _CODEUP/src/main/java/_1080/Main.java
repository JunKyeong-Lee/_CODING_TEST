package _1080;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumTarget = sc.nextInt();

        int sum=0;
        int i=1;
        for(;;i++){
            sum+=i;
            if(sum>=sumTarget){
                break;
            }
        }
        System.out.println(i);
    }
}
