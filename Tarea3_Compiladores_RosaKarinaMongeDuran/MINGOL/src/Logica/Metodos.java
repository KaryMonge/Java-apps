/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Nueva_version*/
package Logica;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Metodos {

    public static boolean estoy_en_comentarios;
    public static String palabra_comentario;
    public static boolean leyo_begin;
    public static boolean leyo_end;
    public static boolean linea_anterior_puntoycoma;
    public static int contador_lineas_comando;
    public static boolean linea_reservada_sola;
    public static ArrayList<String> etiquetas = new ArrayList<String>();
    public static ArrayList<String> variables_int = new ArrayList<String>();
    public static ArrayList<String> variables_real = new ArrayList<String>();
    public static ArrayList<String> variables_char = new ArrayList<String>();
    public static ArrayList<String> etiquetas_buscar = new ArrayList<String>();
    public static ArrayList<String> palabras_reservadas_mayu = new ArrayList<String>();
    public static ArrayList<String> palabras_reservadas_minu = new ArrayList<String>();
    public static boolean estoy_en_seccion_variables;
    public static boolean estoy_en_comandos;
    public static boolean ya_paso_variables;
    public static boolean hubo_error;
    public static boolean estoy_en_read;
    public static ArrayList<String> linea_read = new ArrayList<String>();
    public static boolean estoy_en_print;
    public static ArrayList<String> linea_print = new ArrayList<String>();
    public static boolean estoy_en_definicion_linea_variables;
    public static ArrayList<String> linea_variables = new ArrayList<String>();
    public static boolean estoy_en_asignacion_variables;
    public static ArrayList<String> linea_asignacion_variables = new ArrayList<String>();
    public static ArrayList<String> operadores_relacionales_letras = new ArrayList<String>();
    public static ArrayList<String> operadores_aritmeticos = new ArrayList<String>();
    public static ArrayList<String> operadores_agrupacion = new ArrayList<String>();
    public static ArrayList<String> operadores_relacionales_simbolos = new ArrayList<String>();
    public static int contador_menor_igual;
    public static int contador_mayor_igual;
    public static int contador_diferente;
    public static boolean evaluar_30caracteres;
    public static String linea_asignacion_variables_completa;
    
    //catalogo de Errores:
    public static String noerror = "Linea Sintaxis Correcta!";
    public static String error1 = "ERROR 001: Palabra reservada que debe ir sola";
    public static String error2 = "ERROR 002: No puede haber otro BEGIN";
    public static String error3 = "ERROR 003: No se ha leído un begin";
    public static String error4 = "ERROR 004: No puede haber otro END";
    public static String error5 = "ERROR 005: Ya se leyó un end";
    public static String error6 = "ERROR 006: Error en la sintaxis de la etiqueta";
    public static String error7 = "ERROR 007: Eiqueta o variable ya existe";
    public static String error8 = "ERROR 008: Etiqueta GOTO debe ir de primera en la línea";
    public static String error9 = "ERROR 009: Sintáxis errónea en la instrucción GOTO";
    public static String error10 = "ERROR 010: Etiqueta no ha sido definida";
    public static String error11 = "ERROR 011: La línea tiene más de 80 caracteres";
    public static String error12 = "ERROR 012: Palabra reservada DO o THEN debe estar al final";
    public static String error13 = "ERROR 013: La línea no debe tener punto y coma";
    public static String error14 = "ERROR 014: No se pueden más de 5 líneas continuas de comando sin punto y coma";
    public static String error15 = "ERROR 015: La línea no tiene punto y coma";
    public static String error16 = "ERROR 016: Palabra reservada que debe ir en mayúscula";
    public static String error17 = "ERROR 017: Etiqueta o variable no válida";
    public static String error18 = "ERROR 018: Finalización de comentario erróneo";
    public static String error19 = "ERROR 019: Identificador no puede ser una palabra reservada";
    public static String error20 = "ERROR 020: La línea no debe tener punto y coma";
    public static String error21 = "ERROR 021: Definición de variables ya pasó";
    public static String error22 = "ERROR 022: Nunca se leyó un BEGIN";
    public static String error23 = "ERROR 023: Nunca se leyó un END";
    public static String error24 = "ERROR 024: Palabra reservada que debe ir en minúscula";   
    public static String error25 = "ERROR 025: Ya se inició la definición de comandos. No se pueden definir variables";
    public static String error26 = "ERROR 026: Sintáxis errónea en la palabra reservada";
    
    public static String error27 = "ERROR 027: Sintáxis del read incorrecta";
    public static String error28 = "ERROR 028: Sintáxis del read incorrecta";
    //La diferencia entre el ERROR027 y ERROR028 es que el error 028 se da cuando la línea no tiene punto y coma viene una línea FI, OD, END
    //Mientras que el ERROR027 se da si el read tiene punto y coma
    
    public static String error29 = "ERROR 029: Sintáxis del print incorrecta";
    public static String error30 = "ERROR 030: Sintáxis del print incorrecta";
    //La diferencia entre el ERROR029 y ERROR030 es que el error 030 se da cuando la línea no tiene punto y coma viene una línea FI, OD, END
    //Mientras que el ERROR029 se da si el print tiene punto y coma
    
    public static String error31 = "ERROR 031: Definición de variables incorrecta";
    public static String error32 = "ERROR 032: Definición de variables incorrecta";
    //La diferencia entre el ERROR031 y ERROR032 es que el error 032 se da cuando la línea no tiene punto y coma viene una línea FI, OD, END
    //Mientras que el ERROR031 se da si la definición de variables tiene punto y coma
    
    public static String error33 = "ERROR 033: Asignación de variables incorrecta";
    public static String error34 = "ERROR 034: Asignación de variables incorrecta";
    //La diferencia entre el ERROR033 y ERROR034 es que el error 034 se da cuando la línea no tiene punto y coma viene una línea FI, OD, END
    //Mientras que el ERROR033 se da si la asignación de variables tiene punto y coma
    
    public static String error35 = "ERROR 035: No debe haber espacio entre los : y el =";
    public static String error36 = "ERROR 036: No debe haber espacio entre los < y el =";
    public static String error37 = "ERROR 037: No debe haber espacio entre los > y el =";
    public static String error38 = "ERROR 038: No debe haber espacio entre los / y el =";
    public static String error39 = "ERROR 039: El texto no debe ser mayor a 30 caracteres";
    
    public static String espacios_comentario = "       ";
    public static String espacios_comentario_etiqueta = "EEEEEEE";


    public static String mascara_int(int numero_a_conv) {

        if (numero_a_conv < 10) {

            return "0000" + String.valueOf(numero_a_conv);

        } else if (numero_a_conv < 100) {
            return "000" + String.valueOf(numero_a_conv);
        } else {
            if (numero_a_conv < 1000) {
                return "00" + String.valueOf(numero_a_conv);
            } else if (numero_a_conv <= 10000) {
                return "0" + String.valueOf(numero_a_conv);
            }else{
                return String.valueOf(numero_a_conv);
            }
                    
        }
    }
}
    

