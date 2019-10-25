package estructura_datos.lista_enlazada.runner;

import estructura_datos.lista_enlazada.DoubleList;
import estructura_datos.lista_enlazada.Users;

import java.util.Random;

public class InsertUser implements Runnable {

    private DoubleList doubleList;


    public InsertUser(DoubleList doubleList) {
        this.doubleList = doubleList;
    }


    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int time = random.nextInt(6000);
            try {
                Thread.sleep(time);
                int randomInt = random.nextInt(15);
                int low = 1;
                int high = doubleList.getTotalUser();
                int position = random.nextInt(high - low) + low;
                String user = Users.USERS[randomInt] + "_" + randomInt;
                doubleList.insert(user, position);
                System.out.println("usuario colado: \t " + user + " \t posicion: " + position + " \t total cola: " + doubleList.getTotalUser());
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
