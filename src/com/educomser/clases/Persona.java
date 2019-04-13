package com.educomser.clases;

/**
 *
 * @author alumno
 */
public class Persona {

    // 1 ATRIBUTOS
    private String cedula;
    private String nombre;
    private int edad;
    private char genero;

    // 2 CONSTRUCTORES
    public Persona() {
        cedula = "000000";
        nombre = "ninguno";
        edad = 0;
        genero = 'F';
    }

    // clic derecho > Insert code... > Constructor...
    public Persona(String cedula, String nombre, int edad, char genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // 3 METODOS GETTER Y SETTER
    // GETTER: Obtener un valor
    // SETTER: Asignar un valor
    // clic derecho > Insert code... > Setter and Getter
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    // OTROS METODOS
    public String verificaEdad() {
        return this.edad >= 18 ? "Mayor de edad" : "Menor de edad";
    }

    /*
     public String verificaEdad(){
     if(this.edad>=18){
     return "Mayor de edad";
     }
     return "Menor de edad";
     }
     */
    public void cumplirAnios() {
        this.edad++;
    }

    public void cambiarGenero() {
        if (this.genero == 'F') {
            this.genero = 'M';
        } else {
            this.genero = 'F';
        }
    }

    public void mostrarDatosPersona() {
        System.out.println("-- REPORTE DE PERSONA --");
        System.out.println("Cedula: " + getCedula());
        System.out.println("Nombre: " + getNombre());   
        System.out.println("Edad: " + getEdad());
        System.out.println("Genero: " + getGenero());
    }

}
