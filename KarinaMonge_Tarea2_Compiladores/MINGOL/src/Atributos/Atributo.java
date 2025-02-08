/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atributos;

import java.io.File;
import java.nio.file.Paths;

public class Atributo {

    //DECLARACIÓN DE LOS ATRIBUTOS DE LA CLASE "Datos"
    private final String ruta;
    private final File mingol_texto;
    private final File mingol_errores;
    private final File mingol_a68g;

    public Atributo() {
        ruta = Paths.get("").toAbsolutePath().toString();
        mingol_texto = new File(ruta + "\\CALCULAR_INFLACION.MINGOL");
        mingol_errores = new File(ruta + "\\CALCULAR_INFLACION-ERRORES.txt");
        mingol_a68g = new File(ruta + "\\CALCULAR_INFLACION.a68");
    }

    public Atributo(String ruta, File mingol_texto, File mingol_errores, File mingol_a68g) {
        this.ruta = ruta;
        this.mingol_texto = mingol_texto;
        this.mingol_errores = mingol_errores;
        this.mingol_a68g = mingol_a68g;
    }

    public String getRuta() {
        return ruta;
    }

    public File getMingol_texto() {
        return mingol_texto;
    }

    public File getMingol_errores() {
        return mingol_errores;
    }

    public File getMingol_a68g() {
        return mingol_a68g;
    }




}
