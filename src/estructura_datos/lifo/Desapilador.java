package estructura_datos.lifo;

import java.util.Random;

public class Desapilador implements Runnable{
    private Pila pila;

    public Desapilador(Pila pila) {
        this.pila = pila;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int time = random.nextInt(5000);
            try {
                Thread.sleep(time);
                System.out.println(pila.desapilar());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
