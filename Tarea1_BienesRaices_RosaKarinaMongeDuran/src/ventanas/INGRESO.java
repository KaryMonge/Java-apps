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


package ventanas;

import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import objetos.BIENESRAICES;

public class INGRESO extends javax.swing.JFrame {

    INGRESO.FondoPanel fondo = new INGRESO.FondoPanel();

    public INGRESO() {

        this.setContentPane(fondo);

        initComponents();

        this.setLocationRelativeTo(null);

    }
   //Variables utilizadas para pasar de una ventana a otra.
    public static BIENESRAICES datos;
    public static double Valor_lote_sin_imp;
    public static double Calculo_Cons;
    public static double IVA;
    public static double TOTAL;
    public static double Valor_Construccion;
    public static int anio_costruccion;
    @SuppressWarnings("unchecked")

    public static String fechaActual() {

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");

        return formatoFecha.format(fecha);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BtnIngresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtFechaCoti = new javax.swing.JTextField();
        txtIdentificadorC = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtIngreso = new javax.swing.JTextField();
        txttamaniolote = new javax.swing.JTextField();
        checkPoseeConstruccion = new javax.swing.JCheckBox();
        txtAnioConstruccion = new javax.swing.JTextField();
        txtValorconstruccion = new javax.swing.JTextField();
        txtAplicaBono = new javax.swing.JTextField();
        BtnMostrar = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(660, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Ingreso Mensual:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Edad:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Tamaño de Lote:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Año de la Construcción:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Valor de la Construcción:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Aplica Bono:");

        BtnIngresar.setBackground(new java.awt.Color(102, 102, 102));
        BtnIngresar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        BtnIngresar.setForeground(new java.awt.Color(204, 0, 0));
        BtnIngresar.setText("INGRESAR");
        BtnIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Fecha de Cotización:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Identificador De Cotización:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nombre Completo:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Identificación:");

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 3, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("BIENES RAÌCES ROSWELL 47 S.A");

        txtNombre.setBackground(new java.awt.Color(102, 102, 102));
        txtNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));

        txtFechaCoti.setEditable(false);
        txtFechaCoti.setBackground(new java.awt.Color(102, 102, 102));
        txtFechaCoti.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtFechaCoti.setForeground(new java.awt.Color(204, 204, 204));
        txtFechaCoti.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));
        txtFechaCoti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaCotiActionPerformed(evt);
            }
        });

        txtIdentificadorC.setEditable(false);
        txtIdentificadorC.setBackground(new java.awt.Color(102, 102, 102));
        txtIdentificadorC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtIdentificadorC.setForeground(new java.awt.Color(204, 204, 204));
        txtIdentificadorC.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));

        txtIdentificacion.setBackground(new java.awt.Color(102, 102, 102));
        txtIdentificacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtIdentificacion.setForeground(new java.awt.Color(204, 204, 204));
        txtIdentificacion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));

        txtEdad.setBackground(new java.awt.Color(102, 102, 102));
        txtEdad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(204, 204, 204));
        txtEdad.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));

        txtIngreso.setBackground(new java.awt.Color(102, 102, 102));
        txtIngreso.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtIngreso.setForeground(new java.awt.Color(204, 204, 204));
        txtIngreso.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));
        txtIngreso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIngresoFocusLost(evt);
            }
        });

        txttamaniolote.setBackground(new java.awt.Color(102, 102, 102));
        txttamaniolote.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txttamaniolote.setForeground(new java.awt.Color(204, 204, 204));
        txttamaniolote.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));

        checkPoseeConstruccion.setBackground(new java.awt.Color(102, 102, 102));
        checkPoseeConstruccion.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        checkPoseeConstruccion.setForeground(new java.awt.Color(204, 204, 204));
        checkPoseeConstruccion.setText("Posee Construcción");
        checkPoseeConstruccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));
        checkPoseeConstruccion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkPoseeConstruccionStateChanged(evt);
            }
        });

        txtAnioConstruccion.setBackground(new java.awt.Color(102, 102, 102));
        txtAnioConstruccion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtAnioConstruccion.setForeground(new java.awt.Color(204, 204, 204));
        txtAnioConstruccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));

        txtValorconstruccion.setBackground(new java.awt.Color(102, 102, 102));
        txtValorconstruccion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtValorconstruccion.setForeground(new java.awt.Color(204, 204, 204));
        txtValorconstruccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));

        txtAplicaBono.setEditable(false);
        txtAplicaBono.setBackground(new java.awt.Color(102, 102, 102));
        txtAplicaBono.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtAplicaBono.setForeground(new java.awt.Color(204, 204, 204));
        txtAplicaBono.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 51, 0)));

        BtnMostrar.setBackground(new java.awt.Color(102, 102, 102));
        BtnMostrar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        BtnMostrar.setForeground(new java.awt.Color(153, 0, 0));
        BtnMostrar.setText("MOSTRAR");
        BtnMostrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAplicaBono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFechaCoti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(txtIdentificadorC, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIngreso, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txttamaniolote, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAnioConstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtValorconstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(checkPoseeConstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtFechaCoti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdentificadorC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAplicaBono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txttamaniolote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(checkPoseeConstruccion)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnioConstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorconstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Aquì genero la fecha y número de la cotización inmediatamente el usuario abre la ventana.
        // Se le da un valor de ¨0¨ a los texfields de valor de la construcción y año de construcción.
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date Fecha = new Date();
        txtFechaCoti.setText(format.format(Fecha));

        txtIdentificadorC.setText(String.valueOf((int) Math.floor(Math.random() * 30001)));

        checkPoseeConstruccion.setSelected(false);

         txtValorconstruccion.setText("0");
   
        txtAnioConstruccion.setText("0");  
        
    }//GEN-LAST:event_formWindowOpened

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
            // Aquí le doy el valor a los textfields de lo que el usuario digita.
            
        try {

            String Nombre = txtNombre.getText();
            String Identificacion = txtIdentificacion.getText();
            int Edad = Integer.parseInt(txtEdad.getText());
            double Ingreso = Double.parseDouble(txtIngreso.getText());
            int Identificador_cotizacion = Integer.parseInt(txtIdentificadorC.getText());
            double Tamanio_lote = Float.parseFloat(txttamaniolote.getText());
            boolean Posee_Construccion = checkPoseeConstruccion.isSelected();
            double Valor_de_construccion = Double.parseDouble(txtValorconstruccion.getText());
            int Anio_construccion = Integer.parseInt(txtAnioConstruccion.getText());
            String Aplica_bono = txtAplicaBono.getText();
            
            //Aquí hago las respectivas validaciones de lo digitado por el ususraio.
            if (Nombre.isEmpty() || Identificacion.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Debe llenar los espacios en blanco");
            } else if (Edad < 18 || Edad > 120) {
                JOptionPane.showMessageDialog(null, "NO esta entre el Rango de edad permitido");

            } else if (Identificacion.length() > 10 || Identificacion.length() < 10) {

                JOptionPane.showMessageDialog(null, "La Identificacion no debe mayor o menor a 10 digitos");

            } else if (Nombre.length() > 50) {
                JOptionPane.showMessageDialog(null, "El nombre no debe ser mayor a 50 dígitos");

            } else {
                datos = new BIENESRAICES(Nombre, Identificacion, Edad, Ingreso, Identificador_cotizacion, Tamanio_lote, Posee_Construccion,Valor_de_construccion, Anio_construccion, Aplica_bono);
                //se agregan los valores al constructor generado en bienes raices, esto también sirve si se deseara 
                //hacer un array list si se deseara guardar la información de todos los ingresados mas adelante.

            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Debe Digitar los Valores  Correspondientes");
        }
    }//GEN-LAST:event_BtnIngresarActionPerformed

    private void txtIngresoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIngresoFocusLost
        // Validación para que , al digitar valores menores a 350000, se genere el bono o no
        // en la casilla de Aplica Bono.
        try {
            double Ingreso = Double.parseDouble(txtIngreso.getText());
            if (Ingreso < 350000) {

                txtAplicaBono.setText("Aplica Bono");
            } else {
                txtAplicaBono.setText("No Aplica");
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Debe Digitar los Valores Numéricos Correspondientes");
        }
    }//GEN-LAST:event_txtIngresoFocusLost

    private void txtFechaCotiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaCotiActionPerformed

    }//GEN-LAST:event_txtFechaCotiActionPerformed

    private void checkPoseeConstruccionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkPoseeConstruccionStateChanged
        //Aquí se habilitan o desabilitan las casillas si el usuario digita posee construccion o no.

        boolean Posee_Construccion;

        if (Posee_Construccion = checkPoseeConstruccion.isSelected()) {

            txtValorconstruccion.setEnabled(true);
            txtAnioConstruccion.setEnabled(true);
 
        } else {
            txtValorconstruccion.setEnabled(false);
            txtValorconstruccion.setText("0");
            txtAnioConstruccion.setEnabled(false);
            txtAnioConstruccion.setText("0");
        }
    }//GEN-LAST:event_checkPoseeConstruccionStateChanged

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        //Aquí se hace el traspaso de una ventana hacia la otra, con las variables definidas al inicio.

        if (datos != null) {
            Calculo_Cons = (float) (datos.getValor_de_construccion() * 0.30);
            Valor_lote_sin_imp = (datos.getTamanio_lote() * 300) + (Calculo_Cons);
            IVA = (float) ((Valor_lote_sin_imp * 0.10) + (Calculo_Cons * 0.05));
            TOTAL = Valor_lote_sin_imp + IVA;
            Valor_Construccion = Double.parseDouble(txtValorconstruccion.getText());
           
                    
            Cotizacion Ventana = new Cotizacion();
            Ventana.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Debe Digitar los Valores primero");
        }
    }//GEN-LAST:event_BtnMostrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INGRESO().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JCheckBox checkPoseeConstruccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField txtAnioConstruccion;
    private javax.swing.JTextField txtAplicaBono;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFechaCoti;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtIdentificadorC;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtValorconstruccion;
    private javax.swing.JTextField txttamaniolote;
    // End of variables declaration//GEN-END:variables

        // codigo para cambiar los fondos a la pantalla, aquì agrego un fondo al panel,
    //importado desde el paquete imagenes creado.
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagen/science-fiction.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);

        }
    }

}
