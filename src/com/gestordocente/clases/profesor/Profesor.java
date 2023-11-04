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

    public Profesor(String ci, String nombre, Categoria catDocente, Categoria catCientifica, int tiempo) {
        this.ci = ci;
        this.nombre = nombre;
        this.catCientifica = catCientifica;
        this.tiempoServicio = tiempo;
    }
    // METODOS SET 
    
    public void setCi(String ci){
    this.ci = ci;
    }
    
    public void setNombre (String nombre){
    this.nombre = nombre;
    }
    
    public void setCatDocente (Categoria catDocente){
    this.catDocente = catDocente;
    }
    
    public void setCatCientifica (Categoria catCientifica){
    this.catCientifica = catCientifica;
    }
    
    public void setTiempoServicio (int tiempoServicio){
    this.tiempoServicio = tiempoServicio;
    } 
   
    public void setDisponible(boolean value) {
        this.disponible = value;
    }
    //METODOS GET
    
    public String getCi (){
    return ci ; 
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public Categoria getCatDocente(){
    return catDocente;
    }
    
    public Categoria getCatCientifica (){
    return catCientifica;
    }
    
    public int getTiempoServicio (){
    return tiempoServicio;
    }
    
    public boolean getDisponible (){
    return disponible;
    }
    
    public float getSalario() {
        return 0;
    }
}
