package co.edu.uniquindio.poo.test;

import co.edu.uniquindio.poo.Producto;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {
    @Test
    public void testCreacionProducto() {
        Producto producto = new Producto("Arroz", 3500.0, 10);

        assertEquals("Arroz", producto.getNombre(), "El nombre debe ser igual al proporcionado");
        assertEquals(3500.0, producto.getPrecioUnitario(), "El precio unitario debe ser igual al proporcionado");
        assertEquals(10, producto.getStock(), "El stock debe ser igual al proporcionado");
    }

    @Test
    public void testReducirStockProducto() {
        Producto producto = new Producto("Leche", 2800.0, 15);

        assertTrue(producto.reducirStockProducto(5), "Debería reducir el stock exitosamente");
        assertEquals(10, producto.getStock(), "El stock debería haber disminuido a 10");

        assertFalse(producto.reducirStockProducto(20), "No debería reducir el stock cuando la cantidad excede el stock disponible");
        assertEquals(10, producto.getStock(), "El stock no debería cambiar cuando la operación falla");
    }

    @Test
    public void testListaProductos() {
        Producto producto1 = new Producto("Arroz", 3500.0, 10);
        Producto producto2 = new Producto("Frijoles", 4200.0, 8);
        Producto producto3 = new Producto("Azúcar", 2900.0, 15);

        List<String> nombresEsperados = Arrays.asList("Arroz", "Frijoles", "Azúcar");
        List<String> nombresReales = Arrays.asList(
                producto1.getNombre(),
                producto2.getNombre(),
                producto3.getNombre()
        );

        assertIterableEquals(nombresEsperados, nombresReales, "Las listas de nombres de productos deben ser iguales");
    }

    @Test
    public void testProductoPrecioNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Producto("Café", -5000.0, 10);
        }, "Debería lanzar una excepción cuando el precio es negativo");
    }

}