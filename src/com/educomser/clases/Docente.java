package com.educomser.clases;

import java.util.Scanner;

public class Docente extends Persona {

    private float sueldo;
    private String gradoAcademico;

    public Docente() {
        super();
        sueldo = 0;
        gradoAcademico = "ninguno";
    }

    public Docente(String cedula, String nombre, int edad,
            char genero, float sueldo, String gradoAcademico) {
        super(cedula, nombre, edad, genero);
        this.sueldo = sueldo;
        this.gradoAcademico = gradoAcademico;
    }

    // GETTER Y SETTER
    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public void leerDatosDocente() {
        Scanner in = new Scanner(System.in);
        super.leerDatosPersona();
        System.out.println("Ingrese sueldo: ");
        sueldo = in.nextFloat();
        System.out.println("Ingrese grado: ");
        gradoAcademico = in.next();
    }

}
