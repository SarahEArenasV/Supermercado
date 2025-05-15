package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        // Crear supermercado
        Supermercado supermercado = new Supermercado("Olimpica");

        // Crear empleado (nombre, cedula, edad)
        Empleado empleado = new Empleado("Juan", "Martinez", "12345", "3142546745",25);

        // Crear clientes (nombre, apellido, cedula, telefono)
        Cliente cliente1 = new Cliente("Sofia", "Gomez", "14321", "3001234567");
        Cliente cliente2 = new Cliente("Andrea", "Lopez", "452316", "3009876543");

        // Crear productos
        Producto producto1 = new Producto("Shampoo", 15000, 10);
        Producto producto2 = new Producto("Crema de dientes", 5000, 10);
        Producto producto3 = new Producto("Listerine", 8000, 10);

        // Agregar productos al supermercado
        supermercado.agregarProducto(producto1);
        supermercado.agregarProducto(producto2);
        supermercado.agregarProducto(producto3);

        // Agregar clientes al supermercado
        supermercado.agregarCliente(cliente1);
        supermercado.agregarCliente(cliente2);

        // Agregar empleado al supermercado
        supermercado.agregarEmpleado(empleado);

        // Crear factura
        Factura factura = new Factura("01");

        // Crear detalles y agregarlos a la factura
        DetalleFactura detalleFactura1 = new DetalleFactura(2, producto1);
        factura.agregarDetalleFactura(detalleFactura1);
        detalleFactura1.calcularSubtotalStock();

        DetalleFactura detalleFactura2 = new DetalleFactura(3, producto2);
        factura.agregarDetalleFactura(detalleFactura2);
        detalleFactura2.calcularSubtotalStock();

        // Mostrar información
        Supermercado.mostrarMensaje(supermercado.toString());

        // Calcular y mostrar el subtotal de los detalles
        double totalDetalle1 = detalleFactura1.calcularSubtotal(producto1);
        double totalDetalle2 = detalleFactura2.calcularSubtotal(producto2);
        Supermercado.mostrarMensaje("El subtotal del primer detalle es: " + totalDetalle1);
        Supermercado.mostrarMensaje("El subtotal del segundo detalle es: " + totalDetalle2);

        // Calcular el total de la factura sumando todos los detalles
        double totalFactura = factura.calcularTotal();
        Supermercado.mostrarMensaje("El total de la factura es: " + totalFactura);
        Supermercado.mostrarMensaje(factura.toString());

        Supermercado.mostrarMensaje("El stock disponible del producto " + producto1.getNombre() + " es " + producto1.getStock());
    }
}
