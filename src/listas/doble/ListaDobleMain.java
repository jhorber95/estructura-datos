package listas.doble;


public class ListaDobleMain {
    public static void main(String[] args) {
        ListaDoblementeLigada lista = new ListaDoblementeLigada();

        lista.add("a");
        lista.add("b");
        lista.add("c");


        System.out.println(lista);

        lista.insert("first", 1);
        lista.insert("new", 2);
        lista.insert("node", 3);
        lista.insert("sample", 3);
        lista.insert("222222", 30);
        System.out.println(lista);

    }
}
