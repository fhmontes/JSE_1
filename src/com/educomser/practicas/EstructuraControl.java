package com.educomser.practicas;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EstructuraControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nro de estudiantes: ");
        int nroEstudiantes = teclado.nextInt();

        String nombres[] = new String[nroEstudiantes];
        int notas[][] = new int[nroEstudiantes][3];
        
        for (int i = 0; i < nroEstudiantes; i++) {
            System.out.println("--- ESTUDIANTE " + (i + 1));
            System.out.println("Ingrese nombre: ");
            nombres[i] = teclado.next();
            
            System.out.println("Ingrese nota 1: ");
            notas[i][0] = teclado.nextInt();
            System.out.println("Ingrese nota 2: ");
            notas[i][1] = teclado.nextInt();
            System.out.println("Ingrese nota 3: ");
            notas[i][2] = teclado.nextInt();
        }
        
        System.out.println("\n\nREPORTE DE ESTUDIANTES");
        System.out.println("NRO \t NOMBRE N1 \t N2 \t N3");
        for (int i = 0; i < nroEstudiantes; i++) {
            System.out.println((i+1)+" \t "+
                                nombres[i]+" \t "+
                                notas[i][0]+" \t "+
                                notas[i][1]+" \t "+
                                notas[i][2]+" \t ");
        }

    }

}
