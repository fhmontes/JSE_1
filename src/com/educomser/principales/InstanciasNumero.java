package com.educomser.principales;

import com.educomser.clases.Numero;
import com.educomser.clases.NumeroNegativo;
import com.educomser.clases.NumeroPositivo;

public class InstanciasNumero {

    public static void main(String[] args) {
        Numero num1 = new NumeroPositivo();
        num1.proximo();
        num1.proximo();
        num1.proximo();
        System.out.println(num1);
        
        Numero num2 = new NumeroNegativo();
        num2.proximo();
        num2.proximo();
        num2.proximo();
        System.out.println(num2);
        
    }

}
