package estructura_datos.lista_enlazada;

public class Main {

    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();

        doubleList.insertAtBegin("a");
        doubleList.insertAtEnd("b");
        doubleList.insertAtEnd("c");
        doubleList.insertAtEnd("d");

        doubleList.showNext();
        System.out.println("------------------------------");
        doubleList.showPrevious();

    }
}
