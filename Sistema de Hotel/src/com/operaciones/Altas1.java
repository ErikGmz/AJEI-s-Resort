//---Paquete---//.
package com.operaciones;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import com.clases_auxiliares.Habitacion;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

//---Clase pública---//.
public class Altas1 extends javax.swing.JInternalFrame {
    
    //---Atributos adicionales---//.
    private ArrayList<String> listaHabitacionesOcupadas;
    private ArrayList<Habitacion> listaTotalHabitaciones;
    private String tipoHabitacion;
    private int contadorHabitaciones;
    private int numeroPiso;

    //---Constructor---//.
    public Altas1() {
        initComponents();
        extraInitProcess();
        this.listaHabitacionesOcupadas = new ArrayList<>();
        this.listaTotalHabitaciones = new ArrayList<>();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupHabitaciones = new javax.swing.ButtonGroup();
        buttonGroupPisos = new javax.swing.ButtonGroup();
        jTabbedPaneMenus = new javax.swing.JTabbedPane();
        jPanelDatos = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldCiudad = new javax.swing.JTextField();
        jLabelCiudad = new javax.swing.JLabel();
        jLabelHabitacion = new javax.swing.JLabel();
        jComboBoxHabitacion = new javax.swing.JComboBox();
        jLabelPersonas = new javax.swing.JLabel();
        jRadioButtonUna = new javax.swing.JRadioButton();
        jRadioButtonDos = new javax.swing.JRadioButton();
        jRadioButtonTres = new javax.swing.JRadioButton();
        jLabelPiso = new javax.swing.JLabel();
        jLabelPisoPersonasExtra = new javax.swing.JLabel();
        jComboBoxExtra = new javax.swing.JComboBox();
        jLabelIngreso = new javax.swing.JLabel();
        jDateChooserIngreso = new com.toedter.calendar.JCalendar();
        jLabelDias = new javax.swing.JLabel();
        jSpinnerDias = new javax.swing.JSpinner();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelServicios = new javax.swing.JLabel();
        jCheckBoxCuarto = new javax.swing.JCheckBox();
        jCheckBoxBar = new javax.swing.JCheckBox();
        jCheckBoxTintoteria = new javax.swing.JCheckBox();
        jCheckBoxSPA = new javax.swing.JCheckBox();
        jCheckBoxCuidado = new javax.swing.JCheckBox();
        jCheckBoxGimnasio = new javax.swing.JCheckBox();
        jCheckBoxJuegos = new javax.swing.JCheckBox();
        jCheckBoxTennis = new javax.swing.JCheckBox();
        jCheckBoxArco = new javax.swing.JCheckBox();
        jCheckBoxGolf = new javax.swing.JCheckBox();
        jLabelAdicional = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAdicional = new javax.swing.JTextArea();
        jButtonSiguiente = new javax.swing.JButton();
        jButtonSalida = new javax.swing.JButton();
        jRadioButtonPiso1 = new javax.swing.JRadioButton();
        jRadioButtonPiso2 = new javax.swing.JRadioButton();
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
        jPanelConfirmacion = new javax.swing.JPanel();
        jPanelRecibo = new javax.swing.JPanel();

        jLabelNombre.setText("Nombre:");

        jLabelCiudad.setText("Ciudad de origen: ");

        jLabelHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion.setText("Tipo de habitación:");

        jComboBoxHabitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chaac Suite (habitación simple)", "Itzamná Suite (habitación doble)", "Kauil Suite (habitación triple)" }));
        jComboBoxHabitacion.setFocusable(false);
        jComboBoxHabitacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxHabitacionItemStateChanged(evt);
            }
        });

        jLabelPersonas.setText("Total de huéspedes:");

        buttonGroupHabitaciones.add(jRadioButtonUna);
        jRadioButtonUna.setText("Una persona");
        jRadioButtonUna.setFocusPainted(false);

        buttonGroupHabitaciones.add(jRadioButtonDos);
        jRadioButtonDos.setText("Dos personas");
        jRadioButtonDos.setEnabled(false);
        jRadioButtonDos.setFocusPainted(false);

        buttonGroupHabitaciones.add(jRadioButtonTres);
        jRadioButtonTres.setText("Tres personas");
        jRadioButtonTres.setEnabled(false);
        jRadioButtonTres.setFocusPainted(false);

        jLabelPiso.setText("Piso de hospedaje:");

        jLabelPisoPersonasExtra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPisoPersonasExtra.setText("Personas extra:");

        jComboBoxExtra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Una persona", "Dos personas" }));
        jComboBoxExtra.setFocusable(false);

        jLabelIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIngreso.setText("Fecha de ingreso:");

        jDateChooserIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDateChooserIngreso.setFocusable(false);

        jLabelDias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDias.setText("Días de hospedaje:");

        jSpinnerDias.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        jLabelServicios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelServicios.setText("Servicios adicionales:");

        jCheckBoxCuarto.setText("Atención al cuarto");
        jCheckBoxCuarto.setFocusPainted(false);

        jCheckBoxBar.setText("Acceso al bar");
        jCheckBoxBar.setFocusPainted(false);

        jCheckBoxTintoteria.setText("Acceso a tintorería");
        jCheckBoxTintoteria.setFocusPainted(false);

        jCheckBoxSPA.setText("Acceso al SPA");
        jCheckBoxSPA.setFocusPainted(false);

        jCheckBoxCuidado.setText("Contratación de niñera");
        jCheckBoxCuidado.setFocusPainted(false);

        jCheckBoxGimnasio.setText("Acceso a gimnasio");
        jCheckBoxGimnasio.setFocusPainted(false);

        jCheckBoxJuegos.setText("Acceso a zona de juegos");
        jCheckBoxJuegos.setFocusPainted(false);

        jCheckBoxTennis.setText("Canchas de tennis");
        jCheckBoxTennis.setFocusPainted(false);

        jCheckBoxArco.setText("Campo de tiro con arco");
        jCheckBoxArco.setFocusPainted(false);

        jCheckBoxGolf.setText("Campo de golf");
        jCheckBoxGolf.setFocusPainted(false);

        jLabelAdicional.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAdicional.setText("Información adicional:");

        jTextAreaAdicional.setEditable(false);
        jTextAreaAdicional.setColumns(20);
        jTextAreaAdicional.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextAreaAdicional.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAdicional);

        jButtonSiguiente.setText("Seleccionar habitación");
        jButtonSiguiente.setEnabled(false);
        jButtonSiguiente.setFocusPainted(false);
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jButtonSalida.setText("Verificar disponibilidad");
        jButtonSalida.setFocusPainted(false);
        jButtonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalidaActionPerformed(evt);
            }
        });

        buttonGroupPisos.add(jRadioButtonPiso1);
        jRadioButtonPiso1.setSelected(true);
        jRadioButtonPiso1.setText("Primer piso");
        jRadioButtonPiso1.setFocusPainted(false);
        jRadioButtonPiso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPiso1ActionPerformed(evt);
            }
        });

        buttonGroupPisos.add(jRadioButtonPiso2);
        jRadioButtonPiso2.setText("Segundo piso");
        jRadioButtonPiso2.setFocusPainted(false);
        jRadioButtonPiso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPiso2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelNombre)
                                    .addComponent(jLabelCiudad))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabelPisoPersonasExtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                                        .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jComboBoxExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabelDias, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(jSpinnerDias, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelDatosLayout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabelPersonas)
                                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jRadioButtonUna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jRadioButtonDos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jRadioButtonTres))
                                                .addComponent(jLabelPiso)))
                                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonPiso1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButtonPiso2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooserIngreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelIngreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCheckBoxBar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBoxTintoteria)
                                .addComponent(jCheckBoxSPA)
                                .addComponent(jCheckBoxCuidado)
                                .addComponent(jCheckBoxGimnasio)
                                .addComponent(jCheckBoxJuegos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBoxTennis)
                                .addComponent(jCheckBoxArco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBoxCuarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jCheckBoxGolf))
                        .addGap(71, 71, 71))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                            .addComponent(jLabelAdicional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPisoPersonasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDias)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelServicios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCiudad)
                        .addComponent(jSpinnerDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addComponent(jCheckBoxCuarto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxBar)))
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHabitacion)
                            .addComponent(jLabelIngreso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jComboBoxHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabelPersonas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonUna)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonDos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonTres)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelPiso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButtonPiso1)
                                    .addComponent(jRadioButtonPiso2)))
                            .addComponent(jDateChooserIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxTintoteria)
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
                        .addComponent(jCheckBoxGolf)))
                .addGap(35, 35, 35)
                .addComponent(jLabelAdicional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addComponent(jButtonSalida)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSiguiente)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPaneMenus.addTab("Datos de ingreso", jPanelDatos);

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.setFocusPainted(false);
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jButtonSiguiente2.setText("Siguiente");
        jButtonSiguiente2.setEnabled(false);
        jButtonSiguiente2.setFocusPainted(false);

        jLabelNumeroPiso.setText("Número de piso: ");

        jTextFieldNumeroPiso.setEditable(false);
        jTextFieldNumeroPiso.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNumeroPiso.setText(" Primer piso");
        jTextFieldNumeroPiso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelHabitacion1.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelHabitacion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion1.setText("101");
        jLabelHabitacion1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelHabitacion1.setOpaque(true);

        jLabelHabitacion2.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelHabitacion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion2.setText("102");
        jLabelHabitacion2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelHabitacion2.setOpaque(true);

        jLabelHabitacion3.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelHabitacion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion3.setText("103");
        jLabelHabitacion3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelHabitacion3.setOpaque(true);

        jLabelHabitacion4.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelHabitacion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion4.setText("104");
        jLabelHabitacion4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelHabitacion4.setOpaque(true);

        jLabelHabitacion5.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelHabitacion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion5.setText("105");
        jLabelHabitacion5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelHabitacion5.setOpaque(true);

        jLabelHabitacion10.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelHabitacion10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion10.setText("110");
        jLabelHabitacion10.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelHabitacion10.setOpaque(true);

        jLabelHabitacion9.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelHabitacion9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion9.setText("109");
        jLabelHabitacion9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelHabitacion9.setOpaque(true);

        jLabelHabitacion8.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelHabitacion8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion8.setText("108");
        jLabelHabitacion8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelHabitacion8.setOpaque(true);

        jLabelHabitacion7.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelHabitacion7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion7.setText("107");
        jLabelHabitacion7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelHabitacion7.setOpaque(true);

        jLabelHabitacion6.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelHabitacion6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion6.setText("106");
        jLabelHabitacion6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelHabitacion6.setOpaque(true);

        jLabelHabitacion11.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelHabitacion11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion11.setText("111");
        jLabelHabitacion11.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelHabitacion11.setOpaque(true);

        jLabelHabitacion12.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion12.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelHabitacion12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion12.setText("112");
        jLabelHabitacion12.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelHabitacion12.setOpaque(true);

        jLabelHabitacion13.setBackground(new java.awt.Color(219, 255, 209));
        jLabelHabitacion13.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelHabitacion13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion13.setText("113");
        jLabelHabitacion13.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelHabitacion13.setOpaque(true);

        jLabelHabitacion14.setBackground(new java.awt.Color(255, 215, 215));
        jLabelHabitacion14.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelHabitacion14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion14.setText("114");
        jLabelHabitacion14.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelHabitacion14.setOpaque(true);

        jLabelHabitacion15.setBackground(new java.awt.Color(255, 255, 209));
        jLabelHabitacion15.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelHabitacion15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion15.setText("115");
        jLabelHabitacion15.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelHabitacion15.setOpaque(true);

        jLabelTipoHabitacion.setText("Tipo de habitación:");

        jTextFieldTipoHabitacion.setEditable(false);
        jTextFieldTipoHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTipoHabitacion.setText(" Chaac Suite (habitación simple)");
        jTextFieldTipoHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelHabitacionLayout = new javax.swing.GroupLayout(jPanelHabitacion);
        jPanelHabitacion.setLayout(jPanelHabitacionLayout);
        jPanelHabitacionLayout.setHorizontalGroup(
            jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                        .addComponent(jButtonRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSiguiente2))
                    .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                        .addComponent(jLabelNumeroPiso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNumeroPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabelTipoHabitacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHabitacionLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelHabitacion6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHabitacion11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHabitacion7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHabitacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHabitacion12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHabitacionLayout.createSequentialGroup()
                                .addComponent(jLabelHabitacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelHabitacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jLabelHabitacion5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHabitacionLayout.createSequentialGroup()
                                .addComponent(jLabelHabitacion8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabelHabitacion9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabelHabitacion10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHabitacionLayout.createSequentialGroup()
                                .addComponent(jLabelHabitacion13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabelHabitacion14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabelHabitacion15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanelHabitacionLayout.setVerticalGroup(
            jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHabitacionLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroPiso)
                    .addComponent(jTextFieldNumeroPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTipoHabitacion)
                        .addComponent(jTextFieldTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHabitacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHabitacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHabitacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHabitacion5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHabitacion6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHabitacion7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHabitacion8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHabitacion9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHabitacion10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHabitacion11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHabitacion12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHabitacion13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHabitacion14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHabitacion15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanelHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegresar)
                    .addComponent(jButtonSiguiente2))
                .addContainerGap())
        );

        jTabbedPaneMenus.addTab("Habitación a reservar", jPanelHabitacion);

        javax.swing.GroupLayout jPanelConfirmacionLayout = new javax.swing.GroupLayout(jPanelConfirmacion);
        jPanelConfirmacion.setLayout(jPanelConfirmacionLayout);
        jPanelConfirmacionLayout.setHorizontalGroup(
            jPanelConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );
        jPanelConfirmacionLayout.setVerticalGroup(
            jPanelConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        jTabbedPaneMenus.addTab("Confirmación para el check-in", jPanelConfirmacion);

        javax.swing.GroupLayout jPanelReciboLayout = new javax.swing.GroupLayout(jPanelRecibo);
        jPanelRecibo.setLayout(jPanelReciboLayout);
        jPanelReciboLayout.setHorizontalGroup(
            jPanelReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );
        jPanelReciboLayout.setVerticalGroup(
            jPanelReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        jTabbedPaneMenus.addTab("Impresión del recibo", jPanelRecibo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMenus, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMenus)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //---Validaciones para el número máximo de personas, según el tipo de habitación.
    private void jComboBoxHabitacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxHabitacionItemStateChanged
        //Borrar el contenido previo del JTextArea.
        this.jTextAreaAdicional.setText("");
        
        //Deshabilitar el botón para cambiar el menú.
        if(this.jButtonSiguiente.isEnabled()) this.jButtonSiguiente.setEnabled(false);
        
        switch(this.jComboBoxHabitacion.getSelectedIndex()) {
            //Habitación simple seleccionada.
            case 0:
            this.jRadioButtonDos.setEnabled(false);
            this.jRadioButtonTres.setEnabled(false);

            if(this.jRadioButtonDos.isSelected() || this.jRadioButtonTres.isSelected()) {
                this.jRadioButtonUna.setSelected(true);
            }
            break;

            //Habitación doble seleccionada.
            case 1:
            this.jRadioButtonDos.setEnabled(true);
            this.jRadioButtonTres.setEnabled(false);

            if(this.jRadioButtonTres.isSelected()) {
                this.jRadioButtonDos.setSelected(true);
            }
            break;

            //Habitación triple seleccionada.
            case 2:
            this.jRadioButtonDos.setEnabled(true);
            this.jRadioButtonTres.setEnabled(true);
            break;
        }
    }//GEN-LAST:event_jComboBoxHabitacionItemStateChanged

    //-Verificar disponibilidad de habitaciones de cierto tipo y validar entradas-//.
    private void jButtonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidaActionPerformed
        //Borrar el contenido previo del JTextArea.
        this.jTextAreaAdicional.setText("\n");
        
        if(this.nombreYCiudadValidos()) {
            this.verificarDisponibilidad(this.jComboBoxHabitacion.getSelectedIndex());
        }
        else {
            this.jButtonSiguiente.setEnabled(false);
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
        if(this.jButtonSiguiente.isEnabled()) this.jButtonSiguiente.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonPiso1ActionPerformed

    //-Reiniciar la solicitud tras seleccionar el segundo piso-//.
    private void jRadioButtonPiso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPiso2ActionPerformed
        //Borrar el contenido previo del JTextArea.
        this.jTextAreaAdicional.setText("");
        
        //Deshabilitar el botón para cambiar el menú.
        if(this.jButtonSiguiente.isEnabled()) this.jButtonSiguiente.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonPiso2ActionPerformed

    //-Configuración adicional de ciertos componentes-//.
    private void extraInitProcess() {    
        //Configuración para inhabilitar modificaciones manuales en el JSpinner para indicar la cantidad de días.
        ((JSpinner.DefaultEditor) this.jSpinnerDias.getEditor()).getTextField().setEditable(false);
        
        //Deshabilitar todas las pestañas, exceptuando la primera.
        this.jTabbedPaneMenus.setEnabledAt(1, false);
        this.jTabbedPaneMenus.setEnabledAt(2, false);
        this.jTabbedPaneMenus.setEnabledAt(3, false);
    }
    
    /*
    //-Imprimir la fecha de salida-//.
    private void imprimirSalida() {
        //Procesar la fecha de salida, a partir de los días de hospedaje y fecha de ingreso.
        Date fechaIngreso = this.jDateChooserIngreso.getDate();
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fechaIngreso);
        calendario.add(Calendar.DAY_OF_YEAR, (Integer)this.jSpinnerDias.getValue());
        fechaIngreso = calendario.getTime();

        //Imprimir la fecha de salida.
        String mes;

        //Definir el mes.
        switch(calendario.get(Calendar.MONTH)) {
            case 0: mes = " enero "; break;
            case 1: mes = " febrero "; break;
            case 2: mes = " marzo "; break;
            case 3: mes = " abril "; break;
            case 4: mes = " mayo "; break;
            case 5: mes = " junio "; break;
            case 6: mes = " julio "; break;
            case 7: mes = " agosto "; break;
            case 8: mes = " septiembre "; break;
            case 9: mes = " octubre "; break;
            case 10: mes = " noviembre "; break;
            case 11: mes = " diciembre "; break;
            default: mes = " indefinido "; break;
        }

        SimpleDateFormat formato1 = new SimpleDateFormat("dd 'de'");
        SimpleDateFormat formato2 = new SimpleDateFormat("yyyy");
        this.jTextAreaAdicional.append("Fecha de salida: " + formato1.format(fechaIngreso) + mes + formato2.format(fechaIngreso) + ".\n");
    }
    */
    
    //-Se verifica si el nombre y ciudad son válidos-//.
    private boolean nombreYCiudadValidos() {
        boolean retorno = true;
        
        if(this.jTextFieldNombre.getText().equals("")) {
            this.jTextAreaAdicional.append("Se debe agregar algún nombre.\n");
            retorno = false;
        }
        if(this.jTextFieldCiudad.getText().equals("")) {
            this.jTextAreaAdicional.append("Se debe agregar alguna ciudad.");
            retorno = false;
        }
        return retorno;
    }
    
    //-Verificar la disponibilidad de habitaciones de cierto tipo-//.
    private void verificarDisponibilidad(int campo) {
        //Se vacía el contenido de la lista de habitaciones.
        this.listaHabitacionesOcupadas.clear();
        
        //Determinar el número de piso.
        if(this.jRadioButtonPiso1.isSelected()) {
            this.numeroPiso = 1;
        }
        else {
            this.numeroPiso = 2;
        }
        
        //Se obtiene el número de habitaciones total, según el tipo y piso.
        this.calcularNumeroHabitaciones();
        String nombreHabitacion;
        int HabitacionesReservadas = 0;
        
        switch(campo) {
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
        
        try {
            //Conexión a la base de datos.
            ConexionMySQL conexion = new ConexionMySQL();
            
            try {
                //Consultar en la base de datos todas las habitaciones reservadas.
                ResultSet consulta = conexion.consultarTabla("huespedes",
                "room_id, floor, active", " WHERE room_type = '" + this.tipoHabitacion + "'");
                
                while(consulta.next()) {
                    //Se verifica si la habitación consultada está ocupada.
                    if(consulta.getBoolean("active") && this.numeroPiso == consulta.getInt("floor")) {
                       HabitacionesReservadas++;
                       this.listaHabitacionesOcupadas.add(consulta.getString("room_id"));
                    }
                }
                
                //Se verifica si la cantidad de habitaciones ocupadas equivale o no al total.
                if(HabitacionesReservadas >= this.contadorHabitaciones) {
                    this.jTextAreaAdicional.append("No hay habitaciones tipo " + nombreHabitacion
                    + " disponibles.\nModifique su selección");  
                }
                else {
                    int habitacionesDisponibles = this.contadorHabitaciones - HabitacionesReservadas;
                    
                    //Se verifica si solo hay una habitación disponible.
                    if(habitacionesDisponibles == 1) {
                        this.jTextAreaAdicional.append("Hay una habitación tipo "
                        + nombreHabitacion + " disponible.\nProceda a reservarla.");
                    }
                    else {
                        this.jTextAreaAdicional.append("Hay " + habitacionesDisponibles + 
                        " habitaciones " + "tipo " + nombreHabitacion + " disponibles.\n" +
                        "Proceda a reservar alguna.");
                    }
                    this.jButtonSiguiente.setEnabled(true);
                }
            }
            catch(SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "La consulta no pudo ser "
                + "realizada.\n" + "Verifique la conexión con la base de datos.\n"
                , "Error", JOptionPane.ERROR_MESSAGE);
            }       
        } 
        catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No fue posible realizar la "
            + "conexión con la base de datos.\n" + "Verifique si el servidor "
            + "XAMPP o MySQL local se encuentra activado."
            , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //-Calcular el total de habitaciones, según el tipo y piso-//.
    private void calcularNumeroHabitaciones() {
        //Se verifica si se seleccionó el primer piso del hotel.
        if(this.numeroPiso == 1) {
            this.contadorHabitaciones = 5; 
        }
        else {
            switch(this.jComboBoxHabitacion.getSelectedIndex()) {
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
        if(this.numeroPiso == 1) {
            this.jTextFieldNumeroPiso.setText(" Primer piso");
        }
        else {
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
        if(this.numeroPiso == 1) {
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
        }
        else {
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
        if(this.numeroPiso == 1) {
            this.jTextFieldNumeroPiso.setText(" Primer piso");
        }
        else {
            this.jTextFieldNumeroPiso.setText(" Segundo piso");
        } 
        this.definirNumerosHabitaciones(numeroPiso);
        
        //Establecer el estado de todas las habitaciones del piso.
        for(int i = 0; i < 15; i++) {
            if(!this.listaTotalHabitaciones.get(i).getTipoHabitacion().equals(this.tipoHabitacion)) {
                //Las habitaciones no correspondientes al tipo seleccionado se colorean de amarillo.
                this.seleccionarHabitación(i).setBackground(new Color(255,255,209));
            }
            else if(this.habitacionOcupada(this.listaTotalHabitaciones.get(i).getIdHabitacion())) {
                //Las habitaciones ocupadas se colorean de rojo.
                this.seleccionarHabitación(i).setBackground(new Color(255,215,215));
            }
            else {
                //El resto de habitaciones se colorea de verde.
                this.seleccionarHabitación(i).setBackground(new Color(219,255,209));
            }
        }
    }
    
    //-Definir los números de habitaciones, según el piso-//.
    private void definirNumerosHabitaciones(int numeroPiso) {
        for(int i = 0; i < 15; i++) {
            JLabel habitacion = this.seleccionarHabitación(i);
            habitacion.setText(Integer.toString(numeroPiso * 100 + (i + 1)));
        }
    }
    
    //-Seleccionar alguna habitación, según su numeración-//.
    private JLabel seleccionarHabitación(int indice) {
        JLabel habitacion = null;
        
        switch(indice) {
            case 0: habitacion = this.jLabelHabitacion1; break;
            case 1: habitacion = this.jLabelHabitacion2; break;
            case 2: habitacion = this.jLabelHabitacion3; break;
            case 3: habitacion = this.jLabelHabitacion4; break;
            case 4: habitacion = this.jLabelHabitacion5; break;
            case 5: habitacion = this.jLabelHabitacion6; break;
            case 6: habitacion = this.jLabelHabitacion7; break;
            case 7: habitacion = this.jLabelHabitacion8; break;
            case 8: habitacion = this.jLabelHabitacion9; break;
            case 9: habitacion = this.jLabelHabitacion10; break;
            case 10: habitacion = this.jLabelHabitacion11; break;
            case 11: habitacion = this.jLabelHabitacion12; break;
            case 12: habitacion = this.jLabelHabitacion13; break;
            case 13: habitacion = this.jLabelHabitacion14; break;
            case 14: habitacion = this.jLabelHabitacion15; break;
        }
        
        return habitacion;
    }
    
    private boolean habitacionOcupada(String idHabitacion) {
        for (String listaHabitacionesOcupada : this.listaHabitacionesOcupadas) {
            if (idHabitacion.equals(listaHabitacionesOcupada)) return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupHabitaciones;
    private javax.swing.ButtonGroup buttonGroupPisos;
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
    private javax.swing.JCheckBox jCheckBoxTintoteria;
    private javax.swing.JComboBox jComboBoxExtra;
    private javax.swing.JComboBox jComboBoxHabitacion;
    private com.toedter.calendar.JCalendar jDateChooserIngreso;
    private javax.swing.JLabel jLabelAdicional;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelDias;
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
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumeroPiso;
    private javax.swing.JLabel jLabelPersonas;
    private javax.swing.JLabel jLabelPiso;
    private javax.swing.JLabel jLabelPisoPersonasExtra;
    private javax.swing.JLabel jLabelServicios;
    private javax.swing.JLabel jLabelTipoHabitacion;
    private javax.swing.JPanel jPanelConfirmacion;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelHabitacion;
    private javax.swing.JPanel jPanelRecibo;
    private javax.swing.JRadioButton jRadioButtonDos;
    private javax.swing.JRadioButton jRadioButtonPiso1;
    private javax.swing.JRadioButton jRadioButtonPiso2;
    private javax.swing.JRadioButton jRadioButtonTres;
    private javax.swing.JRadioButton jRadioButtonUna;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerDias;
    private javax.swing.JTabbedPane jTabbedPaneMenus;
    private javax.swing.JTextArea jTextAreaAdicional;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNumeroPiso;
    private javax.swing.JTextField jTextFieldTipoHabitacion;
    // End of variables declaration//GEN-END:variables
}