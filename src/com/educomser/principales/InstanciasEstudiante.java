package com.educomser.principales;

import com.educomser.clases.Estudiante;
import com.educomser.clases.Persona;

public class InstanciasEstudiante {

    public static void main(String[] args) {

        Estudiante est1 = new Estudiante();
        est1.mostrarDatosEstudiante();

        Estudiante est2 = new Estudiante("445566", "Juan", 16, 'M', 45, 78, 21);
        est2.mostrarDatosEstudiante();
        System.out.println("Promedio: " + est2.promedio());
        System.out.println("Observacion: " + est2.verificaEdad());

        System.out.println("--- CASTING ---");
        // CASTING IMPLICITO
        Persona per2 = est2;
        per2.mostrarDatosPersona();
        // CASTING EXPLICITO
        Estudiante estAux = (Estudiante) per2;
        estAux.mostrarDatosEstudiante();
    }

}
