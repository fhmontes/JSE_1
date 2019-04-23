package com.educomser.clases;

public class Circulo implements Figura {

    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    @Override
    public float calcularArea() {
        return (float) (Figura.PI * Math.pow(radio, 2));
    }

    @Override
    public float calcularPerimetro() {
        return 2 * Figura.PI * radio;
    }
}
