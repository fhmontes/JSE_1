package com.educomser.clases;

public class Curso {

    private String descripcion;
    private float precio;
    private Docente docente = new Docente();
    private Estudiante[] estudiantes;

    public Curso() {
        descripcion = "ninguno";
        precio = 0;
    }

    // GETTER Y SETTER
    public Curso(String descripcion, float precio, Estudiante[] estudiantes) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.estudiantes = estudiantes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void mostrarDatos() {
        System.out.println("--- CURSO " + descripcion + " ---");
        System.out.println("Docente: " + docente.getNombre());
        System.out.println("Costo: " + precio);
        System.out.println("--- LISTA DE ESTUDIANTES");
        System.out.println("NOMBRE \t N1 \t N2 \t N3 \t PROM");
        for(int i=0; i<estudiantes.length; i++){
            System.out.println(
                    estudiantes[i].getNombre() + " \t " +
                    estudiantes[i].getNota1() + " \t " +
                    estudiantes[i].getNota2() + " \t " +
                    estudiantes[i].getNota3() + " \t " +
                    estudiantes[i].promedio() + " \t "
            );
        }
        
    }

    public void leerDatosEstudiantes() {
        for(int i=0; i<estudiantes.length; i++){
            System.out.println("-- Estudiante "+(i+1));
            estudiantes[i]=new Estudiante();
            estudiantes[i].leerDatosEstudiante();
        }
    }

}
