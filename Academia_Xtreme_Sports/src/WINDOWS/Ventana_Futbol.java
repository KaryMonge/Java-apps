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

import static Objetos.Guardado_de_Datos.futbolistas;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Ventana_Futbol extends javax.swing.JFrame {

    Ventana_Futbol.FondoPanel fondo = new Ventana_Futbol.FondoPanel();

    public Ventana_Futbol() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_FUTBOL = new javax.swing.JTable();
        btnIngresarusuario = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TABLA_FUTBOL.setBackground(new java.awt.Color(153, 255, 153));
        TABLA_FUTBOL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 0)));
        TABLA_FUTBOL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Identificación", "Fecha Nac", "Edad", "Estatura m.", "Peso", "Tipo Sangre", "Pie Dominante", "Posición"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLA_FUTBOL.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TABLA_FUTBOL);
        if (TABLA_FUTBOL.getColumnModel().getColumnCount() > 0) {
            TABLA_FUTBOL.getColumnModel().getColumn(0).setResizable(false);
            TABLA_FUTBOL.getColumnModel().getColumn(1).setResizable(false);
            TABLA_FUTBOL.getColumnModel().getColumn(2).setResizable(false);
            TABLA_FUTBOL.getColumnModel().getColumn(3).setResizable(false);
            TABLA_FUTBOL.getColumnModel().getColumn(4).setResizable(false);
            TABLA_FUTBOL.getColumnModel().getColumn(5).setResizable(false);
            TABLA_FUTBOL.getColumnModel().getColumn(6).setResizable(false);
            TABLA_FUTBOL.getColumnModel().getColumn(7).setResizable(false);
            TABLA_FUTBOL.getColumnModel().getColumn(8).setResizable(false);
        }

        btnIngresarusuario.setBackground(new java.awt.Color(0, 153, 0));
        btnIngresarusuario.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnIngresarusuario.setText("Ingresar nuevo usuario");
        btnIngresarusuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarusuarioActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(0, 153, 0));
        btnsalir.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnIngresarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarusuarioActionPerformed
        //Aquí se hace el llamado de las variables de la ventana de ingreso
        Ingreso_Atletas ventana = new Ingreso_Atletas();
        ventana.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnIngresarusuarioActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        //Aquí se cierra el programa
        //SALIR aquí se cierra el programa.
        System.exit(0);

    }//GEN-LAST:event_btnsalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Aquí se agregan los datos de los futbolistas a la TABLA_FUTBOL.
        DefaultTableModel model = (DefaultTableModel) TABLA_FUTBOL.getModel();
        while (TABLA_FUTBOL.getRowCount() != 0) {
            model.removeRow(0);
        }
        //metodo usado para impresion de variables a la tabla
        String tablaFut[][] = new String[futbolistas.size()][9];
        
        for (int f = 0; f < futbolistas.size(); f++) {

            tablaFut[f][0] = futbolistas.get(f).getNombre();
            tablaFut[f][1] = futbolistas.get(f).getIdentificacion();
            tablaFut[f][2] = futbolistas.get(f).getFecha_nacimiento();
            tablaFut[f][3] = String.valueOf(futbolistas.get(f).getEdad());
            tablaFut[f][4] = String.valueOf(futbolistas.get(f).getEstatura());
            tablaFut[f][5] = String.valueOf(futbolistas.get(f).getPeso());
            tablaFut[f][6] = futbolistas.get(f).getTipo_de_sangre();
            tablaFut[f][7] = (String) futbolistas.get(f).getPie_dominante();
            tablaFut[f][8] = (String) futbolistas.get(f).getPosicion_campo();

        }
        TABLA_FUTBOL.setModel(new javax.swing.table.DefaultTableModel(
                tablaFut,
                new String[]{
                    "Nombre", "Identificacion", "Fecha_nacimiento", "Edad", "Estatura", "Peso", "Tipo_de_sangre","Posicion_campo", "Pie_dominante"
                }
        ));
         // metodo de testeo, ambos funcionales.
        //DefaultTableModel model = (DefaultTableModel) TABLA_FUTBOL.getModel();

        // int total_filas;
        // total_filas= futbolistas.size();
        //for( int i =0; i < total_filas; i ++){
        //   Object[] Fila = {futbolistas.get(i).getPie_dominante(),futbolistas.get(i).getPosicion_campo(),futbolistas.get(i).getIdentificacion(),futbolistas.get(i).getNombre(), futbolistas.get(i).getFecha_nacimiento(),futbolistas.get(i).getEdad(),futbolistas.get(i).getEstatura(),futbolistas.get(i).getPeso(),futbolistas.get(i).getTipo_de_sangre()};
        //  model.addRow((Fila)); 
        // }
        // TABLA_FUTBOL.setModel(model);
        //TABLA_FUTBOL.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Futbol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABLA_FUTBOL;
    private javax.swing.JButton btnIngresarusuario;
    private javax.swing.JButton btnsalir;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
  class FondoPanel extends JPanel {

        private Image imagen;

        @Override

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagen/futbol1.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);

        }
    }

}
