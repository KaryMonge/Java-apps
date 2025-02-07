
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

public class Basquetbolista extends Atleta {
    //aquí se asigna el atributo puntos a la clase hija Basquetbolista, para luego su respectivo constructor.
    private String puntos;

    public Basquetbolista(String puntos, String identificacion, String nombre, String fecha_nacimiento, int edad, float estatura, float peso, String tipo_de_sangre, String tipo_de_atleta) {
        super(identificacion, nombre, fecha_nacimiento, edad, estatura, peso, tipo_de_sangre, tipo_de_atleta);
        this.puntos = puntos;
    }
    
    @Override
    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Basquetbolista{" + "Puntos=" + puntos + '}';
    }

}
