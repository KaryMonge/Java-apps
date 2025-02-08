/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /* Nueva versión */
package Atributos;

import static Atributos.Lecura.contenido_error;
import static Atributos.Lecura.contenido_error_array;
import static Atributos.Lecura.contenido_original;
import static Atributos.Lecura.datos;
import static Logica.Evaluador_linea.EvaluadorLinea;
import Logica.Metodos;
import static Logica.Metodos.mascara_int;
import Logica.Verificador_Sintaxis;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Atributo {

    //DECLARACIÓN DE LOS ATRIBUTOS DE LA CLASE Atributo
    private final String ruta;
    private final File mingol_texto;
    private final File mingol_errores;
    private final File mingol_a68g;

    //inicalización de las variables
    public Atributo() {
        ruta = Paths.get("").toAbsolutePath().toString();
        mingol_texto = new File(ruta + "\\bueno.mingol");
        mingol_errores = new File(ruta + "\\CALCULAR_INFLACION-ERRORES.txt");
        mingol_a68g = new File(ruta + "\\CALCULAR_INFLACION.a68");

    }

    public Atributo(String ruta, File mingol_texto, File mingol_errores, File mingol_a68g, String linea) {
        this.ruta = ruta;
        this.mingol_texto = mingol_texto;
        this.mingol_errores = mingol_errores;
        this.mingol_a68g = mingol_a68g;
    }

    public File getMingol_errores() {
        return mingol_errores;
    }

    public String getRuta() {
        return ruta;
    }

    public File getMingol_texto() {
        return mingol_texto;
    }

    private void getMingol_errores(String content) {
        try {
            //System.out.println(content);
            File file = new File(mingol_errores.toString());
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void comando_cmd_error() throws IOException {
        try {

            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("Notepad " + mingol_errores.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getMingol_a68g(String content) { // Aquí imprimo los resultados en el notepad
        try {

            //System.out.println(content);
            File file = new File(mingol_a68g.toString());

            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void comando_cmd_noerror() throws IOException {

        try {

            //String [] cmd = {"a68g.exe","CALCULAR_INFLACION.a68"}; 
            //Runtime.getRuntime().exec(cmd);
            //Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && ping localhost\"");
            //Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"a68g.exe CALCULAR_INFLACION.a68\"");
            String[] cdmCommand = {"cmd.exe", "/c", "start", "cmd.exe", "/k", "a68g.exe", mingol_a68g.toString()};
            ProcessBuilder probuilder = new ProcessBuilder(cdmCommand);
            Process process = probuilder.start();

            /*            //Runtime runtime = Runtime.getRuntime();
            String path = Paths.get("").toAbsolutePath().toString();

            //establecemos la ruta donde se guardara el archivo feo.a68
            String pathFile = path + "\\" + ar68;
            
            //instruccion que le indica que compile el archivo 
            String comand = path + "\\" + "a68g.exe" + pathFile;
            
            // indicamos se compile desde el cmd 
            String[] cdmCommand = {"cmd.exe", "/c", "start", "cmd.exe", "/k", comand};
            
            //creamos un proceso
            ProcessBuilder probuilder = new ProcessBuilder(cdmCommand);
            
            //ejecutamos el proceso
            Process process = probuilder.start();*/
        } catch (IOException e) {
        }
    }

    public File getMingol_a68g() {
        return mingol_a68g;
    }

    //Método para obtener lo que existe en el archivo
    public String getTextoArchivo() throws IOException {
        String text = "";
        int num_linea = 0;
        String linea;
        String linea_result;
        File file = new File("");
        String directoryName = file.getAbsoluteFile().toString();
        System.out.println("Current Working Directory is = " + directoryName);

        FileReader Flector = null;
        try {

            // BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(mingol_texto), "utf-8"));
            
            // SI EL ARCHIVO NO EXISTE ES CREADO
            //Se utiliza "utf-8" para la lectura de caracteres especial; 
            File archivo = new File(mingol_texto.toString());
            BufferedReader Blector = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "utf-8"));

            //recorre el archivo por lineas
            System.out.println("");
            System.out.println("*************************************TEXTO****************************************");

            while ((linea = Blector.readLine()) != null) {
                num_linea++;
                linea_result = String.valueOf(mascara_int(num_linea)) + " " + linea + "\n";
                //contenido_error = contenido_error + linea_result;
                contenido_original = contenido_original + linea + "\n";
                //LLAMAR A ANALIZAR LA LINEA
                linea = linea.trim();
                if (!linea.equals("")) {
                    String mensaje_error = EvaluadorLinea(linea);
                    //En los errores: 013, 015 se debe escribir primero el error y luego la línea
                    //porque el error se da por algo en la línea anterior debido a la actual
                    if (mensaje_error.contains("ERROR 013") || mensaje_error.contains("ERROR 015")
                            || mensaje_error.contains("ERROR 028") || mensaje_error.contains("ERROR 030")
                            || mensaje_error.contains("ERROR 032") || mensaje_error.contains("ERROR 034")) {
                        contenido_error_array.add(mensaje_error);
                        contenido_error_array.add(linea_result);
                    } else {
                        contenido_error_array.add(linea_result);
                        contenido_error_array.add(mensaje_error);
                    }
                    //contenido_error = contenido_error + mensaje_error;
                } else {
                    contenido_error_array.add(linea_result);
                }

            }
            if (!Metodos.leyo_begin) {
                //nunca se leyó un begin
                //System.out.println(Metodos.error22);
                Metodos.hubo_error = true;
                contenido_error_array.add(Metodos.espacios_comentario + Metodos.error22 + "\n");
                //contenido_error = contenido_error + Metodos.espacios_comentario + Metodos.error22 + "\n";
            }
            if (!Metodos.leyo_end) {
                //nunca se leyó un end
                //System.out.println(Metodos.error23);
                Metodos.hubo_error = true;
                contenido_error_array.add(Metodos.espacios_comentario + Metodos.error23 + "\n");
                //contenido_error = contenido_error + Metodos.espacios_comentario + Metodos.error23 + "\n";
            }

            Verificador_Sintaxis verifica = new Verificador_Sintaxis();

            for (int i = 0; i < Metodos.etiquetas_buscar.size(); i++) {
                //Se busca el primer error que inicie con espacios_comentario_etiqueta
                int j = 0;
                for (j = 0; j < contenido_error_array.size(); j++) {
                    //Se busca le primer elemento que tenga espacios_comentario_etiqueta
                    if (contenido_error_array.get(j).length() >= 7) {
                        if (contenido_error_array.get(j).substring(0, 7).equals(Metodos.espacios_comentario_etiqueta)) {
                            break;
                        }
                    }
                }
                if (verifica.etiqueta_existe(Metodos.etiquetas_buscar.get(i))) {
                    //La etiqueta SI existe por lo que se elimina el error del arraylist de errors
                    contenido_error_array.remove(j);
                } else //La etiqueta NO existe por lo que se mantiene el error
                //Se hace un reemplazo de espacios_comentario_etiqueta por espacios_comentario
                {
                    contenido_error_array.set(j, contenido_error_array.get(j).replaceAll(Metodos.espacios_comentario_etiqueta, Metodos.espacios_comentario));
                    Metodos.hubo_error = true;
                }
                
            }
            
            //if (Metodos.hubo_error_nombreetiqueta) {
            //hubo error en etiquetas en los GOTO
            //}
            if (Metodos.hubo_error) {
                //Tomo el array list con los strings de errores lo recorro y formo el
                //contenido del error
                for (int i = 0; i < contenido_error_array.size(); i++) {
                    contenido_error = contenido_error + contenido_error_array.get(i);
                }
                datos.getMingol_errores(contenido_error);// se hace el llamado para la escritura del resultado
                comando_cmd_error();
            } else {
                datos.getMingol_a68g(contenido_original);// se hace el llamado para la escritura del resultado
                comando_cmd_noerror();
            }

        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo.mingol");
        }
        return text;

    }

}
