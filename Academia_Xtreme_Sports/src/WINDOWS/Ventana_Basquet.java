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
//importación de el array desde la clase Guardado de Datos.
//directorio para el uso de la tabla
// gráficos para establecer fondo al panel.
import static Objetos.Guardado_de_Datos.basquetbolistas;
import java.awt.Graphics;
import javax.swing.table.DefaultTableModel;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Ventana_Basquet extends javax.swing.JFrame {

    Ventana_Basquet.FondoPanel fondo = new Ventana_Basquet.FondoPanel();

    public Ventana_Basquet() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_BASQUET = new javax.swing.JTable();
        btningresarusuario = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TABLA_BASQUET.setBackground(new java.awt.Color(204, 204, 204));
        TABLA_BASQUET.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        TABLA_BASQUET.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Identificación", "Fecha Nac", "Edad", "Estatura m.", "Peso", "Tipo Sangre", "Puntos Obtenidos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TABLA_BASQUET);
        if (TABLA_BASQUET.getColumnModel().getColumnCount() > 0) {
            TABLA_BASQUET.getColumnModel().getColumn(0).setResizable(false);
            TABLA_BASQUET.getColumnModel().getColumn(1).setResizable(false);
            TABLA_BASQUET.getColumnModel().getColumn(2).setResizable(false);
            TABLA_BASQUET.getColumnModel().getColumn(3).setResizable(false);
            TABLA_BASQUET.getColumnModel().getColumn(4).setResizable(false);
            TABLA_BASQUET.getColumnModel().getColumn(5).setResizable(false);
            TABLA_BASQUET.getColumnModel().getColumn(6).setResizable(false);
            TABLA_BASQUET.getColumnModel().getColumn(7).setResizable(false);
        }

        btningresarusuario.setBackground(new java.awt.Color(102, 102, 102));
        btningresarusuario.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        btningresarusuario.setForeground(new java.awt.Color(255, 255, 255));
        btningresarusuario.setText("INGRESAR OTRO USUARIO");
        btningresarusuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btningresarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarusuarioActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(102, 102, 102));
        btnsalir.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
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
                .addGap(41, 41, 41)
                .addComponent(btningresarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btningresarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarusuarioActionPerformed
        //Aquí se hace el llamado de la la ventana de ingreso
        Ingreso_Atletas ventana = new Ingreso_Atletas();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btningresarusuarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Aquí se agregan los datos de los futbolistas a la TABLA_Basquet.
        DefaultTableModel model = (DefaultTableModel) TABLA_BASQUET.getModel();
        
        //se hace un testeo de 2 metodos para agregar las variables digitadas por el usuario. ambas funcionales. 
        
        while (TABLA_BASQUET.getRowCount() != 0) {
            model.removeRow(0);
        }
        
                int total_filas;
        total_filas = basquetbolistas.size();

       for (int i = 0; i < total_filas; i++) {
            Object[] Fila = {basquetbolistas.get(i).getNombre(), basquetbolistas.get(i).getIdentificacion(),  basquetbolistas.get(i).getFecha_nacimiento(), basquetbolistas.get(i).getEdad(), basquetbolistas.get(i).getEstatura(), basquetbolistas.get(i).getPeso(),basquetbolistas.get(i).getTipo_de_sangre(), basquetbolistas.get(i).getPuntos()};
               // , basquetbolistas.get(i).getPuntos()
            model.addRow((Fila));
        }
        TABLA_BASQUET.setModel(model);
        TABLA_BASQUET.setEnabled(false);

       /* String tablaBas[][] = new String[basquetbolistas.size()][8];

        for (int b = 0; b < basquetbolistas.size(); b++) {

            tablaBas[b][0] = basquetbolistas.get(b).getNombre();
            tablaBas[b][1] = basquetbolistas.get(b).getIdentificacion();
            tablaBas[b][2] = basquetbolistas.get(b).getFecha_nacimiento();
            tablaBas[b][3] = String.valueOf(basquetbolistas.get(b).getEdad());
            tablaBas[b][4] = String.valueOf(basquetbolistas.get(b).getEstatura());
            tablaBas[b][5] = String.valueOf(basquetbolistas.get(b).getPeso());
            tablaBas[b][6] = basquetbolistas.get(b).getTipo_de_sangre();
            tablaBas[b][7] = (String) basquetbolistas.get(b).getPuntos();

        }
         TABLA_BASQUET.setModel(new javax.swing.table.DefaultTableModel(
                tablaBas,
                new String[]{
                    "Nombre", "Identificacion", "Fecha_nacimiento", "Edad", "Estatura", "Peso", "Tipo_de_sangre"//,"Puntos"
                }
        ));*/
    }//GEN-LAST:event_formWindowOpened

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        //SALIDA
        System.exit(0);

    }//GEN-LAST:event_btnsalirActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Basquet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Basquet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Basquet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Basquet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Basquet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABLA_BASQUET;
    private javax.swing.JButton btningresarusuario;
    private javax.swing.JButton btnsalir;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
 class FondoPanel extends JPanel {
       //código para asignar fondo al panel
        private Image imagen;

        @Override

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagen/27d09d6.png")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);

        }
    }

}
