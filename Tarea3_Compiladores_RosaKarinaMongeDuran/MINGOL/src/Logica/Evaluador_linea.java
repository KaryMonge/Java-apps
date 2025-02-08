/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /* Nueva versión */
package Logica;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author karin
 */
public class Evaluador_linea {

    /*


    static String Metodos.espacios_comentario = "       ";
     */
    //   static String delimitador=" <>(){}[];=+-*.";
    //static String delimitador = "\" :;,()";
    static String delimitador = "\" :;,()=<>*/+-";

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
        boolean reservada_puntoycoma = false;
        boolean SinPuntoyComaAnterior = false;
        boolean palabras_reservadas_mayu_mal = false;
        boolean palabras_reservadas_minu_mal = false;
        boolean encontrado = false;
        boolean es_definicion_variable = false;
        boolean es_read = false;
        boolean es_print = false;
        boolean es_pragmat = false;
        boolean es_mode = false;
        boolean es_todavianoprogramada = false;

        while (divisiones.hasMoreTokens()) {
            String division = divisiones.nextToken();
            if (division.isEmpty()) {
            } else {
                String tipoDato = "";
                for (Tabla_palabras.Tipos comparador_TOKENS : Tabla_palabras.Tipos.values()) {
                    if (division.matches(comparador_TOKENS.patron)) {
                        //la division de la linea es igual a un elemento de la tabla palabras
                        switch (comparador_TOKENS) {
                            case Pragmat:
                                if (!es_print) {
                                    tipoDato = "Pragmat";
                                    es_pragmat = true;
                                    Metodos.contador_lineas_comando = 0;
                                    encontrado = true;
                                    break;
                                }
                            case Mode:
                                if (!es_print) {
                                    tipoDato = "Mode";
                                    es_mode = true;
                                    Metodos.contador_lineas_comando = 0;
                                    encontrado = true;
                                    break;
                                }
                            case TodaviaNoProgramadas:
                                if (!es_print) {
                                    tipoDato = "TodaviaNoProgramadas";
                                    es_todavianoprogramada = true;
                                    Metodos.contador_lineas_comando = 0;
                                    encontrado = true;
                                    break;
                                }                                
                            case ReservadasSolas:
                                if (!es_print) {
                                    tipoDato = "ReservadasSolas";
                                    reservada_sola = true;
                                    Metodos.contador_lineas_comando = 0;
                                    encontrado = true;
                                    break;
                                }
                            case ReservadasSolasSinPuntoyComaAnterior:  //Si llevan el punto y coma al final
                                if (!es_print) {
                                    tipoDato = "ReservadasSolasSinPuntoyComaAnterior";
                                    reservada_sola = true;
                                    SinPuntoyComaAnterior = true;
                                    Metodos.contador_lineas_comando = 0;
                                    encontrado = true;
                                    break;
                                }
                            case ReservadasFinales:
                                if (!es_print) {
                                    tipoDato = "ReservadasFinales";
                                    reservada_final = true;
                                    Metodos.contador_lineas_comando = 0;
                                    encontrado = true;
                                    break;
                                }
                            case ReservadasSinPuntoycomaAnterior:
                                if (!es_print) {
                                    tipoDato = "ReservadasSinPuntoycomaAnterior";
                                    reservada_puntoycoma = true;
                                    SinPuntoyComaAnterior = true;
                                    Metodos.contador_lineas_comando = 0;
                                    encontrado = true;
                                    break;
                                }
                            case Variables:
                                if (!es_print) {
                                    tipoDato = "Variables";
                                    es_definicion_variable = true;
                                    Metodos.contador_lineas_comando = 0;
                                    encontrado = true;
                                    break;
                                }
                            case EtiquetaGOTO:
                                if (!es_print) {
                                    tipoDato = "EtiquetaGOTO";
                                    es_etiquetaGOTO = true;
                                    Metodos.contador_lineas_comando = 0;
                                    encontrado = true;
                                    break;
                                }
                            case read:
                                if (!es_print) {
                                    tipoDato = "read";
                                    es_read = true;
                                    Metodos.contador_lineas_comando = 0;
                                    encontrado = true;
                                    break;
                                }
                            case print:
                                if (contador == 0) {
                                    tipoDato = "print";
                                    es_print = true;
                                    Metodos.contador_lineas_comando = 0;
                                    encontrado = true;
                                    break;
                                }
                            case Etiquetas:
                                if (!es_print) {
                                    tipoDato = "Etiquetas";
                                    es_etiqueta = true;
                                    Metodos.contador_lineas_comando = 0;
                                    encontrado = true;
                                    break;
                                }
                            case ReservadasMayu:
                                if (!es_print) {
                                    tipoDato = "ReservadasMayu";
                                    Metodos.contador_lineas_comando = 0;
                                    encontrado = true;
                                }
                            case ReservadasMinu:
                                if (!es_print) {
                                    tipoDato = "ReservadasMinu";
                                    Metodos.contador_lineas_comando = 0;
                                    encontrado = true;
                                }
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
        if (!Metodos.estoy_en_comentarios) {
            // No estoy en comentarios por lo que se verifica
            // si la línea es un comentario
            if (verifica.verifica_comentarios(Parteslinea)) {
                //la línea si es un comentario
                Metodos.estoy_en_comentarios = true;
                // verifico si el resto de la linea contiene la palabra que cierra el comentario
                int pos_final = verifica.verifica_final_comentarios(Parteslinea, 1, Parteslinea.size() - 1);
                if (pos_final > -1) {
                    //encontró el final del comentario
                    Metodos.estoy_en_comentarios = false;
                    //se verifica si el final del comentario está al final de la línea
                    if (pos_final < (Parteslinea.size() - 1)) {
                        // el final del comentario NO está al final de la línea
                        return Metodos.espacios_comentario + Metodos.error18 + "\n";
                    } else {
                        // el final del comentario SI está al final de la línea
                        return "";
                    }
                } else {
                    //No se encontró el final del comentario
                    return "";
                }
            } else if (palabras_reservadas_mayu_mal) {
                // Palabra reservada que debe ir en mayuscula
                Metodos.hubo_error = true;
                return Metodos.espacios_comentario + Metodos.error16 + "\n";
            } else if (palabras_reservadas_minu_mal) {
                // Palabra reservada que debe ir en mayuscula
                Metodos.hubo_error = true;
                return Metodos.espacios_comentario + Metodos.error24 + "\n";
            } else if (es_pragmat) {
                if (verifica.termina_con_puntoycoma(Parteslinea)) {
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error20 + "\n";
                }
                Metodos.linea_anterior_puntoycoma = false;
                Metodos.linea_reservada_sola = false;
                Metodos.estoy_en_read = false;
                Metodos.estoy_en_print = false;
                Metodos.estoy_en_definicion_linea_variables = false;
                Metodos.estoy_en_asignacion_variables = false;                return "";
            } else if (es_mode) {
                if (verifica.termina_con_puntoycoma(Parteslinea)) {
                    Metodos.linea_anterior_puntoycoma = true;
                } else {
                    Metodos.linea_anterior_puntoycoma = false;
                }
                Metodos.linea_reservada_sola = false;
                Metodos.estoy_en_read = false;
                Metodos.estoy_en_print = false;
                Metodos.estoy_en_definicion_linea_variables = false;
                Metodos.estoy_en_asignacion_variables = false;
                return "";
            } else if (es_todavianoprogramada) {
                if (verifica.termina_con_puntoycoma(Parteslinea)) {
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error20 + "\n";
                }
                Metodos.linea_anterior_puntoycoma = false;
                Metodos.linea_reservada_sola = true;
                Metodos.estoy_en_read = false;
                Metodos.estoy_en_print = false;
                Metodos.estoy_en_definicion_linea_variables = false;
                Metodos.estoy_en_asignacion_variables = false;
                return "";
            } else if (reservada_sola) {
                // Es una palabra reservada que va sola:
                // BEGIN, END, ELSE
                if (Metodos.estoy_en_seccion_variables) {
                    Metodos.estoy_en_seccion_variables = false;
                    Metodos.ya_paso_variables = true;
                }
                if (!verifica.reservada_esta_sola(Parteslinea)) { // Se verifica que esté sola
                    //No está sola
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error1 + "\n";
                } else if (verifica.verifica_begin(Parteslinea)) { //si está sola y se verifica si es un begin
                    // Si es begin
                    if (Metodos.leyo_begin) {
                        //ya se leyó un begin y viene otro begin
                        Metodos.hubo_error = true;
                        return Metodos.espacios_comentario + Metodos.error2 + "\n";
                    } else {
                        //no se ha leído un begin y viene un begin
                        Metodos.leyo_begin = true;
                        Metodos.linea_anterior_puntoycoma = false;
                        Metodos.linea_reservada_sola = true;
                        Metodos.estoy_en_read = false;
                        Metodos.estoy_en_print = false;
                        Metodos.estoy_en_definicion_linea_variables = false;
                        Metodos.estoy_en_seccion_variables = false;
                        Metodos.estoy_en_asignacion_variables = false;
                        return "";
                    }
                } else if (verifica.verifica_end(Parteslinea)) { //si está sola, no es un begin y se verifica si es un end
                    // Si es end
                    if (!Metodos.leyo_begin) {
                        //no se ha leído un begin por lo que NO puede venir una palabra reservada que no sea begin
                        Metodos.hubo_error = true;
                        return Metodos.espacios_comentario + Metodos.error3 + "\n";
                    } else if (Metodos.leyo_end) {
                        //ya se leyó un end y viene otro end
                        Metodos.hubo_error = true;
                        return Metodos.espacios_comentario + Metodos.error4 + "\n";
                    } else if (SinPuntoyComaAnterior && Metodos.linea_anterior_puntoycoma) { //Compara si es una linea que no debe llevar punto y coma anterior 
                        //pero la línea si tiene punto y coma al final
                        Metodos.hubo_error = true;
                        return Metodos.espacios_comentario + Metodos.error13 + "\n";
                    } else {
                        if (Metodos.estoy_en_read) {
                            //Estoy en read
                            Metodos.estoy_en_read = false;
                            if (!verifica.valida_read(Metodos.linea_read)) {
                                Metodos.hubo_error = true;
                                return Metodos.espacios_comentario + Metodos.error28 + "\n";
                            }
                        } else if (Metodos.estoy_en_print) {
                            //Estoy en print
                            Metodos.estoy_en_print = false;
                            if (!verifica.valida_print(Metodos.linea_print)) {
                                Metodos.hubo_error = true;
                                return Metodos.espacios_comentario + Metodos.error30 + "\n";
                            }
                        } else if (Metodos.estoy_en_definicion_linea_variables) {
                            //Estoy en una linea de definición de variables
                            Metodos.estoy_en_definicion_linea_variables = false;
                            if (!verifica.valida_variables(Metodos.linea_variables)) {
                                Metodos.hubo_error = true;
                                return Metodos.espacios_comentario + Metodos.error32 + "\n";
                            }
                        } else if (Metodos.estoy_en_asignacion_variables) {
                            //Estoy en una linea de asignacion de variables
                            Metodos.estoy_en_asignacion_variables = false;
                            if (!verifica.valida_asignacion_variables(Metodos.linea_asignacion_variables)) {
                                Metodos.hubo_error = true;
                                return Metodos.espacios_comentario + Metodos.error34 + "\n";
                            } else {
                                //Los elementos de la línea son válidos. Ahora se validan los elementos que son
                                //de dos caracteres y que no pueden ir espaciones en blanco entre ellos.
                                //También, en caso de char se evalua que el texto sea de no más de 30 caracteres
                                //Se valida que los dos puntos y el igual estén pegados
                                if (!Metodos.linea_asignacion_variables_completa.contains(":=")) {
                                    Metodos.hubo_error = true;
                                    return Metodos.espacios_comentario + Metodos.error35 + "\n";
                                }
                                //Se valida que el <= estén pegados
                                if (Metodos.contador_menor_igual > 0) {
                                    String temporal = Metodos.linea_asignacion_variables_completa;
                                    String buscado = "<=";
                                    int contador_encontrados = 0;
                                    while (temporal.indexOf(buscado) > -1) {
                                        temporal = temporal.substring(temporal.indexOf(buscado) + buscado.length(), temporal.length());
                                        contador_encontrados++;
                                    }
                                    if (contador_encontrados < Metodos.contador_menor_igual) {
                                        Metodos.hubo_error = true;
                                        return Metodos.espacios_comentario + Metodos.error36 + "\n";

                                    }
                                }
                                //Se valida que el >= estén pegados
                                if (Metodos.contador_mayor_igual > 0) {
                                    String temporal = Metodos.linea_asignacion_variables_completa;
                                    String buscado = ">=";
                                    int contador_encontrados = 0;
                                    while (temporal.indexOf(buscado) > -1) {
                                        temporal = temporal.substring(temporal.indexOf(buscado) + buscado.length(), temporal.length());
                                        contador_encontrados++;
                                    }
                                    if (contador_encontrados < Metodos.contador_mayor_igual) {
                                        Metodos.hubo_error = true;
                                        return Metodos.espacios_comentario + Metodos.error37 + "\n";
                                    }
                                }

                                //Se valida que el /= estén pegados
                                if (Metodos.contador_diferente > 0) {
                                    String temporal = Metodos.linea_asignacion_variables_completa;
                                    String buscado = "/=";
                                    int contador_encontrados = 0;
                                    while (temporal.indexOf(buscado) > -1) {
                                        temporal = temporal.substring(temporal.indexOf(buscado) + buscado.length(), temporal.length());
                                        contador_encontrados++;
                                    }
                                    if (contador_encontrados < Metodos.contador_diferente) {
                                        Metodos.hubo_error = true;
                                        return Metodos.espacios_comentario + Metodos.error38 + "\n";
                                    }
                                }
                                //en caso de char se evalua que el texto sea de no más de 30 caracteres
                                if (Metodos.evaluar_30caracteres) {
                                    String temporal = Metodos.linea_asignacion_variables_completa;
                                    int primera_comilla = temporal.indexOf("\"");
                                    int segunda_comilla = temporal.indexOf("\"", primera_comilla + 1);
                                    if ((segunda_comilla - primera_comilla - 1) > 30) {
                                        Metodos.hubo_error = true;
                                        return Metodos.espacios_comentario + Metodos.error39 + "\n";
                                    }
                                }
                            }
                        }
                        //no se ha leído un end y viene un end
                        Metodos.leyo_end = true;
                        Metodos.linea_anterior_puntoycoma = false;
                        Metodos.linea_reservada_sola = true;
                        Metodos.estoy_en_read = false;
                        Metodos.estoy_en_print = false;
                        Metodos.estoy_en_definicion_linea_variables = false;
                        Metodos.estoy_en_seccion_variables = false;
                        Metodos.estoy_en_asignacion_variables = false;
                        return "";
                    }
                } else {
                    //Esto sería el else
                    // No es begin y no es un end, y es una palabra reservada entonces se verifica si ya se leyó un begin 
                    // y que no se haya leído un end
                    if (Metodos.estoy_en_seccion_variables) {
                        Metodos.estoy_en_seccion_variables = false;
                        Metodos.ya_paso_variables = true;
                    }
                    if (!Metodos.leyo_begin) {
                        //no se ha leído un begin por lo que NO puede venir una palabra reservada que no sea begin
                        Metodos.hubo_error = true;
                        return Metodos.espacios_comentario + Metodos.error3 + "\n";
                    } else if (Metodos.leyo_end) {
                        //ya se leyó un end por lo que NO puede venir una palabra reservada
                        Metodos.hubo_error = true;
                        return Metodos.espacios_comentario + Metodos.error5 + "\n";
                    } else if (SinPuntoyComaAnterior && Metodos.linea_anterior_puntoycoma) { //Compara si es una linea que no debe llevar punto y coma anterior 
                        //pero la línea si tiene punto y coma al final
                        Metodos.hubo_error = true;
                        return Metodos.espacios_comentario + Metodos.error13 + "\n";
                        /*                    } else if (!Metodos.linea_anterior_puntoycoma && !Metodos.linea_reservada_sola) {
                        //La linea anterior no tiene punto y coma y no es una linea reservada
                        Metodos.hubo_error = true;
                        return Metodos.espacios_comentario + Metodos.error15 + "\n";*/
                    } else {
                        if (Metodos.estoy_en_read) {
                            //Estoy en read
                            Metodos.estoy_en_read = false;
                            if (!verifica.valida_read(Metodos.linea_read)) {
                                Metodos.hubo_error = true;
                                return Metodos.espacios_comentario + Metodos.error28 + "\n";
                            }
                        } else if (Metodos.estoy_en_print) {
                            //Estoy en print
                            Metodos.estoy_en_print = false;
                            if (!verifica.valida_print(Metodos.linea_print)) {
                                Metodos.hubo_error = true;
                                return Metodos.espacios_comentario + Metodos.error30 + "\n";
                            }
                        } else if (Metodos.estoy_en_definicion_linea_variables) {
                            //Estoy en una linea de definición de variables
                            Metodos.estoy_en_definicion_linea_variables = false;
                            if (!verifica.valida_variables(Metodos.linea_variables)) {
                                Metodos.hubo_error = true;
                                return Metodos.espacios_comentario + Metodos.error32 + "\n";
                            }
                        } else if (Metodos.estoy_en_asignacion_variables) {
                            //Estoy en una linea de asignacion de variables
                            Metodos.estoy_en_asignacion_variables = false;
                            if (!verifica.valida_asignacion_variables(Metodos.linea_asignacion_variables)) {
                                Metodos.hubo_error = true;
                                return Metodos.espacios_comentario + Metodos.error34 + "\n";
                            } else {
                                //Los elementos de la línea son válidos. Ahora se validan los elementos que son
                                //de dos caracteres y que no pueden ir espaciones en blanco entre ellos.
                                //Se valida que los dos puntos y el igual estén pegados
                                if (!Metodos.linea_asignacion_variables_completa.contains(":=")) {
                                    Metodos.hubo_error = true;
                                    return Metodos.espacios_comentario + Metodos.error35 + "\n";
                                }
                                //Se valida que el <= estén pegados
                                if (Metodos.contador_menor_igual > 0) {
                                    String temporal = Metodos.linea_asignacion_variables_completa;
                                    String buscado = "<=";
                                    int contador_encontrados = 0;
                                    while (temporal.indexOf(buscado) > -1) {
                                        temporal = temporal.substring(temporal.indexOf(buscado) + buscado.length(), temporal.length());
                                        contador_encontrados++;
                                    }
                                    if (contador_encontrados < Metodos.contador_menor_igual) {
                                        Metodos.hubo_error = true;
                                        return Metodos.espacios_comentario + Metodos.error36 + "\n";
                                    }
                                }
                                //Se valida que el >= estén pegados
                                if (Metodos.contador_mayor_igual > 0) {
                                    String temporal = Metodos.linea_asignacion_variables_completa;
                                    String buscado = ">=";
                                    int contador_encontrados = 0;
                                    while (temporal.indexOf(buscado) > -1) {
                                        temporal = temporal.substring(temporal.indexOf(buscado) + buscado.length(), temporal.length());
                                        contador_encontrados++;
                                    }
                                    if (contador_encontrados < Metodos.contador_mayor_igual) {
                                        Metodos.hubo_error = true;
                                        return Metodos.espacios_comentario + Metodos.error37 + "\n";
                                    }
                                }
                                //Se valida que el /= estén pegados
                                if (Metodos.contador_diferente > 0) {
                                    String temporal = Metodos.linea_asignacion_variables_completa;
                                    String buscado = "/=";
                                    int contador_encontrados = 0;
                                    while (temporal.indexOf(buscado) > -1) {
                                        temporal = temporal.substring(temporal.indexOf(buscado) + buscado.length(), temporal.length());
                                        contador_encontrados++;
                                    }
                                    if (contador_encontrados < Metodos.contador_diferente) {
                                        Metodos.hubo_error = true;
                                        return Metodos.espacios_comentario + Metodos.error38 + "\n";
                                    }
                                }
                                //en caso de char se evalua que el texto sea de no más de 30 caracteres
                                if (Metodos.evaluar_30caracteres) {
                                    String temporal = Metodos.linea_asignacion_variables_completa;
                                    int primera_comilla = temporal.indexOf("\"");
                                    int segunda_comilla = temporal.indexOf("\"", primera_comilla + 1);
                                    if ((segunda_comilla - primera_comilla - 1) > 30) {
                                        Metodos.hubo_error = true;
                                        return Metodos.espacios_comentario + Metodos.error39 + "\n";
                                    }
                                }
                            }
                        }
                        //ya se leyó un begin y no se ha leído un end por lo que puede venir una palabra reservada que no sea begin
                        Metodos.linea_anterior_puntoycoma = false;
                        Metodos.linea_reservada_sola = true;
                        Metodos.estoy_en_comandos = true;
                        Metodos.estoy_en_read = false;
                        Metodos.estoy_en_print = false;
                        Metodos.estoy_en_definicion_linea_variables = false;
                        Metodos.estoy_en_seccion_variables = false;
                        Metodos.estoy_en_asignacion_variables = false;
                        return "";
                    }
                }
            } else if (reservada_puntoycoma) {
                if (Metodos.estoy_en_seccion_variables) {
                    Metodos.estoy_en_seccion_variables = false;
                    Metodos.ya_paso_variables = true;
                }
                if (!Metodos.leyo_begin) {
                    //no se ha leído un begin por lo que NO puede venir una palabra reservada que no sea begin
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error3 + "\n";
                } else if (Metodos.leyo_end) {
                    //ya se leyó un end por lo que NO puede venir una palabra reservada
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error5 + "\n";
                } else if (SinPuntoyComaAnterior && Metodos.linea_anterior_puntoycoma) {
                    //La linea anterior SI tiene punto y coma y NO debe tener
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error13 + "\n";
                } else if (!verifica.validar_reservadapuntoycoma(Parteslinea)) {
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error26 + "\n";
                } else {
                    if (Metodos.estoy_en_read) {
                        //Estoy en read
                        Metodos.estoy_en_read = false;
                        if (!verifica.valida_read(Metodos.linea_read)) {
                            Metodos.hubo_error = true;
                            return Metodos.espacios_comentario + Metodos.error28 + "\n";
                        }
                    } else if (Metodos.estoy_en_print) {
                        //Estoy en print
                        Metodos.estoy_en_print = false;
                        if (!verifica.valida_print(Metodos.linea_print)) {
                            Metodos.hubo_error = true;
                            return Metodos.espacios_comentario + Metodos.error30 + "\n";
                        }
                    } else if (Metodos.estoy_en_definicion_linea_variables) {
                        //Estoy en una linea de definición de variables
                        Metodos.estoy_en_definicion_linea_variables = false;
                        if (!verifica.valida_variables(Metodos.linea_variables)) {
                            Metodos.hubo_error = true;
                            return Metodos.espacios_comentario + Metodos.error32 + "\n";
                        }
                    } else if (Metodos.estoy_en_asignacion_variables) {
                        //Estoy en una linea de asignacion de variables
                        Metodos.estoy_en_asignacion_variables = false;
                        if (!verifica.valida_asignacion_variables(Metodos.linea_asignacion_variables)) {
                            Metodos.hubo_error = true;
                            return Metodos.espacios_comentario + Metodos.error34 + "\n";
                        } else {
                            //Los elementos de la línea son válidos. Ahora se validan los elementos que son
                            //de dos caracteres y que no pueden ir espaciones en blanco entre ellos.
                            //Se valida que los dos puntos y el igual estén pegados
                            if (!Metodos.linea_asignacion_variables_completa.contains(":=")) {
                                Metodos.hubo_error = true;
                                return Metodos.espacios_comentario + Metodos.error35 + "\n";
                            }

                            //Se valida que el <= estén pegados
                            if (Metodos.contador_menor_igual > 0) {
                                String temporal = Metodos.linea_asignacion_variables_completa;
                                String buscado = "<=";
                                int contador_encontrados = 0;
                                while (temporal.indexOf(buscado) > -1) {
                                    temporal = temporal.substring(temporal.indexOf(buscado) + buscado.length(), temporal.length());
                                    contador_encontrados++;
                                }
                                if (contador_encontrados < Metodos.contador_menor_igual) {
                                    Metodos.hubo_error = true;
                                    return Metodos.espacios_comentario + Metodos.error36 + "\n";
                                }
                            }
                            //Se valida que el >= estén pegados
                            if (Metodos.contador_mayor_igual > 0) {
                                String temporal = Metodos.linea_asignacion_variables_completa;
                                String buscado = ">=";
                                int contador_encontrados = 0;
                                while (temporal.indexOf(buscado) > -1) {
                                    temporal = temporal.substring(temporal.indexOf(buscado) + buscado.length(), temporal.length());
                                    contador_encontrados++;
                                }
                                if (contador_encontrados < Metodos.contador_mayor_igual) {
                                    Metodos.hubo_error = true;
                                    return Metodos.espacios_comentario + Metodos.error37 + "\n";
                                }
                            }

                            //Se valida que el /= estén pegados
                            if (Metodos.contador_diferente > 0) {
                                String temporal = Metodos.linea_asignacion_variables_completa;
                                String buscado = "/=";
                                int contador_encontrados = 0;
                                while (temporal.indexOf(buscado) > -1) {
                                    temporal = temporal.substring(temporal.indexOf(buscado) + buscado.length(), temporal.length());
                                    contador_encontrados++;
                                }
                                if (contador_encontrados < Metodos.contador_diferente) {
                                    Metodos.hubo_error = true;
                                    return Metodos.espacios_comentario + Metodos.error38 + "\n";
                                }
                            }
                            //en caso de char se evalua que el texto sea de no más de 30 caracteres
                            if (Metodos.evaluar_30caracteres) {
                                String temporal = Metodos.linea_asignacion_variables_completa;
                                int primera_comilla = temporal.indexOf("\"");
                                int segunda_comilla = temporal.indexOf("\"", primera_comilla + 1);
                                if ((segunda_comilla - primera_comilla - 1) > 30) {
                                    Metodos.hubo_error = true;
                                    return Metodos.espacios_comentario + Metodos.error39 + "\n";
                                }
                            }
                        }
                    }
                    if (verifica.termina_con_puntoycoma(Parteslinea)) {
                        Metodos.linea_anterior_puntoycoma = true;
                    } else {
                        Metodos.linea_anterior_puntoycoma = false;
                    }
                    Metodos.estoy_en_comandos = true;
                    Metodos.linea_reservada_sola = false;
                    Metodos.estoy_en_read = false;
                    Metodos.estoy_en_print = false;
                    Metodos.estoy_en_definicion_linea_variables = false;
                    Metodos.estoy_en_seccion_variables = false;
                    Metodos.estoy_en_asignacion_variables = false;
                    //ya se leyó un begin y no se ha leído un end por lo que puede venir una palabra reservada que no sea begin
                    return "";
                }
            } else if (Metodos.estoy_en_print) {
                Metodos.contador_lineas_comando++;
                if (Metodos.contador_lineas_comando > 5) {
                    Metodos.hubo_error = true;
                    Metodos.estoy_en_print = false;
                    return Metodos.espacios_comentario + Metodos.error14 + "\n";
                }
                if (verifica.termina_con_puntoycoma(Parteslinea)) {
                    Metodos.linea_anterior_puntoycoma = true;
                    Metodos.estoy_en_print = false;
                    Metodos.contador_lineas_comando = 0;
                    verifica.copiar_en_print(Parteslinea);
                    if (!verifica.valida_print(Metodos.linea_print)) {
                        Metodos.hubo_error = true;
                        return Metodos.espacios_comentario + Metodos.error29 + "\n";
                    } else {
                        Metodos.estoy_en_comandos = true;
                        Metodos.linea_reservada_sola = false;
                        return "";
                    }
                } else {
                    Metodos.linea_anterior_puntoycoma = false;
                    verifica.copiar_en_print(Parteslinea);
                    return "";
                }
            } else if (Metodos.estoy_en_read) {
                Metodos.contador_lineas_comando++;
                if (Metodos.contador_lineas_comando > 5) {
                    Metodos.hubo_error = true;
                    Metodos.estoy_en_read = false;
                    return Metodos.espacios_comentario + Metodos.error14 + "\n";
                }
                if (verifica.termina_con_puntoycoma(Parteslinea)) {
                    Metodos.linea_anterior_puntoycoma = true;
                    Metodos.contador_lineas_comando = 0;
                    Metodos.estoy_en_read = false;
                    verifica.copiar_en_read(Parteslinea);
                    if (!verifica.valida_read(Metodos.linea_read)) {
                        Metodos.hubo_error = true;
                        return Metodos.espacios_comentario + Metodos.error27 + "\n";
                    } else {
                        Metodos.estoy_en_comandos = true;
                        Metodos.linea_reservada_sola = false;
                        return "";
                    }
                } else {
                    Metodos.linea_anterior_puntoycoma = false;
                    verifica.copiar_en_read(Parteslinea);
                    return "";
                }
            } else if (es_print) {
                if (Metodos.estoy_en_seccion_variables) {
                    Metodos.estoy_en_seccion_variables = false;
                    Metodos.ya_paso_variables = true;
                }
                if (!Metodos.leyo_begin) {
                    //no se ha leído un begin por lo que NO puede venir una etiqueta
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error3 + "\n";
                } else if (Metodos.leyo_end) {
                    //ya se leyó un end por lo que NO puede venir una palabra reservada
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error5 + "\n";
                } else if (!Metodos.linea_anterior_puntoycoma && !Metodos.linea_reservada_sola) {
                    //La linea anterior no tiene punto y coma y no es una linea reservada
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error15 + "\n";
                } else {
                    //Se limpia si hay algo en la línea del print
                    Metodos.linea_print.clear();
                    Metodos.contador_lineas_comando++;
                    Metodos.linea_reservada_sola = false;
                    if (Metodos.contador_lineas_comando > 5) {
                        Metodos.hubo_error = true;
                        return Metodos.espacios_comentario + Metodos.error14 + "\n";
                    }
                    verifica.copiar_en_print(Parteslinea);
                    if (verifica.termina_con_puntoycoma(Parteslinea)) {
                        Metodos.linea_anterior_puntoycoma = true;
                        Metodos.contador_lineas_comando = 0;
                        if (!verifica.valida_print(Metodos.linea_print)) {
                            Metodos.hubo_error = true;
                            return Metodos.espacios_comentario + Metodos.error29 + "\n";
                        } else {
                            Metodos.estoy_en_comandos = true;
                            return "";
                        }
                    } else {
                        Metodos.linea_anterior_puntoycoma = false;
                        Metodos.estoy_en_print = true;
                    }
                    return "";
                }
            } else if (es_read) {
                if (Metodos.estoy_en_seccion_variables) {
                    Metodos.estoy_en_seccion_variables = false;
                    Metodos.ya_paso_variables = true;
                }
                if (!Metodos.leyo_begin) {
                    //no se ha leído un begin por lo que NO puede venir una etiqueta
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error3 + "\n";
                } else if (Metodos.leyo_end) {
                    //ya se leyó un end por lo que NO puede venir una palabra reservada
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error5 + "\n";
                } else if (!Metodos.linea_anterior_puntoycoma && !Metodos.linea_reservada_sola) {
                    //La linea anterior no tiene punto y coma y no es una linea reservada
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error15 + "\n";
                } else {
                    //Se limpia si hay algo en la línea del read
                    Metodos.linea_read.clear();
                    Metodos.contador_lineas_comando++;
                    Metodos.linea_reservada_sola = false;
                    if (Metodos.contador_lineas_comando > 5) {
                        Metodos.hubo_error = true;
                        return Metodos.espacios_comentario + Metodos.error14 + "\n";
                    }
                    verifica.copiar_en_read(Parteslinea);
                    if (verifica.termina_con_puntoycoma(Parteslinea)) {
                        Metodos.linea_anterior_puntoycoma = true;
                        Metodos.contador_lineas_comando = 0;
                        if (!verifica.valida_read(Metodos.linea_read)) {
                            Metodos.hubo_error = true;
                            return Metodos.espacios_comentario + Metodos.error27 + "\n";
                        } else {
                            Metodos.estoy_en_comandos = true;
                            return "";
                        }
                    } else {
                        Metodos.linea_anterior_puntoycoma = false;
                        Metodos.estoy_en_read = true;
                    }
                    return "";
                }
            } else if (Metodos.estoy_en_asignacion_variables) {
                Metodos.contador_lineas_comando++;
                if (Metodos.contador_lineas_comando > 5) {
                    Metodos.hubo_error = true;
                    Metodos.estoy_en_asignacion_variables = false;
                    return Metodos.espacios_comentario + Metodos.error14 + "\n";
                }
                if (verifica.termina_con_puntoycoma(Parteslinea)) {
                    Metodos.estoy_en_asignacion_variables = false;
                    Metodos.linea_anterior_puntoycoma = true;
                    Metodos.contador_lineas_comando = 0;
                    Metodos.linea_asignacion_variables_completa = Metodos.linea_asignacion_variables_completa + " " + Linea;
                    verifica.copiar_en_asignacion_variables(Parteslinea);
                    if (!verifica.valida_asignacion_variables(Metodos.linea_asignacion_variables)) {
                        Metodos.hubo_error = true;
                        Metodos.estoy_en_read = false;
                        return Metodos.espacios_comentario + Metodos.error27 + "\n";
                    } else {

                        //Los elementos de la línea son válidos. Ahora se validan los elementos que son
                        //de dos caracteres y que no pueden ir espaciones en blanco entre ellos.
                        //Se valida que los dos puntos y el igual estén pegados
                        if (!Metodos.linea_asignacion_variables_completa.contains(":=")) {
                            Metodos.hubo_error = true;
                            return Metodos.espacios_comentario + Metodos.error35 + "\n";
                        }
                        //Se valida que el <= estén pegados
                        if (Metodos.contador_menor_igual > 0) {
                            String temporal = Metodos.linea_asignacion_variables_completa;
                            String buscado = "<=";
                            int contador_encontrados = 0;
                            while (temporal.indexOf(buscado) > -1) {
                                temporal = temporal.substring(temporal.indexOf(buscado) + buscado.length(), temporal.length());
                                contador_encontrados++;
                            }
                            if (contador_encontrados < Metodos.contador_menor_igual) {
                                Metodos.hubo_error = true;
                                return Metodos.espacios_comentario + Metodos.error36 + "\n";

                            }
                        }

                        //Se valida que el >= estén pegados
                        if (Metodos.contador_mayor_igual > 0) {
                            String temporal = Metodos.linea_asignacion_variables_completa;
                            String buscado = ">=";
                            int contador_encontrados = 0;
                            while (temporal.indexOf(buscado) > -1) {
                                temporal = temporal.substring(temporal.indexOf(buscado) + buscado.length(), temporal.length());
                                contador_encontrados++;
                            }
                            if (contador_encontrados < Metodos.contador_mayor_igual) {
                                Metodos.hubo_error = true;
                                return Metodos.espacios_comentario + Metodos.error37 + "\n";
                            }
                        }
                        //Se valida que el /= estén pegados
                        if (Metodos.contador_diferente > 0) {
                            String temporal = Metodos.linea_asignacion_variables_completa;
                            String buscado = "/=";
                            int contador_encontrados = 0;
                            while (temporal.indexOf(buscado) > -1) {
                                temporal = temporal.substring(temporal.indexOf(buscado) + buscado.length(), temporal.length());
                                contador_encontrados++;
                            }
                            if (contador_encontrados < Metodos.contador_diferente) {
                                Metodos.hubo_error = true;
                                return Metodos.espacios_comentario + Metodos.error38 + "\n";
                            }
                        }
                        //en caso de char se evalua que el texto sea de no más de 30 caracteres
                        if (Metodos.evaluar_30caracteres) {
                            String temporal = Metodos.linea_asignacion_variables_completa;
                            int primera_comilla = temporal.indexOf("\"");
                            int segunda_comilla = temporal.indexOf("\"", primera_comilla + 1);
                            if ((segunda_comilla - primera_comilla - 1) > 30) {
                                Metodos.hubo_error = true;
                                return Metodos.espacios_comentario + Metodos.error39 + "\n";
                            }
                        }
                        Metodos.estoy_en_comandos = true;
                        Metodos.linea_reservada_sola = false;
                        Metodos.estoy_en_read = false;
                        return "";
                    }
                } else {
                    Metodos.linea_anterior_puntoycoma = false;
                    Metodos.linea_asignacion_variables_completa = Metodos.linea_asignacion_variables_completa + " " + Linea;
                    verifica.copiar_en_asignacion_variables(Parteslinea);
                    return "";
                }
            } else if (es_etiqueta) {
                if (Metodos.estoy_en_seccion_variables) {
                    Metodos.estoy_en_seccion_variables = false;
                    Metodos.ya_paso_variables = true;
                }
                String etiquetasinpuntos;
                etiquetasinpuntos = Parteslinea.get(0);
                if (!Metodos.leyo_begin) {
                    //no se ha leído un begin por lo que NO puede venir una etiqueta
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error3 + "\n";
                } else if (Metodos.leyo_end) {
                    //ya se leyó un end por lo que NO puede venir una palabra reservada
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error5 + "\n";
                } else if (verifica.variable_existe(etiquetasinpuntos)) {
                    //la linea inicia con una variable que existe y no es una etiqueta
                    //Se limpia si hay algo en la línea del asignacion_variables
                    Metodos.linea_asignacion_variables.clear();
                    Metodos.contador_lineas_comando++;
                    Metodos.linea_reservada_sola = false;
                    if (Metodos.contador_lineas_comando > 5) {
                        Metodos.hubo_error = true;
                        return Metodos.espacios_comentario + Metodos.error14 + "\n";
                    }
                    Metodos.linea_asignacion_variables_completa = Metodos.linea_asignacion_variables_completa + " " + Linea;
                    verifica.copiar_en_asignacion_variables(Parteslinea);
                    if (verifica.termina_con_puntoycoma(Parteslinea)) {
                        Metodos.linea_anterior_puntoycoma = true;
                        Metodos.contador_lineas_comando = 0;
                        //se verfica la linea de asignación de variables
                        if (!verifica.valida_asignacion_variables(Metodos.linea_asignacion_variables)) {
                            Metodos.hubo_error = true;
                            return Metodos.espacios_comentario + Metodos.error33 + "\n";
                        } else {
                            //Los elementos de la línea son válidos. Ahora se validan los elementos que son
                            //de dos caracteres y que no pueden ir espaciones en blanco entre ellos.
                            //Se valida que los dos puntos y el igual estén pegados
                            if (!Metodos.linea_asignacion_variables_completa.contains(":=")) {
                                Metodos.hubo_error = true;
                                Metodos.estoy_en_asignacion_variables = false;
                                return Metodos.espacios_comentario + Metodos.error35 + "\n";
                            }

                            //Se valida que el <= estén pegados
                            if (Metodos.contador_menor_igual > 0) {
                                String temporal = Metodos.linea_asignacion_variables_completa;
                                String buscado = "<=";
                                int contador_encontrados = 0;
                                while (temporal.indexOf(buscado) > -1) {
                                    temporal = temporal.substring(temporal.indexOf(buscado) + buscado.length(), temporal.length());
                                    contador_encontrados++;
                                }
                                if (contador_encontrados < Metodos.contador_menor_igual) {
                                    Metodos.hubo_error = true;
                                    Metodos.estoy_en_asignacion_variables = false;
                                    return Metodos.espacios_comentario + Metodos.error36 + "\n";

                                }
                            }

                            //Se valida que el >= estén pegados
                            if (Metodos.contador_mayor_igual > 0) {
                                String temporal = Metodos.linea_asignacion_variables_completa;
                                String buscado = ">=";
                                int contador_encontrados = 0;
                                while (temporal.indexOf(buscado) > -1) {
                                    temporal = temporal.substring(temporal.indexOf(buscado) + buscado.length(), temporal.length());
                                    contador_encontrados++;
                                }
                                if (contador_encontrados < Metodos.contador_mayor_igual) {
                                    Metodos.hubo_error = true;
                                    Metodos.estoy_en_asignacion_variables = false;
                                    return Metodos.espacios_comentario + Metodos.error37 + "\n";
                                }
                            }

                            //Se valida que el /= estén pegados
                            if (Metodos.contador_diferente > 0) {
                                String temporal = Metodos.linea_asignacion_variables_completa;
                                String buscado = "/=";
                                int contador_encontrados = 0;
                                while (temporal.indexOf(buscado) > -1) {
                                    temporal = temporal.substring(temporal.indexOf(buscado) + buscado.length(), temporal.length());
                                    contador_encontrados++;
                                }
                                if (contador_encontrados < Metodos.contador_diferente) {
                                    Metodos.hubo_error = true;
                                    Metodos.estoy_en_asignacion_variables = false;
                                    return Metodos.espacios_comentario + Metodos.error38 + "\n";
                                }
                            }
                            //en caso de char se evalua que el texto sea de no más de 30 caracteres
                            if (Metodos.evaluar_30caracteres) {
                                String temporal = Metodos.linea_asignacion_variables_completa;
                                int primera_comilla = temporal.indexOf("\"");
                                int segunda_comilla = temporal.indexOf("\"", primera_comilla + 1);
                                if ((segunda_comilla - primera_comilla - 1) > 30) {
                                    Metodos.hubo_error = true;
                                    return Metodos.espacios_comentario + Metodos.error39 + "\n";
                                }
                            }
                            Metodos.estoy_en_comandos = true;
                            return "";
                        }
                    } else {
                        Metodos.linea_anterior_puntoycoma = false;
                        Metodos.estoy_en_asignacion_variables = true;
                    }
                    return "";
                } else if (!verifica.etiqueta_esta_sola(Parteslinea)) { // Se verifica que la etiqueta esté sola
                    //No está sola
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error6 + "\n";
                } else if (!verifica.verificador_identificador(etiquetasinpuntos)) {
                    //no cumple con los requerimientos de etiqueta
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error17 + "\n";
                } else if (verifica.identificador_reservado(etiquetasinpuntos)) {
                    //no cumple con los requerimientos de etiqueta
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error19 + "\n";
                } else if (verifica.etiqueta_existe(etiquetasinpuntos)) { //La etiqueta es válida, así que valida si ya existe entre las etiquetas ya creadas
                    //Ya existe
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error7 + "\n";
                } else if (verifica.variable_existe(etiquetasinpuntos)) { //La etiqueta es válida, así que valida si ya existe entre las variables ya creadas
                    //Ya existe
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error7 + "\n";
                } else if (!Metodos.linea_anterior_puntoycoma && !Metodos.linea_reservada_sola) {
                    //La linea anterior no tiene punto y coma y no es una linea reservada
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error15 + "\n";
                } else {
                    //la etiqueta no existe así que se inserta en la etiquetas
                    Metodos.etiquetas.add(etiquetasinpuntos);
                    Metodos.estoy_en_comandos = true;
                    Metodos.linea_anterior_puntoycoma = false;
                    Metodos.linea_reservada_sola = true;
                    Metodos.estoy_en_read = false;
                    Metodos.estoy_en_print = false;
                    Metodos.estoy_en_definicion_linea_variables = false;
                    Metodos.estoy_en_asignacion_variables = false;
                    return "";
                }
            } else if (es_etiquetaGOTO) {
                if (Metodos.estoy_en_seccion_variables) {
                    Metodos.estoy_en_seccion_variables = false;
                    Metodos.ya_paso_variables = true;
                }
                if (!verifica.GOTOprimero(Parteslinea)) { //se verifica que el GOTO esté de primero
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error8 + "\n";
                } else if (!verifica.GOTO2_3elementos(Parteslinea)) { //se verifica que la línea tenga solo 2 elementos
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error9 + "\n";
                } else if (!Metodos.leyo_begin) {
                    //no se ha leído un begin por lo que NO puede venir una etiqueta
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error3 + "\n";
                } else if (Metodos.leyo_end) {
                    //ya se leyó un end por lo que NO puede venir una palabra reservada
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error5 + "\n";
                } else if (!verifica.etiqueta_existe(Parteslinea.get(1))) {//se verifica que la etiqueta exista
                    // Error si la etiqueta no existe hacia arriba
                    // Se agrega en un arraylist que contiene las etiquetas a buscar hacia abajo
                    // después de haber recorrido el archivo
                    Metodos.etiquetas_buscar.add(Parteslinea.get(1));
                    Metodos.estoy_en_comandos = true;
                    return Metodos.espacios_comentario_etiqueta + Metodos.error10 + "\n";
                } else if (!Metodos.linea_anterior_puntoycoma && !Metodos.linea_reservada_sola) {
                    //La linea anterior no tiene punto y coma y no es una linea reservada
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error15 + "\n";
                } else {
                    Metodos.estoy_en_comandos = true;
                    if (verifica.termina_con_puntoycoma(Parteslinea)) {
                        Metodos.linea_anterior_puntoycoma = true;
                    } else {
                        Metodos.linea_anterior_puntoycoma = false;
                    }
                    Metodos.linea_reservada_sola = false;
                    Metodos.estoy_en_read = false;
                    Metodos.estoy_en_print = false;
                    Metodos.estoy_en_definicion_linea_variables = false;
                    Metodos.estoy_en_asignacion_variables = false;
                    return "";
                }
            } else if (reservada_final) {
                if (Metodos.estoy_en_seccion_variables) {
                    Metodos.estoy_en_seccion_variables = false;
                    Metodos.ya_paso_variables = true;
                }
                if (!verifica.reservada_final(Parteslinea)) { //se verifica que la palabra reservada esté al final
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error12 + "\n";
                } else if (!Metodos.leyo_begin) {
                    //no se ha leído un begin por lo que NO puede venir una etiqueta
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error3 + "\n";
                } else if (Metodos.leyo_end) {
                    //ya se leyó un end por lo que NO puede venir una palabra reservada
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error5 + "\n";
                } else if (!Metodos.linea_anterior_puntoycoma && !Metodos.linea_reservada_sola) {
                    //La linea anterior no tiene punto y coma y no es una linea reservada
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error15 + "\n";
                } else {
                    Metodos.linea_anterior_puntoycoma = false;
                    Metodos.linea_reservada_sola = true;
                    Metodos.estoy_en_comandos = true;
                    Metodos.estoy_en_read = false;
                    Metodos.estoy_en_print = false;
                    Metodos.estoy_en_definicion_linea_variables = false;
                    Metodos.estoy_en_asignacion_variables = false;
                    return "";
                }
            } else if (Metodos.estoy_en_definicion_linea_variables) {
                Metodos.contador_lineas_comando++;
                if (Metodos.contador_lineas_comando > 5) {
                    Metodos.hubo_error = true;
                    Metodos.estoy_en_definicion_linea_variables = false;
                    return Metodos.espacios_comentario + Metodos.error14 + "\n";
                }
                if (verifica.termina_con_puntoycoma(Parteslinea)) {
                    Metodos.linea_anterior_puntoycoma = true;
                    Metodos.contador_lineas_comando = 0;
                    verifica.copiar_en_variables(Parteslinea);
                    if (!verifica.valida_variables(Metodos.linea_variables)) {
                        Metodos.hubo_error = true;
                        Metodos.estoy_en_definicion_linea_variables = false;
                        return Metodos.espacios_comentario + Metodos.error31 + "\n";
                    } else {
                        Metodos.linea_reservada_sola = false;
                        Metodos.estoy_en_definicion_linea_variables = false;
                        return "";
                    }
                } else {
                    Metodos.linea_anterior_puntoycoma = false;
                    verifica.copiar_en_variables(Parteslinea);
                    return "";
                }
            } else if (es_definicion_variable) {
                if (Metodos.ya_paso_variables) {
                    //ya pasó la definición de variables
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error21 + "\n";
                }
                if (Metodos.estoy_en_comandos) {
                    //Ya se inició la definición de comandos por lo que no puede venir
                    //definición de variables
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error25 + "\n";
                } else if (!Metodos.leyo_begin) {
                    //no se ha leído un begin por lo que NO puede venir una etiqueta
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error3 + "\n";
                } else if (Metodos.leyo_end) {
                    //ya se leyó un end por lo que NO puede venir una palabra reservada
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error5 + "\n";
                } else if (!Metodos.linea_anterior_puntoycoma && !Metodos.linea_reservada_sola) {
                    //La linea anterior no tiene punto y coma y no es una linea reservada
                    Metodos.hubo_error = true;
                    return Metodos.espacios_comentario + Metodos.error15 + "\n";
                } else {
                    Metodos.estoy_en_seccion_variables = true;
                    //Se limpia si hay algo en la línea de la definición de variables
                    Metodos.linea_variables.clear();
                    Metodos.contador_lineas_comando++;
                    Metodos.linea_reservada_sola = false;
                    if (Metodos.contador_lineas_comando > 5) {
                        Metodos.hubo_error = true;
                        Metodos.contador_lineas_comando = 0;
                        return Metodos.espacios_comentario + Metodos.error14 + "\n";
                    }
                    verifica.copiar_en_variables(Parteslinea);
                    if (verifica.termina_con_puntoycoma(Parteslinea)) {
                        Metodos.linea_anterior_puntoycoma = true;
                        Metodos.contador_lineas_comando = 0;
                        if (!verifica.valida_variables(Metodos.linea_variables)) {
                            Metodos.hubo_error = true;
                            return Metodos.espacios_comentario + Metodos.error31 + "\n";
                        } else {
                            Metodos.estoy_en_read = false;
                            Metodos.estoy_en_print = false;
                            return "";
                        }
                    } else {
                        Metodos.linea_anterior_puntoycoma = false;
                        Metodos.estoy_en_read = false;
                        Metodos.estoy_en_print = false;
                        Metodos.estoy_en_definicion_linea_variables = true;
                        Metodos.estoy_en_asignacion_variables = false;
                    }
                    return "";
                }
            } else if (SinPuntoyComaAnterior && Metodos.linea_anterior_puntoycoma) {
                if (Metodos.estoy_en_seccion_variables) {
                    Metodos.estoy_en_seccion_variables = false;
                    Metodos.ya_paso_variables = true;
                }
                Metodos.hubo_error = true;
                return Metodos.espacios_comentario + Metodos.error13 + "\n";
            } else {
                if (Metodos.estoy_en_seccion_variables) {
                    Metodos.estoy_en_seccion_variables = false;
                    Metodos.ya_paso_variables = true;
                }
                Metodos.linea_reservada_sola = false;
                Metodos.contador_lineas_comando++;
                if (Metodos.contador_lineas_comando > 5) {
                    Metodos.hubo_error = true;
                    //System.out.println(Metodos.error14);
                    return Metodos.espacios_comentario + Metodos.error14 + "\n";
                } else if (verifica.termina_con_puntoycoma(Parteslinea)) {
                    Metodos.linea_anterior_puntoycoma = true;
                    Metodos.contador_lineas_comando = 0;
                } else {
                    Metodos.linea_anterior_puntoycoma = false;
                }
                Metodos.estoy_en_comandos = true;
                Metodos.estoy_en_read = false;
                Metodos.estoy_en_print = false;
                Metodos.estoy_en_definicion_linea_variables = false;
                Metodos.estoy_en_asignacion_variables = false;
                return "";
            }
        } else {
            // Se está en comentarios
            // verifico si la linea contiene la palabra que cierra el comentario
            int pos_final = verifica.verifica_final_comentarios(Parteslinea, 0, Parteslinea.size() - 1);
            if (pos_final > -1) {
                //encontró el final del comentario
                Metodos.estoy_en_comentarios = false;
                //se verifica si el final del comentario está al final de la línea
                if (pos_final < (Parteslinea.size() - 1)) {
                    // el final del comentario NO está al final de la línea
                    return Metodos.espacios_comentario + Metodos.error18 + "\n";
                } else {
                    // el final del comentario SI está al final de la línea
                    return "";
                }
            } else {
                //No se encontró el final del comentario
                return "";
            }
        }
    }
}
