package ProyectoOrdenDeCompra;

public class Producto {
    private String fabricante;
    private String nombre;
    private int precio;

    public Producto(String fabricante, int precio, String nombre) {
        this.fabricante = fabricante;
        this.precio = precio;
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
