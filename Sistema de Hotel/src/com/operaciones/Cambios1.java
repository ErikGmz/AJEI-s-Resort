//---Paquete---//.
package com.operaciones;

//---Sentencias import---//.

import com.bases_de_datos.ConexionMySQL;
import java.sql.PreparedStatement;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;


//---Clase pública---//.
public class Cambios1 extends javax.swing.JInternalFrame {

    //---Atributos adicionales---//.
    private int identificador = 0;
    private Date fechaIngreso = new Date();
    private String numeroHabitacion;
    private ArrayList<String> cadenas = new ArrayList<>();
    private ArrayList<Integer> numeros = new ArrayList<>();
    
    //---Constructor---//.
    public Cambios1() {
        initComponents();
        extraInitProcess();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jCheckBoxGolf = new javax.swing.JCheckBox();
        jCheckBoxArco = new javax.swing.JCheckBox();
        jCheckBoxTennis = new javax.swing.JCheckBox();
        jCheckBoxJuegos = new javax.swing.JCheckBox();
        jCheckBoxGimnasio = new javax.swing.JCheckBox();
        jCheckBoxCuidado = new javax.swing.JCheckBox();
        jCheckBoxSPA = new javax.swing.JCheckBox();
        jCheckBoxTintoreria = new javax.swing.JCheckBox();
        jCheckBoxBar = new javax.swing.JCheckBox();
        jCheckBoxCuarto = new javax.swing.JCheckBox();
        jLabelServicios = new javax.swing.JLabel();
        jSpinnerDias = new javax.swing.JSpinner();
        jLabelDias = new javax.swing.JLabel();
        jLabelPersonasExtra = new javax.swing.JLabel();
        jComboBoxExtra = new javax.swing.JComboBox();
        jTextFieldCiudad = new javax.swing.JTextField();
        jLabelCiudad = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jButtonCambios = new javax.swing.JButton();
        jLabelHabitacion = new javax.swing.JLabel();
        jTextFieldHabitacion = new javax.swing.JTextField();
        jButtonBusqueda = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();
        jTextFieldResultado = new javax.swing.JTextField();

        jCheckBoxGolf.setText("Campo de golf");
        jCheckBoxGolf.setEnabled(false);
        jCheckBoxGolf.setFocusPainted(false);

        jCheckBoxArco.setText("Campo de tiro con arco");
        jCheckBoxArco.setEnabled(false);
        jCheckBoxArco.setFocusPainted(false);

        jCheckBoxTennis.setText("Canchas de tennis");
        jCheckBoxTennis.setEnabled(false);
        jCheckBoxTennis.setFocusPainted(false);

        jCheckBoxJuegos.setText("Acceso a zona de juegos");
        jCheckBoxJuegos.setEnabled(false);
        jCheckBoxJuegos.setFocusPainted(false);

        jCheckBoxGimnasio.setText("Acceso a gimnasio");
        jCheckBoxGimnasio.setEnabled(false);
        jCheckBoxGimnasio.setFocusPainted(false);

        jCheckBoxCuidado.setText("Contratación de niñera");
        jCheckBoxCuidado.setEnabled(false);
        jCheckBoxCuidado.setFocusPainted(false);

        jCheckBoxSPA.setText("Acceso al SPA");
        jCheckBoxSPA.setEnabled(false);
        jCheckBoxSPA.setFocusPainted(false);

        jCheckBoxTintoreria.setText("Acceso a tintorería");
        jCheckBoxTintoreria.setEnabled(false);
        jCheckBoxTintoreria.setFocusPainted(false);

        jCheckBoxBar.setText("Acceso al bar");
        jCheckBoxBar.setEnabled(false);
        jCheckBoxBar.setFocusPainted(false);

        jCheckBoxCuarto.setText("Atención al cuarto");
        jCheckBoxCuarto.setEnabled(false);
        jCheckBoxCuarto.setFocusPainted(false);

        jLabelServicios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelServicios.setText("Servicios adicionales:");
        jLabelServicios.setEnabled(false);

        jSpinnerDias.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        jSpinnerDias.setEnabled(false);

        jLabelDias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDias.setText("Días de hospedaje:");
        jLabelDias.setEnabled(false);

        jLabelPersonasExtra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPersonasExtra.setText("Huéspedes extra:");
        jLabelPersonasExtra.setEnabled(false);

        jComboBoxExtra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Una persona", "Dos personas" }));
        jComboBoxExtra.setEnabled(false);
        jComboBoxExtra.setFocusable(false);

        jTextFieldCiudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCiudad.setEnabled(false);
        jTextFieldCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCiudadKeyTyped(evt);
            }
        });

        jLabelCiudad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCiudad.setText("Ciudad de origen: ");
        jLabelCiudad.setEnabled(false);

        jLabelApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelApellido.setText("Primer apellido: ");
        jLabelApellido.setEnabled(false);

        jTextFieldApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldApellido.setEnabled(false);
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });

        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNombre.setEnabled(false);
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNombre.setText("Nombre: ");
        jLabelNombre.setEnabled(false);

        jButtonCambios.setText("Realizar cambios");
        jButtonCambios.setEnabled(false);
        jButtonCambios.setFocusPainted(false);
        jButtonCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiosActionPerformed(evt);
            }
        });

        jLabelHabitacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion.setText("Número de habitación");

        jTextFieldHabitacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldHabitacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHabitacionKeyTyped(evt);
            }
        });

        jButtonBusqueda.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonBusqueda.setText("Realizar búsqueda");
        jButtonBusqueda.setFocusPainted(false);
        jButtonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaActionPerformed(evt);
            }
        });

        jLabelResultado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultado.setText("Resultado de la búsqueda");

        jTextFieldResultado.setEditable(false);
        jTextFieldResultado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldResultado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addContainerGap(529, Short.MAX_VALUE)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addComponent(jSpinnerDias, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addComponent(jLabelDias, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxExtra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPersonasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxGolf)
                            .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCheckBoxBar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBoxTintoreria)
                                .addComponent(jCheckBoxSPA)
                                .addComponent(jCheckBoxCuidado)
                                .addComponent(jCheckBoxGimnasio)
                                .addComponent(jCheckBoxJuegos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBoxTennis)
                                .addComponent(jCheckBoxArco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBoxCuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButtonCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(jLabelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(jTextFieldResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCiudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCiudad)
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(188, 188, 188))
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldApellido)
                            .addComponent(jLabelApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCiudad)
                            .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addComponent(jLabelPersonasExtra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addComponent(jLabelHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelBaseLayout.createSequentialGroup()
                                .addComponent(jLabelServicios)
                                .addGap(10, 10, 10)
                                .addComponent(jCheckBoxCuarto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxBar))
                            .addGroup(jPanelBaseLayout.createSequentialGroup()
                                .addComponent(jLabelDias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxTintoreria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxSPA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxCuidado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxGimnasio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxJuegos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxTennis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxArco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxGolf)
                        .addGap(52, 52, 52)))
                .addGap(82, 82, 82)
                .addComponent(jButtonCambios)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-Evento para verificar que el nombre de la ciudad no exceda los 20 caracteres-//.
    private void jTextFieldCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCiudadKeyTyped
        if(this.jTextFieldCiudad.getText().length() > 19) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCiudadKeyTyped

    //-Evento para verificar que el apellido no exceda los 10 caracteres-//.
    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
        if(this.jTextFieldApellido.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    //-Evento para verificar que el nombre no exceda los 10 caracteres-//.
    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        if(this.jTextFieldNombre.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    //-Evento para verificar que la búsqueda de la habitación no exceda los 3 caracteres-//.
    private void jTextFieldHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHabitacionKeyTyped
        if(this.jTextFieldHabitacion.getText().length() > 2) {
            evt.consume();
        }
        else {
            //Desactivar todos los campos para cambiar información.
            this.reajustarControles(false);
            this.jButtonCambios.setEnabled(false);
            this.jButtonBusqueda.setEnabled(true);
            this.jTextFieldResultado.setText("");
        }
    }//GEN-LAST:event_jTextFieldHabitacionKeyTyped

    //-Se muestra la información del huésped correspondiente a la habitación seleccionada-//.
    private void jButtonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaActionPerformed
        if(this.jTextFieldHabitacion.getText().length() > 0) {
            ConexionMySQL conexion = null;

            try {
                //Conexión a la base de datos.
                conexion = new ConexionMySQL();

                try {
                    this.numeroHabitacion = this.jTextFieldHabitacion.getText().trim();
                        
                    //Consultar en la base de datos la información del huésped alojado en la habitación.
                    ResultSet consulta = conexion.consultarTabla("huespedes",
                    "a.guest_id, a.name, a.city, a.days, a.extras, a.check_in"
                    + ", b.room_service, b.bar_access, b.cleaner_service, "
                    + "b.SPA_service, b.baby_sister_service, b.gym_access, "
                    + "b.gaming_access, b.tennis_access, b.bow_shooting, "
                    + "b.golf_access", " AS a JOIN servicios AS b ON a.guest_id "
                    + "= b.guest_id WHERE active = 1 AND room_id = " + this.numeroHabitacion 
                    + " LIMIT 1");
                   
                    //Se verifica si la habitación está ocupada o no.
                    if(consulta.next()) {
                        //Mostrar el nombre de la persona que reservó la habitación.
                        this.jTextFieldResultado.setText("Reservada por " + consulta.getString("a.name"));
                            
                        //Reactivar los controles.
                        this.reajustarControles(true);
                        
                        //Actualizar y almacenar la información.
                        this.identificador = consulta.getInt("a.guest_id");
                        String nombres[] = consulta.getString("a.name").split(" ");
                        this.cadenas.clear();
                        this.numeros.clear();
                        
                        this.jTextFieldNombre.setText(nombres[0]);
                        this.cadenas.add(nombres[0]);
                        
                        this.jTextFieldApellido.setText(nombres[1]);
                        this.cadenas.add(nombres[1]);
                        
                        this.jTextFieldCiudad.setText(consulta.getString("a.city"));
                        this.cadenas.add(consulta.getString("a.city"));
                          
                        this.fechaIngreso.setTime(consulta.getDate("a.check_in").getTime());
                        this.jSpinnerDias.setValue(consulta.getInt("a.days"));
                        this.numeros.add(consulta.getInt("a.days"));
                            
                        if(consulta.getInt("a.extras") > 0) {
                            this.jComboBoxExtra.setSelectedIndex(consulta.getInt("a.extras"));
                            this.numeros.add(consulta.getInt("a.extras"));
                        }
                        else {
                            this.numeros.add(0);
                            this.jLabelPersonasExtra.setEnabled(false);
                            this.jComboBoxExtra.setEnabled(false);
                        }
                        
                        if(consulta.getInt("b.room_service") == 1) {
                            this.jCheckBoxCuarto.setSelected(true);
                            this.numeros.add(1);
                        }
                        else {
                            this.numeros.add(0);
                        }
                        
                        if(consulta.getInt("b.bar_access") == 1) {
                            this.jCheckBoxBar.setSelected(true);
                            this.numeros.add(1);
                        }
                        else {
                            this.numeros.add(0);
                        }
                        
                        if(consulta.getInt("b.cleaner_service") == 1) {
                            this.jCheckBoxTintoreria.setSelected(true);
                            this.numeros.add(1);
                        }
                        else {
                            this.numeros.add(0);
                        }
                        
                        if(consulta.getInt("b.SPA_service") == 1) {
                            this.jCheckBoxSPA.setSelected(true);
                            this.numeros.add(1);
                        }
                        else {
                            this.numeros.add(0);
                        }
                        
                        if(consulta.getInt("b.baby_sister_service") == 1) {
                            this.jCheckBoxCuidado.setSelected(true);
                            this.numeros.add(1);
                        }
                        else {
                            this.numeros.add(0);
                        }
                        
                        if(consulta.getInt("b.gym_access") == 1) {
                            this.jCheckBoxGimnasio.setSelected(true);
                            this.numeros.add(1);
                        }
                        else {
                            this.numeros.add(0);
                        }
                        
                        if(consulta.getInt("b.gaming_access") == 1) {
                            this.jCheckBoxJuegos.setSelected(true);
                            this.numeros.add(1);
                        }
                        else {
                            this.numeros.add(0);
                        }
                        
                        if(consulta.getInt("b.tennis_access") == 1) {
                            this.jCheckBoxTennis.setSelected(true);
                            this.numeros.add(1);
                        }
                        else {
                            this.numeros.add(0);
                        }
                        
                        if(consulta.getInt("b.bow_shooting") == 1) {
                            this.jCheckBoxArco.setSelected(true);
                            this.numeros.add(1);
                        }
                        else {
                            this.numeros.add(0);
                        }
                        
                        if(consulta.getInt("b.golf_access") == 1) {
                            this.jCheckBoxGolf.setSelected(true);
                            this.numeros.add(1);
                        }
                        else {
                            this.numeros.add(0);
                        }
                            
                        this.jButtonBusqueda.setEnabled(false);
                        this.jButtonCambios.setEnabled(true);
                    }
                    else {
                        try {
                            int numero = Integer.parseInt(this.numeroHabitacion);

                            if(numero <= 215 && numero >= 201 || numero <= 115 && numero >= 101) {
                                this.jTextFieldResultado.setText("Habitación no ocupada");
                            }
                            else {
                                this.jTextFieldResultado.setText("Habitación inexistente");
                            }
                        }
                        catch(NumberFormatException ex) {
                            JOptionPane.showMessageDialog(this, "La entrada es inválida.\n"
                            + "Solo es posible introducir números."
                            , "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                catch(SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Ocurrió un error durante la "
                    + "realización de la consulta.\nSQLException: " + ex.getMessage()
                    + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                    "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "No fue posible realizar la "
                + "conexión con la base de datos.\n" + "Verifique si el servidor "
                + "XAMPP o MySQL local se encuentra activado."
                , "Error", JOptionPane.ERROR_MESSAGE);
            }
            finally {
                if(conexion != null) conexion.cerrarConexion();
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Es necesario introducir "
            + "el número de la habitación a buscar."
            , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBusquedaActionPerformed

    //-Generar los correspondientes cambios en la base de datos-//.
    private void jButtonCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiosActionPerformed
        String mensaje = "";
        boolean invalido = false;
        
        if(this.jTextFieldNombre.getText().length() == 0) {
            mensaje += "Se debe escribir algún nombre.\n";
            invalido = true;
        }
        if(this.jTextFieldApellido.getText().length() == 0) {
            mensaje += "Se debe escribir algún apellido.\n";
            invalido = true;
        }
        if(this.jTextFieldCiudad.getText().length() == 0) {
            mensaje += "Se debe escribir el nombre de alguna ciudad.\n";
            invalido = true;
        }
        mensaje += "Reintroduzca sus datos.";
        
        if(invalido) {
            JOptionPane.showMessageDialog(this, mensaje
            , "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else {
            ConexionMySQL conexion = null;

            try {
                //Conexión a la base de datos.
                conexion = new ConexionMySQL();

                try {
                    String nombreCompleto = this.jTextFieldNombre.getText().trim() + " " + this.jTextFieldApellido.getText().trim();

                    //Recalcular la fecha de salida.
                    Calendar calendario = Calendar.getInstance();
                    calendario.setTime(this.fechaIngreso);
                    calendario.add(Calendar.DAY_OF_YEAR, (Integer)this.jSpinnerDias.getValue());         
                    java.sql.Date fechaSalida = new java.sql.Date(calendario.getTime().getTime());
                    
                    //Cambiar los datos correspondientes.
                    PreparedStatement comando = conexion.getConexion().prepareStatement(
                    "UPDATE huespedes set name = '" + nombreCompleto + "', "
                    + "city = '" + this.jTextFieldCiudad.getText() + "', "
                    + "check_out = ?, "
                    + "days = " + (Integer)this.jSpinnerDias.getValue() + ", "
                    + "extras = " + this.jComboBoxExtra.getSelectedIndex() 
                    + " WHERE active = 1 AND room_id = " + this.numeroHabitacion + ";");
                    comando.setDate(1, fechaSalida);
                    comando.executeUpdate();
                    comando.getUpdateCount();
                    
                    conexion.actualizarDatos("servicios",
                    "room_service = " + this.casillaSeleccionada(this.jCheckBoxCuarto)
                    + ", bar_access = " + this.casillaSeleccionada(this.jCheckBoxBar)
                    + ", cleaner_service = " + this.casillaSeleccionada(this.jCheckBoxTintoreria)
                    + ", SPA_service = " + this.casillaSeleccionada(this.jCheckBoxSPA)
                    + ", baby_sister_service = " + this.casillaSeleccionada(this.jCheckBoxCuidado)
                    + ", gym_access = " + this.casillaSeleccionada(this.jCheckBoxGimnasio)
                    + ", gaming_access = " + this.casillaSeleccionada(this.jCheckBoxJuegos)
                    + ", tennis_access = " + this.casillaSeleccionada(this.jCheckBoxTennis)
                    + ", bow_shooting = " + this.casillaSeleccionada(this.jCheckBoxArco)
                    + ", golf_access = " + this.casillaSeleccionada(this.jCheckBoxGolf)
                    , " WHERE guest_id = " + this.identificador + " LIMIT 1");
                    
                    if(this.cambiosRealizados()) {
                        JOptionPane.showMessageDialog(null, "Los datos fueron actualizados "
                        + "exitosamente.",
                        "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        
                        //Desactivar los controles.
                        this.reajustarControles(false);
                        
                        this.jButtonBusqueda.setEnabled(true);
                        this.jButtonCambios.setEnabled(false);
                        this.jTextFieldHabitacion.setText("");
                        this.jTextFieldResultado.setText("");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Ningún dato fue cambiado.",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }        
                }
                catch(SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Ocurrió un error durante la "
                    + "realización de la consulta.\nSQLException: " + ex.getMessage()
                    + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                    "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "No fue posible realizar la "
                + "conexión con la base de datos.\n" + "Verifique si el servidor "
                + "XAMPP o MySQL local se encuentra activado."
                , "Error", JOptionPane.ERROR_MESSAGE);
            }
            finally {
                if(conexion != null) conexion.cerrarConexion();
            }
        }
    }//GEN-LAST:event_jButtonCambiosActionPerformed

    //-Configuración adicional de ciertos componentes-//.
    private void extraInitProcess() {    
        //Configuración para inhabilitar modificaciones manuales en el JSpinner para indicar la cantidad de días.
        ((JSpinner.DefaultEditor) this.jSpinnerDias.getEditor()).getTextField().setEditable(false);
    }
    
    //-Método para activar o desactivar los controles para cambiar la información-//.
    private void reajustarControles(boolean cambio) {
        this.jLabelNombre.setEnabled(cambio);
        this.jTextFieldNombre.setEnabled(cambio);
        if(!cambio) this.jTextFieldNombre.setText("");
            
        this.jLabelApellido.setEnabled(cambio);
        this.jTextFieldApellido.setEnabled(cambio);
        if(!cambio) this.jTextFieldApellido.setText("");
            
        this.jLabelCiudad.setEnabled(cambio);
        this.jTextFieldCiudad.setEnabled(cambio);
        if(!cambio) this.jTextFieldCiudad.setText("");
            
        this.jLabelPersonasExtra.setEnabled(cambio);
        if(!cambio) this.jComboBoxExtra.setSelectedIndex(0);
        this.jComboBoxExtra.setEnabled(cambio);
            
        this.jLabelDias.setEnabled(cambio);
        if(!cambio) this.jSpinnerDias.setValue(1);
        this.jSpinnerDias.setEnabled(cambio);
            
        this.jLabelServicios.setEnabled(cambio);
        if(!cambio) this.jCheckBoxCuarto.setSelected(cambio);
        this.jCheckBoxCuarto.setEnabled(cambio);
            
        if(!cambio) this.jCheckBoxBar.setSelected(cambio);
        this.jCheckBoxBar.setEnabled(cambio);
            
        if(!cambio) this.jCheckBoxTintoreria.setSelected(cambio);
        this.jCheckBoxTintoreria.setEnabled(cambio);
            
        if(!cambio) this.jCheckBoxSPA.setSelected(cambio);
        this.jCheckBoxSPA.setEnabled(cambio);
            
        if(!cambio) this.jCheckBoxCuidado.setSelected(cambio);
        this.jCheckBoxCuidado.setEnabled(cambio);
            
        if(!cambio) this.jCheckBoxGimnasio.setSelected(cambio);
        this.jCheckBoxGimnasio.setEnabled(cambio);
            
        if(!cambio) this.jCheckBoxJuegos.setSelected(cambio);
        this.jCheckBoxJuegos.setEnabled(cambio);
            
        if(!cambio) this.jCheckBoxTennis.setSelected(cambio);
        this.jCheckBoxTennis.setEnabled(cambio);
            
        if(!cambio) this.jCheckBoxArco.setSelected(cambio);
        this.jCheckBoxArco.setEnabled(cambio);
            
        if(!cambio) this.jCheckBoxGolf.setSelected(cambio);
        this.jCheckBoxGolf.setEnabled(cambio);
    }
    
    //-Se verifica si hubo algún cambio de información-//.
    private boolean cambiosRealizados() {
        if(!this.jTextFieldNombre.getText().trim().equals(this.cadenas.get(0))) return true;
        if(!this.jTextFieldApellido.getText().trim().equals(this.cadenas.get(1))) return true;
        if(!this.jTextFieldCiudad.getText().equals(this.cadenas.get(2))) return true;
        
        if((Integer) this.jSpinnerDias.getValue() != this.numeros.get(0)) return true;
        if(this.jComboBoxExtra.getSelectedIndex() != this.numeros.get(1)) return true;
        
        if(this.casillaSeleccionada(this.jCheckBoxCuarto) != this.numeros.get(2)) return true;
        if(this.casillaSeleccionada(this.jCheckBoxBar) != this.numeros.get(3)) return true;
        if(this.casillaSeleccionada(this.jCheckBoxTintoreria) != this.numeros.get(4)) return true;
        if(this.casillaSeleccionada(this.jCheckBoxSPA) != this.numeros.get(5)) return true;
        if(this.casillaSeleccionada(this.jCheckBoxCuidado) != this.numeros.get(6)) return true;
        if(this.casillaSeleccionada(this.jCheckBoxGimnasio) != this.numeros.get(7)) return true;
        if(this.casillaSeleccionada(this.jCheckBoxJuegos) != this.numeros.get(8)) return true;
        if(this.casillaSeleccionada(this.jCheckBoxTennis) != this.numeros.get(9)) return true;
        if(this.casillaSeleccionada(this.jCheckBoxArco) != this.numeros.get(10)) return true;
        if(this.casillaSeleccionada(this.jCheckBoxGolf) != this.numeros.get(11)) return true;
        return false;
    }
    
    //-Se retorna un valor numérico que indica si un JCheckBox está seleccionado o no-//.
    private int casillaSeleccionada(JCheckBox casilla) {
        if(casilla.isSelected()) {
            return 1;
        }
        else {
            return 0;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBusqueda;
    private javax.swing.JButton jButtonCambios;
    private javax.swing.JCheckBox jCheckBoxArco;
    private javax.swing.JCheckBox jCheckBoxBar;
    private javax.swing.JCheckBox jCheckBoxCuarto;
    private javax.swing.JCheckBox jCheckBoxCuidado;
    private javax.swing.JCheckBox jCheckBoxGimnasio;
    private javax.swing.JCheckBox jCheckBoxGolf;
    private javax.swing.JCheckBox jCheckBoxJuegos;
    private javax.swing.JCheckBox jCheckBoxSPA;
    private javax.swing.JCheckBox jCheckBoxTennis;
    private javax.swing.JCheckBox jCheckBoxTintoreria;
    private javax.swing.JComboBox jComboBoxExtra;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelDias;
    private javax.swing.JLabel jLabelHabitacion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPersonasExtra;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelServicios;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JSpinner jSpinnerDias;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldHabitacion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldResultado;
    // End of variables declaration//GEN-END:variables
}