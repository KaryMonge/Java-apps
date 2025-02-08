/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*Nueva_version*/
package Logica;

import java.util.ArrayList;

/**
 *
 * @author karin
 */
public class Verificador_Sintaxis {

    public boolean verificador_identificador(String identificador) {
        char c;
        //se verifica la longitud del identificador
        if (identificador.length() > 20) {
            return false;
        }
        //se verifica que esté formado por minúsculas o números o guión bajo
        //y que la primera ni la última letra sean guion bajo
        for (int i = 0; i < identificador.length(); i++) {
            c = identificador.charAt(i);
            if (i == 0 && c == '_') {
                return false;
            }
            if (i == (identificador.length() - 1) && c == '_') {
                return false;
            }
            //Si el caracter no cumple: estar entre a y z o estar entre 0 y 9 o ser _ 
            //no cumple con ser un identificador
            if (!((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '_')) {
                return false;
            }
        }
        return true;
    }

    public boolean valida_read(ArrayList<String> Partesread) {
        //Se valida la expresion read:
        //read(variable)
        // o
        //read(variable);

        if (!(Partesread.get(0).equals("read"))) {
            return false;
        }

        if (!(Partesread.get(1).equals("("))) {
            return false;
        }

        //se valida el nombre de variable
        if (!variable_existe(Partesread.get(2))) {
            return false;
        }

        if (!(Partesread.get(3).equals(")"))) {
            return false;
        }

        if (Partesread.size() == 5) {
            if (!(Partesread.get(4).equals(";"))) {
                return false;
            }
        }

        if (Partesread.size() > 5) {
            return false;
        }

        return true;
    }

    public boolean valida_asignacion_variables(ArrayList<String> Partesasignacionvariables) {

        //se evalua que tenga al menos 4 de tamano, variable := algo
        if (Partesasignacionvariables.size() < 4) {
            return false;
        }

        //se evalua que tenga la 2da posición sea :, variable := algo
        if (!Partesasignacionvariables.get(1).equals(":")) {
            return false;
        }

        //se evalua que tenga la 3era posición sea =, variable := algo
        if (!Partesasignacionvariables.get(2).equals("=")) {
            return false;
        }

        if ((Partesasignacionvariables.size() == 4) && (Partesasignacionvariables.get(3).equals(";"))) {
            return false;
        }

        String variable_evaluada = Partesasignacionvariables.get(0);
        //se obtiene el tipo de variable que se está evaluando
        Metodos.contador_menor_igual = 0;
        Metodos.contador_mayor_igual = 0;
        Metodos.contador_diferente = 0;
        Metodos.evaluar_30caracteres = false;

        if (Metodos.variables_int.contains(variable_evaluada)) {
            //Es un entero
            return valida_int(Partesasignacionvariables);
        } else if (Metodos.variables_real.contains(variable_evaluada)) {
            //Es un real
            return valida_real(Partesasignacionvariables);
        } else if (Metodos.variables_char.contains(variable_evaluada)) {
            //Es un char
            return valida_char(Partesasignacionvariables);
        }
        return false;
    }

    public boolean valida_int(ArrayList<String> Partesasignacionvariables) {

        int tam;

        if (Partesasignacionvariables.get(Partesasignacionvariables.size() - 1).equals(";")) {
            tam = (Partesasignacionvariables.size() - 2);
        } else {
            tam = (Partesasignacionvariables.size() - 1);
        }


        for (int i = 3; i <= tam; i++) {
            String parte_evaluar = Partesasignacionvariables.get(i);
            //Se valida si es una variable válida
            if (!variable_int_existe(parte_evaluar)) {
                // no es una variable válida entonces
                // se valida si es un paréntesis
                if (!valida_operadores_agrupacion(parte_evaluar)) {
                    //no es un paréntesis entonces
                    //se valida si es un operador relacional en letras
                    if (!valida_operadores_relacionales_letras(parte_evaluar)) {
                        //no es un operador relacional en letras entonces
                        //se valida si es un operador relacional en simbolos
                        if (!valida_operadores_relacionales_simbolos(parte_evaluar)) {
                            //no es un operador relacional en símbolos entonces
                            //se valida si es un operador aritmético
                            if (!valida_operadores_aritmeticos(parte_evaluar)) {
                                if (!valida_constante_entero(Partesasignacionvariables, parte_evaluar, i)) {
                                    return false;
                                }
                            } else {
                                //si es un operador aritmético entonces
                                //entonces se valida si es /=
                                if ((i < tam) && (Partesasignacionvariables.get(i).equals("/"))) {
                                    if (Partesasignacionvariables.get(i + 1).equals("=")) {
                                        //sigue un diferente
                                        Metodos.contador_diferente++;
                                    }
                                }
                            }
                        } else {
                            //si es un operador relacional en simbolos entonces
                            //entonces se valida si es <= ó >=
                            if ((i < tam) && (Partesasignacionvariables.get(i).equals("<"))) {
                                if (Partesasignacionvariables.get(i + 1).equals("=")) {
                                    //sigue un menor o igual
                                    Metodos.contador_menor_igual++;
                                }

                            } else if ((i < tam) && (Partesasignacionvariables.get(i).equals(">"))) {
                                if (Partesasignacionvariables.get(i + 1).equals("=")) {
                                    //sigue un mayor o igual
                                    Metodos.contador_mayor_igual++;
                                }
                            }
                        }

                    }

                }

            }

        }
        return true;
    }

    public boolean valida_real(ArrayList<String> Partesasignacionvariables) {
        int tam;

        if (Partesasignacionvariables.get(Partesasignacionvariables.size() - 1).equals(";")) {
            tam = (Partesasignacionvariables.size() - 2);
        } else {
            tam = (Partesasignacionvariables.size() - 1);
        }

        for (int i = 3; i <= tam; i++) {
            String parte_evaluar = Partesasignacionvariables.get(i);
            //Se valida si es una variable válida
            if (!variable_real_existe(parte_evaluar)) {
                // no es una variable válida entonces
                // se valida si es un paréntesis
                if (!valida_operadores_agrupacion(parte_evaluar)) {
                    //no es un paréntesis entonces
                    //se valida si es un operador relacional en letras
                    if (!valida_operadores_relacionales_letras(parte_evaluar)) {
                        //no es un operador relacional en letras entonces
                        //se valida si es un operador relacional en simbolos
                        if (!valida_operadores_relacionales_simbolos(parte_evaluar)) {
                            //no es un operador relacional en símbolos entonces
                            //se valida si es un operador aritmético
                            if (!valida_operadores_aritmeticos(parte_evaluar)) {
                                if (!valida_constante_real(Partesasignacionvariables, parte_evaluar, i)) {
                                    return false;
                                }
                            } else {
                                //si es un operador aritmético entonces
                                //entonces se valida si es /=
                                if ((i < tam) && (Partesasignacionvariables.get(i).equals("/"))) {
                                    if (Partesasignacionvariables.get(i + 1).equals("=")) {
                                        //sigue un diferente
                                        Metodos.contador_diferente++;
                                    }
                                }
                            }
                        } else {
                            //si es un operador relacional en simbolos entonces
                            //entonces se valida si es <= ó >=
                            if ((i < tam) && (Partesasignacionvariables.get(i).equals("<"))) {
                                if (Partesasignacionvariables.get(i + 1).equals("=")) {
                                    //sigue un menor o igual
                                    Metodos.contador_menor_igual++;
                                }

                            } else if ((i < tam) && (Partesasignacionvariables.get(i).equals(">"))) {
                                if (Partesasignacionvariables.get(i + 1).equals("=")) {
                                    //sigue un mayor o igual
                                    Metodos.contador_mayor_igual++;
                                }
                            }
                        }

                    }

                }

            }

        }
        return true;
    }

    public boolean valida_char(ArrayList<String> Partesasignacionvariables) {
        
        int tam;

        if (Partesasignacionvariables.get(Partesasignacionvariables.size() - 1).equals(";")) {
            tam = (Partesasignacionvariables.size() - 2);
        } else {
            tam = (Partesasignacionvariables.size() - 1);
        }
       
        if (!variable_char_existe(Partesasignacionvariables.get(3))) {
            //Si no es una variable valida entonces tiene que ser un string enmarcado en comillas dobles
            if (Partesasignacionvariables.get(3).equals("\"")) {
                // A la variable se le está asignando un texto
                boolean comilla_encontrada = false;
                int i;
                for (i = 4; i<= tam; i++) {
                    if (Partesasignacionvariables.get(i).equals("\"")) {
                        comilla_encontrada = true;
                        break;
                    }
                }
                if (!comilla_encontrada) {
                    //Se recorrió el for y no se encontro la doble comilla
                    return false;
                }
                if (i<tam) {
                    //la doble comilla fue encontrada y todavía hay más elementos en la línea
                    return false;
                }
/*                //La doble comilla se encontró al final, se valida que el tamaño del string sea de 30 caracteres
                if ((i-4) > 30) {
                    //El string es de más de 30 caracteres
                    return false;
                }*/
                
                Metodos.evaluar_30caracteres = true;
                return true;
            } else {
                return false;
            }
        } else {
            //es una variable valida por lo tanto se valida que no haya nada más, o sea que la variable sea lo ultimo
            if (tam > 3) {
                return false;
            } else {
                return true;
            }
        }
    }

    public boolean valida_constante_entero(ArrayList<String> Partesasignacionvariables, String etiqueta_evaluar, int i) {

        if (etiqueta_evaluar.matches("\\d+")) {
            int numero_entero = Integer.parseInt(etiqueta_evaluar);

            if (Partesasignacionvariables.get(i - 1).equals("-")) {
                //es un número negativo ya que la posición anterior es un signo "-"
                if (numero_entero > 32768) {
                    return false;
                } else {
                    return true;
                }
            } else if (numero_entero > 32767) { //es un número positivo 
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean valida_constante_real(ArrayList<String> Partesasignacionvariables, String etiqueta_evaluar, int i) {

        //("\\d*(\\.\\d+)?")
        if (etiqueta_evaluar.matches("\\d*\\.\\d+")) {
            double numero_double = Double.parseDouble(etiqueta_evaluar);

            if (Partesasignacionvariables.get(i - 1).equals("-")) {
                //es un número negativo ya que la posición anterior es un signo "-"
                if (numero_double > 32768) {
                    return false;
                } else {
                    return true;
                }
            } else if (numero_double >= 32768) { //es un número positivo 
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean valida_operadores_agrupacion(String etiqueta_buscar) {
        return Metodos.operadores_agrupacion.contains(etiqueta_buscar);
    }

    public boolean valida_operadores_aritmeticos(String etiqueta_buscar) {
        return Metodos.operadores_aritmeticos.contains(etiqueta_buscar);
    }

    public boolean valida_operadores_relacionales_letras(String etiqueta_buscar) {
        return Metodos.operadores_relacionales_letras.contains(etiqueta_buscar);
    }

    public boolean valida_operadores_relacionales_simbolos(String etiqueta_buscar) {
        return Metodos.operadores_relacionales_simbolos.contains(etiqueta_buscar);
    }

    public boolean valida_print(ArrayList<String> Partesprint) {
        //Se valida la expresion read:
        //read(variable)
        // o
        //read(variable);

        if (!(Partesprint.get(0).equals("print"))) {
            return false;
        }

        if (!(Partesprint.get(1).equals("("))) {
            return false;
        }

        //se valida el nombre de variable
        if (Partesprint.get(2).equals("\"")) {
            System.out.println("XXXXXX");
        }

        switch (Partesprint.get(2)) {
            case "\"":
                //Lo que viene es un texto por lo que se recorre parteprint
                //hasta encontrar la siguiente " y luego debe venir  un ) y luego podría venir un ;
                boolean comilla_encontrada = false;
                int i;
                for (i = 3; i < Partesprint.size() - 1; i++) {
                    if (Partesprint.get(i).equals("\"")) {
                        comilla_encontrada = true;
                        break;
                    }
                }
                if (comilla_encontrada) {
                    if (Partesprint.size() == (i + 1)) {
                        return false;
                    }
                    if (!Partesprint.get(i + 1).equals(")")) {
                        return false;
                    }
                    if (Partesprint.size() == (i + 3)) {
                        if (!(Partesprint.get(i + 2).equals(";"))) {
                            return false;
                        }
                    }
                    if (Partesprint.size() > (i + 3)) {
                        return false;
                    }
                } else {
                    return false;
                }
                return true;
            case "newline":
                if (!(Partesprint.get(3).equals(")"))) {
                    return false;
                }

                if (Partesprint.size() == 5) {
                    if (!(Partesprint.get(4).equals(";"))) {
                        return false;
                    }
                }

                if (Partesprint.size() > 5) {
                    return false;
                }
                return true;
            case "(":
                int j;
                boolean lei_variable = false;
                boolean parentesis_encontrado = false;

                for (j = 3; j < Partesprint.size() - 1; j++) {
                    //siempre debe llevar al menos una variable
                    if (j == 3) {
                        if (!variable_existe(Partesprint.get(j))) {
                            return false;
                        } else {
                            lei_variable = true;
                        }
                    } else if (Partesprint.get(j).equals(")")) {
                        if (!lei_variable) {
                            return false;
                        } else {
                            parentesis_encontrado = true;
                            break;
                        }
                    } else if (j % 2 == 1) {
                        //posición impar que debe ser una variable
                        if (!variable_existe(Partesprint.get(j))) {
                            return false;
                        } else {
                            lei_variable = true;
                        }
                    } else {
                        //posición par que debe ser una coma
                        if (!Partesprint.get(j).equals(",")) {
                            return false;
                        } else {
                            lei_variable = false;
                        }
                    }
                }

                if (parentesis_encontrado) {
                    if (Partesprint.size() == (j + 1)) {
                        return false;
                    }
                    if (!Partesprint.get(j + 1).equals(")")) {
                        return false;
                    }
                    if (Partesprint.size() == (j + 3)) {
                        if (!(Partesprint.get(j + 2).equals(";"))) {
                            return false;
                        }
                    }
                    if (Partesprint.size() > (j + 3)) {
                        return false;
                    }
                } else {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public boolean valida_variables(ArrayList<String> Partesvariables) {

        boolean estoy_en_int = false;
        boolean estoy_en_real = false;
        boolean estoy_en_char = false;

        if (!(Partesvariables.get(0).equals("INT") || Partesvariables.get(0).equals("REAL") || Partesvariables.get(0).equals("CHAR"))) {
            return false;
        } else if (Partesvariables.get(0).equals("INT")) {
            estoy_en_int = true;
        } else if (Partesvariables.get(0).equals("REAL")) {
            estoy_en_real = true;
        } else if (Partesvariables.get(0).equals("CHAR")) {
            estoy_en_char = true;
        }

        boolean lei_variable = false;

        for (int j = 1; j < Partesvariables.size(); j++) {

            if ((j == Partesvariables.size() - 1) && (j % 2 == 0)) {
                //estoy en la última posicióbn y es una posición par
                //entonces debe ser un punto y coma
                if (!Partesvariables.get(j).equals(";")) {
                    return false;
                }
            } else if (j % 2 == 1) {
                //es una posición impar por lo que debe ser una variable que no exista
                if (variable_existe(Partesvariables.get(j))) {
                    return false;
                } else if (etiqueta_existe(Partesvariables.get(j))) {
                    return false;
                } else if (identificador_reservado(Partesvariables.get(j))) {
                    return false;
                } else if (!verificador_identificador(Partesvariables.get(j))) {
                    return false;
                } else {
                    lei_variable = true;
                    if (estoy_en_int) {
                        Metodos.variables_int.add(Partesvariables.get(j));
                    } else if (estoy_en_real) {
                        Metodos.variables_real.add(Partesvariables.get(j));
                    } else if (estoy_en_char) {
                        Metodos.variables_char.add(Partesvariables.get(j));
                    }
                }
            } else {
                //es una posición par y no es la última por lo que debe ser una coma
                if (!Partesvariables.get(j).equals(",")) {
                    return false;
                }
            }
        }

        if (!lei_variable) {
            return false;
        }
        return true;
    }

    public boolean identificador_reservado(String identificador) {
        //true si el identificador es una palabra reservada
        //false caso contrario
        return (Metodos.palabras_reservadas_mayu.contains(identificador)) || (Metodos.palabras_reservadas_minu.contains(identificador))
                || (Metodos.operadores_relacionales_letras.contains(identificador));
    }

    public boolean reservada_esta_sola(ArrayList<String> Parteslinea) {
        return Parteslinea.size() <= 1;
    }

    public boolean etiqueta_existe(String etiqueta_buscar) {
        return Metodos.etiquetas.contains(etiqueta_buscar);
    }

    public boolean variable_existe(String etiqueta_buscar) {
        if (variable_int_existe(etiqueta_buscar)) {
            return true;
        } else if (variable_real_existe(etiqueta_buscar)) {
            return true;
        } else if (variable_char_existe(etiqueta_buscar)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean variable_int_existe(String etiqueta_buscar) {
        return Metodos.variables_int.contains(etiqueta_buscar);
    }

    public boolean variable_real_existe(String etiqueta_buscar) {
        return Metodos.variables_real.contains(etiqueta_buscar);
    }

    public boolean variable_char_existe(String etiqueta_buscar) {
        return Metodos.variables_char.contains(etiqueta_buscar);
    }

    public boolean GOTOprimero(ArrayList<String> Parteslinea) {
        return Parteslinea.get(0).equals("GOTO");
    }

    public boolean GOTO2_3elementos(ArrayList<String> Parteslinea) {
        if (Parteslinea.size() == 3) {
            if (!Parteslinea.get(2).equals(";")) {
                return false;
            }
        }
        return (Parteslinea.size() == 2 || Parteslinea.size() == 3);
    }

    public boolean etiqueta_esta_sola(ArrayList<String> Parteslinea) {
        if (Parteslinea.size() > 2) {
            return false;
        }
        if (Parteslinea.size() == 2) {
            if (!Parteslinea.get(1).equals(":")) {
                return false;
            } else if (Parteslinea.get(0).contains(":")) {
                return false;
            }
        } else if (Parteslinea.size() == 1 && Parteslinea.get(0).equals(":")) {
            return false;
        }
        return true;
    }

    public boolean validar_reservadapuntoycoma(ArrayList<String> Parteslinea) {
        if (Parteslinea.size() > 2) {
            return false;
        }
        if (Parteslinea.size() == 2) {
            if (!Parteslinea.get(1).equals(";")) {
                return false;
            }
        }
        return true;
    }

    public void copiar_en_asignacion_variables(ArrayList<String> Parteslinea) {
        for (int i = 0; i < Parteslinea.size(); i++) {
            Metodos.linea_asignacion_variables.add(Parteslinea.get(i));
        }
    }

    public void copiar_en_read(ArrayList<String> Parteslinea) {
        for (int i = 0; i < Parteslinea.size(); i++) {
            Metodos.linea_read.add(Parteslinea.get(i));
        }
    }

    public void copiar_en_print(ArrayList<String> Parteslinea) {
        for (int i = 0; i < Parteslinea.size(); i++) {
            Metodos.linea_print.add(Parteslinea.get(i));
        }
    }

    public void copiar_en_variables(ArrayList<String> Parteslinea) {
        for (int i = 0; i < Parteslinea.size(); i++) {
            Metodos.linea_variables.add(Parteslinea.get(i));
        }
    }

    public boolean validar_tipo_variable(ArrayList<String> Parteslinea) {
        return Parteslinea.get(0).equals("INT") || Parteslinea.get(0).equals("REAL") || Parteslinea.get(0).equals("CHAR");
    }

    public boolean validar_masdeuno_variable(ArrayList<String> Parteslinea) {
        return Parteslinea.size() >= 2;
    }

    public boolean variable_termina_con_coma(String nombrevariable) {

        return nombrevariable.charAt(nombrevariable.length() - 1) == ',';
    }

    public boolean variable_termina_con_puntoycoma(ArrayList<String> Parteslinea) {

        return Parteslinea.get(Parteslinea.size() - 1).equals(";");
    }

    public boolean reservada_final(ArrayList<String> Parteslinea) {
        return Parteslinea.get(Parteslinea.size() - 1).equals("THEN") || Parteslinea.get(Parteslinea.size() - 1).equals("DO");
    }

    public boolean termina_con_puntoycoma(ArrayList<String> Parteslinea) {
        return Parteslinea.get(Parteslinea.size() - 1).equals(";");
    }

    public boolean verifica_begin(ArrayList<String> Parteslinea) {

        return Parteslinea.get(0).equals("BEGIN");
    }

    public boolean verifica_end(ArrayList<String> Parteslinea) {
        return Parteslinea.get(0).equals("END");
    }

    public boolean verifica_comentarios(ArrayList<String> Parteslinea) {
        switch (Parteslinea.get(0)) {
            case "COMMENT":
                Metodos.palabra_comentario = "COMMENT";
                return true;
            case "CO":
                Metodos.palabra_comentario = "CO";
                return true;
            case "#":
                Metodos.palabra_comentario = "#";
                return true;
            default:
                return false;
        }
    }

    /*public boolean verifica_final_comentarios(ArrayList<String> Parteslinea) {
        return Parteslinea.get(0).equals(Parteslinea.get(Parteslinea.size() - 1));
    }*/
    public int verifica_final_comentarios(ArrayList<String> Parteslinea, int inicio, int fin) {
        //Devuelve la posicion donde encuentra el fin del comentario
        //-1 si no la encuentra
        for (int i = inicio; i <= fin; i++) {
            if (Parteslinea.get(i).equals(Metodos.palabra_comentario)) {
                return i;
            }
        }
        return -1;
    }

    public boolean reservada_sola(ArrayList<String> Parteslinea) {
        boolean Correcto = true;
        if (Parteslinea.size() > 1) {
            Correcto = false;
        }
        return Correcto;
    }
}
