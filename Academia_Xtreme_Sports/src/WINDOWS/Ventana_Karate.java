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

package WINDOWS;

import static Objetos.Guardado_de_Datos.karatekas;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Ventana_Karate extends javax.swing.JFrame {

    Ventana_Karate.FondoPanel fondo = new Ventana_Karate.FondoPanel();

    public Ventana_Karate() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);

        DefaultTableModel model1 = (DefaultTableModel) TABLA_KARATE.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_KARATE = new javax.swing.JTable();
        btnotrousuario = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TABLA_KARATE.setBackground(new java.awt.Color(255, 153, 153));
        TABLA_KARATE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Identificación", "Fecha Nac", "Edad", "Estatura m.", "Peso", "Tipo Sangre", "Cinta"
            }
        ));
        TABLA_KARATE.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TABLA_KARATE);

        btnotrousuario.setBackground(new java.awt.Color(102, 0, 0));
        btnotrousuario.setForeground(new java.awt.Color(255, 255, 255));
        btnotrousuario.setText("INGRESAR OTRO USUARIO");
        btnotrousuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnotrousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnotrousuarioActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(102, 0, 0));
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("SALIR");
        btnsalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnotrousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnotrousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnotrousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnotrousuarioActionPerformed
        //Aquí se hace el llamado de las variables de la ventana de ingreso
        Ingreso_Atletas ventana = new Ingreso_Atletas();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnotrousuarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Aquí se imprimen los resultados en la tabla de Karate.
        //limpiado de tablas con datos anteriores ,se borran al iniciar nuevamente el programa.
         DefaultTableModel model = (DefaultTableModel) TABLA_KARATE.getModel();
         while(TABLA_KARATE.getRowCount()!=0){
        model.removeRow(0);  
    }
        //testeo y prueba de métodos para agregar los valores a la tabla, ambos funcionales.
        // propósito de aplicaión: conocer cual es más fácil y efectivo.
        
     //método 1
     
     /*   String tablaKar[][] = new String[karatekas.size()][9];

        for (int K = 0; K < karatekas.size(); K++) {

            tablaKar[K][0] = karatekas.get(K).getNombre();
            tablaKar[K][1] = karatekas.get(K).getIdentificacion();
            tablaKar[K][2] = karatekas.get(K).getFecha_nacimiento();
            tablaKar[K][3] = String.valueOf(karatekas.get(K).getEdad());
            tablaKar[K][4] = String.valueOf(karatekas.get(K).getEstatura());
            tablaKar[K][5] = String.valueOf(karatekas.get(K).getPeso());
            tablaKar[K][6] = karatekas.get(K).getTipo_de_sangre();
            tablaKar[K][7] = (String) karatekas.get(K).getCinta_ganada();

        }
        TABLA_KARATE.setModel(new javax.swing.table.DefaultTableModel(
                tablaKar,
                new String[]{
                    "Nombre", "Identificacion", "Fecha_nacimiento", "Edad", "Estatura", "Peso", "Tipo_de_sangre","  Cinta_ganada"
                }
        ));*/

     // medoto 2 de asgnación de varibles utlizado.
        int total_filas;
        total_filas = karatekas.size();

       for (int i = 0; i < total_filas; i++) {
            Object[] Fila = {karatekas.get(i).getNombre(), karatekas.get(i).getIdentificacion(),  karatekas.get(i).getFecha_nacimiento(), karatekas.get(i).getEdad(), karatekas.get(i).getEstatura(), karatekas.get(i).getPeso(),karatekas.get(i).getTipo_de_sangre(), karatekas.get(i).getCinta_ganada()};

            model.addRow((Fila));
        }
        TABLA_KARATE.setModel(model);
        TABLA_KARATE.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // Aquí se sale
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Karate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABLA_KARATE;
    private javax.swing.JButton btnotrousuario;
    private javax.swing.JButton btnsalir;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
 class FondoPanel extends JPanel {

        private Image imagen;

        @Override

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagen/jujuquebonito.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);

        }
    }

}
