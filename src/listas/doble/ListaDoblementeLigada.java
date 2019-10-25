package listas.doble;

public class ListaDoblementeLigada {
    private Nodo p;
    private Nodo u;
    private int contNodo;

    public ListaDoblementeLigada() {
        this.p = null;
        this.u = null;
        this.contNodo = 0;
    }

    private boolean isEmpty() {
        return p == null;
    }

    void add(Object dato) {
        Nodo nodo = new Nodo(dato);
        contNodo++;

        if (isEmpty()) {
            p = nodo;
            u = nodo;
            return;
        }
        u.setLd(nodo);
        nodo.setLi(u);
        u = nodo;
    }

    void insert(Object dato, int pos) {
        if (isEmpty() || contNodo < pos) {
            add(dato);
            return;
        }

        Nodo nodo = new Nodo(dato);

        /**
         * insert at begin
         */
        if (pos == 1) {
            nodo.setLd(p);
            p.setLi(nodo);
            p = nodo;
            return;
        }


        Nodo i = p;
        int con = 1;
        while (con < pos ){
            i = i.getLd();
            con++;
        }

        i.getLi().setLd(nodo);
        nodo.setLi(i.getLi());

        i.setLi(nodo);
        nodo.setLd(i);

    }

    @Override
    public String toString() {
        String aux = "";
        Nodo i = p;
        while (i != null) {
            aux += i.getDato().toString() + "\n";
            i = i.getLd();
        }

        return aux;
    }
}
