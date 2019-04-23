package com.educomser.principales;

import com.educomser.clases.Curso;
import com.educomser.clases.Estudiante;
import java.util.Scanner;

public class InstanciasCurso {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Curso cur1=new Curso();
        System.out.println("Ingrese nombre del curso: ");
        cur1.setDescripcion(in.next());
        System.out.println("Ingrese costo del curso: ");
        cur1.setPrecio(in.nextFloat());
        System.out.println("Ingrese datos del docente...");
        cur1.getDocente().leerDatosDocente();
        System.out.println("Ingrese nro de estudiantes: ");
        int nroEstudiantes = in.nextInt();
        cur1.setEstudiantes(new Estudiante[nroEstudiantes]);
        System.out.println("Ingrese datos de estudiantes...");
        cur1.leerDatosEstudiantes();
        cur1.mostrarDatos();
    }
}
