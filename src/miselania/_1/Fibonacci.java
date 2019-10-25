package miselania._1;

public class Fibonacci {

    public static void main(String[] ar) {
        System.out.println(nFibonacci(20));
        System.out.println(fibonacci(20));
    }

    private static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    private static double nFibonacci(int number) {
        if (number == 0 || number == 1 ) return number;
        double a = 0, b = 1, c = 1, i = 1;
        while (i < number) {
           c = a +b;
           a = b;
           b = c;
           i++;

        }
        return c;
    }
}
