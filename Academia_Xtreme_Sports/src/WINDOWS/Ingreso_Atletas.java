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

//importacion de los array list para ingresar usuarios.
import Objetos.Basquetbolista;
import Objetos.Funciones;
import Objetos.Futbolista;
import Objetos.Guardado_de_Datos;
import Objetos.Karateka;

//librerías para asignar fondos al panel,asignar formato fecha,y el JOption para los mensajes de error.
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ingreso_Atletas extends javax.swing.JFrame {

    //código para fijar el fondo de la pantalla.
    Ingreso_Atletas.FondoPanel fondo = new Ingreso_Atletas.FondoPanel();

    public Ingreso_Atletas() {
       //código para establecer el fondo de pantalla.
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel1.setBackground(new Color(0, 0, 0, 100));
        jPanel2.setBackground(new Color(0, 0, 0, 100));
        Panelfutbol.setBackground(new Color(0, 0, 0, 100));
        Panelbasquet.setBackground(new Color(0, 0, 0, 100));
        Panelkarate.setBackground(new Color(0, 0, 0, 100));
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtidentificacion = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtestatura = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        cbxdisciplina = new javax.swing.JComboBox<>();
        cbxsangre = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        Btningresar = new javax.swing.JButton();
        btnlistadeusuarios = new javax.swing.JButton();
        Panelfutbol = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbxpiedominante = new javax.swing.JComboBox<>();
        cbxposicioncampo = new javax.swing.JComboBox<>();
        Panelbasquet = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtpuntos = new javax.swing.JTextField();
        Panelkarate = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cbxcintaganada = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(950, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("  ACADEMIA XTREME SPORTS");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre completo:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Identificación:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Nac.");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Edad:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estatura en metros: ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Peso en kilos:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo de Sangre:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Disciplina:");

        txtedad.setEditable(false);
        txtedad.setText("0");

        cbxdisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fútbol", "Baloncesto", "Karate" }));
        cbxdisciplina.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxdisciplinaItemStateChanged(evt);
            }
        });

        cbxsangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));

        jSpinner1.setModel(new javax.swing.SpinnerDateModel());
        jSpinner1.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner1, "dd/MM/yyyy"));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtestatura, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxsangre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxdisciplina, 0, 134, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtestatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbxsangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbxdisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        Btningresar.setBackground(new java.awt.Color(102, 102, 102));
        Btningresar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        Btningresar.setForeground(new java.awt.Color(204, 0, 0));
        Btningresar.setText("INGRESAR USUARIO");
        Btningresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtningresarActionPerformed(evt);
            }
        });

        btnlistadeusuarios.setBackground(new java.awt.Color(102, 102, 102));
        btnlistadeusuarios.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnlistadeusuarios.setForeground(new java.awt.Color(204, 0, 0));
        btnlistadeusuarios.setText(" LISTA DE  USUARIOS");
        btnlistadeusuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlistadeusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistadeusuariosActionPerformed(evt);
            }
        });

        Panelfutbol.setBackground(new java.awt.Color(51, 51, 51));
        Panelfutbol.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fútbol");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Pie Dominante:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Posición en el campo:");

        cbxpiedominante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Derecho", "Izquierdo" }));

        cbxposicioncampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Defensa", "Delantero", "Mediocampista" }));

        javax.swing.GroupLayout PanelfutbolLayout = new javax.swing.GroupLayout(Panelfutbol);
        Panelfutbol.setLayout(PanelfutbolLayout);
        PanelfutbolLayout.setHorizontalGroup(
            PanelfutbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelfutbolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelfutbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelfutbolLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelfutbolLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxpiedominante, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelfutbolLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(cbxposicioncampo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelfutbolLayout.setVerticalGroup(
            PanelfutbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelfutbolLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelfutbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbxpiedominante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelfutbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cbxposicioncampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        Panelbasquet.setBackground(new java.awt.Color(51, 51, 51));
        Panelbasquet.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Baloncesto");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("promedio de puntos por partido:");

        javax.swing.GroupLayout PanelbasquetLayout = new javax.swing.GroupLayout(Panelbasquet);
        Panelbasquet.setLayout(PanelbasquetLayout);
        PanelbasquetLayout.setHorizontalGroup(
            PanelbasquetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelbasquetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelbasquetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelbasquetLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelbasquetLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(txtpuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelbasquetLayout.setVerticalGroup(
            PanelbasquetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelbasquetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelbasquetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtpuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        Panelkarate.setBackground(new java.awt.Color(51, 51, 51));
        Panelkarate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Karate");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Cinta Ganada:");

        cbxcintaganada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco", "Amarillo", "Naranja", "Verde", "Azul", "Marrón", "Negro" }));

        javax.swing.GroupLayout PanelkarateLayout = new javax.swing.GroupLayout(Panelkarate);
        Panelkarate.setLayout(PanelkarateLayout);
        PanelkarateLayout.setHorizontalGroup(
            PanelkarateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelkarateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelkarateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelkarateLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelkarateLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(cbxcintaganada, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        PanelkarateLayout.setVerticalGroup(
            PanelkarateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelkarateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(PanelkarateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cbxcintaganada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("DATOS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(Btningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panelkarate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlistadeusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panelbasquet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panelfutbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Panelfutbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Panelbasquet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panelkarate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlistadeusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtningresarActionPerformed
        // Aquí ingresan los textos que digita el usuario y se asignan asus respectivas variables.
        //seguidamente se validan.

        try {
            String nombre = txtnombre.getText();
            String identificacion = txtidentificacion.getText();
            Date date = (Date) jSpinner1.getValue();
            String fecha_nacimiento = Funciones.formato.format(date);
            int edad = Integer.parseInt(txtedad.getText());
            String tipo_de_atleta = cbxdisciplina.getSelectedItem().toString();
            
            
            
            if (nombre.isEmpty() || identificacion.isEmpty() || txtestatura.getText().isEmpty() || txtpeso.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Debe llenar los espacios en blanco");

                return;
            }

            if (identificacion.length() < 0 || identificacion.length() > 15) {

                JOptionPane.showMessageDialog(null, "La Identificacion no debe mayor a 15 digitos");

                return;

            }
            if ( nombre.length() > 30) {
                JOptionPane.showMessageDialog(null, "El nombre no debe ser mayor a 30 dígitos");

                return;

            }
            if (edad < 7|| edad >120) {

                JOptionPane.showMessageDialog(null, "No se permiten menores a 7 años o mayores a 120");
                JOptionPane.showMessageDialog(null, "Asegurese de digitar el formato de fecha correctamente: dd/mm/aaaaa");

                return;
            }

            float estatura = Float.parseFloat(txtestatura.getText());
            if(estatura<0.50 || estatura > 2.71){
                //según investigación la estatura de la persona mas alta del mundo es de 2.71, por lo que se validó como el máximo 2.80cm.
                JOptionPane.showMessageDialog(null, "Asegurese de digitar la altura correctamente formato 'm.cm'");
              
                 
                return;
            }
            
            float peso = Float.parseFloat(txtpeso.getText());
            if(peso<0 || peso > 500){
                //Según investigación el peso máximo de un adulto fue de 594 kilos, por lo que la validación de peso máximo fue 500 kilos.
                JOptionPane.showMessageDialog(null, "Asegurese de digitar el peso correctamente");
                return;
            }
            

            //Aquí le doy un valor al tipo de sangre.
            String tipo_de_sangre = "A+";
            switch (cbxsangre.getSelectedItem().toString()) {

                case "A+":
                    tipo_de_sangre = "A+";
                    break;
                case "A-":
                    tipo_de_sangre = "A-";
                    break;
                case "B+":
                    tipo_de_sangre = "B+";
                    break;
                case "B-":
                    tipo_de_sangre = "B-";
                    break;
                case "O+":
                    tipo_de_sangre = "O-";
                    break;
                case "AB+":
                    tipo_de_sangre = "AB+";
                    break;
                case "AB-":
                    tipo_de_sangre = "AB-";
                    break;

            }
            //Aquí en este switch valido los atributos de las clases hijas,seleccionados por el ususario según la disciplina correpondinte.
            switch (cbxdisciplina.getSelectedItem().toString()) {

                case "Fútbol":
                    //String  = cbxpiedominante.getSelectedItem().toString();
                    String pie_dominante = "Derecho";
                    switch (cbxpiedominante.getSelectedItem().toString()) {

                        case "Derecho":
                            pie_dominante = "Derecho";
                            break;
                        case "Izquierdo":
                            pie_dominante = "Izquierdo";
                            break;
                    }
                    // String posicion_campo = cbxposicioncampo.getSelectedItem().toString());
                    String posicion_campo = "Defensa";
                    switch (cbxposicioncampo.getSelectedItem().toString()) {

                        case "Defensa":
                            posicion_campo = "Defensa";
                            break;
                        case "Delantero":
                            posicion_campo = "Delantero";
                            break;
                        case "Mediocampista":
                            posicion_campo = "Mediocampista";
                            break;
                    }

                    Futbolista futbolista = new Futbolista(posicion_campo, pie_dominante, identificacion, nombre, fecha_nacimiento, edad, estatura, peso, tipo_de_sangre, tipo_de_atleta);
                    Guardado_de_Datos.futbolistas.add(futbolista);
                    JOptionPane.showMessageDialog(null, "Seleccionó Fútbol");
                    break;

                case "Baloncesto":
                    double puntos = Double.parseDouble(txtpuntos.getText());
                    if (puntos< 0 || puntos > 50) {
                        JOptionPane.showMessageDialog(null, "La puntuacion permitida de 0 a 50");
                    } else {
                       
                        Basquetbolista basquetbolista = new Basquetbolista(String.valueOf(puntos), identificacion, nombre, fecha_nacimiento, edad, estatura, peso, tipo_de_sangre, tipo_de_atleta);

                        Guardado_de_Datos.basquetbolistas.add(basquetbolista);

                        JOptionPane.showMessageDialog(null, "Seleccionó Baloncesto");
                    }
                    break;

                case "Karate":
                    //String  = cbxcintaganada.getSelectedItem().toString();

                    String cinta_ganada = "Blanco";
                    switch (cbxcintaganada.getSelectedItem().toString()) {
                        case " Blanco":
                            cinta_ganada = "Blanco";
                            break;
                        case "Amarillo":
                            cinta_ganada = "Amarillo";
                            break;
                        case "Naranja":
                            cinta_ganada = "Naranja";
                            break;
                        case "Verde":
                            cinta_ganada = "Verde";
                            break;
                        case "Azul":
                            cinta_ganada = "Azul";
                            break;
                        case "Marrón":
                            cinta_ganada = "Marrón";
                            break;
                        case "Negro":
                            cinta_ganada = "Negro";
                            break;

                    }
                    Karateka karateka = new Karateka(cinta_ganada, identificacion, nombre, fecha_nacimiento, edad, estatura, peso, tipo_de_sangre, tipo_de_atleta);
                    Guardado_de_Datos.karatekas.add(karateka);
                    JOptionPane.showMessageDialog(null, "Seleccionó Karate");
                    break;
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Debe Digitar los Valores  Correspondientes");

        }

    }//GEN-LAST:event_BtningresarActionPerformed

    private void btnlistadeusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistadeusuariosActionPerformed
        // Aquí se muestran las ventanas segun la seleccion de disciplina del usuario.

        switch (cbxdisciplina.getSelectedItem().toString()) {

            case "Fútbol":

                Ventana_Futbol ventana = new Ventana_Futbol();
                ventana.setVisible(true);
                this.dispose();

                break;

            case "Baloncesto":

                Ventana_Basquet ventana1 = new Ventana_Basquet();
                ventana1.setVisible(true);
                this.dispose();
                break;

            case "Karate":

                Ventana_Karate ventana2 = new Ventana_Karate();
                ventana2.setVisible(true);
                this.dispose();
                break;
        }

    }//GEN-LAST:event_btnlistadeusuariosActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // Aqui se le da el formato al spiner de fecha.
        Date date = (Date) jSpinner1.getValue();
        txtedad.setText(String.valueOf(Funciones.getedad(Funciones.formato.format(date))));
        
        
        
    }//GEN-LAST:event_jSpinner1StateChanged

    private void cbxdisciplinaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxdisciplinaItemStateChanged
        // Aquí se hace visible el panel solamente de la disciplina elegida.  

        switch (cbxdisciplina.getSelectedItem().toString()) {

            case "Fútbol":
                Panelfutbol.setVisible(true);
                Panelkarate.setVisible(false);
                Panelbasquet.setVisible(false);

                break;

            case "Baloncesto":

                Panelbasquet.setVisible(true);
                Panelfutbol.setVisible(false);
                Panelkarate.setVisible(false);

                break;

            case "Karate":

                Panelkarate.setVisible(true);
                Panelbasquet.setVisible(false);
                Panelfutbol.setVisible(false);

                break;

        }


    }//GEN-LAST:event_cbxdisciplinaItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Aquíhago invisibles los paneles de las disciploinas al habrir la ventana.
        Panelfutbol.setVisible(true);
        Panelkarate.setVisible(false);
        Panelbasquet.setVisible(false);


    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso_Atletas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btningresar;
    private javax.swing.JPanel Panelbasquet;
    private javax.swing.JPanel Panelfutbol;
    private javax.swing.JPanel Panelkarate;
    private javax.swing.JButton btnlistadeusuarios;
    private javax.swing.JComboBox<String> cbxcintaganada;
    private javax.swing.JComboBox<String> cbxdisciplina;
    private javax.swing.JComboBox<String> cbxpiedominante;
    private javax.swing.JComboBox<String> cbxposicioncampo;
    private javax.swing.JComboBox<String> cbxsangre;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtestatura;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JTextField txtpuntos;
    // End of variables declaration//GEN-END:variables
    // codigo para cambiar los fondos a la pantalla, aquì agrego un fondo al panel,
    //importado desde el paquete imagenes creado.
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagen/dragonrojo.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);

        }
    }

}
