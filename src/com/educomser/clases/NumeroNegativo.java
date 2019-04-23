package com.educomser.clases;

public class NumeroNegativo extends Numero {

    public NumeroNegativo() {
        numero = 0;
    }

    @Override
    public void proximo() {
        numero--;
    }
}
