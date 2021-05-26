//---Paquete---//.
package com.operaciones;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import java.awt.Color;
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
public class Modificaciones extends javax.swing.JInternalFrame {

    //---Atributos adicionales---//.
    private int identificador = 0;
    private Date fechaIngreso = new Date();
    private String numeroHabitacion;
    private ArrayList<String> cadenas = new ArrayList<>();
    private ArrayList<Integer> numeros = new ArrayList<>();

    //---Constructor---//.
    public Modificaciones() {
        initComponents();
        extraInitProcess();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelConsultaHabitacion = new javax.swing.JPanel();
        jLabelHabitacion = new javax.swing.JLabel();
        jTextFieldHabitacion = new javax.swing.JTextField();
        jButtonBusqueda = new javax.swing.JButton();
        jPanelEstadoHabitacion = new javax.swing.JPanel();
        jLabelResultado = new javax.swing.JLabel();
        jTextFieldResultado = new javax.swing.JTextField();
        jPanelModificaciones = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jLabelPersonasExtra = new javax.swing.JLabel();
        jComboBoxExtra = new javax.swing.JComboBox();
        jLabelDias = new javax.swing.JLabel();
        jSpinnerDias = new javax.swing.JSpinner();
        jLabelServicios = new javax.swing.JLabel();
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
        jButtonCambios = new javax.swing.JButton();
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
        jLabelDatosPersonales = new javax.swing.JLabel();
        jLabelDatosHospedaje = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jPanelBase.setBackground(new java.awt.Color(255, 232, 205));

        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/close.png"))); // NOI18N
        jLabelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(72, 72, 72));
        jLabelTitulo.setText("Modificaciones");

        jPanelConsultaHabitacion.setBackground(new java.awt.Color(255, 163, 51));
        jPanelConsultaHabitacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "Consulta De Habitación", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N

        jLabelHabitacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion.setText("Número de habitación:");

        jTextFieldHabitacion.setBackground(new java.awt.Color(255, 232, 205));
        jTextFieldHabitacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldHabitacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHabitacionActionPerformed(evt);
            }
        });
        jTextFieldHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHabitacionKeyTyped(evt);
            }
        });

        jButtonBusqueda.setBackground(new java.awt.Color(228, 130, 0));
        jButtonBusqueda.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/search.png"))); // NOI18N
        jButtonBusqueda.setText("Realizar búsqueda");
        jButtonBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButtonBusqueda.setBorderPainted(false);
        jButtonBusqueda.setContentAreaFilled(false);
        jButtonBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBusqueda.setFocusPainted(false);
        jButtonBusqueda.setOpaque(true);
        jButtonBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonBusquedaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonBusquedaMouseExited(evt);
            }
        });
        jButtonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultaHabitacionLayout = new javax.swing.GroupLayout(jPanelConsultaHabitacion);
        jPanelConsultaHabitacion.setLayout(jPanelConsultaHabitacionLayout);
        jPanelConsultaHabitacionLayout.setHorizontalGroup(
            jPanelConsultaHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelConsultaHabitacionLayout.createSequentialGroup()
                        .addComponent(jLabelHabitacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldHabitacion)))
                .addContainerGap())
        );
        jPanelConsultaHabitacionLayout.setVerticalGroup(
            jPanelConsultaHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaHabitacionLayout.createSequentialGroup()
                .addGroup(jPanelConsultaHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEstadoHabitacion.setBackground(new java.awt.Color(255, 163, 51));
        jPanelEstadoHabitacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "Estado De La Habitación", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N

        jLabelResultado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultado.setText("Resultado de la búsqueda:");

        jTextFieldResultado.setEditable(false);
        jTextFieldResultado.setBackground(new java.awt.Color(255, 232, 205));
        jTextFieldResultado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanelEstadoHabitacionLayout = new javax.swing.GroupLayout(jPanelEstadoHabitacion);
        jPanelEstadoHabitacion.setLayout(jPanelEstadoHabitacionLayout);
        jPanelEstadoHabitacionLayout.setHorizontalGroup(
            jPanelEstadoHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstadoHabitacionLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabelResultado)
                .addGap(66, 66, 66))
            .addGroup(jPanelEstadoHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldResultado)
                .addContainerGap())
        );
        jPanelEstadoHabitacionLayout.setVerticalGroup(
            jPanelEstadoHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstadoHabitacionLayout.createSequentialGroup()
                .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelModificaciones.setBackground(new java.awt.Color(255, 163, 51));
        jPanelModificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "Modificaciones", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N
        jPanelModificaciones.setEnabled(false);

        jLabelNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNombre.setText("Nombre: ");
        jLabelNombre.setEnabled(false);

        jLabelApellido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelApellido.setText("Apellido:");
        jLabelApellido.setEnabled(false);

        jLabelCiudad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelCiudad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCiudad.setText("Ciudad de origen: ");
        jLabelCiudad.setEnabled(false);

        jTextFieldNombre.setBackground(new java.awt.Color(255, 232, 205));
        jTextFieldNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNombre.setEnabled(false);
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jTextFieldApellido.setBackground(new java.awt.Color(255, 232, 205));
        jTextFieldApellido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldApellido.setEnabled(false);
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });

        jTextFieldCiudad.setBackground(new java.awt.Color(255, 232, 205));
        jTextFieldCiudad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldCiudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCiudad.setEnabled(false);
        jTextFieldCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCiudadKeyTyped(evt);
            }
        });

        jLabelPersonasExtra.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelPersonasExtra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPersonasExtra.setText("Huéspedes extra:");
        jLabelPersonasExtra.setEnabled(false);

        jComboBoxExtra.setBackground(new java.awt.Color(255, 232, 205));
        jComboBoxExtra.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jComboBoxExtra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Una persona", "Dos personas" }));
        jComboBoxExtra.setEnabled(false);
        jComboBoxExtra.setFocusable(false);

        jLabelDias.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelDias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDias.setText("Días de hospedaje:");
        jLabelDias.setEnabled(false);

        jSpinnerDias.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jSpinnerDias.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        jSpinnerDias.setEnabled(false);

        jLabelServicios.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelServicios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelServicios.setText("Servicios Extra:");
        jLabelServicios.setEnabled(false);

        jCheckBoxCuarto.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxCuarto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxCuarto.setText("Atención al cuarto");
        jCheckBoxCuarto.setEnabled(false);
        jCheckBoxCuarto.setFocusPainted(false);

        jCheckBoxBar.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxBar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxBar.setText("Acceso al bar");
        jCheckBoxBar.setEnabled(false);
        jCheckBoxBar.setFocusPainted(false);

        jCheckBoxTintoreria.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxTintoreria.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxTintoreria.setText("Acceso a tintorería");
        jCheckBoxTintoreria.setEnabled(false);
        jCheckBoxTintoreria.setFocusPainted(false);

        jCheckBoxSPA.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxSPA.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxSPA.setText("Acceso al SPA");
        jCheckBoxSPA.setEnabled(false);
        jCheckBoxSPA.setFocusPainted(false);

        jCheckBoxCuidado.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxCuidado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxCuidado.setText("Contratación de niñera");
        jCheckBoxCuidado.setEnabled(false);
        jCheckBoxCuidado.setFocusPainted(false);

        jCheckBoxGimnasio.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxGimnasio.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxGimnasio.setText("Acceso a gimnasio");
        jCheckBoxGimnasio.setEnabled(false);
        jCheckBoxGimnasio.setFocusPainted(false);

        jCheckBoxJuegos.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxJuegos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxJuegos.setText("Acceso a zona de juegos");
        jCheckBoxJuegos.setEnabled(false);
        jCheckBoxJuegos.setFocusPainted(false);

        jCheckBoxTennis.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxTennis.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxTennis.setText("Canchas de tennis");
        jCheckBoxTennis.setEnabled(false);
        jCheckBoxTennis.setFocusPainted(false);

        jCheckBoxArco.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxArco.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxArco.setText("Campo de tiro con arco");
        jCheckBoxArco.setEnabled(false);
        jCheckBoxArco.setFocusPainted(false);

        jCheckBoxGolf.setBackground(new java.awt.Color(255, 163, 51));
        jCheckBoxGolf.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jCheckBoxGolf.setText("Campo de golf");
        jCheckBoxGolf.setEnabled(false);
        jCheckBoxGolf.setFocusPainted(false);

        jButtonCambios.setBackground(new java.awt.Color(228, 130, 0));
        jButtonCambios.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/edit32.png"))); // NOI18N
        jButtonCambios.setText("Realizar cambios");
        jButtonCambios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButtonCambios.setBorderPainted(false);
        jButtonCambios.setContentAreaFilled(false);
        jButtonCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCambios.setEnabled(false);
        jButtonCambios.setFocusPainted(false);
        jButtonCambios.setOpaque(true);
        jButtonCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCambiosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCambiosMouseExited(evt);
            }
        });
        jButtonCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiosActionPerformed(evt);
            }
        });

        jLabelServicioAlCuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/coffee.png"))); // NOI18N
        jLabelServicioAlCuarto.setEnabled(false);

        jLabelBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/cocktail-glass.png"))); // NOI18N
        jLabelBar.setEnabled(false);

        jLabelTintoreria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/tshirt.png"))); // NOI18N
        jLabelTintoreria.setEnabled(false);

        jLabelSPA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/spa-lotus-flower.png"))); // NOI18N
        jLabelSPA.setEnabled(false);

        jLabelNiñera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/child.png"))); // NOI18N
        jLabelNiñera.setEnabled(false);

        jLabelGimnasio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/hands-up.png"))); // NOI18N
        jLabelGimnasio.setEnabled(false);

        jLabelZonaJuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/group.png"))); // NOI18N
        jLabelZonaJuegos.setEnabled(false);

        jLabelTenis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/tennis_sport.png"))); // NOI18N
        jLabelTenis.setEnabled(false);

        jLabelTiroConArco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/bullseye.png"))); // NOI18N
        jLabelTiroConArco.setEnabled(false);

        jLabelGolf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servicios/golf-player.png"))); // NOI18N
        jLabelGolf.setEnabled(false);

        jLabelDatosPersonales.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelDatosPersonales.setText("Datos Personales:");
        jLabelDatosPersonales.setEnabled(false);

        jLabelDatosHospedaje.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelDatosHospedaje.setText("Datos De Hospedaje:");
        jLabelDatosHospedaje.setEnabled(false);

        javax.swing.GroupLayout jPanelModificacionesLayout = new javax.swing.GroupLayout(jPanelModificaciones);
        jPanelModificaciones.setLayout(jPanelModificacionesLayout);
        jPanelModificacionesLayout.setHorizontalGroup(
            jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificacionesLayout.createSequentialGroup()
                .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModificacionesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelModificacionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDias)
                            .addComponent(jLabelPersonasExtra))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerDias, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModificacionesLayout.createSequentialGroup()
                                .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxGolf)
                                    .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jCheckBoxBar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBoxTintoreria)
                                        .addComponent(jCheckBoxSPA)
                                        .addComponent(jCheckBoxCuidado)
                                        .addComponent(jCheckBoxGimnasio)
                                        .addComponent(jCheckBoxJuegos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCheckBoxTennis)
                                        .addComponent(jCheckBoxArco, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBoxCuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabelServicios)))
                    .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelModificacionesLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabelCiudad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModificacionesLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelDatosHospedaje))
                            .addGroup(jPanelModificacionesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelNombre)
                                    .addGroup(jPanelModificacionesLayout.createSequentialGroup()
                                        .addComponent(jLabelApellido)
                                        .addGap(3, 3, 3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextFieldApellido)))
                            .addGroup(jPanelModificacionesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelDatosPersonales)))))
                .addContainerGap())
        );
        jPanelModificacionesLayout.setVerticalGroup(
            jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificacionesLayout.createSequentialGroup()
                .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelServicios)
                    .addComponent(jLabelDatosPersonales))
                .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModificacionesLayout.createSequentialGroup()
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBoxCuarto)
                            .addComponent(jLabelServicioAlCuarto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelBar)
                            .addComponent(jCheckBoxBar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTintoreria)
                            .addComponent(jCheckBoxTintoreria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSPA)
                            .addComponent(jCheckBoxSPA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNiñera)
                            .addComponent(jCheckBoxCuidado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelGimnasio)
                            .addComponent(jCheckBoxGimnasio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelZonaJuegos)
                            .addComponent(jCheckBoxJuegos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTenis)
                            .addComponent(jCheckBoxTennis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBoxArco)
                            .addComponent(jLabelTiroConArco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGolf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBoxGolf, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(jPanelModificacionesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldApellido)
                            .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCiudad))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDatosHospedaje)
                        .addGap(15, 15, 15)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDias)
                            .addComponent(jSpinnerDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPersonasExtra)
                            .addComponent(jComboBoxExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCambios)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addComponent(jLabelCerrar)
                        .addGap(321, 321, 321)
                        .addComponent(jLabelTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanelEstadoHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelConsultaHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelModificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelCerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addComponent(jPanelConsultaHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelEstadoHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelModificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-Evento para verificar que el nombre de la ciudad no exceda los 20 caracteres-//.
    private void jTextFieldCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCiudadKeyTyped
        if (this.jTextFieldCiudad.getText().length() > 19) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCiudadKeyTyped

    //-Evento para verificar que el apellido no exceda los 10 caracteres-//.
    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
        if (this.jTextFieldApellido.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    //-Evento para verificar que el nombre no exceda los 10 caracteres-//.
    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        if (this.jTextFieldNombre.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    //-Evento para verificar que la búsqueda de la habitación no exceda los 3 caracteres-//.
    private void jTextFieldHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHabitacionKeyTyped
        if (this.jTextFieldHabitacion.getText().length() > 2) {
            evt.consume();
        } else {
            //Desactivar todos los campos para cambiar información.
            this.reajustarControles(false);
            this.jButtonCambios.setEnabled(false);
            this.jButtonBusqueda.setEnabled(true);
            this.jTextFieldResultado.setText("");
        }
    }//GEN-LAST:event_jTextFieldHabitacionKeyTyped

    //-Se muestra la información del huésped correspondiente a la habitación seleccionada-//.
    private void jButtonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaActionPerformed
        if (this.jTextFieldHabitacion.getText().length() > 0) {
            ConexionMySQL conexion = null;

            try {
                //Conexión a la base de datos.
                conexion = new ConexionMySQL();

                try {
                    this.numeroHabitacion = this.jTextFieldHabitacion.getText().trim();

                    //Consultar en la base de datos la información del huésped alojado en la habitación.
                    ResultSet consulta = conexion.consultarTabla("huespedes",
                            "a.guest_id, a.name, a.city, a.days, a.extras, a.check_in, a.room_type"
                            + ", a.guests, b.room_service, b.bar_access, b.cleaner_service, "
                            + "b.SPA_service, b.baby_sister_service, b.gym_access, "
                            + "b.gaming_access, b.tennis_access, b.bow_shooting, "
                            + "b.golf_access", " AS a JOIN servicios AS b ON a.guest_id "
                            + "= b.guest_id WHERE active = 1 AND room_id = " + this.numeroHabitacion
                            + " LIMIT 1");

                    //Se verifica si la habitación está ocupada o no.
                    if (consulta.next()) {
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

                        if (consulta.getInt("a.extras") > 0) {
                            this.jComboBoxExtra.setSelectedIndex(consulta.getInt("a.extras"));
                            this.numeros.add(consulta.getInt("a.extras"));
                        } else {
                            this.numeros.add(0);
                        }

                        int maxPersonas = 0;
                        switch (consulta.getString("a.room_type")) {
                            case "S":
                                maxPersonas = 1;
                                break;

                            case "D":
                                maxPersonas = 2;
                                break;

                            case "T":
                                maxPersonas = 3;
                                break;
                        }

                        if (maxPersonas > consulta.getInt("a.guests")) {
                            this.jLabelPersonasExtra.setEnabled(false);
                            this.jComboBoxExtra.setEnabled(false);
                        } else {
                            this.jLabelPersonasExtra.setEnabled(true);
                            this.jComboBoxExtra.setEnabled(true);
                        }

                        if (consulta.getInt("b.room_service") == 1) {
                            this.jCheckBoxCuarto.setSelected(true);
                            this.numeros.add(1);
                        } else {
                            this.numeros.add(0);
                        }

                        if (consulta.getInt("b.bar_access") == 1) {
                            this.jCheckBoxBar.setSelected(true);
                            this.numeros.add(1);
                        } else {
                            this.numeros.add(0);
                        }

                        if (consulta.getInt("b.cleaner_service") == 1) {
                            this.jCheckBoxTintoreria.setSelected(true);
                            this.numeros.add(1);
                        } else {
                            this.numeros.add(0);
                        }

                        if (consulta.getInt("b.SPA_service") == 1) {
                            this.jCheckBoxSPA.setSelected(true);
                            this.numeros.add(1);
                        } else {
                            this.numeros.add(0);
                        }

                        if (consulta.getInt("b.baby_sister_service") == 1) {
                            this.jCheckBoxCuidado.setSelected(true);
                            this.numeros.add(1);
                        } else {
                            this.numeros.add(0);
                        }

                        if (consulta.getInt("b.gym_access") == 1) {
                            this.jCheckBoxGimnasio.setSelected(true);
                            this.numeros.add(1);
                        } else {
                            this.numeros.add(0);
                        }

                        if (consulta.getInt("b.gaming_access") == 1) {
                            this.jCheckBoxJuegos.setSelected(true);
                            this.numeros.add(1);
                        } else {
                            this.numeros.add(0);
                        }

                        if (consulta.getInt("b.tennis_access") == 1) {
                            this.jCheckBoxTennis.setSelected(true);
                            this.numeros.add(1);
                        } else {
                            this.numeros.add(0);
                        }

                        if (consulta.getInt("b.bow_shooting") == 1) {
                            this.jCheckBoxArco.setSelected(true);
                            this.numeros.add(1);
                        } else {
                            this.numeros.add(0);
                        }

                        if (consulta.getInt("b.golf_access") == 1) {
                            this.jCheckBoxGolf.setSelected(true);
                            this.numeros.add(1);
                        } else {
                            this.numeros.add(0);
                        }

                        this.jButtonBusqueda.setEnabled(false);
                        this.jButtonCambios.setEnabled(true);
                    } else {
                        try {
                            int numero = Integer.parseInt(this.numeroHabitacion);

                            if (numero <= 215 && numero >= 201 || numero <= 115 && numero >= 101) {
                                this.jTextFieldResultado.setText("Habitación no ocupada");
                            } else {
                                this.jTextFieldResultado.setText("Habitación inexistente");
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(this, "La entrada es inválida.\n"
                                    + "Solo es posible introducir números.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
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
        } else {
            JOptionPane.showMessageDialog(this, "Es necesario introducir "
                    + "el número de la habitación a buscar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBusquedaActionPerformed

    //-Generar los correspondientes cambios en la base de datos-//.
    private void jButtonCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiosActionPerformed
        String mensaje = "";
        boolean invalido = false;

        if (this.jTextFieldNombre.getText().length() == 0) {
            mensaje += "Se debe escribir algún nombre.\n";
            invalido = true;
        }
        if (this.jTextFieldApellido.getText().length() == 0) {
            mensaje += "Se debe escribir algún apellido.\n";
            invalido = true;
        }
        if (this.jTextFieldCiudad.getText().length() == 0) {
            mensaje += "Se debe escribir el nombre de alguna ciudad.\n";
            invalido = true;
        }
        mensaje += "Reintroduzca sus datos.";

        if (invalido) {
            JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            ConexionMySQL conexion = null;

            try {
                //Conexión a la base de datos.
                conexion = new ConexionMySQL();

                try {
                    String nombreCompleto = this.jTextFieldNombre.getText().trim() + " " + this.jTextFieldApellido.getText().trim();

                    //Recalcular la fecha de salida.
                    Calendar calendario = Calendar.getInstance();
                    calendario.setTime(this.fechaIngreso);
                    calendario.add(Calendar.DAY_OF_YEAR, (Integer) this.jSpinnerDias.getValue());
                    java.sql.Date fechaSalida = new java.sql.Date(calendario.getTime().getTime());

                    //Cambiar los datos correspondientes.
                    PreparedStatement comando = conexion.getConexion().prepareStatement(
                            "UPDATE huespedes set name = '" + nombreCompleto + "', "
                            + "city = '" + this.jTextFieldCiudad.getText() + "', "
                            + "check_out = ?, "
                            + "days = " + (Integer) this.jSpinnerDias.getValue() + ", "
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
                            + ", golf_access = " + this.casillaSeleccionada(this.jCheckBoxGolf), " WHERE guest_id = " + this.identificador + " LIMIT 1");

                    if (this.cambiosRealizados()) {
                        JOptionPane.showMessageDialog(null, "Los datos fueron actualizados "
                                + "exitosamente.",
                                "Mensaje", JOptionPane.INFORMATION_MESSAGE);

                        //Desactivar los controles.
                        this.reajustarControles(false);

                        this.jButtonBusqueda.setEnabled(true);
                        this.jButtonCambios.setEnabled(false);
                        this.jTextFieldHabitacion.setText("");
                        this.jTextFieldResultado.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ningún dato fue cambiado.",
                                "Advertencia", JOptionPane.WARNING_MESSAGE);
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
    }//GEN-LAST:event_jButtonCambiosActionPerformed

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jButtonBusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBusquedaMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonBusqueda.setBackground(color);
    }//GEN-LAST:event_jButtonBusquedaMouseEntered

    private void jButtonBusquedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBusquedaMouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonBusqueda.setBackground(color);
    }//GEN-LAST:event_jButtonBusquedaMouseExited

    private void jButtonCambiosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCambiosMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonCambios.setBackground(color);
    }//GEN-LAST:event_jButtonCambiosMouseEntered

    private void jButtonCambiosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCambiosMouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonCambios.setBackground(color);
    }//GEN-LAST:event_jButtonCambiosMouseExited

    private void jTextFieldHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHabitacionActionPerformed

    //-Configuración adicional de ciertos componentes-//.
    private void extraInitProcess() {
        //Configuración para inhabilitar modificaciones manuales en el JSpinner para indicar la cantidad de días.
        ((JSpinner.DefaultEditor) this.jSpinnerDias.getEditor()).getTextField().setEditable(false);
    }

    //-Método para activar o desactivar los controles para cambiar la información-//.
    private void reajustarControles(boolean cambio) {
        this.jPanelModificaciones.setEnabled(cambio);
        
        this.jLabelDatosPersonales.setEnabled(cambio);
        this.jLabelNombre.setEnabled(cambio);
        this.jTextFieldNombre.setEnabled(cambio);
        if (!cambio) {
            this.jTextFieldNombre.setText("");
        }

        this.jLabelApellido.setEnabled(cambio);
        this.jTextFieldApellido.setEnabled(cambio);
        if (!cambio) {
            this.jTextFieldApellido.setText("");
        }

        this.jLabelCiudad.setEnabled(cambio);
        this.jTextFieldCiudad.setEnabled(cambio);
        if (!cambio) {
            this.jTextFieldCiudad.setText("");
        }

        this.jLabelDatosHospedaje.setEnabled(cambio);
        this.jLabelPersonasExtra.setEnabled(cambio);
        if (!cambio) {
            this.jComboBoxExtra.setSelectedIndex(0);
        }
        this.jComboBoxExtra.setEnabled(cambio);

        this.jLabelDias.setEnabled(cambio);
        if (!cambio) {
            this.jSpinnerDias.setValue(1);
        }
        this.jSpinnerDias.setEnabled(cambio);

        this.jLabelServicios.setEnabled(cambio);
        if (!cambio) {
            this.jCheckBoxCuarto.setSelected(cambio);
        }
        this.jLabelServicioAlCuarto.setEnabled(cambio);
        this.jCheckBoxCuarto.setEnabled(cambio);

        if (!cambio) {
            this.jCheckBoxBar.setSelected(cambio);
        }
        this.jLabelBar.setEnabled(cambio);
        this.jCheckBoxBar.setEnabled(cambio);
        if (!cambio) {
            this.jCheckBoxTintoreria.setSelected(cambio);
        }
        this.jLabelTintoreria.setEnabled(cambio);
        this.jCheckBoxTintoreria.setEnabled(cambio);

        if (!cambio) {
            this.jCheckBoxSPA.setSelected(cambio);
        }
        this.jLabelSPA.setEnabled(cambio);
        this.jCheckBoxSPA.setEnabled(cambio);

        if (!cambio) {
            this.jCheckBoxCuidado.setSelected(cambio);
        }
        this.jLabelNiñera.setEnabled(cambio);
        this.jCheckBoxCuidado.setEnabled(cambio);

        if (!cambio) {
            this.jCheckBoxGimnasio.setSelected(cambio);
        }
        this.jLabelGimnasio.setEnabled(cambio);
        this.jCheckBoxGimnasio.setEnabled(cambio);

        if (!cambio) {
            this.jCheckBoxJuegos.setSelected(cambio);
        }
        this.jLabelZonaJuegos.setEnabled(cambio);
        this.jCheckBoxJuegos.setEnabled(cambio);

        if (!cambio) {
            this.jCheckBoxTennis.setSelected(cambio);
        }
        this.jLabelTenis.setEnabled(cambio);
        this.jCheckBoxTennis.setEnabled(cambio);

        if (!cambio) {
            this.jCheckBoxArco.setSelected(cambio);
        }
        this.jLabelTiroConArco.setEnabled(cambio);
        this.jCheckBoxArco.setEnabled(cambio);

        if (!cambio) {
            this.jCheckBoxGolf.setSelected(cambio);
        }
        this.jLabelGolf.setEnabled(cambio);
        this.jCheckBoxGolf.setEnabled(cambio);
    }

    //-Se verifica si hubo algún cambio de información-//.
    private boolean cambiosRealizados() {
        if (!this.jTextFieldNombre.getText().trim().equals(this.cadenas.get(0))) {
            return true;
        }
        if (!this.jTextFieldApellido.getText().trim().equals(this.cadenas.get(1))) {
            return true;
        }
        if (!this.jTextFieldCiudad.getText().equals(this.cadenas.get(2))) {
            return true;
        }

        if ((Integer) this.jSpinnerDias.getValue() != this.numeros.get(0)) {
            return true;
        }
        if (this.jComboBoxExtra.getSelectedIndex() != this.numeros.get(1)) {
            return true;
        }

        if (this.casillaSeleccionada(this.jCheckBoxCuarto) != this.numeros.get(2)) {
            return true;
        }
        if (this.casillaSeleccionada(this.jCheckBoxBar) != this.numeros.get(3)) {
            return true;
        }
        if (this.casillaSeleccionada(this.jCheckBoxTintoreria) != this.numeros.get(4)) {
            return true;
        }
        if (this.casillaSeleccionada(this.jCheckBoxSPA) != this.numeros.get(5)) {
            return true;
        }
        if (this.casillaSeleccionada(this.jCheckBoxCuidado) != this.numeros.get(6)) {
            return true;
        }
        if (this.casillaSeleccionada(this.jCheckBoxGimnasio) != this.numeros.get(7)) {
            return true;
        }
        if (this.casillaSeleccionada(this.jCheckBoxJuegos) != this.numeros.get(8)) {
            return true;
        }
        if (this.casillaSeleccionada(this.jCheckBoxTennis) != this.numeros.get(9)) {
            return true;
        }
        if (this.casillaSeleccionada(this.jCheckBoxArco) != this.numeros.get(10)) {
            return true;
        }
        if (this.casillaSeleccionada(this.jCheckBoxGolf) != this.numeros.get(11)) {
            return true;
        }
        return false;
    }

    //-Se retorna un valor numérico que indica si un JCheckBox está seleccionado o no-//.
    private int casillaSeleccionada(JCheckBox casilla) {
        if (casilla.isSelected()) {
            return 1;
        } else {
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
    private javax.swing.JLabel jLabelBar;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelDatosHospedaje;
    private javax.swing.JLabel jLabelDatosPersonales;
    private javax.swing.JLabel jLabelDias;
    private javax.swing.JLabel jLabelGimnasio;
    private javax.swing.JLabel jLabelGolf;
    private javax.swing.JLabel jLabelHabitacion;
    private javax.swing.JLabel jLabelNiñera;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPersonasExtra;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelSPA;
    private javax.swing.JLabel jLabelServicioAlCuarto;
    private javax.swing.JLabel jLabelServicios;
    private javax.swing.JLabel jLabelTenis;
    private javax.swing.JLabel jLabelTintoreria;
    private javax.swing.JLabel jLabelTiroConArco;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelZonaJuegos;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelConsultaHabitacion;
    private javax.swing.JPanel jPanelEstadoHabitacion;
    private javax.swing.JPanel jPanelModificaciones;
    private javax.swing.JSpinner jSpinnerDias;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldHabitacion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldResultado;
    // End of variables declaration//GEN-END:variables
}
