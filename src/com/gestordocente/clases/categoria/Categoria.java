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
    
    public Categoria(String nombre, float aumento){
        this.nombre = nombre;
        this.aumento = aumento;
    }
    
    //Metodos get
    public String getNombre(){
        return this.nombre;
    }
}
