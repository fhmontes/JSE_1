package com.educomser.clases;

public class Rectangulo implements Figura {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return base * altura;
    }

    @Override
    public float calcularPerimetro() {
        return base * 2 + altura * 2;
    }

}
