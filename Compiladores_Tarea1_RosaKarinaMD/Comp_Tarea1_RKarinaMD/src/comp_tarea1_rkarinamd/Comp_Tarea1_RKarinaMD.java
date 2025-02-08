package comp_tarea1_rkarinamd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.util.StringTokenizer;
import java.io.InputStream;
import java.util.Scanner;

public class Comp_Tarea1_RKarinaMD {

    public static int contador_lineas = 0;
    public static int contador_caracteres_sin_esp = 0;
    public static int contador_caracteres_con_esp = 0;
    public static int contador_palabras = 0;

    public static void analisis_L(String linea) {
        
        //String delimitador = " ";
        //StringTokenizer stringTokenizer1 = new StringTokenizer(linea);
        //StringTokenizer stringTokenizer2 = new StringTokenizer(linea,delimitador);
        //contador_caracteres_con_esp = contador_caracteres_con_esp + linea.length();
        //contador_caracteres_sin_esp = contador_caracteres_sin_esp + linea.replace(" ", "").length();;
        
        boolean en_palabra = false;
        contador_lineas++;
        for (int i = 0; i < linea.length(); i++) {

            char letra = linea.charAt(i); // aqui se cuentan cualquier caracter, incluyendo los espacios

            contador_caracteres_con_esp++;

            if (letra != " ".charAt(0)) {
                contador_caracteres_sin_esp++;
            }
            if (Character.isLetter(letra)) {

                if (!en_palabra) {
                    contador_palabras++;
                    en_palabra = true;
                }
            } else {
                en_palabra = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        //Método con el que averguo el directorio de trabajo
        File file = new File("");
        String directoryName = file.getAbsoluteFile().toString();
        System.out.println("Current Working Directory is = " + directoryName);

        FileReader Flector = null;
        try {
            // se abre el fichero y se crea el BufferedReader para hacer la lectura (readLine())  
            File archivo = new File("texto.txt");
            BufferedReader Blector = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), StandardCharsets.UTF_8));
            //BufferedReader Blector = new BufferedReader(new InputStreamReader(new FileInputStream(archivo),"utf-8"));
            // BufferedReader Blector = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), StandardCharsets.UTF_8));

            Flector = new FileReader(archivo);
            Blector = new BufferedReader(Flector);
            // Lectura de texto 0
            String linea;

            //recorre el archivo por lineas
            System.out.println("" );
             System.out.println("*************************************TEXTO****************************************" );
            while ((linea = Blector.readLine()) != null) {
                //System.out.println(linea);
                //linea = Normalizer.normalize(linea, Normalizer.Form.NFD);
                //linea = linea.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                
                System.out.println(linea);
                analisis_L(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // finally cierra la lectura del texto para probar la excepciones.
            try {
                if (null != Flector) {
                    Flector.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        
        escritura_datos();// se hace el llamado para la escritura del resultado
        //aquí imprimo los resultados en la consola
        System.out.println("*********************************RESULTADOS*********************************" );
        System.out.println( "* Total de Palabras en el Texto:               " + contador_palabras + "                          *");
        System.out.println("*__________________________________________________________________________*" );
        System.out.println( "* Total de Caracteres sin espacio:             " + contador_caracteres_sin_esp + "                         *" );
        System.out.println("*__________________________________________________________________________*" );
        System.out.println( "* Total de Caracteres con espacio:             " + contador_caracteres_con_esp + "                         *");
        System.out.println("*__________________________________________________________________________*" );
        System.out.println( "* Total de lineas en el texto:                 " + contador_lineas + "                          *");
        System.out.println("*********************************RESULTADOS*********************************" );

        comando_cmd();
    }

    public static void escritura_datos() { // Aquí imprimo los resultados en el notepad
        try {
            String ubicacion = "resultado.txt";
            // String ubicacion = "\\Compiladores_Tarea1\\resultado.txt";
            String contenido = "*********************************RESULTADOS*********************************" + "\n";
            contenido = contenido + "* Total de Palabras en el Texto:               " + contador_palabras + "                          *" + "\n";
            contenido = contenido + "*__________________________________________________________________________*" + "\n";
            contenido = contenido + "* Total de Caracteres sin espacio:             " + contador_caracteres_sin_esp + "                         *" + "\n";
            contenido = contenido + "*__________________________________________________________________________*" + "\n";
            contenido = contenido + "* Total de Caracteres con espacio:             " + contador_caracteres_con_esp + "                         *" + "\n";
            contenido = contenido + "*__________________________________________________________________________*" + "\n";
            contenido = contenido + "* Total de lineas en el texto:                 " + contador_lineas + "                          *" + "\n";
            contenido = contenido + "****************************************************************************" + "\n";
            File file = new File(ubicacion);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void comando_cmd() throws IOException {
        try {

            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec(" notepad.exe resultado.txt");
        } catch (IOException e) {
        }
    }

}

// Estimado profesor Uriel Ezequiel;
//Para hacer el llamado del .jar desde el Command de windows, se debe usar el método que usted me envió 
//java -Dfile.encoding=UTF-8 -jar ejemplo.jar texto.txt 

//en mi caso lo utilicé de esta manera:
//java -Dfile.encoding=UTF-8 -jar C:\Users\karin\OneDrive\Desktop\Compiladores_Tarea1_RosaKarinaMD\Comp_Tarea1_RKarinaMD\dist\Comp_Tarea1_RKarinaMD.jar
//Atte Rosa Karina Monge Duran.