/*Nueva_version */

package Logica;


public class Tabla_palabras {
    
        enum Tipos {
            Pragmat("PRAGMAT"),
            Mode("MODE"),
            TodaviaNoProgramadas("IF|FOR"),
            ReservadasSolas("BEGIN"),
            ReservadasSolasSinPuntoyComaAnterior("END|ELSE"),
            ReservadasFinales("THEN|DO"),
            ReservadasSinPuntoycomaAnterior("FI|OD"), //Si llevan el punto y coma al final
            read("read"),
            print("print"),
            //Etiquetas("[A-Za-z]*[0-9]*:"),
            Etiquetas("[a-z]*[0-9]*:"),
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
