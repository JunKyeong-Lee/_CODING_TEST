package plus.code._9371._2._3085;
/*
 * N * N 크기의 사탕을 채워 넣는다. 색깔은 다르다.
 * 사탕의 색이 다른 인접한 두칸을 고른다.
 * 고른 칸에  들어있는 사탕을 서로 교환한다.
 * 이때 모두 같은 색으로 이루어져 있는 가장 긴 연속부분 을 고른 뒤
 * 모두 먹는다.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        char[][] board = new char[N][N];
        int[][] dpC = new int[N][N];
        int[][] dpP = new int[N][N];
        int[][] dpZ = new int[N][N];
        int[][] dpY = new int[N][N];
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(board[i][j]=='C'){
                    dpC[i][j] = Math.max(dpC[i - 1][j],
                            Math.max(dpC[i + 1][j],
                                    Math.max(dpC[i][j - 1],
                                            dpC[i][j + 1])))+1;

                }
            }
        }
    }

}
