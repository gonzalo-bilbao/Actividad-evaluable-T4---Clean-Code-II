/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t4_actividadevaluable_cleancode2;

public class Vendedor extends Persona {
    private int idVendedor;

    public Vendedor(String nombre, String nif, int idVendedor, int edad) {
        super(nombre, nif, edad);
        this.idVendedor = idVendedor;
    }

    // Constructor por defecto
    public Vendedor() {
        super();
        idVendedor = 0;
    }

    // Getters y Setters
    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
    // Restricción de idVendedor actualizada
        if (idVendedor >= 0 && idVendedor <= 10000) {
            this.idVendedor = idVendedor;
        } else {
            // Manejo de errores
            this.idVendedor=0;
            System.out.println("Error: El id debe de estar en el rango de 0 a 10.000");
        }
    }
}