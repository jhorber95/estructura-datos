package estructura_datos.lifo;

public class Pila {
    private int max = 10;
    private int tope;
    private Object objects[];

    public Pila() {
        tope = 0;
        objects = new Object[max];
    }

    private boolean estaVacia() {
        return tope == 0;
    }

    private boolean estaLlena() {
        return tope == max;
    }

    public String apilar(Object dato) {
        if (estaLlena()) {
            return "com.java.Pila llena";
        }
        objects[tope] = dato;
        tope++;
        return "Se apilo " + dato + ", tope: " + tope;
    }

    public String desapilar() {
        if (estaVacia()) {
            return "pila vacia";
        }
        tope --;
        return "Se desapilo " + objects[tope] + ", tope: " + tope;
    }
}
