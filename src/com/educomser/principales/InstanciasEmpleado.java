package com.educomser.principales;

import com.educomser.clases.Empleado;
import com.educomser.clases.Gerente;
import com.educomser.clases.Obrero;

public class InstanciasEmpleado {

    public static void main(String[] args) {
        // 1. Instanciar un objeto Empleado
        // Empleado emp1 = new Empleado(); // NO ES POSIBLE

        // 2. Instanciar un objeto Obrero
        Empleado emp2 = new Obrero((float) 500.50, "Juan", (float) 2300.30);
        System.out.println(emp2);
        System.out.println("Liquido Pagable: " + emp2.liquidoPagable());
        
        // 3. Instanciar un objeto Gerente
        Empleado emp3 = new Gerente((float) 1000.50, "Ana", (float) 19000.50);
        System.out.println(emp3);
        System.out.println("Liquido Pagable: " + emp3.liquidoPagable());
        
        // 4 Vectores de objetos
        Obrero obreros[]={
                        new Obrero(500, "Maria", 1500),
                        new Obrero(500, "Sergio", 1200)};
        Empleado empleados[]={
                        new Obrero(500, "Maria", 1500),
                        new Gerente(500, "Sergio", 1200)};

    }

}
