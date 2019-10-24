package estructura_datos.lifo;

import java.util.Random;

public class Apilador implements Runnable{
    private Pila pila;

    public Apilador(Pila pila) {
        this.pila = pila;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int time = random.nextInt(2000);
            try {
                Thread.sleep(time);
                int dato = random.nextInt(10000);
                System.out.println(pila.apilar(dato));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
