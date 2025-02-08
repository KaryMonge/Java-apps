/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    public boolean identificador_reservado(String identificador) {
        //true si el identificador es una palabra reservada
        //false caso contrario
        return Metodos.palabras_reservadas_mayu.contains(identificador);
    }

    public boolean reservada_esta_sola(ArrayList<String> Parteslinea) {
        return Parteslinea.size() <= 1;
    }

    public boolean etiqueta_existe(String etiqueta_buscar) {
        return Metodos.etiquetas.contains(etiqueta_buscar);
    }

    public boolean GOTOprimero(ArrayList<String> Parteslinea) {
        return Parteslinea.get(0).equals("GOTO");
    }

    public boolean GOTO2elementos(ArrayList<String> Parteslinea) {
        return Parteslinea.size() == 2;
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
                
        return Parteslinea.get(Parteslinea.size()-1).equals(";");
    }

    public boolean reservada_final(ArrayList<String> Parteslinea) {
        return Parteslinea.get(Parteslinea.size() - 1).equals("THEN") || Parteslinea.get(Parteslinea.size() - 1).equals("DO");
    }

    public boolean termina_con_puntoycoma(ArrayList<String> Parteslinea) {
        return Parteslinea.get(Parteslinea.size() - 1).substring(Parteslinea.get(Parteslinea.size() - 1).length() - 1).equals(";");
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
                return true;
            case "CO":
                return true;
            case "#":
                return true;
            default:
                return false;
        }
    }

    public boolean verifica_final_comentarios(ArrayList<String> Parteslinea) {
        return Parteslinea.get(0).equals(Parteslinea.get(Parteslinea.size() - 1));
    }

    public boolean reservada_sola(ArrayList<String> Parteslinea) {
        boolean Correcto = true;
        if (Parteslinea.size() > 1) {
            Correcto = false;
        }
        return Correcto;
    }
}
