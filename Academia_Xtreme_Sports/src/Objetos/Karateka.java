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

//Aquí está la asignación y constructor de la clase hija KARATEKA, aqui se asignó su atributo Cinta.
public class Karateka extends Atleta{
  
   private String cinta_ganada;

    public Karateka(String cinta_ganada, String identificacion, String nombre, String fecha_nacimiento, int edad, float estatura, float peso, String tipo_de_sangre, String tipo_de_atleta) {
        super(identificacion, nombre, fecha_nacimiento, edad, estatura, peso, tipo_de_sangre, tipo_de_atleta);
        this.cinta_ganada = cinta_ganada;
    }

   @Override
    public String getCinta_ganada() {
        return cinta_ganada;
    }

    public void setCinta_ganada(String cinta_ganada) {
        this.cinta_ganada = cinta_ganada;
    }

    @Override
    public String toString() {
        return "Karateka{" + "cinta_ganada=" + cinta_ganada + '}';
    }

}
