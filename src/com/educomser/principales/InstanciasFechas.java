package com.educomser.principales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class InstanciasFechas {

    public static void main(String[] args) throws ParseException {
        // Clase Date
        Date fecha = new Date();
        System.out.println("Fecha: " + fecha);
        // Formato a una fecha
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Fecha con formato: "+df.format(fecha));
        // Leer una fecha
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nac (dd/mm/aaaa): ");
        String fechaNacTmp = in.next();
        SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNac = df1.parse(fechaNacTmp);
        System.out.println("Fecha nac: "+fechaNac);
        // A partir de la fecha de nacimiento mostrar la edad
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaNac);
        int anio = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH) + 1;
        int dia = cal.get(Calendar.DATE);
        LocalDate localHoy = LocalDate.now();
        LocalDate localNac = LocalDate.of(anio, mes, dia);
        Period diff = Period.between(localNac, localHoy);
        System.out.println("Edad: "+diff.getYears()+" anios");
    }

}
