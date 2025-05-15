package co.edu.uniquindio.poo.java.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.Empleado;

import java.beans.Transient;
import java.util.Arrays;
import java.util.List;

public class SupermercadoTest {

    @Test
    public void datosCompletos(){
        LOG.info("iniciando test datosCompletos");
        Supermercado supermercado = new Supermercado("Laureles");
        assertEquals("Laureles", supermercado.getNombre());
        LOG.info("finalizando test datosCompletos");
    }

     @Test
     public void datosVacios(){
        LOG.info("iniciando test datosVacios");
        Empleado empleado1 = new Empleado("Juan", "123",20);
        assertTrows(Throwable.class, () -> new Empleado ("", "", 0));
        LOG.info("finalizando test datosVacios");
     
     }


      @Test
      public void obtenerListadoMenoresEdad(){
        LOG.info("iniciando test obtenerListadoMenoresEdad");
        Supermercado supermercado = new Supermercado("Laureles");
        Empleado empleado1 = new Empleado("Luis", "456", 20);
        Empleado empleado2 = new Empleado("Juan", "456", 17);
        Empleado empleado3 = new Empleado("Camilo", "456", 15);

        supermercado.agregarEmpleado(empleado1);
        supermercado.agregarEmpleado(empleado2);
        supermercado.agregarEmpleado(empleado3);

        var listaEsperada = list.of(Juan, Camilo);

        assertIterableEquals(listaEsperada, supermercado.getEmpleadosMenoresDeEdad());

        LOG.info("finalizando test obtenerListadoMenoresEdad");
      }

        @Test
        public void agregarEmpleado(){
            LOG.info("iniciando test agregarEmpleado");
            Supermercado supermercado = new Supermercado("Laureles");
            Empleado empleado1 = new Empleado("Luis", "456", 20);
            Empleado empleado2 = new Empleado("Luis", "456", 17);
            Empleado empleado3 = new Empleado("Luis", "456", 15);

            supermercado.agregarEmpleado(empleado1);
            supermercado.agregarEmpleado(empleado2);
            supermercado.agregarEmpleado(empleado3);

            assertTrue(supermercado.getEmpleados().contains(empleado1));
            assertTrue(supermercado.getEmpleados().contains(empleado2));
            assertTrue(supermercado.getEmpleados().contains(empleado3));

            assertEquals(3, supermercado.getEmpleados().size());

            LOG.info("finalizando test agregarEmpleado");
        }
 }
