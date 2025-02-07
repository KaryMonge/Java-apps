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

// este es el contructor de la clase hija Futbolista, se asignan los atributos pie dominate y posición del campo, luego se crea el constructor.
public class Futbolista extends Atleta {
    
    private String pie_dominante;
    private String posicion_campo;

    public Futbolista(String pie_dominante, String posicion_campo, String identificacion, String nombre, String fecha_nacimiento, int edad, float estatura, float peso, String tipo_de_sangre, String tipo_de_atleta) {
        super(identificacion, nombre, fecha_nacimiento, edad, estatura, peso, tipo_de_sangre, tipo_de_atleta);
        this.pie_dominante = pie_dominante;
        this.posicion_campo = posicion_campo;
    }

    @Override
    public String getPie_dominante() {
        return pie_dominante;
    }

    @Override
    public String getPosicion_campo() {
        return posicion_campo;
    }

    public void setPie_dominante(String pie_dominante) {
        this.pie_dominante = pie_dominante;
    }

    public void setPosicion_campo(String posicion_campo) {
        this.posicion_campo = posicion_campo;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "pie_dominante=" + pie_dominante + ", posicion_campo=" + posicion_campo + '}';
    }
    
}
