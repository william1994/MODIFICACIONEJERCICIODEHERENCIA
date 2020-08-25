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
public class ClassPersona {
    
    protected String Nombre,direccion,fechaNc,Genero;
    protected int Edad;

    

    @Override
    public String toString() {
        return "ClassPersona{" + "Nombre=" + Nombre + ", direccion=" + direccion + ", fechaNc=" + fechaNc + ", Genero=" + Genero + ", Edad=" + Edad + '}';
    }
    
    
    
}
