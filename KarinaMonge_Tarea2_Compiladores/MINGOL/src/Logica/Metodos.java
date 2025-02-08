/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Metodos {

    public static boolean leyo_begin;
    public static boolean leyo_end;
    public static boolean linea_anterior_puntoycoma;
    public static int contador_lineas_comando;
    public static boolean linea_reservada_anterior;
    public static ArrayList<String> etiquetas = new ArrayList<String>();
    public static ArrayList<String> palabras_reservadas_mayu = new ArrayList<String>();
    public static ArrayList<String> palabras_reservadas_minu = new ArrayList<String>();
    public static boolean estoy_en_variables;
    public static boolean ya_paso_variables;
    public static boolean hubo_error;
    
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
    public static String error13 = "ERROR 013: La línea anterior no debe tener punto y coma";
    public static String error14 = "ERROR 014: No se pueden más de 5 líneas continuas de comando sin punto y coma";
    public static String error15 = "ERROR 015: La línea anterior no tiene punto y coma";
    public static String error16 = "ERROR 016: Palabra reservada que debe ir en mayúscula";
    public static String error17 = "ERROR 017: Etiqueta o variable no válida";
    public static String error18 = "ERROR 018: Finalización de comentario erróneo";
    public static String error19 = "ERROR 019: Identificador no puede ser una palabra reservada";
    public static String error20 = "ERROR 020: Definición de variables incorrecta";
    public static String error21 = "ERROR 021: Definición de variables ya pasó";
    public static String error22 = "ERROR 022: Nunca se leyó un BEGIN";
    public static String error23 = "ERROR 023: Nunca se leyó un END";
    public static String error24 = "ERROR 024: Palabra reservada que debe ir en minúscula";    
    public static String espacios_comentario = "       ";
    
    public static int contador_lineas = 0;
    public static int contador_caracteres_sin_esp = 0;
    public static int contador_caracteres_con_esp = 0;
    public static int contador_palabras = 0;

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
    

