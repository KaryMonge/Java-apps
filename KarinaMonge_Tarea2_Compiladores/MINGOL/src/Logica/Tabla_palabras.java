
package Logica;


public class Tabla_palabras {
    
        enum Tipos {
            ReservadasSolas("BEGIN|ELSE"),
            ReservadasSolasSinPuntoyComaAnterior("END"),
            ReservadasFinales("THEN|DO"),
            ReservadasSinPuntoycomaAnterior("FI|OD"),
            Etiquetas("[A-Za-z]*[0-9]*:"),
            Variables("INT|REAL|CHAR"),
            EtiquetaGOTO("GOTO"),
            ReservadasMayu("CO|DOUBLE|PRAGMAT|SKIP"),
            ReservadasMinu("print|read");
       // Reservada("(IF|ELSE|ENDIF|CICLO|INCREMENTA|REPITE|INICIO|FIN)"),        
       // Numeros("[0-9]*"),
      //  Parentesis("(\\(|\\)|\\[|\\]|\\{|\\})"),
      //  Separadores("(;|,|.)"),
       // Operadores("(\\*|\\+\\-)");
        
        public final String patron;
        Tipos (String s){
            this.patron = s;
        }  
    }
    
}
