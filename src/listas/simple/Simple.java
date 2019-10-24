package listas.simple;

public class Simple {
    public static void main(String[] args) throws Throwable {
        ListaSimplementeLigada lista = new ListaSimplementeLigada();

        lista.add(1);
        lista.add(14);
        lista.add(15);
        lista.add(15);
        lista.add(21);
        lista.add(41);
        lista.add("something");
        lista.insert("new dato", 3);

        System.out.println(lista);

        if (lista.delete(3)) {
            System.out.println("delete ok 3");
        } else {
            System.out.println("delete false 3");
        }

        if (lista.delete("something")) {
            System.out.println("delete ok");
        } else {
            System.out.println("delete false");
        }


        System.out.println(lista);

        System.out.println(lista.search(41));
        System.out.println(lista.search(444));

    }
}
