package miselania._1;

public class Ejercicio5 {
    private static final Double E = 0.0001;

    public static void main(String[] ar) {
        System.out.println(calculate(2, 10, 0));
    }

    private static int factorial(int n) {
        if (n >= 1) {
            return n * factorial(n - 1);
        } else return 1;
    }

    private static double calculate(int number, int n, int start) {
        double sum = Math.pow(number, start) / factorial(start);
        if (start < n && sum > E) {
            return sum + calculate(number, n, start + 1);
        } else {
            return sum;
        }
    }
}
