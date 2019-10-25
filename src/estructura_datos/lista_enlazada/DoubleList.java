package estructura_datos.lista_enlazada;


public class DoubleList {
    private Node start;
    private Node end;
    private int totalNodes;

    public DoubleList() {
        this.start = null;
        this.end = null;
        this.totalNodes = 0;
    }

    public void add(String data) {
        Node node = new Node(null, null, data);
        totalNodes++;

        if (start == null) {
            start = node;
            end = node;
            return;
        }
        end.setNext(node);
        node.setPrevious(end);
        end = node;
    }

    public void insert(String data, int pos) {
        totalNodes++;

        if (start == null || totalNodes < pos) {
            add(data);
            return;
        }
        Node node = new Node(null, null, data);

        if (pos == 1) {
            node.setNext(start);
            start.setPrevious(node);
            start = node;
            return;
        }

      /*  Node i = start;
        int cont = 1;
        while (cont < pos) {
            i = i.getNext();
            cont++;
        }*/

        Node i = getNode(pos);

        i.getPrevious().setNext(node);
        node.setPrevious(i.getPrevious());

        i.setPrevious(node);
        node.setNext(i);
    }

    public boolean delete(int pos) throws Throwable {
        if (start == null || pos > totalNodes) {
            return false;
        }
        totalNodes--;

//        Eliminar al pricipio
        if (pos == 1) {
            Node node = start;
            if (start.getNext() != null) {
                start.getNext().setPrevious(null);
                start = start.getNext();
                node.finalize();
                return true;
            } else {
                start = null;
                return true;
            }

        }
//        eliminar al final
        if (pos == totalNodes) {
            Node node = end;
            end.getPrevious().setNext(null);
            end = end.getPrevious();
            node.finalize();
            return true;
        }

        Node i = getNode(pos);

        i.getPrevious().setNext(i.getNext());
        i.getNext().setPrevious(i.getPrevious());
        i.finalize();
        return true;
    }

    private Node getNode(int pos) {
        Node i = start;
        int cont = 1;
        while (cont < pos) {
            i = i.getNext();
            cont++;
        }
        return i;
    }

    public int getTotalUser() {
        return totalNodes;
    }

    @Override
    public String toString() {
        String aux = "";
        Node tempNode = start;
        while (tempNode != null) {
            aux += tempNode.getData() + "\n";
            tempNode = tempNode.getNext();
        }
        return aux;
    }
}
