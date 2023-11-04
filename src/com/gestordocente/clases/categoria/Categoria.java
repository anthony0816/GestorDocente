/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestordocente.clases.categoria;

/**
 *
 * @author sardlimad
 */
public class Categoria {

    protected String nombre;
    protected float aumento;

    public Categoria(String nombre, float aumento) {
        this.nombre = nombre;
        this.aumento = aumento;
    }
    // METODOS SET

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAumento(float aumento) {
        this.aumento = aumento;
    }

//METODOS GET
    public String getNombre() {
        return this.nombre;
    }

    public float getAumento() {
        return aumento;
    }
}
