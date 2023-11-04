/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestordocente.clases;

import com.gestordocente.clases.categoria.Categoria;
import com.gestordocente.clases.profesor.Adiestrado;
import com.gestordocente.clases.profesor.Profesor;

/**
 *
 * @author sardlimad
 */
public class Departamento {
    protected String nombre;
    protected String facultad;
    protected Profesor jefe;
    protected Profesor[] profesores = new Profesor[0];
    protected Asignatura[] asignaturas = new Asignatura[0];

    //Constructor vacio
    public Departamento() {
    }

    public Departamento(String nombre, String facultad, Profesor jefe, Profesor[] profesores, Asignatura[] asignaturas) {

        this.nombre = nombre;
        this.facultad = facultad;
        this.jefe = jefe;
        this.profesores = profesores;
        this.asignaturas = asignaturas;

    }

    //Metodos set
    public void setNombre(String text) {
        this.nombre = text;
    }

    public void setFacultad(String text) {
        this.facultad = text;
    }

    public void setJefe(Profesor jefe) {
        this.jefe = jefe;
    }
    
    //Metodos get
    public Asignatura[] getAsignaturas(){
        return this.asignaturas;
    }

    public void AddProfesor(String ci, String nombre, Categoria catDocente, Categoria catCientifica, int tiempo) {

        Profesor aux[] = new Profesor[this.profesores.length + 1]; //Crear nuevo array

        for (int i = 0; i < this.profesores.length; i++) {
            aux[i] = this.profesores[i];
        }

        //Alamcenar nuevo Profesor en la ultima posicion
        aux[aux.length - 1] = new Profesor(ci, nombre, catDocente, catCientifica, tiempo);
        
        this.profesores = aux;
    }

    public void AddProfesor(String ci, String nombre, Categoria catDocente, Categoria catCientifica, int tiempo, boolean autorizo) {
        
        Profesor aux[] = new Profesor[this.profesores.length + 1]; //Crear nuevo array

        for (int i = 0; i < this.profesores.length; i++) {
            aux[i] = this.profesores[i];
        }

        //Alamcenar nuevo Profesor en la ultima posicion (Tipo Adiestrado)
        aux[aux.length - 1] = new Adiestrado(ci, nombre, catDocente, catCientifica, tiempo, false);
        
        this.profesores = aux;
    }

    public void AddAsignatura(String nombre, String diciplina, int[] horasClase, String planEst, String carrera, int aAcad) {

        Asignatura aux[] = new Asignatura[this.asignaturas.length + 1]; //Crear nuevo array

        for (int i = 0; i < this.asignaturas.length; i++) {
            aux[i] = this.asignaturas[i];
        }

        aux[aux.length - 1] = new Asignatura(nombre, diciplina, horasClase, planEst, carrera, aAcad);
        
        this.asignaturas = aux;
    }
    
    public void AddAsignatura(String nombre, String diciplina, int[] horasClase, String planEst, String carrera, int aAcad, String tipoEvalFinal){
        Asignatura aux[] = new Asignatura[this.asignaturas.length + 1]; //Crear nuevo array

        for (int i = 0; i < this.asignaturas.length; i++) {
            aux[i] = this.asignaturas[i];
        }

        aux[aux.length - 1] = new Asignatura(nombre, diciplina, horasClase, planEst, carrera, aAcad, tipoEvalFinal);
        
        this.asignaturas = aux;
    }
}
