package chap07;

public class sqrt {
    public static void main(String[] args) {
        long n = 222222222;
        double temp = n;
        for (int i = 0; i < 50; i++) {
            System.out.printf("(%11.15f + %d/%11.15f) / 2 = ", temp, n, temp);
            temp = (temp + n / temp) / 2;
            System.out.printf("%11.15f\n", temp);
        }
        System.out.println(Math.sqrt(n));
    }
}
