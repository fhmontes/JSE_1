package com.educomser.clases;

public class Gerente extends Empleado {

    private float viatico;

    public Gerente(float viatico, String nombre, float sueldo) {
        super(nombre, sueldo);
        this.viatico = viatico;
    }

    @Override
    public float liquidoPagable() {
        float lp = getSueldo() + viatico *2;
        return lp;
    }

    @Override
    public String toString() {
        return "Gerente{" + 
                "nombre=" + getNombre() +
                ", sueldo=" + getSueldo() +
                ", viatico=" + viatico +'}';
    }

    
}
