/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase02herencia;

/**
 *
 * @author USUARIO
 */
public class classEstudiante extends ClassPersona {

    private int Matricula;
    private String Carrera;

    public classEstudiante(String Nombre, String Direccion, String Fecha, String Genero, int Edad, int Matricula, String Carrera) {
        this.Nombre = Nombre;
        this.direccion = Direccion;
        this.fechaNc = Fecha;
        this.Genero = Genero;
        this.Edad = Edad;
        this.Matricula = Matricula;
        this.Carrera = Carrera;

    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNc() {
        return fechaNc;
    }

    public void setFechaNc(String fechaNc) {
        this.fechaNc = fechaNc;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "classEstudiante{" + "Nombre=" + Nombre + ", direccion=" + direccion + ", fechaNc=" + fechaNc + ", Genero=" + Genero + ", Edad=" + Edad + ", Matricula=" + Matricula + ", Carrera=" + Carrera + '}';
    }

}
