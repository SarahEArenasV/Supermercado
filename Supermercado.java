package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Supermercado {
    private String nombre;
    LinkedList<Cliente> clientes;
    LinkedList<Empleado> empleados;
    LinkedList<Producto> productos;
    
    public Supermercado(String nombre) {
        this.nombre = nombre;
        this.clientes = new LinkedList<>();
        this.empleados = new LinkedList<>();
        this.productos = new LinkedList<>();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }



    @Override
    public String toString() {
        return "Supermercao:" + nombre + ", clientes: " + clientes + ", trabajadores: " + empleados + ", productos: "
                + productos;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

  public LinkedList<Empleado> obtenerEmpleadosMenoresDe18(){
        LinkedList<Empleado> empleadosMenores = new LinkedList<>();
        for (Empleado empleado : empleados) {
            if (empleado.getEdad() < 18) {
                empleadosMenores.add(empleado);
            }
        }
        return empleadosMenores;
    }
    
}