//UNIVERSIDAD ESTATAL A DISTANCIA
//VICERRECTORIA ACADÉMICA
//ESCUELA DE LAS CIENCIAS EXACTAS Y NATURALES
//CATEDRA DESARROLLO DE SISTEMAS
//DIPLOMADO EN INFORMÁTICA
//CÓDIGO:00825
//ESTRUCTURA DE DATOS
//EXAMEN
//GRUPO:03
//ESTUDIANTE: ROSA KARINA MONGE DURÁN
//CÉDULA: 112250672


package Parte_Logica;


public class Node {

    // info
    protected int numero;

    // caracteristicas
    // private int altura;
    
    protected Node izq;
    protected Node der;

    Node() {

    }

    public Node(int numero, Node padre, Node izq, Node der) {
        this.numero = numero;
    
        this.izq = izq;
        this.der = der;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Node getIzq() {
        return izq;
    }

    public void setIzq(Node izq) {
        this.izq = izq;
    }

    public Node getDer() {
        return der;
    }

    public void setDer(Node der) {
        this.der = der;
    }

}
