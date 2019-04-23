package com.educomser.principales;

import com.educomser.clases.Calculadora;

public class IntanciasCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        cal.sumar(5, 4);
        cal.sumar(30, 2);
        cal.sumar(30.12, 2);
        cal.sumar(4, 5, 2);
        
    }
    
}
