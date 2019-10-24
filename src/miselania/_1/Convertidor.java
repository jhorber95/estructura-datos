package miselania._1;

public class Convertidor {

    private static final double INCH = 39.37;
    private static final double FOOT = 3.2808;

    public static void main(String [] args) {
        convertir(10);
    }

    private static  void convertir(int metros) {
        System.out.println( metros + " equivalen a " + metros * INCH + " pulgadas");
        System.out.println( metros + " equivalen a " + metros * FOOT + " pies");
    }
}
