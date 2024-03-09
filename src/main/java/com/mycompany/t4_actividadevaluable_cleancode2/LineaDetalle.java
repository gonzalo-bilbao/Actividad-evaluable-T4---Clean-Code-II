/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t4_actividadevaluable_cleancode2;

public class LineaDetalle {
    private Producto producto;
    private int cantidad;
    private String medida;

    public LineaDetalle(Producto producto, int cantidad, String medida) {
        this.producto = producto;
        setCantidad(cantidad); // Manejo de errores
        this.medida = medida;
    }

    // Constructor por defecto
    public LineaDetalle() {
        cantidad = 0;
        medida = "";
    }

    // Getters y Setters
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        // Restricción de cantidad actualizada
        if (cantidad >= 0 && cantidad <= 10000) {
            this.cantidad = cantidad;
        } else {
            // Manejo de errores
            System.out.println("Error: La cantidad debe estar en el rango de 0 a 10,000.");
            this.cantidad = 0; // Se asigna un valor predeterminado
        }
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }
}

