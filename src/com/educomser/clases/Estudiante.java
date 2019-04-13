package com.educomser.clases;

public class Estudiante extends Persona {

    private int nota1;
    private int nota2;
    private int nota3;
    // private int nota1, nota2, nota3;

    public Estudiante() {
        super(); // Persona()
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
    }

    public Estudiante(String cedula, String nombre, int edad, char genero, int nota1, int nota2, int nota3) {
        super(cedula, nombre, edad, genero); // Persona(cedula, nombre, edad, genero)
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public double promedio() {
        double prom = (nota1 + nota2 + nota3) / 3;
        return prom;
    }

    public void mostrarDatosEstudiante() {
        System.out.println("-- DATOS DE ESTUDIANTE --");
        // mostrarDatosPersona();
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("nota1: " + nota1);
        System.out.println("nota2: " + nota2);
        System.out.println("nota3: " + nota3);
    }

}
