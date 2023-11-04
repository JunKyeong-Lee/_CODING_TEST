package chap05;

public class _06AdjacencyMtx {
    public static void main(String[] args) {
        int[][] arr = {{0, 7, 5}, {7, 0, 9}, {5, 9, 0}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}