package com.educomser.clases;

public class Obrero extends Empleado {

    private float seguroVida;

    public Obrero(float seguroVida, String nombre, float sueldo) {
        super(nombre, sueldo);
        this.seguroVida = seguroVida;
    }

    @Override
    public float liquidoPagable() {
        float lp = getSueldo() + seguroVida;
        return lp;
    }

    @Override
    public String toString() {
        return "Obrero{" + 
                "nombre=" + getNombre() +
                ", sueldo=" + getSueldo() +
                ", seguroVida=" + seguroVida +'}';
    }   

}
