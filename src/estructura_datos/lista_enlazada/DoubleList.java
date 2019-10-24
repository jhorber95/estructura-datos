package estructura_datos.lista_enlazada;

public class DoubleList {
    private Node start;
    private Node end;

    public DoubleList() {
        this.start = null;
        this.end = null;
    }

    public void insertAtBegin(String data) {
        if (start == null) {
            start = new Node(null, null, data);
            end = start;
        } else {
            Node newNode = new Node(null, start, data);
            start.setPrevious(newNode);
            start = newNode;
        }
    }

    public void insertAtEnd(String data) {
        if (start == null) {
            start = new Node(null, null, data);
            start = end;
        } else {
            Node newNode = new Node(null , end, data);
            end.setNext(newNode);
            end = newNode;
        }
    }

    public String deleteStart() {
        String data = start.getData();
        start = start.getNext();
        if(start != null) {
            start.setPrevious(null);
        }else {
            end = null;
        }
        return data;
    }

    public String deleteEnd() {
        String data = end.getData();
        end = end.getPrevious();
        if(end != null) {
            end.setNext(null);
        }else {
            start = null;
        }
        return data;
    }

    public void showNext() {
        Node tempNode = start;
        while (tempNode != null) {
            System.out.println(tempNode.getData());
            tempNode = tempNode.getNext();
        }
    }

    public void showPrevious() {
        Node tempNode = end;
        while (tempNode != null) {
            System.out.println(tempNode.getData());
            tempNode = tempNode.getPrevious();
        }
    }

    public boolean search(String data) {
        Node tempNode = end;
        while (tempNode != null) {
            if (tempNode.getData().equals(data)){
                return true;
            }
            tempNode = tempNode.getPrevious();
        }
        return false;
    }
}
