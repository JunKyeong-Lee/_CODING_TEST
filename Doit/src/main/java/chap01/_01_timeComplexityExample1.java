package chap01;

public class _01_timeComplexityExample1 {
    public static void main(String[] args) {
        int findNumber = (int) (Math.random() * 100);
        for (int i = 0; i < 100; i++) {
            if (i == findNumber) {
                System.out.println(i);
                break;
            }
        }
    }
}
