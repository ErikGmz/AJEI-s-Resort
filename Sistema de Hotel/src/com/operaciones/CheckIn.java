//---Paquete---//.
package com.operaciones;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import com.clases_auxiliares.Habitacion;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;

//---Clase pública---//.
public class CheckIn extends javax.swing.JInternalFrame {

    //---Atributos adicionales---//.
    private ArrayList<String> listaHabitacionesOcupadas;
    private ArrayList<Habitacion> listaTotalHabitaciones;
    private String tipoHabitacion;
    private int contadorHabitaciones;
    private int numeroPiso;
    private int cantidadHuespedes;
    private int cantidadHuespedesExtra;
    private JLabel habitacionSeleccionada;
    private Calendar fechaInicial;
    private Calendar fechaFinal;

    //---Constructor---//.
    public CheckIn() {
        initComponents();
        extraInitProcess();
        this.listaHabitacionesOcupadas = new ArrayList<>();
        this.listaTotalHabitaciones = new ArrayList<>();
        this.habitacionSeleccionada = null;
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupHabitaciones = new javax.swing.ButtonGroup();
        buttonGroupPisos = new javax.swing.ButtonGroup();
        jPanelBase = new javax.swing.JPanel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jTabbedPaneMenus = new javax.swing.JTabbedPane();
        jPanelDatos = new javax.swing.JPanel();
        jLabelAdicional = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAdicional = new javax.swing.JTextArea();
        jButtonSiguiente = new javax.swing.JButton();
        jButtonSalida = new javax.swing.JButton();
        jPanelDatosPersonales = new javax.swing.JPanel();
        jTextFieldCiudad = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabelCiudad = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jPanelDatosHuespedes = new javax.swing.JPanel();
        jLabelPersonas = new javax.swing.JLabel();
        jRadioButtonUna = new javax.swing.JRadioButton();
        jRadioButtonDos = new javax.swing.JRadioButton();
        jRadioButtonTres = new javax.swing.JRadioButton();
        jLabelPisoPersonasExtra = new javax.swing.JLabel();
        jComboBoxExtra = new javax.swing.JComboBox();
        jPanelDatosHabitación = new javax.swing.JPanel();
        jLabelHabitacion = new javax.swing.JLabel();
        jLabelPiso = new javax.swing.JLabel();
        jComboBoxHabitacion = new javax.swing.JComboBox();
        jRadioButtonPiso2 = new javax.swing.JRadioButton();
        jRadioButtonPiso1 = new javax.swing.JRadioButton();
        jPanelTiempoReservación = new javax.swing.JPanel();
        jLabelIngreso = new javax.swing.JLabel();
        jDateChooserIngreso = new com.toedter.calendar.JDateChooser();
        jLabelDias = new javax.swing.JLabel();
        jSpinnerDias = new javax.swing.JSpinner();
        jPanelServiciosExtra = new javax.swing.JPanel();
        jCheckBoxCuarto = new javax.swing.JCheckBox();
        jCheckBoxBar = new javax.swing.JCheckBox();
        jCheckBoxTintoreria = new javax.swing.JCheckBox();
        jCheckBoxSPA = new javax.swing.JCheckBox();
        jCheckBoxCuidado = new javax.swing.JCheckBox();
        jCheckBoxGimnasio = new javax.swing.JCheckBox();
        jCheckBoxJuegos = new javax.swing.JCheckBox();
        jCheckBoxTennis = new javax.swing.JCheckBox();
        jCheckBoxArco = new javax.swing.JCheckBox();
        jCheckBoxGolf = new javax.swing.JCheckBox();
        jLabelServicioAlCuarto = new javax.swing.JLabel();
        jLabelBar = new javax.swing.JLabel();
        jLabelTintoreria = new javax.swing.JLabel();
        jLabelSPA = new javax.swing.JLabel();
        jLabelNiñera = new javax.swing.JLabel();
        jLabelGimnasio = new javax.swing.JLabel();
        jLabelZonaJuegos = new javax.swing.JLabel();
        jLabelTenis = new javax.swing.JLabel();
        jLabelTiroConArco = new javax.swing.JLabel();
        jLabelGolf = new javax.swing.JLabel();
        jPanelHabitacion = new javax.swing.JPanel();
        jButtonRegresar = new javax.swing.JButton();
        jButtonSiguiente2 = new javax.swing.JButton();
        jLabelNumeroPiso = new javax.swing.JLabel();
        jTextFieldNumeroPiso = new javax.swing.JTextField();
        jLabelHabitacion1 = new javax.swing.JLabel();
        jLabelHabitacion2 = new javax.swing.JLabel();
        jLabelHabitacion3 = new javax.swing.JLabel();
        jLabelHabitacion4 = new javax.swing.JLabel();
        jLabelHabitacion5 = new javax.swing.JLabel();
        jLabelHabitacion10 = new javax.swing.JLabel();
        jLabelHabitacion9 = new javax.swing.JLabel();
        jLabelHabitacion8 = new javax.swing.JLabel();
        jLabelHabitacion7 = new javax.swing.JLabel();
        jLabelHabitacion6 = new javax.swing.JLabel();
        jLabelHabitacion11 = new javax.swing.JLabel();
        jLabelHabitacion12 = new javax.swing.JLabel();
        jLabelHabitacion13 = new javax.swing.JLabel();
        jLabelHabitacion14 = new javax.swing.JLabel();
        jLabelHabitacion15 = new javax.swing.JLabel();
        jLabelTipoHabitacion = new javax.swing.JLabel();
        jTextFieldTipoHabitacion = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanelConfirmacion = new javax.swing.JPanel();
        jButtonModificar = new javax.swing.JButton();
        jButtonGenerarRecibo = new javax.swing.JButton();
        jPanelInformacionReservacion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDatos = new javax.swing.JTextArea();
        jPanelRecibo = new javax.swing.JPanel();
        jButtonNuevo = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jPanelBase.setBackground(new java.awt.Color(255, 232, 205));

        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pantallas/close.png"))); // NOI18N
        jLabelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelTitulo.setText("Check In");

        jTabbedPaneMenus.setBackground(new java.awt.Color(255, 232, 205));
        jTabbedPaneMenus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jTabbedPaneMenus.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jPanelDatos.setBackground(new java.awt.Color(255, 232, 205));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanelDatos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelAdicional.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelAdicional.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAdicional.setText("Información adicional:");

        jTextAreaAdicional.setEditable(false);
        jTextAreaAdicional.setColumns(20);
        jTextAreaAdicional.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextAreaAdicional.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAdicional);

        jButtonSiguiente.setBackground(new java.awt.Color(228, 130, 0));
        jButtonSiguiente.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonSiguiente.setText("Seleccionar habitación");
        jButtonSiguiente.setBorder(null);
        jButtonSiguiente.setBorderPainted(false);
        jButtonSiguiente.setContentAreaFilled(false);
        jButtonSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSiguiente.setEnabled(false);
        jButtonSiguiente.setOpaque(true);
        jButtonSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSiguienteMouseExited(evt);
            }
        });
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jButtonSalida.setBackground(new java.awt.Color(228, 130, 0));
        jButtonSalida.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonSalida.setText("Validar datos de entrada");
        jButtonSalida.setAutoscrolls(true);
        jButtonSalida.setBorder(null);
        jButtonSalida.setBorderPainted(false);
        jButtonSalida.setContentAreaFilled(false);
        jButtonSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalida.setInheritsPopupMenu(true);
        jButtonSalida.setOpaque(true);
        jButtonSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSalidaMouseExited(evt);
            }
        });
        jButtonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalidaActionPerformed(evt);
            }
        });

        jPanelDatosPersonales.setBackground(new java.awt.Color(255, 163, 51));
        jPanelDatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "Datos Personales", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N

        jTextFieldCiudad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldCiudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCiudadKeyTyped(evt);
            }
        });

        jLabelApellido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelApellido.setText("Apellido:");

        jTextFieldNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jTextFieldApellido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });

        jLabelCiudad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelCiudad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCiudad.setText("Ciudad de origen: ");

        jLabelNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNombre.setText("Nombre: ");

        javax.swing.GroupLayout jPanelDatosPersonalesLayout = new javax.swing.GroupLayout(jPanelDatosPersonales);
        jPanelDatosPersonales.setLayout(jPanelDatosPersonalesLayout);
        jPanelDatosPersonalesLayout.setHorizontalGroup(
            jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(jLabelCiudad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApellido)
                            .addComponent(jLabelNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextFieldApellido))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDatosPersonalesLayout.setVerticalGroup(
            jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCiudad)
                    .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelDatosHuespedes.setBackground(new java.awt.Color(255, 163, 51));
        jPanelDatosHuespedes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "Datos De Los Huéspedes", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N

        jLabelPersonas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelPersonas.setText("Total de huéspedes:");

        jRadioButtonUna.setBackground(new java.awt.Color(255, 163, 51));
        buttonGroupHabitaciones.add(jRadioButtonUna);
        jRadioButtonUna.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jRadioButtonUna.setSelected(true);
        jRadioButtonUna.setText("Una persona");
        jRadioButtonUna.setFocusPainted(false);
        jRadioButtonUna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonUnaActionPerformed(evt);
            }
        });

        jRadioButtonDos.setBackground(new java.awt.Color(255, 163, 51));
        buttonGroupHabitaciones.add(jRadioButtonDos);
        jRadioButtonDos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jRadioButtonDos.setText("Dos personas");
        jRadioButtonDos.setEnabled(false);
        jRadioButtonDos.setFocusPainted(false);
        jRadioButtonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDosActionPerformed(evt);
            }
        });

        jRadioButtonTres.setBackground(new java.awt.Color(255, 163, 51));
        buttonGroupHabitaciones.add(jRadioButtonTres);
        jRadioButtonTres.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jRadioButtonTres.setText("Tres personas");
        jRadioButtonTres.setEnabled(false);
        jRadioButtonTres.setFocusPainted(false);
        jRadioButtonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTresActionPerformed(evt);
            }
        });

        jLabelPisoPersonasExtra.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelPisoPersonasExtra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPisoPersonasExtra.setText("Huéspedes extra:");

        jComboBoxExtra.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jComboBoxExtra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Una persona", "Dos personas" }));
        jComboBoxExtra.setFocusable(false);

        javax.swing.GroupLayout jPanelDatosHuespedesLayout = new javax.swing.GroupLayout(jPanelDatosHuespedes);
        jPanelDatosHuespedes.setLayout(jPanelDatosHuespedesLayout);
        jPanelDatosHuespedesLayout.setHorizontalGroup(
            jPanelDatosHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosHuespedesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosHuespedesLayout.createSequentialGroup()
                        .addComponent(jLabelPersonas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDatosHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonUna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(208, 208, 208))
                    .addGroup(jPanelDatosHuespedesLayout.createSequentialGroup()
                        .addComponent(jLabelPisoPersonasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelDatosHuespedesLayout.setVerticalGroup(
            jPanelDatosHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosHuespedesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPersonas)
                    .addComponent(jRadioButtonUna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonDos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonTres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPisoPersonasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDatosHabitación.setBackground(new java.awt.Color(255, 163, 51));
        jPanelDatosHabitación.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "Datos De La Habitación", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N

        jLabelHabitacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion.setText("Tipo de habitación:");

        jLabelPiso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelPiso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPiso.setText("Piso de hospedaje:");

        jComboBoxHabitacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jComboBoxHabitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chaac Suite (habitación simple)", "Itzamná Suite (habitación doble)", "Kauil Suite (habitación triple)" }));
        jComboBoxHabitacion.setFocusable(false);
        jComboBoxHabitacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxHabitacionItemStateChanged(evt);
            }
        });

        jRadioButtonPiso2.setBackground(new java.awt.Color(255, 163, 51));
        buttonGroupPisos.add(jRadioButtonPiso2);
        jRadioButtonPiso2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jRadioButtonPiso2.setText("Segundo piso");
        jRadioButtonPiso2.setFocusPainted(false);
        jRadioButtonPiso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPiso2ActionPerformed(evt);
            }
        });

        jRadioButtonPiso1.setBackground(new java.awt.Color(255, 163, 51));
        buttonGroupPisos.add(jRadioButtonPiso1);
        jRadioButtonPiso1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jRadioButtonPiso1.setSelected(true);
        jRadioButtonPiso1.setText("Primer piso");
        jRadioButtonPiso1.setFocusPainted(false);
        jRadioButtonPiso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPiso1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosHabitaciónLayout = new javax.swing.GroupLayout(jPanelDatosHabitación);
        jPanelDatosHabitación.setLayout(jPanelDatosHabitaciónLayout);
        jPanelDatosHabitaciónLayout.setHorizontalGroup(
            jPanelDatosHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosHabitaciónLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDatosHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosHabitaciónLayout.createSequentialGroup()
                        .addComponent(jRadioButtonPiso1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonPiso2))
                    .addComponent(jLabelHabitacion)
                    .addComponent(jComboBoxHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPiso)))
        );
        jPanelDatosHabitaciónLayout.setVerticalGroup(
            jPanelDatosHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosHabitaciónLayout.createSequentialGroup()
                .addComponent(jLabelHabitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPiso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosHabitaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPiso1)
                    .addComponent(jRadioButtonPiso2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTiempoReservación.setBackground(new java.awt.Color(255, 163, 51));
        jPanelTiempoReservación.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "Tiempo De Reservación", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N

        jLabelIngreso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIngreso.setText("Fecha de ingreso:");

        jDateChooserIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserIngreso.setDateFormatString("dd/MM/yyyy");
        jDateChooserIngreso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabelDias.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelDias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDias.setText("Días de hospedaje:");

        jSpinnerDias.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jSpinnerDias.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        javax.swing.GroupLayout jPanelTiempoReservaciónLayout = new javax.swing.GroupLayout(jPanelTiempoReservación);
        jPanelTiempoReservación.setLayout(jPanelTiempoReservaciónLayout);
        jPanelTiempoReservaciónLayout.setHorizontalGroup(
            jPanelTiempoReservaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTiempoReservaciónLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTiempoReservaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelTiempoReservaciónLayout.createSequentialGroup()
                        .addComponent(jLabelDias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerDias))
                    .addComponent(jLabelIngreso)
                    .addComponent(jDateChooserIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTiempoReservaciónLayout.setVerticalGroup(
            jPanelTiempoReservaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTiempoReservaciónLayout.createSequentialGroup()
                .addComponent(jLabelIngreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTiempoReservaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDias)
                    .addComponent(jSpinnerDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelServiciosExtra.setBackground(new java.awt.Color(255, 163, 51));
        jPanelServiciosExtra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "Servicios Extra", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N

        jCheckBoxCuarto.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxCuarto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxCuarto.setText("Atención al cuarto");
        jCheckBoxCuarto.setFocusPainted(false);

        jCheckBoxBar.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxBar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxBar.setText("Acceso al bar");
        jCheckBoxBar.setFocusPainted(false);

        jCheckBoxTintoreria.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxTintoreria.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxTintoreria.setText("Servicio de tintorería");
        jCheckBoxTintoreria.setFocusPainted(false);

        jCheckBoxSPA.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxSPA.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxSPA.setText("Servicio de SPA");
        jCheckBoxSPA.setFocusPainted(false);

        jCheckBoxCuidado.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxCuidado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxCuidado.setText("Contratación de niñera");
        jCheckBoxCuidado.setFocusPainted(false);

        jCheckBoxGimnasio.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxGimnasio.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxGimnasio.setText("Acceso a gimnasio");
        jCheckBoxGimnasio.setFocusPainted(false);

        jCheckBoxJuegos.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxJuegos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxJuegos.setText("Acceso a zona de juegos");
        jCheckBoxJuegos.setFocusPainted(false);

        jCheckBoxTennis.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxTennis.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxTennis.setText("Acceso a canchas de tennis");
        jCheckBoxTennis.setFocusPainted(false);

        jCheckBoxArco.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxArco.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxArco.setText("Acceso a campo de tiro con arco");
        jCheckBoxArco.setFocusPainted(false);

        jCheckBoxGolf.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxGolf.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxGolf.setText("Acceso a campo de golf");
        jCheckBoxGolf.setFocusPainted(false);

        jLabelServicioAlCuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/coffee.png"))); // NOI18N

        jLabelBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/cocktail-glass.png"))); // NOI18N

        jLabelTintoreria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/tshirt.png"))); // NOI18N

        jLabelSPA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/spa-lotus-flower.png"))); // NOI18N

        jLabelNiñera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/child.png"))); // NOI18N

        jLabelGimnasio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/hands-up.png"))); // NOI18N

        jLabelZonaJuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/group.png"))); // NOI18N

        jLabelTenis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/tennis_sport.png"))); // NOI18N

        jLabelTiroConArco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/bullseye.png"))); // NOI18N

        jLabelGolf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/golf-player.png"))); // NOI18N

        javax.swing.GroupLayout jPanelServiciosExtraLayout = new javax.swing.GroupLayout(jPanelServiciosExtra);
        jPanelServiciosExtra.setLayout(jPanelServiciosExtraLayout);
        jPanelServiciosExtraLayout.setHorizontalGroup(
            jPanelServiciosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServiciosExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelServiciosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelServicioAlCuarto)
                    .addComponent(jLabelBar)
                    .addComponent(jLabelTintoreria)
                    .addComponent(jLabelSPA)
                    .addComponent(jLabelNiñera)
                    .addComponent(jLabelGimnasio)
                    .addComponent(jLabelZonaJuegos)
                    .addComponent(jLabelTenis)
                    .addComponent(jLabelTiroConArco)
                    .addComponent(jLabelGolf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelServiciosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxTintoreria)
                    .addComponent(jCheckBoxSPA)
                    .addComponent(jCheckBoxCuidado)
                    .addComponent(jCheckBoxGimnasio)
                    .addComponent(jCheckBoxJuegos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBoxTennis)
                    .addComponent(jCheckBoxArco)
                    .addComponent(jCheckBoxGolf)
                    .addComponent(jCheckBoxBar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxCuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelServiciosExtraLayout.setVerticalGroup(
            jPanelServiciosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServiciosExtraLayout.createSequentialGroup()
                .addGroup(jPanelServiciosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxCuarto)
                    .addComponent(jLabelServicioAlCuarto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelServiciosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxBar)
                    .addComponent(jLabelBar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelServiciosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxTintoreria)
                    .addComponent(jLabelTintoreria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelServiciosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxSPA)
                    .addComponent(jLabelSPA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelServiciosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxCuidado)
                    .addComponent(jLabelNiñera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelServiciosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxGimnasio)
                    .addComponent(jLabelGimnasio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelServiciosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxJuegos)
                    .addComponent(jLabelZonaJuegos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelServiciosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxTennis)
                    .addComponent(jLabelTenis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelServiciosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxArco)
                    .addComponent(jLabelTiroConArco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelServiciosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxGolf)
                    .addComponent(jLabelGolf)))
        );

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelDatosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelDatosHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 289, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelDatosHabitación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelTiempoReservación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabelAdicional)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(jPanelServiciosExtra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addComponent(jPanelServiciosExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSiguiente))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelDatosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelDatosHabitación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelDatosHuespedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelTiempoReservación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAdicional)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addGap(1064, 1064, 1064))
        );

        jPanelDatosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonSalida, jButtonSiguiente});

        jTabbedPaneMenus.addTab("Datos De Reservación", jPanelDatos);

        jPanelHabitacion.setBackground(new java.awt.Color(255, 232, 205));

        jButtonRegresar.setBackground(new java.awt.Color(228, 130, 0));
        jButtonRegresar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pantallas/left-arrows.png"))); // NOI18N
        jButtonRegresar.setBorder(null);
        jButtonRegresar.setBorderPainted(false);
        jButtonRegresar.setContentAreaFilled(false);
        jButtonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegresar.setOpaque(true);
        jButtonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRegresarMouseExited(evt);
            }
        });
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jButtonSiguiente2.setBackground(new java.awt.Color(228, 130, 0));
        jButtonSiguiente2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonSiguiente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pantallas/right-arrows.png"))); // NOI18N
        jButtonSiguiente2.setBorder(null);
        jButtonSiguiente2.setBorderPainted(false);
        jButtonSiguiente2.setContentAreaFilled(false);
        jButtonSiguiente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSiguiente2.setEnabled(false);
        jButtonSiguiente2.setOpaque(true);
        jButtonSiguiente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSiguiente2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSiguiente2MouseExited(evt);
            }
        });
        jButtonSiguiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguiente2ActionPerformed(evt);
            }
        });

        jLabelNumeroPiso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelNumeroPiso.setText("Número de piso: ");

        jTextFieldNumeroPiso.setEditable(false);
        jTextFieldNumeroPiso.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNumeroPiso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldNumeroPiso.setText(" Primer piso");
        jTextFieldNumeroPiso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelHabitacion1.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelHabitacion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion1.setText("101");
        jLabelHabitacion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHabitacion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitacion1.setOpaque(true);
        jLabelHabitacion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabitacion1MouseClicked(evt);
            }
        });

        jLabelHabitacion2.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelHabitacion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion2.setText("102");
        jLabelHabitacion2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHabitacion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitacion2.setOpaque(true);
        jLabelHabitacion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabitacion2MouseClicked(evt);
            }
        });

        jLabelHabitacion3.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelHabitacion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion3.setText("103");
        jLabelHabitacion3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHabitacion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitacion3.setOpaque(true);
        jLabelHabitacion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabitacion3MouseClicked(evt);
            }
        });

        jLabelHabitacion4.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion4.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelHabitacion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion4.setText("104");
        jLabelHabitacion4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHabitacion4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitacion4.setOpaque(true);
        jLabelHabitacion4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabitacion4MouseClicked(evt);
            }
        });

        jLabelHabitacion5.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion5.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelHabitacion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion5.setText("105");
        jLabelHabitacion5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHabitacion5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitacion5.setOpaque(true);
        jLabelHabitacion5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabitacion5MouseClicked(evt);
            }
        });

        jLabelHabitacion10.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion10.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelHabitacion10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion10.setText("110");
        jLabelHabitacion10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHabitacion10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitacion10.setOpaque(true);
        jLabelHabitacion10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabitacion10MouseClicked(evt);
            }
        });

        jLabelHabitacion9.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion9.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelHabitacion9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion9.setText("109");
        jLabelHabitacion9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHabitacion9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitacion9.setOpaque(true);
        jLabelHabitacion9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabitacion9MouseClicked(evt);
            }
        });

        jLabelHabitacion8.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion8.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelHabitacion8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion8.setText("108");
        jLabelHabitacion8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHabitacion8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitacion8.setOpaque(true);
        jLabelHabitacion8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabitacion8MouseClicked(evt);
            }
        });

        jLabelHabitacion7.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion7.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelHabitacion7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion7.setText("107");
        jLabelHabitacion7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHabitacion7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitacion7.setOpaque(true);
        jLabelHabitacion7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabitacion7MouseClicked(evt);
            }
        });

        jLabelHabitacion6.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion6.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelHabitacion6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion6.setText("106");
        jLabelHabitacion6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHabitacion6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitacion6.setOpaque(true);
        jLabelHabitacion6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabitacion6MouseClicked(evt);
            }
        });

        jLabelHabitacion11.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion11.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelHabitacion11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion11.setText("111");
        jLabelHabitacion11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHabitacion11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitacion11.setOpaque(true);
        jLabelHabitacion11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabitacion11MouseClicked(evt);
            }
        });

        jLabelHabitacion12.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion12.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelHabitacion12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion12.setText("112");
        jLabelHabitacion12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHabitacion12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitacion12.setOpaque(true);
        jLabelHabitacion12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabitacion12MouseClicked(evt);
            }
        });

        jLabelHabitacion13.setBackground(new java.awt.Color(236, 118, 125));
        jLabelHabitacion13.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelHabitacion13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion13.setText("113");
        jLabelHabitacion13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHabitacion13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitacion13.setOpaque(true);
        jLabelHabitacion13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabitacion13MouseClicked(evt);
            }
        });

        jLabelHabitacion14.setBackground(new java.awt.Color(255, 215, 215));
        jLabelHabitacion14.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelHabitacion14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion14.setText("114");
        jLabelHabitacion14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHabitacion14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitacion14.setOpaque(true);
        jLabelHabitacion14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabitacion14MouseClicked(evt);
            }
        });

        jLabelHabitacion15.setBackground(new java.awt.Color(255, 255, 209));
        jLabelHabitacion15.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelHabitacion15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion15.setText("115");
        jLabelHabitacion15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHabitacion15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitacion15.setOpaque(true);
        jLabelHabitacion15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHabitacion15MouseClicked(evt);
            }
        });

        jLabelTipoHabitacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelTipoHabitacion.setText("Tipo de habitación:");

        jTextFieldTipoHabitacion.setEditable(false);
        jTextFieldTipoHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTipoHabitacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldTipoHabitacion.setText(" Chaac Suite (habitación simple)");
        jTextFieldTipoHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelHabitacionLayout = new javax.swing.GroupLayout(jPanelHabitacion);
        jPanelHabitacion.setLayout(jPanelHabitacionLayout);
        jPanelHabitacionLayout.setHorizontalGroup(
            jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHabitacionLayout.createSequentialGroup()
                .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelHabitacion6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabelHabitacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelHabitacion11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                        .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHabitacion7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHabitacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHabitacion12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelHabitacion13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelHabitacion8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelHabitacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHabitacion14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelHabitacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelHabitacion9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelHabitacion15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabelHabitacion5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabelHabitacion10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSiguiente2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTipoHabitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNumeroPiso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNumeroPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );
        jPanelHabitacionLayout.setVerticalGroup(
            jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNumeroPiso)
                        .addComponent(jTextFieldNumeroPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTipoHabitacion)
                        .addComponent(jTextFieldTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHabitacionLayout.createSequentialGroup()
                        .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                                .addComponent(jLabelHabitacion5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabelHabitacion10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabelHabitacion15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                                .addComponent(jLabelHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabelHabitacion6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabelHabitacion11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSiguiente2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                        .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                                .addComponent(jLabelHabitacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabelHabitacion7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabelHabitacion12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                                .addComponent(jLabelHabitacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabelHabitacion8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabelHabitacion13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                                .addComponent(jLabelHabitacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabelHabitacion9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabelHabitacion14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        jTabbedPaneMenus.addTab("Habitación A Reservar", jPanelHabitacion);

        jPanelConfirmacion.setBackground(new java.awt.Color(255, 232, 205));

        jButtonModificar.setBackground(new java.awt.Color(228, 130, 0));
        jButtonModificar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pantallas/edit.png"))); // NOI18N
        jButtonModificar.setText("Modificar Datos De Reservación");
        jButtonModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButtonModificar.setBorderPainted(false);
        jButtonModificar.setContentAreaFilled(false);
        jButtonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModificar.setOpaque(true);
        jButtonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonModificarMouseExited(evt);
            }
        });
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonGenerarRecibo.setBackground(new java.awt.Color(228, 130, 0));
        jButtonGenerarRecibo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonGenerarRecibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pantallas/text-file.png"))); // NOI18N
        jButtonGenerarRecibo.setText("Generar recibo");
        jButtonGenerarRecibo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButtonGenerarRecibo.setBorderPainted(false);
        jButtonGenerarRecibo.setContentAreaFilled(false);
        jButtonGenerarRecibo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGenerarRecibo.setOpaque(true);
        jButtonGenerarRecibo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonGenerarReciboMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonGenerarReciboMouseExited(evt);
            }
        });
        jButtonGenerarRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarReciboActionPerformed(evt);
            }
        });

        jPanelInformacionReservacion.setBackground(new java.awt.Color(255, 163, 51));
        jPanelInformacionReservacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "Información De La Reservación", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N

        jTextAreaDatos.setEditable(false);
        jTextAreaDatos.setColumns(20);
        jTextAreaDatos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextAreaDatos.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDatos);

        javax.swing.GroupLayout jPanelInformacionReservacionLayout = new javax.swing.GroupLayout(jPanelInformacionReservacion);
        jPanelInformacionReservacion.setLayout(jPanelInformacionReservacionLayout);
        jPanelInformacionReservacionLayout.setHorizontalGroup(
            jPanelInformacionReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformacionReservacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInformacionReservacionLayout.setVerticalGroup(
            jPanelInformacionReservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformacionReservacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelConfirmacionLayout = new javax.swing.GroupLayout(jPanelConfirmacion);
        jPanelConfirmacion.setLayout(jPanelConfirmacionLayout);
        jPanelConfirmacionLayout.setHorizontalGroup(
            jPanelConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfirmacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelInformacionReservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addComponent(jButtonGenerarRecibo)
                .addContainerGap())
        );
        jPanelConfirmacionLayout.setVerticalGroup(
            jPanelConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConfirmacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInformacionReservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGenerarRecibo))
                .addContainerGap())
        );

        jTabbedPaneMenus.addTab("Confirmación Para El Check-In", jPanelConfirmacion);

        jPanelRecibo.setBackground(new java.awt.Color(255, 232, 205));

        jButtonNuevo.setText("Realizar otro registro");
        jButtonNuevo.setFocusPainted(false);
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelReciboLayout = new javax.swing.GroupLayout(jPanelRecibo);
        jPanelRecibo.setLayout(jPanelReciboLayout);
        jPanelReciboLayout.setHorizontalGroup(
            jPanelReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReciboLayout.createSequentialGroup()
                .addContainerGap(732, Short.MAX_VALUE)
                .addComponent(jButtonNuevo)
                .addContainerGap())
        );
        jPanelReciboLayout.setVerticalGroup(
            jPanelReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReciboLayout.createSequentialGroup()
                .addContainerGap(438, Short.MAX_VALUE)
                .addComponent(jButtonNuevo)
                .addContainerGap())
        );

        jTabbedPaneMenus.addTab("Impresión De Recibo", jPanelRecibo);

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCerrar)
                .addGap(349, 349, 349)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPaneMenus)
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelCerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneMenus, javax.swing.GroupLayout.PREFERRED_SIZE, 504, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //---Validaciones para el número máximo de personas, según el tipo de habitación.
    private void jComboBoxHabitacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxHabitacionItemStateChanged
        //Borrar el contenido previo del JTextArea.
        this.jTextAreaAdicional.setText("");

        //Deshabilitar el botón para cambiar el menú.
        if (this.jButtonSiguiente.isEnabled()) {
            this.jButtonSiguiente.setEnabled(false);
        }
        if (!this.jButtonSalida.isEnabled()) {
            this.jButtonSalida.setEnabled(true);
        }

        //Validar la cantidad máxima de personas, según el tipo de habitación.
        switch (this.jComboBoxHabitacion.getSelectedIndex()) {
            //Habitación simple seleccionada.
            case 0:
                this.jRadioButtonDos.setEnabled(false);
                this.jRadioButtonTres.setEnabled(false);
                this.jRadioButtonUna.setSelected(true);
                this.jComboBoxExtra.setEnabled(true);
                break;

            //Habitación doble seleccionada.
            case 1:
                this.jRadioButtonDos.setEnabled(true);
                this.jRadioButtonTres.setEnabled(false);

                if (this.jRadioButtonTres.isSelected()) {
                    this.jRadioButtonDos.setSelected(true);
                    this.jComboBoxExtra.setEnabled(true);
                } else if (!this.jRadioButtonDos.isSelected()) {
                    this.jComboBoxExtra.setEnabled(false);
                    this.jComboBoxExtra.setSelectedIndex(0);
                } else {
                    this.jComboBoxExtra.setEnabled(true);
                }
                break;

            //Habitación triple seleccionada.
            case 2:
                this.jRadioButtonDos.setEnabled(true);
                this.jRadioButtonTres.setEnabled(true);

                if (!this.jRadioButtonTres.isSelected()) {
                    this.jComboBoxExtra.setEnabled(false);
                    this.jComboBoxExtra.setSelectedIndex(0);
                }
                break;
        }
    }//GEN-LAST:event_jComboBoxHabitacionItemStateChanged

    //-Verificar disponibilidad de habitaciones de cierto tipo y validar entradas-//.
    private void jButtonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidaActionPerformed
        //Crear un salto de línea al inicio del JTextField.
        this.jTextAreaAdicional.setText("\n");

        //Se verifica si el nombre completo y ciudad fueron introducidos.
        if (this.nombresYCiudadValidos()) {

            //Se verifica la validez de la fecha de ingreso.
            if (this.jDateChooserIngreso.getDate() != null) {

            } else {
                this.jButtonSiguiente.setEnabled(false);
                this.jButtonSalida.setEnabled(true);
            }

            this.verificarDisponibilidad(this.jComboBoxHabitacion.getSelectedIndex());
        } else {
            this.jButtonSiguiente.setEnabled(false);
            this.jButtonSalida.setEnabled(true);
        }

        //La selección previa de alguna habitación se elimina.
        if (this.habitacionSeleccionada != null) {
            this.habitacionSeleccionada = null;
            this.jButtonSiguiente2.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonSalidaActionPerformed

    //-Permitir la selección de alguna habitación específica-//.
    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        this.jTabbedPaneMenus.setSelectedIndex(1);

        //Deshabilitar todas las pestañas, exceptuando la segunda.
        this.jTabbedPaneMenus.setEnabledAt(0, false);
        this.jTabbedPaneMenus.setEnabledAt(1, true);

        //Cambiarse al segundo menú.
        this.segundoMenu();
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    //-Regresar a la pantalla de solicitud de datos-//.
    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        this.jTabbedPaneMenus.setSelectedIndex(0);

        //Deshabilitar todas las pestañas, exceptuando la primera.
        this.jTabbedPaneMenus.setEnabledAt(0, true);
        this.jTabbedPaneMenus.setEnabledAt(1, false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    //-Reiniciar la solicitud tras seleccionar el primer piso-//.
    private void jRadioButtonPiso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPiso1ActionPerformed
        //Borrar el contenido previo del JTextArea.
        this.jTextAreaAdicional.setText("");

        //Deshabilitar el botón para cambiar el menú.
        if (this.jButtonSiguiente.isEnabled()) {
            this.jButtonSiguiente.setEnabled(false);
        }
        if (!this.jButtonSalida.isEnabled()) {
            this.jButtonSalida.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonPiso1ActionPerformed

    //-Reiniciar la solicitud tras seleccionar el segundo piso-//.
    private void jRadioButtonPiso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPiso2ActionPerformed
        //Borrar el contenido previo del JTextArea.
        this.jTextAreaAdicional.setText("");

        //Deshabilitar el botón para cambiar el menú.
        if (this.jButtonSiguiente.isEnabled()) {
            this.jButtonSiguiente.setEnabled(false);
        }
        if (!this.jButtonSalida.isEnabled()) {
            this.jButtonSalida.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonPiso2ActionPerformed

    //-Evento para seleccionar la primera habitación del piso correspondiente-//.
    private void jLabelHabitacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabitacion1MouseClicked
        this.seleccionarHabitacion(this.jLabelHabitacion1);
    }//GEN-LAST:event_jLabelHabitacion1MouseClicked

    //-Evento para seleccionar la segunda habitación del piso correspondiente-//.
    private void jLabelHabitacion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabitacion2MouseClicked
        this.seleccionarHabitacion(this.jLabelHabitacion2);
    }//GEN-LAST:event_jLabelHabitacion2MouseClicked

    //-Evento para seleccionar la tercera habitación del piso correspondiente-//.
    private void jLabelHabitacion3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabitacion3MouseClicked
        this.seleccionarHabitacion(this.jLabelHabitacion3);
    }//GEN-LAST:event_jLabelHabitacion3MouseClicked

    //-Evento para seleccionar la cuarta habitación del piso correspondiente-//.
    private void jLabelHabitacion4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabitacion4MouseClicked
        this.seleccionarHabitacion(this.jLabelHabitacion4);
    }//GEN-LAST:event_jLabelHabitacion4MouseClicked

    //-Evento para seleccionar la quinta habitación del piso correspondiente-//.
    private void jLabelHabitacion5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabitacion5MouseClicked
        this.seleccionarHabitacion(this.jLabelHabitacion5);
    }//GEN-LAST:event_jLabelHabitacion5MouseClicked

    //-Evento para seleccionar la sexta habitación del piso correspondiente-//.
    private void jLabelHabitacion6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabitacion6MouseClicked
        this.seleccionarHabitacion(this.jLabelHabitacion6);
    }//GEN-LAST:event_jLabelHabitacion6MouseClicked

    //-Evento para seleccionar la séptima habitación del piso correspondiente-//.
    private void jLabelHabitacion7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabitacion7MouseClicked
        this.seleccionarHabitacion(this.jLabelHabitacion7);
    }//GEN-LAST:event_jLabelHabitacion7MouseClicked

    //-Evento para seleccionar la octava habitación del piso correspondiente-//.
    private void jLabelHabitacion8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabitacion8MouseClicked
        this.seleccionarHabitacion(this.jLabelHabitacion8);
    }//GEN-LAST:event_jLabelHabitacion8MouseClicked

    //-Evento para seleccionar la novena habitación del piso correspondiente-//.
    private void jLabelHabitacion9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabitacion9MouseClicked
        this.seleccionarHabitacion(this.jLabelHabitacion9);
    }//GEN-LAST:event_jLabelHabitacion9MouseClicked

    //-Evento para seleccionar la décima habitación del piso correspondiente-//.
    private void jLabelHabitacion10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabitacion10MouseClicked
        this.seleccionarHabitacion(this.jLabelHabitacion10);
    }//GEN-LAST:event_jLabelHabitacion10MouseClicked

    //-Evento para seleccionar la undécima habitación del piso correspondiente-//.
    private void jLabelHabitacion11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabitacion11MouseClicked
        this.seleccionarHabitacion(this.jLabelHabitacion11);
    }//GEN-LAST:event_jLabelHabitacion11MouseClicked

    //-Evento para seleccionar la duodécima habitación del piso correspondiente-//.
    private void jLabelHabitacion12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabitacion12MouseClicked
        this.seleccionarHabitacion(this.jLabelHabitacion12);
    }//GEN-LAST:event_jLabelHabitacion12MouseClicked

    //-Evento para seleccionar la decimotercera habitación del piso correspondiente-//.
    private void jLabelHabitacion13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabitacion13MouseClicked
        this.seleccionarHabitacion(this.jLabelHabitacion13);
    }//GEN-LAST:event_jLabelHabitacion13MouseClicked

    //-Evento para seleccionar la decimocuarta habitación del piso correspondiente-//.
    private void jLabelHabitacion14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabitacion14MouseClicked
        this.seleccionarHabitacion(this.jLabelHabitacion14);
    }//GEN-LAST:event_jLabelHabitacion14MouseClicked

    //-Evento para seleccionar la decimoquinta habitación del piso correspondiente-//.
    private void jLabelHabitacion15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHabitacion15MouseClicked
        this.seleccionarHabitacion(this.jLabelHabitacion15);
    }//GEN-LAST:event_jLabelHabitacion15MouseClicked

    //-Permitir la confirmación del check-in-//.
    private void jButtonSiguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguiente2ActionPerformed
        this.jTabbedPaneMenus.setSelectedIndex(2);

        //Deshabilitar todas las pestañas, exceptuando la primera.
        this.jTabbedPaneMenus.setEnabledAt(1, false);
        this.jTabbedPaneMenus.setEnabledAt(2, true);

        //Mostrar el tercer menú.
        this.tercerMenu();
    }//GEN-LAST:event_jButtonSiguiente2ActionPerformed

    //-Permitir la modificación de los datos para la reservación-//.
    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        this.jTabbedPaneMenus.setSelectedIndex(0);

        //Deshabilitar todas las pestañas, exceptuando la primera.
        this.jTabbedPaneMenus.setEnabledAt(0, true);
        this.jTabbedPaneMenus.setEnabledAt(2, false);
    }//GEN-LAST:event_jButtonModificarActionPerformed

    //-Permitir la impresión del recibo y registrar los datos-//.
    private void jButtonGenerarReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarReciboActionPerformed
        this.jTabbedPaneMenus.setSelectedIndex(3);

        //Deshabilitar todas las pestañas, exceptuando la primera.
        this.jTabbedPaneMenus.setEnabledAt(2, false);
        this.jTabbedPaneMenus.setEnabledAt(3, true);

        //Función para añadir el registro a la base de datos.
        this.agregarInformacion();
    }//GEN-LAST:event_jButtonGenerarReciboActionPerformed

    //-Generar un registro nuevo (método de prueba)-//.
    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        this.jTabbedPaneMenus.setSelectedIndex(0);

        //Deshabilitar todas las pestañas, exceptuando la primera.
        this.jTabbedPaneMenus.setEnabledAt(0, true);
        this.jTabbedPaneMenus.setEnabledAt(3, false);

        //Borrar información previa.
        this.jTextFieldNombre.setText("");
        this.jTextFieldApellido.setText("");
        this.jTextFieldCiudad.setText("");
        this.jDateChooserIngreso.setDate(new Date());
        this.jComboBoxHabitacion.setSelectedIndex(0);
        this.jRadioButtonUna.setSelected(true);
        this.jRadioButtonPiso1.setSelected(true);
        this.jComboBoxExtra.setSelectedIndex(0);
        this.jSpinnerDias.setValue(1);
        this.jCheckBoxCuarto.setSelected(false);
        this.jCheckBoxBar.setSelected(false);
        this.jCheckBoxTintoreria.setSelected(false);
        this.jCheckBoxSPA.setSelected(false);
        this.jCheckBoxCuidado.setSelected(false);
        this.jCheckBoxGimnasio.setSelected(false);
        this.jCheckBoxJuegos.setSelected(false);
        this.jCheckBoxTennis.setSelected(false);
        this.jCheckBoxArco.setSelected(false);
        this.jCheckBoxGolf.setSelected(false);
        this.jTextAreaAdicional.setText("");
        this.jButtonSiguiente.setEnabled(false);
        this.jButtonSalida.setEnabled(true);
        this.jDateChooserIngreso.setDate(new Date());
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    //-Verificar si en una habitación doble habrá dos personas o no-//.
    private void jRadioButtonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDosActionPerformed
        if (this.jComboBoxHabitacion.getSelectedIndex() == 1) {
            this.jComboBoxExtra.setEnabled(true);
        } else {
            this.jComboBoxExtra.setEnabled(false);
            this.jComboBoxExtra.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jRadioButtonDosActionPerformed

    //-Verificar si en una habitación triple habrá tres personas o no-//.
    private void jRadioButtonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTresActionPerformed
        if (this.jComboBoxHabitacion.getSelectedIndex() == 2) {
            this.jComboBoxExtra.setEnabled(true);
        } else {
            this.jComboBoxExtra.setEnabled(false);
            this.jComboBoxExtra.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jRadioButtonTresActionPerformed

    //-Verificar si habrá una sola persona en una habitación doble o triple.
    private void jRadioButtonUnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonUnaActionPerformed
        int indice = this.jComboBoxHabitacion.getSelectedIndex();
        if (indice == 1 || indice == 2) {
            this.jComboBoxExtra.setEnabled(false);
            this.jComboBoxExtra.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jRadioButtonUnaActionPerformed

    //-Evento para verificar que el nombre no exceda los 10 caracteres-//.
    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        if (this.jTextFieldNombre.getText().length() > 9) {
            evt.consume();
        } else {
            if (this.jTextAreaAdicional.getText().length() > 0) {
                this.jTextAreaAdicional.setText("");
            }
            if (!this.jButtonSalida.isEnabled()) {
                this.jButtonSalida.setEnabled(true);
            }
            if (this.jButtonSiguiente.isEnabled()) {
                this.jButtonSiguiente.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    //-Evento para verificar que el nombre de la ciudad no exceda los 20 caracteres-//.
    private void jTextFieldCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCiudadKeyTyped
        if (this.jTextFieldCiudad.getText().length() > 19) {
            evt.consume();
        } else {
            if (this.jTextAreaAdicional.getText().length() > 0) {
                this.jTextAreaAdicional.setText("");
            }
            if (!this.jButtonSalida.isEnabled()) {
                this.jButtonSalida.setEnabled(true);
            }
            if (this.jButtonSiguiente.isEnabled()) {
                this.jButtonSiguiente.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jTextFieldCiudadKeyTyped

    //-Evento para verificar que el apellido no exceda los 10 caracteres-//.
    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
        if (this.jTextFieldApellido.getText().length() > 9) {
            evt.consume();
        } else {
            if (this.jTextAreaAdicional.getText().length() > 0) {
                this.jTextAreaAdicional.setText("");
            }
            if (!this.jButtonSalida.isEnabled()) {
                this.jButtonSalida.setEnabled(true);
            }
            if (this.jButtonSiguiente.isEnabled()) {
                this.jButtonSiguiente.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jButtonSalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalidaMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonSalida.setBackground(color);
    }//GEN-LAST:event_jButtonSalidaMouseEntered

    private void jButtonSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalidaMouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonSalida.setBackground(color);
    }//GEN-LAST:event_jButtonSalidaMouseExited

    private void jButtonSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSiguienteMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonSiguiente.setBackground(color);
    }//GEN-LAST:event_jButtonSiguienteMouseEntered

    private void jButtonSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSiguienteMouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonSiguiente.setBackground(color);
    }//GEN-LAST:event_jButtonSiguienteMouseExited

    private void jButtonRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonRegresar.setBackground(color);
    }//GEN-LAST:event_jButtonRegresarMouseEntered

    private void jButtonRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonRegresar.setBackground(color);
    }//GEN-LAST:event_jButtonRegresarMouseExited

    private void jButtonSiguiente2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSiguiente2MouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonSiguiente2.setBackground(color);
    }//GEN-LAST:event_jButtonSiguiente2MouseEntered

    private void jButtonSiguiente2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSiguiente2MouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonSiguiente2.setBackground(color);
    }//GEN-LAST:event_jButtonSiguiente2MouseExited

    private void jButtonModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificarMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonModificar.setBackground(color);
    }//GEN-LAST:event_jButtonModificarMouseEntered

    private void jButtonModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificarMouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonModificar.setBackground(color);
    }//GEN-LAST:event_jButtonModificarMouseExited

    private void jButtonGenerarReciboMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerarReciboMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonGenerarRecibo.setBackground(color);
    }//GEN-LAST:event_jButtonGenerarReciboMouseEntered

    private void jButtonGenerarReciboMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerarReciboMouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonGenerarRecibo.setBackground(color);
    }//GEN-LAST:event_jButtonGenerarReciboMouseExited

    //-Configuración adicional de ciertos componentes-//.
    private void extraInitProcess() {
        //Configuración para inhabilitar modificaciones manuales en el JSpinner para indicar la cantidad de días.
        ((JSpinner.DefaultEditor) this.jSpinnerDias.getEditor()).getTextField().setEditable(false);

        //Deshabilitar todas las pestañas, exceptuando la primera.
        this.jTabbedPaneMenus.setEnabledAt(1, false);
        this.jTabbedPaneMenus.setEnabledAt(2, false);
        this.jTabbedPaneMenus.setEnabledAt(3, false);

        //Deshabilitar modificaciones manuales en el JDateChooser y cambiar el color.
        JTextFieldDateEditor editor = (JTextFieldDateEditor) this.jDateChooserIngreso.getDateEditor();
        editor.setEditable(false);
        editor.setBackground(new Color(255, 255, 255));
        editor.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, false));

        //Seleccionar la fecha actual.
        this.jDateChooserIngreso.setDate(new Date());
    }

    //-Se verifica si el nombre completo y ciudad son válidos-//.
    private boolean nombresYCiudadValidos() {
        boolean retorno = true;
        String nombre = this.jTextFieldNombre.getText();
        String apellido = this.jTextFieldApellido.getText();
        String ciudad = this.jTextFieldCiudad.getText();

        if (nombre.equals("")) {
            this.jTextAreaAdicional.append("Se debe agregar algún nombre.\n");
            retorno = false;
        }
        if (apellido.equals("")) {
            this.jTextAreaAdicional.append("Se debe agregar algún apellido.\n");
            retorno = false;
        }
        if (ciudad.equals("")) {
            this.jTextAreaAdicional.append("Se debe agregar el nombre de alguna ciudad.\n");
            retorno = false;
        }

        return retorno;
    }

    //-Verificar la disponibilidad de habitaciones de cierto tipo-//.
    private void verificarDisponibilidad(int campo) {
        //Se vacía el contenido de la lista de habitaciones.
        this.listaHabitacionesOcupadas.clear();

        //Determinar el número de piso.
        if (this.jRadioButtonPiso1.isSelected()) {
            this.numeroPiso = 1;
        } else {
            this.numeroPiso = 2;
        }

        //Se obtiene el número de habitaciones total, según el tipo y piso.
        this.calcularNumeroHabitaciones();
        String nombreHabitacion;
        int HabitacionesReservadas = 0;

        switch (campo) {
            case 0:
                this.tipoHabitacion = "S";
                nombreHabitacion = "Chaac Suite";
                break;

            case 1:
                this.tipoHabitacion = "D";
                nombreHabitacion = "Itzamná Suite";
                break;

            case 2:
                this.tipoHabitacion = "T";
                nombreHabitacion = "Kauil Suite";
                break;

            default:
                this.tipoHabitacion = "";
                nombreHabitacion = "";
                break;
        }

        ConexionMySQL conexion = null;
        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();

            try {
                //Consultar en la base de datos todas las habitaciones reservadas.
                ResultSet consulta = conexion.consultarTabla("huespedes",
                        "room_id", " WHERE room_type = '" + this.tipoHabitacion + "' AND active = 1 AND floor =" + this.numeroPiso);

                while (consulta.next()) {
                    HabitacionesReservadas++;
                    this.listaHabitacionesOcupadas.add(consulta.getString("room_id"));
                }

                //Se verifica si la cantidad de habitaciones ocupadas equivale o no al total.
                if (HabitacionesReservadas >= this.contadorHabitaciones) {
                    this.jTextAreaAdicional.append("No hay habitaciones tipo " + nombreHabitacion
                            + " disponibles en el piso no. " + this.numeroPiso + ".\nModifique su selección.");
                } else {
                    int habitacionesDisponibles = this.contadorHabitaciones - HabitacionesReservadas;

                    //Se verifica si solo hay una habitación disponible.
                    if (habitacionesDisponibles == 1) {
                        this.jTextAreaAdicional.append("Hay una habitación tipo "
                                + nombreHabitacion + " disponible en el piso no. " + this.numeroPiso
                                + ".\nProceda a reservarla.");
                    } else {
                        this.jTextAreaAdicional.append("Hay " + habitacionesDisponibles
                                + " habitaciones " + "tipo " + nombreHabitacion + " disponibles"
                                + " en el piso no. " + this.numeroPiso + ".\n"
                                + "Proceda a reservar alguna.");
                    }
                    this.jButtonSiguiente.setEnabled(true);
                    this.jButtonSalida.setEnabled(false);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ocurrió un error durante la "
                        + " realización de la consulta.\nSQLException: " + ex.getMessage()
                        + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No fue posible realizar la "
                    + "conexión con la base de datos.\n" + "Verifique si el servidor "
                    + "XAMPP o MySQL local se encuentra activado.", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (conexion != null) {
                conexion.cerrarConexion();
            }
        }
    }

    //-Calcular el total de habitaciones, según el tipo y piso-//.
    private void calcularNumeroHabitaciones() {
        //Se verifica si se seleccionó el primer piso del hotel.
        if (this.numeroPiso == 1) {
            this.contadorHabitaciones = 5;
        } else {
            switch (this.jComboBoxHabitacion.getSelectedIndex()) {
                //Habitaciones simples.
                case 0:

                //Habitaciones dobles.
                case 1:
                    this.contadorHabitaciones = 4;
                    break;

                //Habitaciones triples.
                case 2:
                    this.contadorHabitaciones = 7;
                    break;
            }
        }
    }

    //-Control para gestionar la selección de cierta habitación-//.
    private void segundoMenu() {
        //Verificar el piso cuyas habitaciones se mostrarán.
        if (this.numeroPiso == 1) {
            this.jTextFieldNumeroPiso.setText(" Primer piso");
        } else {
            this.jTextFieldNumeroPiso.setText(" Segundo piso");
        }

        //Imprimir el tipo de habitación escogido.
        this.jTextFieldTipoHabitacion.setText(" " + (String) this.jComboBoxHabitacion.getSelectedItem());

        //Establecer los tipos de habitaciones, según el piso.
        this.definirHabitaciones();

        //Definir el estado de cada habitación.
        this.definirEstadoHabitaciones();
    }

    //-Definir las características generales de las habitaciones, según el piso-//.
    private void definirHabitaciones() {
        this.listaTotalHabitaciones.clear();
        if (this.numeroPiso == 1) {
            this.listaTotalHabitaciones.add(new Habitacion("101", "S"));
            this.listaTotalHabitaciones.add(new Habitacion("102", "D"));
            this.listaTotalHabitaciones.add(new Habitacion("103", "T"));
            this.listaTotalHabitaciones.add(new Habitacion("104", "S"));
            this.listaTotalHabitaciones.add(new Habitacion("105", "D"));
            this.listaTotalHabitaciones.add(new Habitacion("106", "T"));
            this.listaTotalHabitaciones.add(new Habitacion("107", "S"));
            this.listaTotalHabitaciones.add(new Habitacion("108", "D"));
            this.listaTotalHabitaciones.add(new Habitacion("109", "T"));
            this.listaTotalHabitaciones.add(new Habitacion("110", "S"));
            this.listaTotalHabitaciones.add(new Habitacion("111", "D"));
            this.listaTotalHabitaciones.add(new Habitacion("112", "T"));
            this.listaTotalHabitaciones.add(new Habitacion("113", "S"));
            this.listaTotalHabitaciones.add(new Habitacion("114", "D"));
            this.listaTotalHabitaciones.add(new Habitacion("115", "T"));
        } else {
            this.listaTotalHabitaciones.add(new Habitacion("201", "T"));
            this.listaTotalHabitaciones.add(new Habitacion("202", "S"));
            this.listaTotalHabitaciones.add(new Habitacion("203", "T"));
            this.listaTotalHabitaciones.add(new Habitacion("204", "T"));
            this.listaTotalHabitaciones.add(new Habitacion("205", "D"));
            this.listaTotalHabitaciones.add(new Habitacion("206", "D"));
            this.listaTotalHabitaciones.add(new Habitacion("207", "T"));
            this.listaTotalHabitaciones.add(new Habitacion("208", "S"));
            this.listaTotalHabitaciones.add(new Habitacion("209", "D"));
            this.listaTotalHabitaciones.add(new Habitacion("210", "T"));
            this.listaTotalHabitaciones.add(new Habitacion("211", "S"));
            this.listaTotalHabitaciones.add(new Habitacion("212", "D"));
            this.listaTotalHabitaciones.add(new Habitacion("213", "S"));
            this.listaTotalHabitaciones.add(new Habitacion("214", "T"));
            this.listaTotalHabitaciones.add(new Habitacion("215", "T"));
        }
    }

    //-Se define el estado de cada habitación-//.
    private void definirEstadoHabitaciones() {
        //Según el número de piso, mostrar la distribución de habitaciones.
        if (this.numeroPiso == 1) {
            this.jTextFieldNumeroPiso.setText(" Primer piso");
        } else {
            this.jTextFieldNumeroPiso.setText(" Segundo piso");
        }
        this.definirNumerosHabitaciones(numeroPiso);

        //Establecer el estado de todas las habitaciones del piso.
        for (int i = 0; i < 15; i++) {
            if (!this.listaTotalHabitaciones.get(i).getTipoHabitacion().equals(this.tipoHabitacion)) {
                //Las habitaciones no correspondientes al tipo seleccionado se colorean de amarillo.
                this.seleccionarHabitación(i).setBackground(new Color(255, 255, 209));
            } else if (this.habitacionOcupada(this.listaTotalHabitaciones.get(i).getIdHabitacion())) {
                //Las habitaciones ocupadas se colorean de rojo.
                this.seleccionarHabitación(i).setBackground(new Color(255, 215, 215));
            } else {
                //El resto de habitaciones se colorea de verde.
                this.seleccionarHabitación(i).setBackground(new Color(219, 255, 209));
            }
        }
        //La habitación seleccionada se colorea de rojo oscuro.
        if (this.habitacionSeleccionada != null) {
            this.habitacionSeleccionada.setBackground(new Color(236, 118, 125));
        }
    }

    //-Definir los números de habitaciones, según el piso-//.
    private void definirNumerosHabitaciones(int numeroPiso) {
        for (int i = 0; i < 15; i++) {
            JLabel habitacion = this.seleccionarHabitación(i);
            habitacion.setText(Integer.toString(numeroPiso * 100 + (i + 1)));
        }
    }

    //-Seleccionar alguna habitación, según su numeración-//.
    private JLabel seleccionarHabitación(int indice) {
        JLabel habitacion = null;

        switch (indice) {
            case 0:
                habitacion = this.jLabelHabitacion1;
                break;
            case 1:
                habitacion = this.jLabelHabitacion2;
                break;
            case 2:
                habitacion = this.jLabelHabitacion3;
                break;
            case 3:
                habitacion = this.jLabelHabitacion4;
                break;
            case 4:
                habitacion = this.jLabelHabitacion5;
                break;
            case 5:
                habitacion = this.jLabelHabitacion6;
                break;
            case 6:
                habitacion = this.jLabelHabitacion7;
                break;
            case 7:
                habitacion = this.jLabelHabitacion8;
                break;
            case 8:
                habitacion = this.jLabelHabitacion9;
                break;
            case 9:
                habitacion = this.jLabelHabitacion10;
                break;
            case 10:
                habitacion = this.jLabelHabitacion11;
                break;
            case 11:
                habitacion = this.jLabelHabitacion12;
                break;
            case 12:
                habitacion = this.jLabelHabitacion13;
                break;
            case 13:
                habitacion = this.jLabelHabitacion14;
                break;
            case 14:
                habitacion = this.jLabelHabitacion15;
                break;
        }

        return habitacion;
    }

    //-Se verifica si una habitación específica está ocupada-//.
    private boolean habitacionOcupada(String idHabitacion) {
        for (String listaHabitacionesOcupada : this.listaHabitacionesOcupadas) {
            if (idHabitacion.equals(listaHabitacionesOcupada)) {
                return true;
            }
        }
        return false;
    }

    //-Se escoge una habitación específica (debe estar disponible o no seleccionada)-//.
    private void seleccionarHabitacion(JLabel habitacion) {
        //Se verifica si la habitación no estaba seleccionada.
        if (this.habitacionSeleccionada == null) {
            //Se verifica si la habitación está disponible.
            Color estado = habitacion.getBackground();

            if (!estado.equals(new Color(255, 215, 215)) && !estado.equals(new Color(255, 255, 209))) {
                habitacion.setBackground(new Color(236, 118, 125));
                this.habitacionSeleccionada = habitacion;
                this.jButtonSiguiente2.setEnabled(true);
            }
        } else if (this.habitacionSeleccionada != habitacion) {
            //Se verifica si la habitación está disponible.
            Color estado = habitacion.getBackground();

            if (!estado.equals(new Color(255, 215, 215)) && !estado.equals(new Color(255, 255, 209))) {
                this.habitacionSeleccionada.setBackground(new Color(219, 255, 209));
                habitacion.setBackground(new Color(236, 118, 125));
                this.habitacionSeleccionada = habitacion;
            }
        }
    }

    //-Se muestra el tercer menú del sistema de registro-//.
    private void tercerMenu() {
        //Vaciar el JTextArea.
        this.jTextAreaDatos.setText("");

        //Imprimir el nombre del huésped.
        this.jTextAreaDatos.append("\nNombre completo del huésped: " + this.jTextFieldNombre.getText().trim()
                + " " + this.jTextFieldApellido.getText().trim() + ".\n");

        //Imprimir la ciudad de origen.
        this.jTextAreaDatos.append("Ciudad de origen: " + this.jTextFieldCiudad.getText() + ".\n\n");

        //Imprimir la fecha de ingreso.
        Date fecha = this.jDateChooserIngreso.getDate();
        this.fechaInicial = Calendar.getInstance();
        this.fechaInicial.setTime(fecha);
        this.imprimirFecha("ingreso", this.fechaInicial, fecha, this.jTextAreaDatos);

        //Imprimir la fecha de salida.
        this.fechaFinal = Calendar.getInstance();
        this.fechaFinal.setTime(fecha);
        this.fechaFinal.add(Calendar.DAY_OF_YEAR, (Integer) this.jSpinnerDias.getValue());
        fecha = this.fechaFinal.getTime();
        this.imprimirFecha("salida", this.fechaFinal, fecha, this.jTextAreaDatos);

        //Imprimir la cantidad de días de hospedaje.
        this.jTextAreaDatos.append("Días de hospedaje: " + (Integer) this.jSpinnerDias.getValue() + ".\n\n");

        //Imprimir el número de la habitación reservada.
        this.jTextAreaDatos.append("Número de habitación: " + this.habitacionSeleccionada.getText() + ".\n");

        //Imprimir el número de piso.
        this.jTextAreaDatos.append("Número de piso: " + this.numeroPiso + ".\n");

        //Imprimir el tipo de habitación.
        this.jTextAreaDatos.append("Tipo de habitación: " + (String) this.jComboBoxHabitacion.getSelectedItem() + ".\n");

        //Imprimir el límite de huéspedes.
        this.jTextAreaDatos.append("Límite de huéspedes: ");
        switch (this.tipoHabitacion) {
            //Habitación simple.
            case "S":
                this.jTextAreaDatos.append("1.\n");
                break;

            //Habitación doble.
            case "D":
                this.jTextAreaDatos.append("2.\n");
                break;

            //Habitación triple.
            case "T":
                this.jTextAreaDatos.append("3.\n");
                break;
        }

        //Imprimir y almacenar la cantidad de huéspedes.
        this.jTextAreaDatos.append("\nCantidad de huéspedes: ");
        if (this.jRadioButtonUna.isSelected()) {
            this.jTextAreaDatos.append("1.\n");
            this.cantidadHuespedes = 1;
        } else if (this.jRadioButtonDos.isSelected()) {
            this.jTextAreaDatos.append("2.\n");
            this.cantidadHuespedes = 2;
        } else {
            this.jTextAreaDatos.append("3.\n");
            this.cantidadHuespedes = 3;
        }

        //Imprimir y almacenar la cantidad de huéspedes extra.
        String cadena = (String) this.jComboBoxExtra.getSelectedItem();
        char texto[] = cadena.toCharArray();
        texto[0] = Character.toLowerCase(cadena.charAt(0));
        this.jTextAreaDatos.append("Huéspedes extra: " + String.valueOf(texto) + ".\n");
        this.jTextAreaDatos.append("(Por cada uno se cobrará $714 adicionales la noche).\n");
        this.cantidadHuespedesExtra = this.jComboBoxExtra.getSelectedIndex();

        //Imprimir la lista de servicios adicionales.
        this.jTextAreaDatos.append("\nServicios adicionales:\n");
        if (this.jCheckBoxCuarto.isSelected()) {
            this.jTextAreaDatos.append("- " + this.jCheckBoxCuarto.getText() + ".\n");
        }
        if (this.jCheckBoxBar.isSelected()) {
            this.jTextAreaDatos.append("- " + this.jCheckBoxBar.getText() + ".\n");
        }
        if (this.jCheckBoxTintoreria.isSelected()) {
            this.jTextAreaDatos.append("- " + this.jCheckBoxTintoreria.getText() + ".\n");
        }
        if (this.jCheckBoxSPA.isSelected()) {
            this.jTextAreaDatos.append("- " + this.jCheckBoxSPA.getText() + ".\n");
        }
        if (this.jCheckBoxCuidado.isSelected()) {
            this.jTextAreaDatos.append("- " + this.jCheckBoxCuidado.getText() + ".\n");
        }
        if (this.jCheckBoxGimnasio.isSelected()) {
            this.jTextAreaDatos.append("- " + this.jCheckBoxGimnasio.getText() + ".\n");
        }
        if (this.jCheckBoxJuegos.isSelected()) {
            this.jTextAreaDatos.append("- " + this.jCheckBoxJuegos.getText() + ".\n");
        }
        if (this.jCheckBoxTennis.isSelected()) {
            this.jTextAreaDatos.append("- " + this.jCheckBoxTennis.getText() + ".\n");
        }
        if (this.jCheckBoxArco.isSelected()) {
            this.jTextAreaDatos.append("- " + this.jCheckBoxArco.getText() + ".\n");
        }
        if (this.jCheckBoxGolf.isSelected()) {
            this.jTextAreaDatos.append("- " + this.jCheckBoxGolf.getText() + ".\n");
        }
    }

    //-Se imprime, en un JTextArea, una fecha específica-//.
    private void imprimirFecha(String tipoFecha, Calendar calendario, Date fecha, JTextArea campo) {
        //Imprimir la fecha de salida.
        String mes;

        //Definir el mes.
        switch (calendario.get(Calendar.MONTH)) {
            case 0:
                mes = " enero ";
                break;
            case 1:
                mes = " febrero ";
                break;
            case 2:
                mes = " marzo ";
                break;
            case 3:
                mes = " abril ";
                break;
            case 4:
                mes = " mayo ";
                break;
            case 5:
                mes = " junio ";
                break;
            case 6:
                mes = " julio ";
                break;
            case 7:
                mes = " agosto ";
                break;
            case 8:
                mes = " septiembre ";
                break;
            case 9:
                mes = " octubre ";
                break;
            case 10:
                mes = " noviembre ";
                break;
            case 11:
                mes = " diciembre ";
                break;
            default:
                mes = " indefinido ";
                break;
        }

        SimpleDateFormat formato1 = new SimpleDateFormat("dd 'de'");
        SimpleDateFormat formato2 = new SimpleDateFormat("yyyy");
        campo.append("Fecha de " + tipoFecha + ": " + formato1.format(fecha) + mes + "de " + formato2.format(fecha) + ".\n");
    }

    //-Todos los datos del nuevo huésped se almacenan en la base de datos-//.
    private void agregarInformacion() {
        ConexionMySQL conexion = null;
        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();

            try {
                //Almacenar fechas en variables SQL.
                java.sql.Date fechaI = new java.sql.Date(this.fechaInicial.getTime().getTime());
                java.sql.Date fechaF = new java.sql.Date(this.fechaFinal.getTime().getTime());

                //Agregar los datos a la tabla de huéspedes.
                PreparedStatement comando = conexion.getConexion().prepareStatement(
                        "INSERT INTO huespedes(name, city, check_in, check_out, days, "
                        + "room_id, room_type, floor, guests, extras, active) VALUES"
                        + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                comando.setString(1, this.jTextFieldNombre.getText().trim() + " " + this.jTextFieldApellido.getText().trim());
                comando.setString(2, this.jTextFieldCiudad.getText());
                comando.setDate(3, fechaI);
                comando.setDate(4, fechaF);
                comando.setInt(5, (Integer) this.jSpinnerDias.getValue());
                comando.setString(6, this.habitacionSeleccionada.getText());
                comando.setString(7, this.tipoHabitacion);
                comando.setInt(8, this.numeroPiso);
                comando.setInt(9, this.cantidadHuespedes);
                comando.setInt(10, this.cantidadHuespedesExtra);
                comando.setInt(11, 1);
                comando.executeUpdate();

                //Consultar el identificador de huésped.
                ResultSet consulta = conexion.consultarTabla("huespedes",
                        "guest_id", " ORDER BY guest_id DESC LIMIT 1");

                //Agregar datos a la tabla de servicios.
                if (consulta.next()) {
                    //Agregar datos a la tabla de servicios.
                    conexion.insertarDatos("servicios", "(guest_id, room_service,"
                            + " bar_access, cleaner_service, SPA_service, baby_sister_service,"
                            + "gym_access, gaming_access, tennis_access, bow_shooting, golf_access)",
                            "(" + consulta.getInt("guest_id") + ", "
                            + this.aEntero(this.jCheckBoxCuarto.isSelected()) + ", "
                            + this.aEntero(this.jCheckBoxBar.isSelected()) + ", "
                            + this.aEntero(this.jCheckBoxTintoreria.isSelected()) + ", "
                            + this.aEntero(this.jCheckBoxSPA.isSelected()) + ", "
                            + this.aEntero(this.jCheckBoxCuidado.isSelected()) + ", "
                            + this.aEntero(this.jCheckBoxGimnasio.isSelected()) + ", "
                            + this.aEntero(this.jCheckBoxJuegos.isSelected()) + ", "
                            + this.aEntero(this.jCheckBoxTennis.isSelected()) + ", "
                            + this.aEntero(this.jCheckBoxArco.isSelected()) + ", "
                            + this.aEntero(this.jCheckBoxGolf.isSelected()) + ")");

                    JOptionPane.showMessageDialog(this, "El registro fue exitosamente "
                            + "realizado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    throw new SQLException();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ocurrió un error durante la "
                        + "realización de la consulta.\nSQLException: " + ex.getMessage()
                        + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No fue posible realizar la "
                    + "conexión con la base de datos.\n" + "Verifique si el servidor "
                    + "XAMPP o MySQL local se encuentra activado.", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (conexion != null) {
                conexion.cerrarConexion();
            }
        }
    }

    //-Obtener un valor entero a partir de un booleano-//.
    private int aEntero(boolean booleano) {
        if (booleano) {
            return 1;
        } else {
            return 0;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupHabitaciones;
    private javax.swing.ButtonGroup buttonGroupPisos;
    private javax.swing.JButton jButtonGenerarRecibo;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JButton jButtonSiguiente2;
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
    private javax.swing.JComboBox jComboBoxHabitacion;
    private com.toedter.calendar.JDateChooser jDateChooserIngreso;
    private javax.swing.JLabel jLabelAdicional;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelBar;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelDias;
    private javax.swing.JLabel jLabelGimnasio;
    private javax.swing.JLabel jLabelGolf;
    private javax.swing.JLabel jLabelHabitacion;
    private javax.swing.JLabel jLabelHabitacion1;
    private javax.swing.JLabel jLabelHabitacion10;
    private javax.swing.JLabel jLabelHabitacion11;
    private javax.swing.JLabel jLabelHabitacion12;
    private javax.swing.JLabel jLabelHabitacion13;
    private javax.swing.JLabel jLabelHabitacion14;
    private javax.swing.JLabel jLabelHabitacion15;
    private javax.swing.JLabel jLabelHabitacion2;
    private javax.swing.JLabel jLabelHabitacion3;
    private javax.swing.JLabel jLabelHabitacion4;
    private javax.swing.JLabel jLabelHabitacion5;
    private javax.swing.JLabel jLabelHabitacion6;
    private javax.swing.JLabel jLabelHabitacion7;
    private javax.swing.JLabel jLabelHabitacion8;
    private javax.swing.JLabel jLabelHabitacion9;
    private javax.swing.JLabel jLabelIngreso;
    private javax.swing.JLabel jLabelNiñera;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumeroPiso;
    private javax.swing.JLabel jLabelPersonas;
    private javax.swing.JLabel jLabelPiso;
    private javax.swing.JLabel jLabelPisoPersonasExtra;
    private javax.swing.JLabel jLabelSPA;
    private javax.swing.JLabel jLabelServicioAlCuarto;
    private javax.swing.JLabel jLabelTenis;
    private javax.swing.JLabel jLabelTintoreria;
    private javax.swing.JLabel jLabelTipoHabitacion;
    private javax.swing.JLabel jLabelTiroConArco;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelZonaJuegos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelConfirmacion;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelDatosHabitación;
    private javax.swing.JPanel jPanelDatosHuespedes;
    private javax.swing.JPanel jPanelDatosPersonales;
    private javax.swing.JPanel jPanelHabitacion;
    private javax.swing.JPanel jPanelInformacionReservacion;
    private javax.swing.JPanel jPanelRecibo;
    private javax.swing.JPanel jPanelServiciosExtra;
    private javax.swing.JPanel jPanelTiempoReservación;
    private javax.swing.JRadioButton jRadioButtonDos;
    private javax.swing.JRadioButton jRadioButtonPiso1;
    private javax.swing.JRadioButton jRadioButtonPiso2;
    private javax.swing.JRadioButton jRadioButtonTres;
    private javax.swing.JRadioButton jRadioButtonUna;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerDias;
    private javax.swing.JTabbedPane jTabbedPaneMenus;
    private javax.swing.JTextArea jTextAreaAdicional;
    private javax.swing.JTextArea jTextAreaDatos;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNumeroPiso;
    private javax.swing.JTextField jTextFieldTipoHabitacion;
    // End of variables declaration//GEN-END:variables
}
