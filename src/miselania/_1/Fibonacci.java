package miselania._1;

public class Fibonacci {

    public static void main(String[] ar) {
        System.out.println(fibonacci(4));
    }

    private static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
