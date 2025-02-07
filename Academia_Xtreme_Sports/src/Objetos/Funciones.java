//UNIVERSIDAD ESTATAL A DISTANCIA
//VICERRECTORIA ACADÉMICA
//ESCUELA DE LAS CIENCIAS EXACTAS Y NATURALES
//CATEDRA DESARROLLO DE SISTEMAS
//DIPLOMADO EN INFORMÁTICA

//CÓDIGO:00824

//PROGARMACIÒN INTERMEDIA

//TAREA 2

//GRUPO:04

//ESTUDIANTE: ROSA KARINA MONGE DURÁN

//CÉDULA: 112250672

package Objetos;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Funciones {
 // aquí se asignarian las funciones a usar, en este caso solo se utilizó una para la conversión de fecha a edad.
    public static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public static int getedad(String fechaNac) {
        int edad;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechan = LocalDate.parse(fechaNac, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechan, ahora);

        edad = periodo.getYears();

        return edad;
    }

    
    
    
}
