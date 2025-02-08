package Objetos;

import java.util.Random;

public class Arreglos_Pilas {
    // array que guarda los datos de todos los usuarios.

    public Persona[] Todos = new Persona[50];
    public Persona[] jovenes = new Persona[50];
    public Persona[] adultos = new Persona[50];
    public Persona[] mayores = new Persona[50];

    //método push para apilar
    public void stack_push_method(Persona[] vector, Persona elemento, int i) {
        vector[i] = elemento;
    }

    //  Vector_Aleatorio(0); //este es el llamado del vector
    public void vector_Personas() { //este void genera un vector aleatorio 
        Random rd = new Random();
        // la i es cada posicion del arreglo, a la cual se le va asignar un numero ramdom, el cual no tendrá ID duplicadas.

        int i = 0;
        int j;
        boolean duplex;
        while (i < Todos.length) {
            int cedula = rd.nextInt(900000000) + 100000000;
            j = 0;
            duplex = false;
            while (j < i && !duplex) {
                if (cedula == Todos[j].identificacion) {
                    duplex = true;
                } else {
                    j++;
                }

            }
            if (!duplex) {
                int edad = rd.nextInt(100) + 1;
                Persona todo = new Persona(cedula, edad);
                stack_push_method(Todos, todo, i);
                i++;
            }
        }
    }

    // este es el método para llenar los vectores según sus edades.
    // la primera pila contendrá a las personas menores, es decir las que tienen una edad  inferior a 18. 
    //La segunda pila contendrá a las  personas adultas, es decir las que tienen una edad entre 18 y 64 inclusive. 
    //La tercera pila contendrá a los adultos mayores, es decir las personas con la edad superior a 64. 
    public void Vector_edades() {
        int edad = 0;
        int cedula = 0;
        int j = 49;
        int k = 49;
        int l = 49;

        for (int i = 0; i < 50; i++) {

            edad = Todos[i].edad;
            cedula = Todos[i].identificacion;
            if (edad < 18) {
                //Es una persona menor de edad.
                Persona joven = new Persona(cedula, edad);
                stack_push_method(jovenes, joven, j);
                j--;

            } else if (edad < 65) {
               // es una persona adulta
                Persona adulto = new Persona(cedula, edad);
                stack_push_method(adultos, adulto, k);
                k--;

            } else {
                //es una persona adulta mayor
                Persona mayor = new Persona(cedula, edad);
                stack_push_method(mayores, mayor, l);
                l--;
            }

        }
    }

}
