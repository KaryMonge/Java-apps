/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /* Nueva versión */
package Atributos;

import Logica.Metodos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Lecura {

    public static Atributo datos = new Atributo();
    public static String contenido_original = "";
    public static String contenido_error = "";
    public static ArrayList<String> contenido_error_array = new ArrayList<String>();

    public static void Inicializacion_Variables (){
        
        Metodos.estoy_en_comentarios = false;
        Metodos.leyo_begin = false;
        Metodos.leyo_end = false;
        Metodos.linea_anterior_puntoycoma = false;
        Metodos.contador_lineas_comando = 0;
        Metodos.linea_reservada_sola = false;
        Metodos.estoy_en_seccion_variables = false;
        Metodos.ya_paso_variables = false;
        Metodos.hubo_error = false;
        Metodos.estoy_en_comandos = false;
        Metodos.estoy_en_read = false;
        Metodos.estoy_en_definicion_linea_variables = false;
        
        Metodos.palabras_reservadas_mayu.add("BEGIN");
        Metodos.palabras_reservadas_mayu.add("END");
        Metodos.palabras_reservadas_mayu.add("ELSE");
        Metodos.palabras_reservadas_mayu.add("THEN");
        Metodos.palabras_reservadas_mayu.add("DO");
        Metodos.palabras_reservadas_mayu.add("GOTO");
        Metodos.palabras_reservadas_mayu.add("FI");
        Metodos.palabras_reservadas_mayu.add("OD");
        Metodos.palabras_reservadas_mayu.add("INT");
        Metodos.palabras_reservadas_mayu.add("REAL");
        Metodos.palabras_reservadas_mayu.add("CHAR");
        Metodos.palabras_reservadas_mayu.add("COMMENT");
        Metodos.palabras_reservadas_mayu.add("CO");
        Metodos.palabras_reservadas_mayu.add("DOUBLE");
        Metodos.palabras_reservadas_mayu.add("PRAGMAT");
        Metodos.palabras_reservadas_mayu.add("SKIP");
        
        Metodos.palabras_reservadas_minu.add("print");
        Metodos.palabras_reservadas_minu.add("read");
        
        Metodos.operadores_aritmeticos.add("*");
        Metodos.operadores_aritmeticos.add("/");
        Metodos.operadores_aritmeticos.add("+");
        Metodos.operadores_aritmeticos.add("-");
        
        Metodos.operadores_agrupacion.add("(");
        Metodos.operadores_agrupacion.add(")");

        Metodos.operadores_relacionales_letras.add("EQ");
        Metodos.operadores_relacionales_letras.add("NE");
        Metodos.operadores_relacionales_letras.add("LT");
        Metodos.operadores_relacionales_letras.add("GT");
        Metodos.operadores_relacionales_letras.add("LE");
        Metodos.operadores_relacionales_letras.add("GE");

        Metodos.operadores_relacionales_simbolos.add("=");
        Metodos.operadores_relacionales_simbolos.add("<");
        Metodos.operadores_relacionales_simbolos.add(">");

    }

    public static void Apertura_Archivo() throws IOException {
        datos.getTextoArchivo();
    }



}
