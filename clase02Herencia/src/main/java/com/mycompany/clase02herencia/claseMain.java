/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase02herencia;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class claseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //SECCION PARA TOMA DE DATOS
        Scanner sc = new Scanner(System.in);
        System.out.println("ESCRIBE TU NOMBRE");
        String Nombre = sc.nextLine();
        System.out.println("ESCRIBE TU DIRECCION");
        String Direccion = sc.nextLine();
         System.out.println("ESCRIBE TU FECHA DE NACIMIENTO");
        String Fecha = sc.nextLine();
        System.out.println("ESCRIBE TU EDAD");
        int Edad = sc.nextInt();
         String Genero = sc.nextLine();
        
        
        
        profesor profe = new profesor();
        
        
        profe.setNombre(Nombre);
        profe.setDireccion(Direccion);
        profe.setEdad(Edad);
        profe.setFechaNc(Fecha);
        profe.setGenero(Genero);
        System.out.println(profe.esMayorDeEdad());
        System.out.println(profe.MostrarSinEdad());
        
        
        
//        classEstudiante estu = new classEstudiante(profe.getNombre(), "EL PARAISO", "14/11/94", "Masculino", 25, 1500, "Ing. Sistemas y Computacion");
//        System.out.println(estu.toString());
    }

}
