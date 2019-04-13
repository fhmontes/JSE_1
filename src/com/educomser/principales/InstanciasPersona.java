package com.educomser.principales;

import com.educomser.clases.Persona;

public class InstanciasPersona {

    public static void main(String[] args) {
        // 1. Intanciar un objeto Persona
        Persona per1 = new Persona();

        // 2. Mostrar datos
        per1.mostrarDatosPersona();
        /*
        System.out.println("Cedula: " + per1.getCedula());
        System.out.println("Nombre: " + per1.getNombre());
        System.out.println("Edad: " + per1.getEdad());
        System.out.println("Genero: " + per1.getGenero());
        */
        Persona per2 = new Persona("778899", "Juan", 20, 'M');
        per2.mostrarDatosPersona();
        /*
        System.out.println("Cedula: " + per2.getCedula());
        System.out.println("Nombre: " + per2.getNombre());
        System.out.println("Edad: " + per2.getEdad());
        System.out.println("Genero: " + per2.getGenero());
        */
    }

}
