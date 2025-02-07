//UNIVERSIDAD ESTATAL A DISTANCIA
//VICERRECTORIA ACADÉMICA
//ESCUELA DE LAS CIENCIAS EXACTAS Y NATURALES
//CATEDRA DESARROLLO DE SISTEMAS
//DIPLOMADO EN INFORMÁTICA

//CÓDIGO:00824

//PROGARMACIÒN INTERMEDIA

//PROYECTO #4

//GRUPO:04

//ESTUDIANTE: ROSA KARINA MONGE DURÁN

//CÉDULA: 112250672

package objetos;

import java.util.Date;

public class BIENESRAICES {
 //variables utilizadas
    private String Nombre;
    private String Identificacion;
    private int Edad;
    private double Ingreso;
    private int Identificador_cotizacion;
    java.util.Date fecha_cotizacion = new Date();
    private double Tamanio_lote;
    private boolean Posee_Construccion;
    private double Valor_de_construccion;
    private int Anio_construccion;
    private String Aplica_bono;
    
     // A continuación se llama al constructor.
    
    //los Getter para acceso a los campos y atributos de una clase.

    public BIENESRAICES(String Nombre, String Identificacion, int Edad, double Ingreso, int Identificador_cotizacion, double Tamanio_lote, boolean Posee_Construccion, double Valor_de_construccion, int Anio_construccion, String Aplica_bono) {
        this.Nombre = Nombre;
        this.Identificacion = Identificacion;
        this.Edad = Edad;
        this.Ingreso = Ingreso;
        this.Identificador_cotizacion = Identificador_cotizacion;
        this.Tamanio_lote = Tamanio_lote;
        this.Posee_Construccion = Posee_Construccion;
        this.Valor_de_construccion = Valor_de_construccion;
        this.Anio_construccion = Anio_construccion;
        this.Aplica_bono = Aplica_bono;
    }
 // los Setters para establecer o asignar un valor a un campo o atributo.
    public String getNombre() {
        return Nombre;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public int getEdad() {
        return Edad;
    }

    public double getIngreso() {
        return Ingreso;
    }

    public int getIdentificador_cotizacion() {
        return Identificador_cotizacion;
    }

    public double getValor_de_construccion() {
        return Valor_de_construccion;
    }

    public Date getFecha_cotizacion() {
        return fecha_cotizacion;
    }

    public boolean isPosee_Construccion() {
        return Posee_Construccion;
    }

    public double getTamanio_lote() {
        return Tamanio_lote;
    }

    public int getAnio_construccion() {
        return Anio_construccion;
    }

    public String getAplica_bono() {
        return Aplica_bono;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setIngreso(double Ingreso) {
        this.Ingreso = Ingreso;
    }

    public void setIdentificador_cotizacion(int Identificador_cotizacion) {
        this.Identificador_cotizacion = Identificador_cotizacion;
    }

    public void setTamanio_lote(double Tamanio_lote) {
        this.Tamanio_lote = Tamanio_lote;
    }

    public void setFecha_cotizacion(Date fecha_cotizacion) {
        this.fecha_cotizacion = fecha_cotizacion;
    }

    public void setPosee_Construccion(boolean Posee_Construccion) {
        this.Posee_Construccion = Posee_Construccion;
    }

    public void setValor_de_construccion(double Valor_de_construccion) {
        this.Valor_de_construccion = Valor_de_construccion;
    }

    public void setAnio_construccion(int Anio_construccion) {
        this.Anio_construccion = Anio_construccion;
    }

    public void setAplica_bono(String Aplica_bono) {
        this.Aplica_bono = Aplica_bono;
    }

}
