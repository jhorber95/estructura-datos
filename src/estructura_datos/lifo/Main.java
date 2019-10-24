package estructura_datos.lifo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String [] arg) {
        Pila pila = new Pila();
        Apilador apilador = new Apilador(pila);
        Desapilador desapilador = new Desapilador(pila);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(apilador);
        executorService.execute(desapilador);
    }
}
