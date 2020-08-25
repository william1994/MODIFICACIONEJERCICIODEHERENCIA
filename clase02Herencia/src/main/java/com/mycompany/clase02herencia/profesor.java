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
public class profesor extends ClassPersona {

    private String Titulo;
    private String Dedicacion;

    public profesor(String Nombre, String Direccion, String Fecha, String Genero, int Edad, String Titulo, String Dedicacion) {

        this.Nombre = Nombre;
        this.direccion = Direccion;
        this.fechaNc = Fecha;
        this.Genero = Genero;
        this.Edad = Edad;
        this.Titulo = Titulo;
        this.Dedicacion = Dedicacion;

    }

    public profesor() {

    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDedicacion() {
        return Dedicacion;
    }

    public void setDedicacion(String Dedicacion) {
        this.Dedicacion = Dedicacion;
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
    
    void saludo(){
    
    }

    public String esMayorDeEdad() {
        int edad = this.Edad;
        if (edad<18){
        return "Eres menor de edad";
        }
        else {
        return "Eres mayor de edad";
        }
 
    }

    public String MostrarProfesor() {
        return "profesor{" + "Nombre=" + Nombre + ", direccion=" + direccion + ", fechaNc=" + fechaNc + ", Genero=" + Genero + ", Edad=" + Edad + ", Titulo=" + Titulo + ", Dedicacion=" + Dedicacion + '}';
    }

    public String MostrarSinEdad() {
        return "profesor{" + "Nombre=" + Nombre + ", direccion=" + direccion + ", fechaNc=" + fechaNc + ", Genero=" + Genero + ", Titulo=" + Titulo + ", Dedicacion=" + Dedicacion + '}';
    }

    public String MostrarSinTitulo() {
        return "profesor{" + "Nombre=" + Nombre + ", direccion=" + direccion + ", fechaNc=" + fechaNc + ", Genero=" + Genero + ", Titulo=" + Titulo + ", Dedicacion=" + Dedicacion + '}';
    }

}
