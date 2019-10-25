package estructura_datos.lista_enlazada.runner;

import estructura_datos.lista_enlazada.DoubleList;
import estructura_datos.lista_enlazada.Users;

import java.util.Random;

public class addUser implements Runnable {

    private  DoubleList doubleList;

    public addUser(DoubleList doubleList) {
        this.doubleList = doubleList;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int time = random.nextInt(2000);
            try {
                Thread.sleep(time);
                int randomInt = random.nextInt(15);
                String user = Users.USERS[randomInt] + "_" + randomInt;
                doubleList.add(user);
                System.out.println("nuevo usuario: \t " + user + " \t total cola " + doubleList.getTotalUser());
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
