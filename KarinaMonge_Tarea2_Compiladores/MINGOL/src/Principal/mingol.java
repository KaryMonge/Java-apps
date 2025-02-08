package Principal;

import java.io.File;
import java.nio.file.Paths;
import Logica.Metodos;
import static Logica.Metodos.mascara_int;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import static Logica.Evaluador_linea.EvaluadorLinea;

public class mingol {
    
    public static String contenido_original = "";
    public static String contenido_error = "";

    public static void main(String[] args) throws IOException {
        Metodos.leyo_begin = false;
        Metodos.leyo_end = false;
        Metodos.linea_anterior_puntoycoma = false;
        Metodos.contador_lineas_comando = 0;
        Metodos.linea_reservada_anterior = false;
        Metodos.estoy_en_variables = false;
        Metodos.ya_paso_variables = false;
        Metodos.hubo_error = false;

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

        int num_linea = 0;
        String linea_result;

        try {
            String ruta = Paths.get("").toAbsolutePath().toString();
            String nomb_archivo;
            for (int i = 0; i < args.length; i++) {
                File archivo = new File(args[i]);
                nomb_archivo = archivo.getName();
            }
        } catch (Exception e) {
        }

        //Método con el que averguo el directorio de trabajo
        File file = new File("");
        String directoryName = file.getAbsoluteFile().toString();
        System.out.println("Current Working Directory is = " + directoryName);

        FileReader Flector = null;
        try {
            // se abre el fichero y se crea el BufferedReader para hacer la lectura (readLine())  
            File archivo = new File("CALCULAR_INFLACION.MINGOL");
            BufferedReader Blector = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), StandardCharsets.UTF_8));

            String linea;

            //recorre el archivo por lineas
            System.out.println("");
            System.out.println("*************************************TEXTO****************************************");

            while ((linea = Blector.readLine()) != null) {
                num_linea++;
                linea_result = String.valueOf(mascara_int(num_linea)) + " " + linea + "\n";
                contenido_error = contenido_error + linea_result;
                contenido_original = contenido_original + linea + "\n";
                //LLAMAR A ANALIZAR LA LINEA
                linea = linea.trim();
                if (!linea.equals("")) {
                    String mensaje_error = EvaluadorLinea(linea);
                    contenido_error = contenido_error + mensaje_error;
                }
            }
            if (!Metodos.leyo_begin) {
                //nunca se leyó un begin
                //System.out.println(Metodos.error22);
                Metodos.hubo_error = true;
                contenido_error = contenido_error + Metodos.espacios_comentario + Metodos.error22 + "\n";
            }
            if (!Metodos.leyo_end) {
                //nunca se leyó un end
                //System.out.println(Metodos.error23);
                Metodos.hubo_error = true;
                contenido_error = contenido_error + Metodos.espacios_comentario + Metodos.error23 + "\n";
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
        if (Metodos.hubo_error){ 
            escritura_datos_error(contenido_error);// se hace el llamado para la escritura del resultado
            comando_cmd_error();
        } else {
            escritura_datos_sinerror(contenido_original);// se hace el llamado para la escritura del resultado
            
        }
        
        //aquí imprimo los resultados en la consola

        //comando_cmd();
    }

    public static void escritura_datos_error(String content) { // Aquí imprimo los resultados en el notepad
        try {
            String ubicacion = "CALCULAR_INFLACION-errores.txt";
            //System.out.println(content);
            File file = new File(ubicacion);
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

    public static void escritura_datos_sinerror(String content) { // Aquí imprimo los resultados en el notepad
        try {
            String ubicacion = "CALCULAR_INFLACION.a68";
            System.out.println(content);
            File file = new File(ubicacion);
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

    public static void comando_cmd_error() throws IOException {
        try {

            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("Notepad CALCULAR_INFLACION-errores.txt");
        } catch (IOException e) {
        }
    }

    public static void comando_cmd_noerror() throws IOException {
        
        try {
            
            //String [] cmd = {"a68g.exe","CALCULAR_INFLACION.a68"}; 
            //Runtime.getRuntime().exec(cmd);
            //Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && ping localhost\"");
            //Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"a68g.exe CALCULAR_INFLACION.a68\"");
            String[] cdmCommand = {"cmd.exe", "/c", "start", "cmd.exe", "/k", "a68g.exe", "CALCULAR_INFLACION.a68"};
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
}
/*

public void compilar() {
        String ar68 = name;//almacena el nombre de feo.a68
        System.out.println("Compilando archivo .....");
        try {
            //Obtenemos la ruta absoluta del proyecto

            String path = Paths.get("").toAbsolutePath().toString();
            //establecemos la ruta donde se guardara el archivo feo.a68
            String pathFile = path + "\\" + ar68;
            //instruccion que le indica que compile el archivo 
            String comand = path + "\\" + "a68g.exe " + pathFile;
            // indicamos se compile desde el cmd 
            String[] cdmCommand = {"cmd.exe", "/c", "start", "cmd.exe", "/k", comand};
            //creamos un proceso
            ProcessBuilder probuilder = new ProcessBuilder(cdmCommand);
            //ejecutamos el proceso
            Process process = probuilder.start();

        } catch (Exception ex) {

            System.out.println("Ocurrio una excepcion de tipo " + ex.toString());
        }

    }*/