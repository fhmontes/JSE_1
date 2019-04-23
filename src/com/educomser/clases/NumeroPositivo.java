package com.educomser.clases;


public class NumeroPositivo extends Numero {

    public NumeroPositivo() {
        numero = 0;
    }

    @Override
    public void proximo() {
        numero++;
    }
}
