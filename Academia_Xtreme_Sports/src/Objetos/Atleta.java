//UNIVERSIDAD ESTATAL A DISTANCIA
//VICERRECTORIA ACADÉMICA
//ESCUELA DE LAS CIENCIAS EXACTAS Y NATURALES
//CATEDRA DESARROLLO DE SISTEMAS
//DIPLOMADO EN INFORMÁTICA

//CÓDIGO:00824

//PROGARMACIÒN INTERMEDIA

//Tarea 2

//GRUPO:04

//ESTUDIANTE: ROSA KARINA MONGE DURÁN

//CÉDULA: 112250672
package Objetos;

public class Atleta {

    protected String identificacion;
    protected String nombre;
    protected String fecha_nacimiento;
    protected int edad;
    protected float estatura;
    protected float peso;
    protected String tipo_de_sangre;
    protected String tipo_de_atleta;

    public Atleta(String identificacion, String nombre, String fecha_nacimiento, int edad, float estatura, float peso, String tipo_de_sangre, String tipo_de_atleta) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.tipo_de_sangre = tipo_de_sangre;
        this.tipo_de_atleta = tipo_de_sangre;

    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public float getPeso() {
        return peso;
    }

    public String getTipo_de_sangre() {
        return tipo_de_sangre;
    }

    public String getTipo_de_atleta() {
        return tipo_de_atleta;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setTipo_de_sangre(String tipo_de_sangre) {
        this.tipo_de_sangre = tipo_de_sangre;
    }

    public void setTipo_de_atleta(String tipo_de_atleta) {
        this.tipo_de_atleta = tipo_de_atleta;
    }

    @Override
    public String toString() {
        return "Atleta{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", edad=" + edad + ", estatura=" + estatura + ", peso=" + peso + ", tipo_de_sangre=" + tipo_de_sangre + ", tipo_de_atleta=" + tipo_de_atleta + '}';
    }

    public Object getPie_dominante() {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getPosicion_campo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getPuntos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getCinta_ganada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
