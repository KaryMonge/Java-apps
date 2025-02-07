//UNIVERSIDAD ESTATAL A DISTANCIA
//VICERRECTORIA ACADÉMICA
//ESCUELA DE LAS CIENCIAS EXACTAS Y NATURALES
//CATEDRA DESARROLLO DE SISTEMAS
//DIPLOMADO EN INFORMÁTICA

//CÓDIGO:00824

//PROGARMACIÒN INTERMEDIA

//TAREA 2

//GRUPO:04

//ESTUDIANTE: ROSA KARINA MONGE DURÁN

//CÉDULA: 112250672

package Objetos;


import java.util.ArrayList;
//aquí se almacenan los arrays list de cada clase hija, se hace en una clase a parte para eficacia del funcionamiento
//y velocidad del programa, ya que libera el uso de datos.
public class Guardado_de_Datos extends Atleta{
    
     public static ArrayList <Atleta> futbolistas = new ArrayList<Atleta> ();
     public static ArrayList <Atleta> basquetbolistas = new ArrayList<Atleta> ();
     public static ArrayList <Atleta> karatekas = new ArrayList<Atleta> ();

    public Guardado_de_Datos(String identificacion,String nombre, String fecha_nacimiento, int edad, float estatura, float peso, String tipo_de_sangre, String tipo_de_atleta) {
        super(identificacion, nombre, fecha_nacimiento, edad, estatura, peso, tipo_de_sangre, tipo_de_atleta);
    }
     

}

