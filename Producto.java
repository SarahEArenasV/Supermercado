package co.edu.uniquindio.poo;

public class Producto {
    private String nombre;
    private double precioUnitario;
    private int stock;


    public Producto(String nombre, double precioUnitario, int stock) {
        // Validación para precio negativo
        if (precioUnitario < 0) {
            throw new IllegalArgumentException("El precio unitario no puede ser negativo");
        }
        
        // Validación para nombre vacío
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío");
        }
        
        // Validación para stock negativo
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
        
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío");
        }
        this.nombre = nombre;
    }


    public double getPrecioUnitario() {
        return precioUnitario;
    }


    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario < 0) {
            throw new IllegalArgumentException("El precio unitario no puede ser negativo");
        }
        this.precioUnitario = precioUnitario;
    }
    
    public int getStock() {
        return stock;
    }


    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
        this.stock = stock;
    }
    

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precioUnitario=" + precioUnitario + ", stock=" + stock + "]";
    }

    public boolean reducirStockProducto(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            return true;
        } else {
            return false;
        }
    }
}