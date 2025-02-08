package Ventanas;

import Objetos.Arreglos_Pilas;
import Objetos.Persona;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Division_Usuarios extends javax.swing.JFrame {

    Division_Usuarios.FondoPanel fondo = new Division_Usuarios.FondoPanel();
    Arreglos_Pilas datos = new Arreglos_Pilas();

    public Division_Usuarios() {

        this.setContentPane(fondo);// fija el fondo seleccionado en el jpanel
        initComponents();

        this.setLocationRelativeTo(null);

        jPanel3.setBackground(new Color(0, 0, 0, 100));
        PANEL_MENORES.setBackground(new Color(0, 0, 0, 100));
        PANEL_ADULTOS.setBackground(new Color(0, 0, 0, 100));
        PANEL_MAYORES.setBackground(new Color(0, 0, 0, 100));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Aleatoria = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Menores = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_Adultos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabla_Mayores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PANEL_MENORES = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        BTN_ELIM_MENOR = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TXT_MOST_MENOR = new javax.swing.JTextField();
        BTN_VAC_MENOR = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PANEL_ADULTOS = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BTN_ELIM_ADU = new javax.swing.JButton();
        BTN_VAC_ADU = new javax.swing.JButton();
        TXT_MOST_ADUL = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        BTNSALIR = new javax.swing.JButton();
        PANEL_MAYORES = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BTN_ELIM_MAY = new javax.swing.JButton();
        BTN_VAC_MAY = new javax.swing.JButton();
        TXT_MOST_MAY = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Aleatoria.setBackground(new java.awt.Color(0, 0, 0));
        Tabla_Aleatoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 51, 0)));
        Tabla_Aleatoria.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Tabla_Aleatoria.setForeground(new java.awt.Color(255, 153, 0));
        Tabla_Aleatoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICACIÒN", "EDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Aleatoria.setEnabled(false);
        jScrollPane1.setViewportView(Tabla_Aleatoria);
        if (Tabla_Aleatoria.getColumnModel().getColumnCount() > 0) {
            Tabla_Aleatoria.getColumnModel().getColumn(0).setResizable(false);
            Tabla_Aleatoria.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 310, 451));

        Tabla_Menores.setBackground(new java.awt.Color(0, 0, 0));
        Tabla_Menores.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Tabla_Menores.setForeground(new java.awt.Color(255, 153, 0));
        Tabla_Menores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICACIÒN", "EDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Menores.setEnabled(false);
        jScrollPane2.setViewportView(Tabla_Menores);
        if (Tabla_Menores.getColumnModel().getColumnCount() > 0) {
            Tabla_Menores.getColumnModel().getColumn(0).setResizable(false);
            Tabla_Menores.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 310, 451));

        Tabla_Adultos.setBackground(new java.awt.Color(0, 0, 0));
        Tabla_Adultos.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Tabla_Adultos.setForeground(new java.awt.Color(255, 153, 0));
        Tabla_Adultos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICACIÒN", "EDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Adultos.setEnabled(false);
        jScrollPane3.setViewportView(Tabla_Adultos);
        if (Tabla_Adultos.getColumnModel().getColumnCount() > 0) {
            Tabla_Adultos.getColumnModel().getColumn(0).setResizable(false);
            Tabla_Adultos.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 300, 450));

        Tabla_Mayores.setBackground(new java.awt.Color(0, 0, 0));
        Tabla_Mayores.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Tabla_Mayores.setForeground(new java.awt.Color(255, 153, 0));
        Tabla_Mayores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICACIÒN", "EDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Mayores.setEnabled(false);
        jScrollPane4.setViewportView(Tabla_Mayores);
        if (Tabla_Mayores.getColumnModel().getColumnCount() > 0) {
            Tabla_Mayores.getColumnModel().getColumn(0).setResizable(false);
            Tabla_Mayores.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 60, 300, 450));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Unispace", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  DATOS ALEATORIOS");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 220, 27));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Unispace", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  MENORES DE EDAD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 210, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Unispace", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  ADULTOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 130, 27));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Unispace", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" ADULTOS MAYORES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 190, 27));

        PANEL_MENORES.setBackground(new java.awt.Color(0, 0, 0));
        PANEL_MENORES.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        PANEL_MENORES.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("ELIMINAR CÈDULA");

        BTN_ELIM_MENOR.setBackground(new java.awt.Color(51, 51, 51));
        BTN_ELIM_MENOR.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        BTN_ELIM_MENOR.setForeground(new java.awt.Color(255, 102, 0));
        BTN_ELIM_MENOR.setText("ELIMINAR");
        BTN_ELIM_MENOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ELIM_MENORActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("ELEMENTOS");

        TXT_MOST_MENOR.setEditable(false);
        TXT_MOST_MENOR.setBackground(new java.awt.Color(51, 51, 51));
        TXT_MOST_MENOR.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        TXT_MOST_MENOR.setForeground(new java.awt.Color(255, 102, 0));

        BTN_VAC_MENOR.setBackground(new java.awt.Color(51, 51, 51));
        BTN_VAC_MENOR.setFont(new java.awt.Font("Unispace", 3, 12)); // NOI18N
        BTN_VAC_MENOR.setForeground(new java.awt.Color(255, 102, 0));
        BTN_VAC_MENOR.setText("VACIAR");
        BTN_VAC_MENOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_VAC_MENORActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("VACIAR PILA");

        jLabel15.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 153, 0));
        jLabel15.setText("PILA MENORES DE EDAD");

        javax.swing.GroupLayout PANEL_MENORESLayout = new javax.swing.GroupLayout(PANEL_MENORES);
        PANEL_MENORES.setLayout(PANEL_MENORESLayout);
        PANEL_MENORESLayout.setHorizontalGroup(
            PANEL_MENORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_MENORESLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(PANEL_MENORESLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_MENORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(PANEL_MENORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANEL_MENORESLayout.createSequentialGroup()
                        .addComponent(BTN_VAC_MENOR, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_MENORESLayout.createSequentialGroup()
                        .addGroup(PANEL_MENORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTN_ELIM_MENOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TXT_MOST_MENOR))
                        .addGap(17, 17, 17))))
        );
        PANEL_MENORESLayout.setVerticalGroup(
            PANEL_MENORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_MENORESLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(PANEL_MENORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(TXT_MOST_MENOR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PANEL_MENORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_ELIM_MENOR)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(PANEL_MENORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_VAC_MENOR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(PANEL_MENORES, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 310, 190));

        PANEL_ADULTOS.setBackground(new java.awt.Color(0, 0, 0));
        PANEL_ADULTOS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        PANEL_ADULTOS.setForeground(new java.awt.Color(255, 153, 0));

        jLabel6.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("ELIMINAR CÈDULA");

        jLabel9.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("ELEMENTOS");

        BTN_ELIM_ADU.setBackground(new java.awt.Color(51, 51, 51));
        BTN_ELIM_ADU.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        BTN_ELIM_ADU.setForeground(new java.awt.Color(255, 102, 0));
        BTN_ELIM_ADU.setText("ELIMINAR");
        BTN_ELIM_ADU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ELIM_ADUActionPerformed(evt);
            }
        });

        BTN_VAC_ADU.setBackground(new java.awt.Color(51, 51, 51));
        BTN_VAC_ADU.setFont(new java.awt.Font("Unispace", 3, 12)); // NOI18N
        BTN_VAC_ADU.setForeground(new java.awt.Color(255, 102, 0));
        BTN_VAC_ADU.setText("VACIAR");
        BTN_VAC_ADU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_VAC_ADUActionPerformed(evt);
            }
        });

        TXT_MOST_ADUL.setEditable(false);
        TXT_MOST_ADUL.setBackground(new java.awt.Color(51, 51, 51));
        TXT_MOST_ADUL.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        TXT_MOST_ADUL.setForeground(new java.awt.Color(255, 102, 0));

        jLabel13.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setText("VACIAR PILA");

        jLabel16.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 0));
        jLabel16.setText("PILA ADULTOS");

        javax.swing.GroupLayout PANEL_ADULTOSLayout = new javax.swing.GroupLayout(PANEL_ADULTOS);
        PANEL_ADULTOS.setLayout(PANEL_ADULTOSLayout);
        PANEL_ADULTOSLayout.setHorizontalGroup(
            PANEL_ADULTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_ADULTOSLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(PANEL_ADULTOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_ADULTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANEL_ADULTOSLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXT_MOST_ADUL, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PANEL_ADULTOSLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_VAC_ADU, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PANEL_ADULTOSLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(BTN_ELIM_ADU)))
                .addContainerGap())
        );
        PANEL_ADULTOSLayout.setVerticalGroup(
            PANEL_ADULTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_ADULTOSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(27, 27, 27)
                .addGroup(PANEL_ADULTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXT_MOST_ADUL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(PANEL_ADULTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_ELIM_ADU, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(PANEL_ADULTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(BTN_VAC_ADU))
                .addGap(22, 22, 22))
        );

        getContentPane().add(PANEL_ADULTOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 300, 190));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("REINICIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BTNSALIR.setBackground(new java.awt.Color(51, 51, 51));
        BTNSALIR.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        BTNSALIR.setForeground(new java.awt.Color(255, 102, 0));
        BTNSALIR.setText("SALIR");
        BTNSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSALIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTNSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BTNSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 310, 190));

        PANEL_MAYORES.setBackground(new java.awt.Color(0, 0, 0));
        PANEL_MAYORES.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));

        jLabel10.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("ELEMENTOS");

        jLabel11.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("ELIMINAR CÈDULA");

        BTN_ELIM_MAY.setBackground(new java.awt.Color(51, 51, 51));
        BTN_ELIM_MAY.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        BTN_ELIM_MAY.setForeground(new java.awt.Color(255, 102, 0));
        BTN_ELIM_MAY.setText("ELIMINAR");
        BTN_ELIM_MAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ELIM_MAYActionPerformed(evt);
            }
        });

        BTN_VAC_MAY.setBackground(new java.awt.Color(51, 51, 51));
        BTN_VAC_MAY.setFont(new java.awt.Font("Unispace", 3, 12)); // NOI18N
        BTN_VAC_MAY.setForeground(new java.awt.Color(255, 102, 0));
        BTN_VAC_MAY.setText("VACIAR");
        BTN_VAC_MAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_VAC_MAYActionPerformed(evt);
            }
        });

        TXT_MOST_MAY.setEditable(false);
        TXT_MOST_MAY.setBackground(new java.awt.Color(51, 51, 51));
        TXT_MOST_MAY.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        TXT_MOST_MAY.setForeground(new java.awt.Color(255, 102, 0));

        jLabel14.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 0));
        jLabel14.setText("VACIAR PILA");

        jLabel17.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 153, 0));
        jLabel17.setText("PILA ADULTOS MAYORES");

        javax.swing.GroupLayout PANEL_MAYORESLayout = new javax.swing.GroupLayout(PANEL_MAYORES);
        PANEL_MAYORES.setLayout(PANEL_MAYORESLayout);
        PANEL_MAYORESLayout.setHorizontalGroup(
            PANEL_MAYORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_MAYORESLayout.createSequentialGroup()
                .addGroup(PANEL_MAYORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PANEL_MAYORESLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PANEL_MAYORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(PANEL_MAYORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTN_VAC_MAY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTN_ELIM_MAY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PANEL_MAYORESLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXT_MOST_MAY, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_MAYORESLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        PANEL_MAYORESLayout.setVerticalGroup(
            PANEL_MAYORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_MAYORESLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGroup(PANEL_MAYORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANEL_MAYORESLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(TXT_MOST_MAY, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_MAYORESLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PANEL_MAYORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(BTN_ELIM_MAY))
                .addGap(20, 20, 20)
                .addGroup(PANEL_MAYORESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(BTN_VAC_MAY))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PANEL_MAYORES, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 300, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //método eliminacion de cada uno de los elementos tope de la pila
    public void stack_pop(JTable Tabla, Persona[] Vector, JTextField Texto) {
        int i = 0;
        boolean es_nulo = true;

        while (es_nulo) {
            Persona fila = Vector[i];
            if (fila != null) {
                //si no es nulo entonces encontró el tope de la pila.
                // Primero se elimina el elemento del vector.
                int j = 50 - i;
                JOptionPane.showMessageDialog(null, "Elemento a eliminar:\nPosición: " + j + ", ID: " + fila.getIdentificacion());
                Persona elim = null;
                Vector[i] = elim;
                //Segundo, se elimina el dato de la tabla. lo que se hace es volver a pintar la tabla.
                pintado_tablas(Tabla, Vector, Texto);
                es_nulo = false;
            } else {

                // si es nulo entonces incremento el contador para seguir buscando.
                i++;

                if (i == 50) {
                    // se ha recorrido todo el arreglo
                    es_nulo = false;
                    JOptionPane.showMessageDialog(null, "La pila ya está vacía!");
                }

            }
        }
    }

    //método eliminacion de la pila
    public void stack_clean(JTable Tabla, Persona[] Vector, JTextField Texto) {
        int i = 0;
        if ("0".equals(Texto.getText())) {
    // si el txt es igual al "0" tira el mensaje de que la pila ya está vacía, sino sigue vaciándola hasta que la pila esté vacía.
            JOptionPane.showMessageDialog(null, "La pila ya está vacía!");
        } else {
            //este for recorre todo el vector y lo pone en null.
            for (i = 0; i < Vector.length; i++) {
                Persona elim = null;
                Vector[i] = elim;
            }
            //se vuelve a pintar la tabla despues del null, hace el refresh.
            pintado_tablas(Tabla, Vector, Texto);
        }
    }

    //CóDICO GENéRICO PARA PINTAR LAS TABLAS JóVENES, ADULTOS Y MAYORES.
    
    //solo le mando por parámetros la JTable, l vector y el txt, y con este metodo pinto las 3 tablas de edades despendiendo de la tabla que se
    //envíe como parámetro.
    public void pintado_tablas(JTable Tabla, Persona[] Vector, JTextField Texto) {

        DefaultTableModel estilo = new DefaultTableModel();
        estilo.addColumn("Posición");
        estilo.addColumn("Identificación");
        estilo.addColumn("Edad");
        Tabla.setModel(estilo);
        int contador = 0;
        for (int i = 0; i < Vector.length; i++) {
            Persona fila = Vector[i];
            if (fila != null) {
                estilo.addRow(new Object[]{50 - i, fila.getIdentificacion(), fila.getEdad()});
                contador++;
            } else {
                estilo.addRow(new Object[]{50 - i, "", ""});
            }
        }
        Texto.setText(String.valueOf(contador));
    }


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // AQUI VA EL CODIGO APENAS SE HABRE LA VENTANA

        
        //llamado de los vectores
        datos.vector_Personas();
        datos.Vector_edades();
        //pintado de la tabla original
        DefaultTableModel estilo = new DefaultTableModel();
        estilo.addColumn("Posición");
        estilo.addColumn("Identificación");
        estilo.addColumn("Edad");
        Tabla_Aleatoria.setModel(estilo);
        for (int i = 0; i < datos.Todos.length; i++) {
            Persona col1 = datos.Todos[i];
            estilo.addRow(new Object[]{i + 1, col1.getIdentificacion(), col1.getEdad()});

        }
        
        //   for (Persona col : datos.Todos) {
        //      estilo.addRow(new Object[]{col.getPosicion() + 1, col.getIdentificacion(), col.getEdad()});
        //   }
        // pintado de las tablas.
        pintado_tablas(Tabla_Menores, datos.jovenes, TXT_MOST_MENOR);

        pintado_tablas(Tabla_Adultos, datos.adultos, TXT_MOST_ADUL);

        pintado_tablas(Tabla_Mayores, datos.mayores, TXT_MOST_MAY);


    }//GEN-LAST:event_formWindowOpened

    private void BTN_ELIM_MENORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ELIM_MENORActionPerformed
        // Eliminar posición del arreglo jovenes
        stack_pop(Tabla_Menores, datos.jovenes, TXT_MOST_MENOR);

    }//GEN-LAST:event_BTN_ELIM_MENORActionPerformed

    private void BTN_ELIM_ADUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ELIM_ADUActionPerformed
        // Eliminar posición del arreglo adultos
        stack_pop(Tabla_Adultos, datos.adultos, TXT_MOST_ADUL);

    }//GEN-LAST:event_BTN_ELIM_ADUActionPerformed

    private void BTN_ELIM_MAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ELIM_MAYActionPerformed
        // Eliminar posición del arreglo mayores
        stack_pop(Tabla_Mayores, datos.mayores, TXT_MOST_MAY);

    }//GEN-LAST:event_BTN_ELIM_MAYActionPerformed

    private void BTN_VAC_MENORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_VAC_MENORActionPerformed
        // Limpieza de la pila menores
        stack_clean(Tabla_Menores, datos.jovenes, TXT_MOST_MENOR);
    }//GEN-LAST:event_BTN_VAC_MENORActionPerformed

    private void BTN_VAC_ADUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_VAC_ADUActionPerformed
        // Limpieza de la pila adultos
        stack_clean(Tabla_Adultos, datos.adultos, TXT_MOST_ADUL);
    }//GEN-LAST:event_BTN_VAC_ADUActionPerformed

    private void BTN_VAC_MAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_VAC_MAYActionPerformed
        // Limpieza de la pila mayores
        stack_clean(Tabla_Mayores, datos.mayores, TXT_MOST_MAY);
    }//GEN-LAST:event_BTN_VAC_MAYActionPerformed

    private void BTNSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSALIRActionPerformed
        // Salir
        System.exit(0);
    }//GEN-LAST:event_BTNSALIRActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Division_Usuarios ventana = new Division_Usuarios();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNSALIR;
    private javax.swing.JButton BTN_ELIM_ADU;
    private javax.swing.JButton BTN_ELIM_MAY;
    private javax.swing.JButton BTN_ELIM_MENOR;
    private javax.swing.JButton BTN_VAC_ADU;
    private javax.swing.JButton BTN_VAC_MAY;
    private javax.swing.JButton BTN_VAC_MENOR;
    private javax.swing.JPanel PANEL_ADULTOS;
    private javax.swing.JPanel PANEL_MAYORES;
    private javax.swing.JPanel PANEL_MENORES;
    private javax.swing.JTextField TXT_MOST_ADUL;
    private javax.swing.JTextField TXT_MOST_MAY;
    private javax.swing.JTextField TXT_MOST_MENOR;
    private javax.swing.JTable Tabla_Adultos;
    private javax.swing.JTable Tabla_Aleatoria;
    private javax.swing.JTable Tabla_Mayores;
    private javax.swing.JTable Tabla_Menores;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/wallpaperbetter(1).jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);

        }
    }

}
