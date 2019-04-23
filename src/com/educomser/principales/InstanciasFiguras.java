package com.educomser.principales;

import com.educomser.clases.Circulo;
import com.educomser.clases.Figura;
import com.educomser.clases.Rectangulo;

public class InstanciasFiguras {

    public static void main(String[] args) {
        // Figura fig1 = new Figura();
        Figura fig2 = new Rectangulo(4, 5);
        System.out.println("RECTANGULO");
        System.out.println("Area: " + fig2.calcularArea());
        System.out.println("Perimetro: " + fig2.calcularPerimetro());

        Figura fig3 = new Circulo(15);
        System.out.println("CIRCULO");
        System.out.println("Area: " + fig3.calcularArea());
        System.out.println("Perimetro: " + fig3.calcularPerimetro());
    }

}
