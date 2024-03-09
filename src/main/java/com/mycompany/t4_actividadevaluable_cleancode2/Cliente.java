/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t4_actividadevaluable_cleancode2;

public class Cliente extends Persona {
    private int idCliente;

    public Cliente(String nombre, String nif, int edad, int idCliente) {
        super(nombre, nif, edad);
        this.idCliente = idCliente;
    }

    // Constructor por defecto
    public Cliente() {
        super();
        this.idCliente = 0;
    }

    // Getters y Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}