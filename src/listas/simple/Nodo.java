package listas.simple;

public class Nodo {
    private Object dato;
    private Nodo liga;

    public Nodo(Object dato) {
        this.dato = dato;
        liga = null;
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
    }

    public Object getDato() {
        return dato;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

    @Override
    public String toString() {
        return dato.toString() ;
    }
}
