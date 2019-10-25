package estructura_datos.lista_enlazada;

import estructura_datos.lista_enlazada.runner.InsertUser;
import estructura_datos.lista_enlazada.runner.RemoveUser;
import estructura_datos.lista_enlazada.runner.addUser;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DoubleListMain {

    public static void main(String[] args) throws Throwable {
        DoubleList list = new DoubleList();


       /* list.add("a");
       *//* list.add("b");
        list.add("c");
        list.add("d");*//*

        System.out.println(list);

        if(list.delete(1)){
            System.out.println("y");
        } else {
            System.out.println("n");
        }

        System.out.println(list);*/


        addUser addUser = new addUser(list) ;
        InsertUser colarUser = new InsertUser(list);
        RemoveUser atenderUser = new RemoveUser(list);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(addUser);
        executorService.execute(colarUser);
        executorService.execute(atenderUser);
    }
}
