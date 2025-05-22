package ProyectoOrdenDeCompra;

import java.util.Date;

public class OrdenCompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProducto;

    private static int ultimoId;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.id = ++ultimoId;
        this.productos = new Producto[4];
        this.indiceProducto = 0;
    }

    public int getId() {
        return id;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addProducto(Producto producto){
        if (indiceProducto < productos.length) {
            productos[indiceProducto++] = producto;
        } else {
            System.out.println("No se pueden agregar más de 4 productos.");
        }
    }

    public double getGranTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }
}
