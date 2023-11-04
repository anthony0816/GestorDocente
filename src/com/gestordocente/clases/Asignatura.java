/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestordocente.clases;

/**
 *
 * @author sardlimad
 */
public class Asignatura {

    protected String nombre;
    protected String diciplina;
    protected int[] horasClase = new int[5]; //[0]Conferencias, [1]CP, [2]Seminario, [3]Laboratorio, [4]Taller.
    protected String planEst;
    protected String carrera;
    protected int aAcademico; //Año Academico
    protected String tipoEvalFinal;

    //Constructor para Asignatura sin Evaluacion Final
    public Asignatura(String nombre, String diciplina, int[] horasClase, String planEst, String carrera, int aAcad) {

        this.nombre = nombre;
        this.diciplina = diciplina;
        this.horasClase = horasClase;
        this.planEst = planEst;
        this.carrera = carrera;
        this.aAcademico = aAcad;

    }

    //Construcotr para Asignatura con Evaluacion Final
    public Asignatura(String nombre, String diciplina, int[] horasClase, String planEst, String carrera, int aAcad, String tipoEvalFinal) {

        this.nombre = nombre;
        this.diciplina = diciplina;
        this.horasClase = horasClase;
        this.planEst = planEst;
        this.carrera = carrera;
        this.aAcademico = aAcad;
        this.tipoEvalFinal = tipoEvalFinal;
    }
    // METODOS GET

    public String getNombre() {
        return this.nombre;
    }

    public String getDisciplina() {
        return this.diciplina;
    }

    public int[] getHorasClase() {
        return horasClase;
    }

    public String getPlanEst() {
        return this.planEst;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public int getAnho() {
        return this.aAcademico;
    }

    public String getEvalFinal() {
        return this.tipoEvalFinal;
    }
    // METODOS SET

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public void setHorasClase(int conf, int cp, int sem, int lab, int taller) {
        int[] aux = {conf, cp, sem, lab, taller};

        this.horasClase = aux;
    }

    public void setPlanEst(String planEst) {
        
        this.planEst = planEst;
    }
    
    public void setCarreras (String carrera){
    this.carrera = carrera;
    }
    
    public void setaAcademico(int aAcademico){
    this.aAcademico = aAcademico;
    }
    
    public void setTipoEvalFinal (String TipoEvalFinal){
    this.tipoEvalFinal = TipoEvalFinal;
    }
    
    
    
    
    
    
    
}
