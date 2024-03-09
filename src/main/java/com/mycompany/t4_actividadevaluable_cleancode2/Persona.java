/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t4_actividadevaluable_cleancode2;

public class Persona {
    private String nombre;
    private String nif;
    private int edad;

    public Persona(String nombre, String nif, int edad) {
        this.nombre = nombre;
        this.nif = nif;
        setEdad(edad); // Manejo de errores
    }

    // Constructor por defecto
    public Persona() {
        nombre = "";
        nif = "";
        edad = 0;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        // Restricción de edad actualizada
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            // Manejo de errores
            System.out.println("Error: La edad de una persona debe estar en el rango de 0 a 120 años");
            this.edad = 0; // Se asigna un valor predeterminado
        }
    }
}