
package com.mycompany.t4_actividadevaluable_cleancode2;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ConjuntoTest {

    @Test
    public void testSetCantidad() {
        LineaDetalle linea = new LineaDetalle();
//        linea.setCantidad(500); // Cantidad dentro del rango permitido
//        assertEquals(500, linea.getCantidad());

        linea.setCantidad(-100); // Cantidad negativa , da error
        //assertEquals(0, linea.getCantidad()); // Se  establecido en 0

//        linea.setCantidad(15000); // Cantidad fuera del rango permitido , da error
//        assertEquals(0, linea.getCantidad()); // Se  establecido en 0
    }

    @Test
    public void testSetEdad() {
        Persona persona = new Persona();
//        persona.setEdad(25); // Edad dentro del rango permitido
//        assertEquals(25, persona.getEdad());

        persona.setEdad(-5); // Edad negativa , da error
        assertEquals(0, persona.getEdad()); // Se  establecido en 0

//        persona.setEdad(150); // Edad fuera del rango permitido , da error
//        assertEquals(0, persona.getEdad()); // Se  establecido en 0
    }

    @Test
    public void testSetIdProducto() {
        Producto producto = new Producto();
//        producto.setIdProducto(1001); // ID dentro del rango permitido
//        assertEquals(1001, producto.getIdProducto());

        producto.setIdProducto(-50); // ID negativo , da error
        assertEquals(0, producto.getIdProducto()); //Se  establecido en 0

//        producto.setIdProducto(15000); // ID fuera del rango permitido , da error
//        assertEquals(0, producto.getIdProducto()); // Se  establecido en 0
    }

    @Test
    public void testSetIdVendedor() {
        Vendedor vendedor = new Vendedor();
//        vendedor.setIdVendedor(5001); // ID dentro del rango permitido
//        assertEquals(5001, vendedor.getIdVendedor());

        vendedor.setIdVendedor(-20); // ID negativo , da error
        assertEquals(0, vendedor.getIdVendedor()); // Se  establecido en 0

//        vendedor.setIdVendedor(20000); // ID fuera del rango permitido , da error)
//        assertEquals(0, vendedor.getIdVendedor()); // Se  establecido en 0
    }
}