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

package Parte_grafica;

import Parte_Logica.Tree;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class W_tree extends javax.swing.JFrame {
     W_tree.FondoPanel fondo = new W_tree.FondoPanel();

    Tree pino = new Tree();
    int cantidad_nodos = 0;

    public W_tree() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel1.setBackground(new Color(0, 0, 0, 100));
    }
  
    //Nota aclaratoría:  no muestro los números ingresados en uun area de texto, porque en las rúbricas no los solicitan.
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnpeso = new javax.swing.JButton();
        txtpeso = new javax.swing.JTextField();
        btnaltura = new javax.swing.JButton();
        txtaltura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textinsertar = new javax.swing.JTextField();
        btninsertar = new javax.swing.JButton();
        btnpreorder = new javax.swing.JButton();
        txtpreoder = new javax.swing.JTextField();
        btninorder = new javax.swing.JButton();
        txtinorder = new javax.swing.JTextField();
        btnposorder = new javax.swing.JButton();
        txtposorder = new javax.swing.JTextField();
        btnsalir = new javax.swing.JButton();
        btncuantosnodos = new javax.swing.JButton();
        txtcantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jButton3.setText("jButton3");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnpeso.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnpeso.setForeground(new java.awt.Color(102, 0, 153));
        btnpeso.setText("Mostrar peso");
        btnpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesoActionPerformed(evt);
            }
        });
        jPanel1.add(btnpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 160, -1));

        txtpeso.setEditable(false);
        txtpeso.setBackground(new java.awt.Color(255, 255, 255));
        txtpeso.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        txtpeso.setForeground(new java.awt.Color(102, 51, 255));
        jPanel1.add(txtpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 109, 30));

        btnaltura.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnaltura.setForeground(new java.awt.Color(102, 0, 153));
        btnaltura.setText("mostrar altura");
        btnaltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnaltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 160, -1));

        txtaltura.setEditable(false);
        txtaltura.setBackground(new java.awt.Color(255, 255, 255));
        txtaltura.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        txtaltura.setForeground(new java.awt.Color(102, 51, 255));
        jPanel1.add(txtaltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 110, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Digite su nodo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 140, 40));

        textinsertar.setBackground(new java.awt.Color(255, 255, 255));
        textinsertar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        textinsertar.setForeground(new java.awt.Color(102, 51, 255));
        jPanel1.add(textinsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 113, 30));

        btninsertar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btninsertar.setForeground(new java.awt.Color(102, 0, 153));
        btninsertar.setText("Insertar");
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });
        jPanel1.add(btninsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 109, -1));

        btnpreorder.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnpreorder.setForeground(new java.awt.Color(102, 0, 153));
        btnpreorder.setText("Preorden");
        btnpreorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreorderActionPerformed(evt);
            }
        });
        jPanel1.add(btnpreorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 160, 30));

        txtpreoder.setEditable(false);
        txtpreoder.setBackground(new java.awt.Color(255, 255, 255));
        txtpreoder.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        txtpreoder.setForeground(new java.awt.Color(102, 51, 255));
        jPanel1.add(txtpreoder, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 374, 30));

        btninorder.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btninorder.setForeground(new java.awt.Color(102, 0, 153));
        btninorder.setText("Inorden");
        btninorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninorderActionPerformed(evt);
            }
        });
        jPanel1.add(btninorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 160, 30));

        txtinorder.setEditable(false);
        txtinorder.setBackground(new java.awt.Color(255, 255, 255));
        txtinorder.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        txtinorder.setForeground(new java.awt.Color(102, 51, 255));
        jPanel1.add(txtinorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 374, 30));

        btnposorder.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnposorder.setForeground(new java.awt.Color(102, 0, 153));
        btnposorder.setText("Posorden");
        btnposorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnposorderActionPerformed(evt);
            }
        });
        jPanel1.add(btnposorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 160, 30));

        txtposorder.setEditable(false);
        txtposorder.setBackground(new java.awt.Color(255, 255, 255));
        txtposorder.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        txtposorder.setForeground(new java.awt.Color(102, 51, 255));
        jPanel1.add(txtposorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 374, 30));

        btnsalir.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(102, 0, 153));
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, 110, -1));

        btncuantosnodos.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btncuantosnodos.setForeground(new java.awt.Color(102, 0, 153));
        btncuantosnodos.setText("Empezar");
        btncuantosnodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncuantosnodosActionPerformed(evt);
            }
        });
        jPanel1.add(btncuantosnodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 110, -1));

        txtcantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtcantidad.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        txtcantidad.setForeground(new java.awt.Color(102, 51, 255));
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 110, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cuantos nodos desea digitar?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 260, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed

        try {
            int insert_nodo = Integer.parseInt(textinsertar.getText());

            if (insert_nodo > 9999 || insert_nodo < -9999) {

                JOptionPane.showMessageDialog(null, "El número ingresado debe ser menor a 10000 y mayor a -10000 ");
                textinsertar.setText("");

            } else if (pino.conteo_nodos >= cantidad_nodos) {

                JOptionPane.showMessageDialog(null, "Ya alcanzó la cantidad máxima de nodos de " + cantidad_nodos);
                textinsertar.setText("");
            } else {

                pino.insert(insert_nodo);
                textinsertar.setText("");

            }
            
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Debe llenar el espacio con números válidos.");
            textinsertar.setText("");
        }

    }//GEN-LAST:event_btninsertarActionPerformed

    private void btnalturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalturaActionPerformed
        // mostrar altura
        txtaltura.setText(String.valueOf(pino.height()));
    }//GEN-LAST:event_btnalturaActionPerformed

    private void btnpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesoActionPerformed
        // mostrar peso
        txtpeso.setText(String.valueOf(pino.weight()));
    }//GEN-LAST:event_btnpesoActionPerformed

    private void btnpreorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreorderActionPerformed
        // mostrar preorden

        txtpreoder.setText(String.valueOf(pino.preorder_route()));
    }//GEN-LAST:event_btnpreorderActionPerformed

    private void btninorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninorderActionPerformed
        // mostrar inorden

        txtinorder.setText(String.valueOf(pino.inorder_route()));
    }//GEN-LAST:event_btninorderActionPerformed

    private void btnposorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnposorderActionPerformed
        // mostrar posorden

        txtposorder.setText(String.valueOf(pino.posorder_route()));

    }//GEN-LAST:event_btnposorderActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // SALIR
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btncuantosnodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncuantosnodosActionPerformed
        // catidad deseada de nodos

        try {
            cantidad_nodos = Integer.parseInt(txtcantidad.getText());

            if (cantidad_nodos < 1 || cantidad_nodos > 100) {

                JOptionPane.showMessageDialog(null, "Error: La cantidad aceptada de nodos es de 1 hasta 100 ");
                txtcantidad.setText("");
            } else {

                txtcantidad.setEnabled(false);
                btncuantosnodos.setEnabled(false);
                btninsertar.setEnabled(true);
                textinsertar.setEnabled(true);
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Debe llenar el espacio con números válidos.");
            txtcantidad.setText("");
        }
    }//GEN-LAST:event_btncuantosnodosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //
          btninsertar.setEnabled(false);
          textinsertar.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(W_tree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(W_tree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(W_tree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(W_tree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new W_tree().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaltura;
    private javax.swing.JButton btncuantosnodos;
    private javax.swing.JButton btninorder;
    private javax.swing.JButton btninsertar;
    private javax.swing.JButton btnpeso;
    private javax.swing.JButton btnposorder;
    private javax.swing.JButton btnpreorder;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textinsertar;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtinorder;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JTextField txtposorder;
    private javax.swing.JTextField txtpreoder;
    // End of variables declaration//GEN-END:variables
    // codigo para cambiar los fondos a la pantalla, aquì agrego un fondo al panel,
    //importado desde el paquete imagenes creado.
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagen/nodos.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);

        }
    }


}
