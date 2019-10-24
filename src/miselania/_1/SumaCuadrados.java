package miselania._1;

public class SumaCuadrados {

    public static void main(String [] args){
        calcular2s();
    }

    private static void calcular2s() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.print("Total " + sum);

    }
}
