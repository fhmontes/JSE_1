package com.educomser.clases;

public class Calculadora {

    public Calculadora() {
    }

    public void sumar(int a, int b) {
        int c = a + b;
        System.out.println("Suma: " + c);
    }
    
    public void sumar(double a, double b) {
        double c = a + b;
        System.out.println("Suma: " + c);
    }
    
    public void sumar(int a, int b, int c) {
        int d = a + b + c;
        System.out.println("Suma: " + d);
    }
}
