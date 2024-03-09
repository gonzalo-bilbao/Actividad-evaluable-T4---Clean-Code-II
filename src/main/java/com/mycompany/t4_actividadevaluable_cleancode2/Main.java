/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t4_actividadevaluable_cleancode2;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gonzalo Bilbao", "00000000Z", 19, 652);
        Vendedor vendedor = new Vendedor("Marcelo Taboada", "12345678F", 990, 19);
        
        //Cliente con una edad negativa
        //Cliente cliente = new Cliente("Gonzalo Bilbao", "00000000Z", -19, 652);
        
        //Edad mayor a 120 
        //Vendedor vendedor = new Vendedor("Marcelo Taboada", "12345678F", 10001, 19);

        //ID de Vendedor fuera del rango permitido
        //Vendedor vendedor = new Vendedor("Marcelo Taboada", "12345678F", 990000, 19);
        
        imprimirDatosCliente(cliente);
        imprimirDatosVendedor(vendedor);


        System.out.println("\nSegunda etapa del ejercicio\n");
 
        // Crear objetos de prueba para la segunda etapa del ejercicio
        Producto producto1 = new Producto(1, "Harina", 3.65);
        Producto producto2 = new Producto(2, "Levadura", 1.5);

        //Producto con un ID negativo
        //Producto producto3 = new Producto(-1, "Harina", 3.65);
        
        //Cantidad negativa en una LineaDetalle
        //Producto producto4 = new Producto(2, "Leche", 0.99);
        //LineaDetalle linea3 = new LineaDetalle(producto3, -3, "litros");
        
        LineaDetalle linea1 = new LineaDetalle(producto1, 5, "kg");
        LineaDetalle linea2 = new LineaDetalle(producto2, 3, "g");

        imprimirLineaDetalle(linea1);
        imprimirLineaDetalle(linea2);
        //imprimirLineaDetalle(linea3);
    }
    private static void imprimirDatosCliente(Cliente cliente) {
        System.out.println("Cliente: " + cliente.getNombre() + " (" + cliente.getEdad() + ") [NIF: " + cliente.getNif() + "] Id: " + cliente.getIdCliente());
    }
    private static void imprimirDatosVendedor(Vendedor vendedor) {
        System.out.println("Vendedor: " + vendedor.getNombre() + " (" + vendedor.getEdad() + ") [NIF: " + vendedor.getNif() + "] Id: " + vendedor.getIdVendedor());
    }
    private static void imprimirLineaDetalle(LineaDetalle linea) {
        System.out.println("Linea:");
        System.out.println("    Producto: " + linea.getProducto().getNombre());
        System.out.println("    Cantidad: " + linea.getCantidad() + " " + linea.getMedida());
    }
}
