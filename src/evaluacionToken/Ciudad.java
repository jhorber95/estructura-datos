package evaluacionToken;

public class Ciudad {
    private String nombre;
    private String almacen;
    private String mes;
    private int venta;

    public Ciudad(String nombre, String almacen, String mes, int venta) {
        this.nombre = nombre;
        this.almacen = almacen;
        this.mes = mes;
        this.venta = venta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", almacen='" + almacen + '\'' +
                ", mes='" + mes + '\'' +
                ", venta=" + venta +
                '}' + "\n"
                ;
    }
}
