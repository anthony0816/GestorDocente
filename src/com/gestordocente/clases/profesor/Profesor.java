/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestordocente.clases.profesor;

import com.gestordocente.clases.categoria.Categoria;

/**
 *
 * @author sardlimad
 */
public class Profesor {
    protected String ci;
    protected String nombre;
    protected Categoria catDocente;
    protected Categoria catCientifica;
    protected int tiempoServicio; //Antiguedad en Años
    protected boolean disponible = true;

    protected float salarioBase = 2500;

    public Profesor(String ci, String nombre,Categoria catDocente, Categoria catCientifica, int tiempo) {
        this.ci = ci;
        this.nombre = nombre;
        this.catCientifica = catCientifica;
        this.tiempoServicio = tiempo;
    }
    
    
    public void setDisponible(boolean value){
        this.disponible = value;
    }

    public float getSalario() {
        return 0;
    }
}
