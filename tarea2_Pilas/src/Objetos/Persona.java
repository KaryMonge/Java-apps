//UNIVERSIDAD ESTATAL A DISTANCIA
//VICERRECTORIA ACADÉMICA
//ESCUELA DE LAS CIENCIAS EXACTAS Y NATURALES
//CATEDRA DESARROLLO DE SISTEMAS
//DIPLOMADO EN INFORMÁTICA
//CÓDIGO:00825
//ESTRUCTURA DE DATOS
//Tarea 2
//GRUPO:03
//ESTUDIANTE: ROSA KARINA MONGE DURÁN
//CÉDULA: 112250672
package Objetos;
// clase padre personas, la cual solo tiene edad y ID.
public class Persona {
 
    protected int identificacion;
    protected int edad;

    public Persona(int identificacion, int edad) {
        this.identificacion = identificacion;
        this.edad = edad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}

