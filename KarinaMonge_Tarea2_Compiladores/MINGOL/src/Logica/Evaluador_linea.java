/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author karin
 */
public class Evaluador_linea {
/*
    static String Metodos.noerror = "Linea Sintaxis Correcta!";
    static String Metodos.error1 = "ERROR 001: Palabra reservada que debe ir sola";
    static String Metodos.error2 = "ERROR 002: No puede haber otro BEGIN";
    static String Metodos.error3 = "ERROR 003: No se ha leído un begin";
    static String Metodos.error4 = "ERROR 004: No puede haber otro END";
    static String Metodos.error5 = "ERROR 005: Ya se leyó un end";
    static String Metodos.error6 = "ERROR 006: Error en la sintaxis de la etiqueta";
    static String Metodos.error7 = "ERROR 007: Eiqueta o variable ya existe";
    static String Metodos.error8 = "ERROR 008: Etiqueta GOTO debe ir de primera en la línea";
    static String Metodos.error9 = "ERROR 009: Sintáxis errónea en la instrucción GOTO";
    static String Metodos.error10 = "ERROR 010: Etiqueta no ha sido definida";
    static String Metodos.error11 = "ERROR 011: La línea tiene más de 80 caracteres";
    static String Metodos.error12 = "ERROR 012: Palabra reservada DO o THEN debe estar al final";
    static String Metodos.error13 = "ERROR 013: La línea anterior no debe tener punto y coma";
    static String Metodos.error14 = "ERROR 014: No se pueden más de 5 líneas continuas de comando sin punto y coma";
    static String Metodos.error15 = "ERROR 015: La línea anterior no tiene punto y coma";
    static String Metodos.error16 = "ERROR 016: Palabra reservada que debe ir en mayúscula";
    static String Metodos.error17 = "ERROR 017: Etiqueta o variable no válida";
    static String Metodos.error18 = "ERROR 018: Finalización de comentario erróneo";
    static String Metodos.error19 = "ERROR 019: Identificador no puede ser una palabra reservada";
    static String Metodos.error20 = "ERROR 020: Definición de variables incorrecta";
    static String Metodos.error21 = "ERROR 020: Definición de variables ya pasó";

    static String Metodos.espacios_comentario = "       ";
*/
    //   static String delimitador=" <>(){}[];=+-*.";
    static String delimitador = " :;";

    public static String EvaluadorLinea(String Linea) {

        ArrayList<String> Parteslinea = new ArrayList<String>();

        StringTokenizer divisiones = new StringTokenizer(Linea, delimitador, true);
        if (Linea.length() > 80) {
            Metodos.hubo_error = true;
            //System.out.println(Metodos.error11);
            return Metodos.espacios_comentario + Metodos.error11 + "\n";
        }
        int contador = 0;
        boolean reservada_sola = false;
        boolean es_etiqueta = false;
        boolean es_etiquetaGOTO = false;
        boolean reservada_final = false;
        boolean SinPuntoyComaAnterior = false;
        boolean palabras_reservadas_mayu_mal = false;
        boolean palabras_reservadas_minu_mal = false;
        boolean encontrado = false;
        boolean es_variable = false;

        while (divisiones.hasMoreTokens()) {
            String division = divisiones.nextToken();
            if (division.isEmpty()) {
            } else {
                String tipoDato = "";
                for (Tabla_palabras.Tipos comparador_TOKENS : Tabla_palabras.Tipos.values()) {
                    if (division.matches(comparador_TOKENS.patron)) {
                        //la division de la linea es igual a un elemento de la tabla palabras
                        switch (comparador_TOKENS) {
                            case ReservadasSolas:
                                tipoDato = "ReservadasSolas";
                                reservada_sola = true;
                                Metodos.contador_lineas_comando = 0;
                                encontrado = true;
                                break;
                            case ReservadasSolasSinPuntoyComaAnterior:
                                tipoDato = "ReservadasSolasSinPuntoyComaAnterior";
                                reservada_sola = true;
                                SinPuntoyComaAnterior = true;
                                Metodos.contador_lineas_comando = 0;
                                encontrado = true;
                                break;
                            case ReservadasFinales:
                                tipoDato = "ReservadasFinales";
                                reservada_final = true;
                                Metodos.contador_lineas_comando = 0;
                                encontrado = true;
                                break;
                            case ReservadasSinPuntoycomaAnterior:
                                tipoDato = "ReservadasSinPuntoycomaAnterior";
                                SinPuntoyComaAnterior = true;
                                Metodos.contador_lineas_comando = 0;
                                encontrado = true;
                                break;
                            case Variables:
                                tipoDato = "Variables";
                                es_variable = true;
                                Metodos.contador_lineas_comando = 0;
                                encontrado = true;
                                break;
                            case EtiquetaGOTO:
                                tipoDato = "EtiquetaGOTO";
                                es_etiquetaGOTO = true;
                                Metodos.contador_lineas_comando = 0;
                                encontrado = true;
                                break;
                            case Etiquetas:
                                tipoDato = "Etiquetas";
                                es_etiqueta = true;
                                Metodos.contador_lineas_comando = 0;
                                encontrado = true;
                                break;
                            case ReservadasMayu:
                                tipoDato = "ReservadasMayu";
                                Metodos.contador_lineas_comando = 0;
                                encontrado = true;
                            case ReservadasMinu:
                                tipoDato = "ReservadasMinu";
                                Metodos.contador_lineas_comando = 0;
                                encontrado = true;
                                
                            default:
                        }
                    }
                    if (encontrado) {
                        //para que el FOR no se siga ejecutando una vez
                        //que encontró el TOKEN en la tabla
                        break;
                    }
                }
                if (!encontrado && Metodos.palabras_reservadas_mayu.contains(division.toUpperCase())) {
                    //como no se encontró en la tabla de palabras reservadas pero, al convertirla a mayúscula si se encuentra aquí
                    //signifca que es una palabra reservada mal escrita
                    palabras_reservadas_mayu_mal = true;
                }
                if (!encontrado && Metodos.palabras_reservadas_minu.contains(division.toLowerCase())) {
                    //como no se encontró en la tabla de palabras reservadas pero, al convertirla a mayúscula si se encuentra aquí
                    //signifca que es una palabra reservada mal escrita
                    palabras_reservadas_minu_mal = true;
                }

                if (!division.trim().isEmpty()) {
                    Parteslinea.add(division);
                }
                contador++;
            }
        }

        Verificador_Sintaxis verifica = new Verificador_Sintaxis();
        if (verifica.verifica_comentarios(Parteslinea)) {
            if (verifica.verifica_final_comentarios(Parteslinea)) {
                //System.out.println(Metodos.noerror);
                return "";
            } else {
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error18);
                return Metodos.espacios_comentario + Metodos.error18 + "\n";
            }
        } else if (palabras_reservadas_mayu_mal) {
            // Palabra reservada que debe ir en mayuscula
            Metodos.hubo_error = true;
            //System.out.println(Metodos.error16);
            return Metodos.espacios_comentario + Metodos.error16 + "\n";
        } else if (palabras_reservadas_minu_mal) {
            // Palabra reservada que debe ir en mayuscula
            Metodos.hubo_error = true;
            //System.out.println(Metodos.error24);
            return Metodos.espacios_comentario + Metodos.error24 + "\n";
        } else if (reservada_sola) {
            // Es una palabra reservada que va sola:
            // BEGIN, END, ELSE
            if (Metodos.estoy_en_variables) {
                Metodos.estoy_en_variables = false;
                Metodos.ya_paso_variables = true;
            }
            if (!verifica.reservada_esta_sola(Parteslinea)) { // Se verifica que esté sola
                //No está sola
                //System.out.println(Metodos.error1);
                Metodos.hubo_error = true;
                return Metodos.espacios_comentario + Metodos.error1 + "\n";
            } else if (verifica.verifica_begin(Parteslinea)) { //si está sola y se verifica si es un begin
                // Si es begin
                if (Metodos.leyo_begin) {
                    //ya se leyó un begin y viene otro begin
                    //System.out.println(Metodos.error2);
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error2 + "\n";
                } else {
                    //no se ha leído un begin y viene un begin
                    Metodos.leyo_begin = true;
                    Metodos.linea_anterior_puntoycoma = false;
                    Metodos.linea_reservada_anterior = true;
                    //System.out.println(Metodos.noerror);
                    return "";
                }
            } else if (verifica.verifica_end(Parteslinea)) { //si está sola, no es un begin y se verifica si es un end
                // Si es end
                if (!Metodos.leyo_begin) {
                    //no se ha leído un begin por lo que NO puede venir una palabra reservada que no sea begin
                    Metodos.hubo_error = true;
                    //System.out.println(Metodos.error3);
                    return Metodos.espacios_comentario + Metodos.error3 + "\n";
                } else if (Metodos.leyo_end) {
                    //ya se leyó un end y viene otro end
                    Metodos.hubo_error = true;
                    //System.out.println(Metodos.error4);
                    return Metodos.espacios_comentario + Metodos.error4 + "\n";
                } else if (SinPuntoyComaAnterior && Metodos.linea_anterior_puntoycoma) { //Compara si es una linea que no debe llevar punto y coma anterior 
                    //pero la línea si tiene punto y coma al final
                    Metodos.hubo_error = true;
                    //System.out.println(Metodos.error13);
                    return Metodos.espacios_comentario + Metodos.error13 + "\n";
                } else {
                    //no se ha leído un end y viene un end
                    Metodos.leyo_end = true;
                    Metodos.linea_anterior_puntoycoma = false;
                    Metodos.linea_reservada_anterior = true;
                    //System.out.println(Metodos.noerror);
                    return "";
                }
            } else {
                // No es begin y no es un end, y es una palabra reservada entonces se verifica si ya se leyó un begin 
                // y que no se haya leído un end
                if (!Metodos.leyo_begin) {
                    //no se ha leído un begin por lo que NO puede venir una palabra reservada que no sea begin
                    Metodos.hubo_error = true;
                    //System.out.println(Metodos.error3);
                    return Metodos.espacios_comentario + Metodos.error3 + "\n";
                } else if (Metodos.leyo_end) {
                    //ya se leyó un end por lo que NO puede venir una palabra reservada
                    Metodos.hubo_error = true;
                    //System.out.println(Metodos.error5);
                    return Metodos.espacios_comentario + Metodos.error5 + "\n";
                } else if (!Metodos.linea_anterior_puntoycoma && !Metodos.linea_reservada_anterior) {
                    //La linea anterior no tiene punto y coma y no es una linea reservada
                    Metodos.hubo_error = true;
                    //System.out.println(Metodos.error15);
                    return Metodos.espacios_comentario + Metodos.error15 + "\n";
                } else {
                    //ya se leyó un begin y no se ha leído un end por lo que puede venir una palabra reservada que no sea begin
                    Metodos.linea_anterior_puntoycoma = false;
                    Metodos.linea_reservada_anterior = true;
                    //System.out.println(Metodos.noerror);
                    return "";
                }
            }
        } else if (es_variable) {
            if (Metodos.ya_paso_variables) {
                //ya pasó la definición de variables
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error21);
                return Metodos.espacios_comentario + Metodos.error21 + "\n";
            } else {
                Metodos.estoy_en_variables = true;
            }
            if (!Metodos.leyo_begin) {
                //no se ha leído un begin por lo que NO puede venir una etiqueta
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error3);
                return Metodos.espacios_comentario + Metodos.error3 + "\n";
            } else if (Metodos.leyo_end) {
                //ya se leyó un end por lo que NO puede venir una palabra reservada
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error5);
                return Metodos.espacios_comentario + Metodos.error5 + "\n";
            } else if (!verifica.validar_tipo_variable(Parteslinea)) {
                //Definicion de variables incorrecta
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error20);
                return Metodos.espacios_comentario + Metodos.error20 + "\n";
            } else if (!verifica.validar_masdeuno_variable(Parteslinea)) {
                //Definicion de variables incorrecta
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error20);
                return Metodos.espacios_comentario + Metodos.error20 + "\n";
            }
            //se examinan que la variables internas terminen en coma
            int tamano_for;
            if (verifica.variable_termina_con_puntoycoma(Parteslinea)) {
                tamano_for = Parteslinea.size() - 3;
            } else {
                tamano_for = Parteslinea.size() - 2;
            }
            for (int i = 1; i <= tamano_for; i++) {
                if (!verifica.variable_termina_con_coma(Parteslinea.get(i))) {
                    Metodos.hubo_error = true;
                    //System.out.println(Metodos.error20);
                    return Metodos.espacios_comentario + Metodos.error20 + "\n";
                }
            }
            //se valida que las variables tengan un nombre de identificador correcto y no sea una palabra reservada y que no exista
            //primero para las variables que tienen coma en el medio
            for (int i = 1; i <= tamano_for; i++) {
                String nombre_variable;
                nombre_variable = Parteslinea.get(i).substring(0, Parteslinea.get(i).length() - 1);
                if (!verifica.verificador_identificador(nombre_variable)) {
                    //no cumple con los requerimientos de etiqueta
                    Metodos.hubo_error = true;
                    //System.out.println(Metodos.error17);
                    return Metodos.espacios_comentario + Metodos.error17 + "\n";
                } else if (verifica.identificador_reservado(nombre_variable)) {
                    //no cumple con los requerimientos de etiqueta
                    Metodos.hubo_error = true;
                    //System.out.println(Metodos.error19);
                    return Metodos.espacios_comentario + Metodos.error19 + "\n";
                } else if (verifica.etiqueta_existe(nombre_variable)) { //La etiqueta es válida, así que valida si ya existe entre las ya creadas
                    //Ya existe
                    Metodos.hubo_error = true;
                    //System.out.println(Metodos.error7);
                    return Metodos.espacios_comentario + Metodos.error7 + "\n";
                } else {
                    Metodos.etiquetas.add(nombre_variable);
                }
            }
            //Validamos el nombre de la variable en la última posición que sea identificador correcto y no una palabra reservada y no exista
            if (!verifica.verificador_identificador(Parteslinea.get(tamano_for + 1))) {
                //no cumple con los requerimientos de etiqueta
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error17);
                return Metodos.espacios_comentario + Metodos.error17 + "\n";
            } else if (verifica.identificador_reservado(Parteslinea.get(tamano_for + 1))) {
                //no cumple con los requerimientos de etiqueta
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error19);
                return Metodos.espacios_comentario + Metodos.error19 + "\n";
            } else if (verifica.etiqueta_existe(Parteslinea.get(tamano_for + 1))) { //La etiqueta es válida, así que valida si ya existe entre las ya creadas
                //Ya existe
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error7);
                return Metodos.espacios_comentario + Metodos.error7 + "\n";
            } else {
                    Metodos.etiquetas.add(Parteslinea.get(tamano_for + 1));
            }
            if (!Metodos.linea_anterior_puntoycoma && !Metodos.linea_reservada_anterior) {
                //La linea anterior no tiene punto y coma y no es una linea reservada
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error15);
                return Metodos.espacios_comentario + Metodos.error15 + "\n";
            } else {
                //la etiqueta no existe así que se inserta en la etiquetas
                Metodos.linea_anterior_puntoycoma = verifica.variable_termina_con_puntoycoma(Parteslinea);
                Metodos.linea_reservada_anterior = false;
                //System.out.println(Metodos.noerror);
                return "";
            }
        } else if (es_etiqueta) {
            if (Metodos.estoy_en_variables) {
                Metodos.estoy_en_variables = false;
                Metodos.ya_paso_variables = true;
            }
            String etiquetasinpuntos;
            if (Parteslinea.size() == 1) {
                etiquetasinpuntos = Parteslinea.get(0).substring(0, Parteslinea.get(0).length() - 1);
            } else {
                etiquetasinpuntos = Parteslinea.get(0);
            }
            if (!verifica.etiqueta_esta_sola(Parteslinea)) { // Se verifica que la etiqueta esté sola
                //No está sola
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error6);
                return Metodos.espacios_comentario + Metodos.error6 + "\n";
            } else if (!Metodos.leyo_begin) {
                //no se ha leído un begin por lo que NO puede venir una etiqueta
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error3);
                return Metodos.espacios_comentario + Metodos.error3 + "\n";
            } else if (Metodos.leyo_end) {
                //ya se leyó un end por lo que NO puede venir una palabra reservada
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error5);
                return Metodos.espacios_comentario + Metodos.error5 + "\n";
            } else if (!verifica.verificador_identificador(etiquetasinpuntos)) {
                //no cumple con los requerimientos de etiqueta
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error17);
                return Metodos.espacios_comentario + Metodos.error17 + "\n";
            } else if (verifica.identificador_reservado(etiquetasinpuntos)) {
                //no cumple con los requerimientos de etiqueta
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error19);
                return Metodos.espacios_comentario + Metodos.error19 + "\n";
            } else if (verifica.etiqueta_existe(etiquetasinpuntos)) { //La etiqueta es válida, así que valida si ya existe entre las ya creadas
                //Ya existe
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error7);
                return Metodos.espacios_comentario + Metodos.error7 + "\n";
            } else if (!Metodos.linea_anterior_puntoycoma && !Metodos.linea_reservada_anterior) {
                //La linea anterior no tiene punto y coma y no es una linea reservada
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error15);
                return Metodos.espacios_comentario + Metodos.error15 + "\n";
            } else {
                //la etiqueta no existe así que se inserta en la etiquetas
                Metodos.etiquetas.add(etiquetasinpuntos);
                Metodos.linea_anterior_puntoycoma = false;
                Metodos.linea_reservada_anterior = true;
                //System.out.println(Metodos.noerror);
                return "";
            }
        } else if (es_etiquetaGOTO) {
            if (Metodos.estoy_en_variables) {
                Metodos.estoy_en_variables = false;
                Metodos.ya_paso_variables = true;
            }
            if (!verifica.GOTOprimero(Parteslinea)) { //se verifica que el GOTO esté de primero
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error8);
                return Metodos.espacios_comentario + Metodos.error8 + "\n";
            } else if (!verifica.GOTO2elementos(Parteslinea)) { //se verifica que la línea tenga solo 2 elementos
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error9);
                return Metodos.espacios_comentario + Metodos.error9 + "\n";
            } else if (!Metodos.leyo_begin) {
                //no se ha leído un begin por lo que NO puede venir una etiqueta
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error3);
                return Metodos.espacios_comentario + Metodos.error3 + "\n";
            } else if (Metodos.leyo_end) {
                //ya se leyó un end por lo que NO puede venir una palabra reservada
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error5);
                return Metodos.espacios_comentario + Metodos.error5 + "\n";
            } else if (!verifica.etiqueta_existe(Parteslinea.get(1))) {//se verifica que la etiqueta exista
                // Error si la etiqueta no existe
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error10);
                return Metodos.espacios_comentario + Metodos.error10 + "\n";
            } else if (!Metodos.linea_anterior_puntoycoma && !Metodos.linea_reservada_anterior) {
                //La linea anterior no tiene punto y coma y no es una linea reservada
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error15);
                return Metodos.espacios_comentario + Metodos.error15 + "\n";
            } else {
                Metodos.linea_anterior_puntoycoma = false;
                Metodos.linea_reservada_anterior = true;
                //System.out.println(Metodos.noerror);
                return "";
            }
        } else if (reservada_final) {
            if (Metodos.estoy_en_variables) {
                Metodos.estoy_en_variables = false;
                Metodos.ya_paso_variables = true;
            }
            if (!verifica.reservada_final(Parteslinea)) { //se verifica que la palabra reservada esté al final
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error12);
                return Metodos.espacios_comentario + Metodos.error12 + "\n";
            } else if (!Metodos.leyo_begin) {
                //no se ha leído un begin por lo que NO puede venir una etiqueta
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error3);
                return Metodos.espacios_comentario + Metodos.error3 + "\n";
            } else if (Metodos.leyo_end) {
                //ya se leyó un end por lo que NO puede venir una palabra reservada
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error5);
                return Metodos.espacios_comentario + Metodos.error5 + "\n";
            } else if (!Metodos.linea_anterior_puntoycoma && !Metodos.linea_reservada_anterior) {
                //La linea anterior no tiene punto y coma y no es una linea reservada
                Metodos.hubo_error = true;
                //System.out.println(Metodos.error15);
                return Metodos.espacios_comentario + Metodos.error15 + "\n";
            } else {
                Metodos.linea_anterior_puntoycoma = false;
                Metodos.linea_reservada_anterior = true;
                //System.out.println(Metodos.noerror);
                return "";
            }
        } else if (SinPuntoyComaAnterior && Metodos.linea_anterior_puntoycoma) {
            if (Metodos.estoy_en_variables) {
                Metodos.estoy_en_variables = false;
                Metodos.ya_paso_variables = true;
            }
            Metodos.hubo_error = true;
            //System.out.println(Metodos.error13);
            return Metodos.espacios_comentario + Metodos.error13 + "\n";
        } else {
            if (Metodos.estoy_en_variables) {
                Metodos.estoy_en_variables = false;
                Metodos.ya_paso_variables = true;
            }
            Metodos.linea_reservada_anterior = false;
            if (verifica.termina_con_puntoycoma(Parteslinea)) {
                Metodos.linea_anterior_puntoycoma = true;
                Metodos.contador_lineas_comando = 0;
            } else {
                Metodos.linea_anterior_puntoycoma = false;
                Metodos.contador_lineas_comando++;
                if (Metodos.contador_lineas_comando == 5) {
                    Metodos.hubo_error = true;
                    //System.out.println(Metodos.error14);
                    return Metodos.espacios_comentario + Metodos.error14 + "\n";
                }
            }
            return "";
        }
    }
}
