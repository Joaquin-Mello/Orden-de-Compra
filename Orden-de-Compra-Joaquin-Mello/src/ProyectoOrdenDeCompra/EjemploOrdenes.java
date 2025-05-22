package ProyectoOrdenDeCompra;

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra primerOrden = new OrdenCompra("Orden de trabajo");
        primerOrden.setCliente(new Cliente("Joaquin", "Mello"));
        primerOrden.setFecha(new Date());

        primerOrden.addProducto(new Producto("HP", 250, "Impresora"));
        primerOrden.addProducto(new Producto("Logitech", 170, "Monitor"));
        primerOrden.addProducto(new Producto("Dell", 400, "Laptop"));
        primerOrden.addProducto(new Producto("Lenovo", 50, "Teclado"));

        OrdenCompra segundaOrden = new OrdenCompra("Orden de hogar");
        segundaOrden.setCliente(new Cliente("Martin", "Mendoza"));
        segundaOrden.setFecha(new Date());

        segundaOrden.addProducto(new Producto("Divino", 125, "Sillon"));
        segundaOrden.addProducto(new Producto("James", 80, "Lavarropas"));
        segundaOrden.addProducto(new Producto("Samsung", 400, "TV"));
        segundaOrden.addProducto(new Producto("Divino", 120, "Colchon"));


        OrdenCompra tercerOrden = new OrdenCompra("Orden personal");
        tercerOrden.setCliente(new Cliente("Juan", "Torres"));
        tercerOrden.setFecha(new Date());

        tercerOrden.addProducto(new Producto("Sony", 105, "Auriculares"));
        tercerOrden.addProducto(new Producto("Apple", 1300, "Iphone 13"));
        tercerOrden.addProducto(new Producto("Adidas", 30, "Buzo"));
        tercerOrden.addProducto(new Producto("Channel", 170, "Perfume 100ml"));

        imprimirOrden(primerOrden);
        imprimirOrden(segundaOrden);
        imprimirOrden(tercerOrden);
    }
    public static void imprimirOrden(OrdenCompra orden) {
        System.out.println("Orden #" + orden.getId());
        System.out.println("Descripción: " + orden.getDescripcion());
        System.out.println("Fecha: " + orden.getFecha());
        Cliente cliente = orden.getCliente();
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Productos:");
        for (Producto p : orden.getProductos()) {
            System.out.println(" - " + p.getFabricante() + " | " + p.getNombre() + " | $" + p.getPrecio());
        }
        System.out.println("Gran Total: $" + orden.getGranTotal());
        System.out.println("--------------------------------------------------\n");
    }
}
