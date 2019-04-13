package com.educomser.practicas;

/**
 *
 * @author alumno
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Hugo Montes";
        int edad = 78;
        char genero = 'M';
        float sueldo = (float) 2000.50;
        double descuento = 500.30;

        System.out.println("REPORTE");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Descuento: " + descuento);

        String observacion = edad >= 18 ? "Mayor de edad" : "Menor de edad";

        System.out.println("Observacion: " + observacion);
    }

}
