/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t4_actividadevaluable_cleancode2;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precioUnitario;

    public Producto(int idProducto, String nombre, double precioUnitario) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    // Constructor por defecto
    public Producto() {
        idProducto = 0;
        nombre = "";
        precioUnitario = 0;
    }

    // Getters y Setters
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        // Restricción de idProducto actualizada
        if (idProducto >= 0 && idProducto <= 10000) {
            this.idProducto = idProducto;
        } else {
            // Manejo de errores
            System.out.println("Error: El idProducto debe estar en el rango de 0 a 10,000.");
            this.idProducto = 0; // Se asigna un valor predeterminado
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}