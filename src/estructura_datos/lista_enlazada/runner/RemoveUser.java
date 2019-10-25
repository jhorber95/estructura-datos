package estructura_datos.lista_enlazada.runner;

import estructura_datos.lista_enlazada.DoubleList;
import estructura_datos.lista_enlazada.Users;

import java.util.Random;

public class RemoveUser implements Runnable {

    private  DoubleList doubleList;

    public RemoveUser(DoubleList doubleList) {
        this.doubleList = doubleList;
    }


    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int time = random.nextInt(5000);
            try {
                Thread.sleep(time);
                if (doubleList.delete(1)) {
                    System.out.println("usuario atendido  \t total cola: " + doubleList.getTotalUser());
                }else {
                    System.out.println("No hay usuarios para atender \t  total cola: " + doubleList.getTotalUser());
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }
}
