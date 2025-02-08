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

import static java.lang.Integer.max;
import javax.swing.JOptionPane;

public class Tree {

    public int conteo_nodos = 0;
    //puntero al nodo raiz
    private Node root = null;

    public boolean empty_tree() {
        return root == null;
    }
    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public void insert_position(Node nod, int numero, boolean left_node) {
        // función recursiva, la cual recibe un nodo, un entero y un booleano.
        Node son_node = new Node();
        if (left_node) {
            son_node = nod.getIzq();

        } else {
            son_node = nod.getDer();

        }

        if (son_node == null) {
            //parada de la recursividad.
            Node new_node = new Node();
            // se inserta el nodo 
            new_node.setNumero(numero);
            new_node.setIzq(null);
            new_node.setDer(null);

            if (left_node) {

                nod.setIzq(new_node);

            } else {

                nod.setDer(new_node);

            }
            conteo_nodos++;

        } else {
            int son_num;
            son_num = son_node.getNumero();
            if (son_num == numero) {
                //  System.out.println("Error: el número " + numero + " ya existe");
                JOptionPane.showMessageDialog(null, "Error: el número " + numero + " ya existe");

            } else if (son_num > numero) {

                insert_position(son_node, numero, true);
            } else {

                insert_position(son_node, numero, false);
            }

        }
    }
    // -----------------------------------------------------------------------------------------------------------------------------------

    public void insert(int numero) {

        if (empty_tree()) {
            Node root_node = new Node();
            // se inserta el nodo raíz
            root_node.setNumero(numero);
            root_node.setIzq(null);
            root_node.setDer(null);

            root = root_node; // esto liga la cajita al árbol. este es el nodo raíz
            conteo_nodos++;
        } else {

            int num_root;
            num_root = root.getNumero();

            if (num_root == numero) {
                //  System.out.println("Error: el número " + numero + " ya existe");
                JOptionPane.showMessageDialog(null, "Error: el número " + numero + " ya existe");

            } else if (num_root > numero) {
                // se inserta a la izquierda

                insert_position(root, numero, true);

            } else {
                // se inserta a la derecha
                insert_position(root, numero, false);
            }
        }

    }
    //----------------------------------------------------------------------------------------------------------------------------------------------------

    public int recursive_height(Node nod) {
        // función recursiva para calcular la altura
        if (nod == null) {
            return 0;

        } else {
            //altura = max(altura(hijo1), altura(hijo2)) + 1
            return max(recursive_height(nod.getIzq()), recursive_height(nod.getDer())) + 1;

        }
    }

    public int height() {
        // función principal para llamar la altura
        if (empty_tree()) {

            return 0;

        } else {

            return recursive_height(root);

        }

    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------
    public int recursive_weight(Node nod) {
        // función recursiva para calcular la altura

        if (nod == null) {
            return 0;

        } else {
            // peso = peso(hijo1) + peso(hijo2) + 1
            return (recursive_weight(nod.getIzq()) + recursive_weight(nod.getDer())) + 1;

        }
    }

    public int weight() {

        // función principal para llamar la altura
        if (empty_tree()) {

            return 0;

        } else {

            return recursive_weight(root);

        }
    }

    //-------------------------------------------------------------------------------------------------------------------------------------------------------
    public String preorder_route() {

        return preorder_route_recursive(root);

    }

    public String preorder_route_recursive(Node nod) {

        if (nod == null) {
            return "";
        } else {

            return String.valueOf(nod.getNumero()) + ", " + preorder_route_recursive(nod.getIzq()) + preorder_route_recursive(nod.getDer());

        }
    }

    public String inorder_route() {

        return inorder_route_recursive(root);

    }

    public String inorder_route_recursive(Node nod) {

        if (nod == null) {
            return "";
        } else {

            return inorder_route_recursive(nod.getIzq()) + String.valueOf(nod.getNumero()) + ", " + inorder_route_recursive(nod.getDer());

        }
    }

    public String posorder_route() {

        return posorder_route_recursive(root);

    }

    public String posorder_route_recursive(Node nod) {

        if (nod == null) {
            return "";
        } else {

            return posorder_route_recursive(nod.getIzq()) + posorder_route_recursive(nod.getDer()) + String.valueOf(nod.getNumero()) + ", ";
        }

    }

    // -----------------------------------------------------------------------------------------------------------------------------------
}
