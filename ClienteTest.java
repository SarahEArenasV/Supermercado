package co.edu.uniquindio.poo.test;

import co.edu.uniquindio.poo.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    public void testCreacionCliente() {
        Cliente cliente = new Cliente("Juan", "Pérez", "1234567890", "3201234567");

        assertEquals("Juan", cliente.getNombre(), "El nombre debe ser igual al proporcionado");
        assertEquals("1234567890", cliente.getCedula(), "La cédula debe ser igual a la proporcionada");
    }

    @Test
    public void testToString() {
        Cliente cliente = new Cliente("María", "López", "0987654321", "3101234567");
        String resultado = cliente.toString();

        assertTrue(resultado.contains("María"), "El toString debe contener el nombre del cliente");
        assertTrue(resultado.contains("López"), "El toString debe contener el apellido del cliente");
        assertTrue(resultado.contains("0987654321"), "El toString debe contener la cédula del cliente");
    }

    @Test
    public void testClienteParametrosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Cliente("", "Pérez", "1234567890", "3201234567");
        }, "Debería lanzar una excepción cuando el nombre está vacío");
    }

}