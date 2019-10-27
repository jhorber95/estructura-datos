package listas.simple;

public class ListaSimplementeLigada {
    private Nodo p;

    ListaSimplementeLigada() {
        this.p = null;
    }

    private boolean estaVacia() {
        return p == null;
    }

    void add(Object data) {
        Nodo nodo = new Nodo(data);
        if (estaVacia()) {
            p = nodo;
            return;
        }
        Nodo i = p;
        while (i.getLiga() != null) {
            i = i.getLiga();
        }
        i.setLiga(nodo);
    }

    void insert(Object dato, int posicion) {
        if (estaVacia()) {
            add(dato);
            return;
        }
        Nodo nodo = new Nodo(dato);

        if (posicion == 1) {
            nodo.setLiga(p);
            p = nodo;
            return;
        }
        Nodo i = p;
        int contNodo = 1;
        while (i.getLiga() != null && contNodo < posicion - 1) {
            i = i.getLiga();
            contNodo++;
        }
        nodo.setLiga(i.getLiga());
        i.setLiga(nodo);
    }

    boolean delete(int pos) throws Throwable {
        int contNodo = 1;
        if (estaVacia()) {
            return false;
        }
        if (pos == 1) {
            Nodo aux = p;
            p = p.getLiga();
            aux.finalize();
            return true;
        }

        Nodo i = p;
        while (i.getLiga() != null && contNodo < pos - 1) {
            i = i.getLiga();
            contNodo++;
        }

        if (i.getLiga() == null) {
            return false;
        }

        Nodo aux = i.getLiga();
        i.setLiga(aux.getLiga());
        aux.finalize();
        return true;
    }

    boolean delete(Object dato) throws Throwable {
        if (estaVacia()) return false;

        if (p.getDato() == dato) {
            Nodo aux = p;
            p = p.getLiga();
            aux.finalize();
            return true;
        }
        Nodo i = p;
        while (i.getLiga().getDato() != dato) {
            i = i.getLiga();
            if(i.getLiga() == null) return false;
        }
        Nodo aux = i.getLiga();
        i.setLiga(aux.getLiga());
        aux.finalize();
        return true;
    }

    int search(Object dato) {
        if (estaVacia()) return 0;

        int contNodo = 1;

        Nodo i = p;
        while (i != null) {
            if (i.getDato() == dato) {
                return contNodo;
            }
            i = i.getLiga();
            contNodo++;
        }
        return 0;
    }

    @Override

    public String toString() {
        String aux = "";
        Nodo i = p;
        while (i != null) {
            aux += i.toString() + "\n";
            i = i.getLiga();
        }
        return aux;
    }
}
