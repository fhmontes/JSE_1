package com.educomser.principales;

public class ConceptosGenerales {

    public static void main(String[] args) {
        String nombre="Juan";
        System.out.println(nombre.charAt(2));
        
        if(nombre == "Juan"){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        if(nombre.equals("Juan")){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        System.out.println(nombre.length()+"");
        System.err.println("error");
        
        int edad=0;
    }
    
}
