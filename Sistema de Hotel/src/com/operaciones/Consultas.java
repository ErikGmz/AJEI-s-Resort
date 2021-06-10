//---Paquete---//.
package com.operaciones;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Consultas extends javax.swing.JInternalFrame {

    //---Atributos adicionales---//.
    private ArrayList<Integer> habitacionesSimples = new ArrayList<>();
    private ArrayList<Integer> habitacionesDobles = new ArrayList<>();
    private ArrayList<Integer> habitacionesTriples = new ArrayList<>();

    //---Constructor---//.
    public Consultas() {
        initComponents();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPiso = new javax.swing.ButtonGroup();
        jPanelBase = new javax.swing.JPanel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelConsultaHuesped = new javax.swing.JPanel();
        jLabelNombreHuesped = new javax.swing.JLabel();
        jLabelApellidoHuesped = new javax.swing.JLabel();
        jTextFieldNombreHuesped = new javax.swing.JTextField();
        jTextFieldApellidoHuesped = new javax.swing.JTextField();
        jButtonConsultaHuesped = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaConsultaHuesped = new javax.swing.JTextArea();
        jLabelEstadoConsultaHuesped = new javax.swing.JLabel();
        jPanelConsultaHabitacion = new javax.swing.JPanel();
        jLabelNumeroHabitacion = new javax.swing.JLabel();
        jButtonConsultaHabitacion = new javax.swing.JButton();
        jTextFieldNumeroHabitacion = new javax.swing.JTextField();
        jTextFieldConsultaHabitacion = new javax.swing.JTextField();
        jLabelEstadoConsultaHabitacion = new javax.swing.JLabel();
        jPanelConsultaDisponibilidad = new javax.swing.JPanel();
        jLabelNumeroPiso = new javax.swing.JLabel();
        jRadioButtonPiso1 = new javax.swing.JRadioButton();
        jRadioButtonPiso2 = new javax.swing.JRadioButton();
        jButtonConsultaDisponibilidad = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaConsultaDisponibilidad = new javax.swing.JTextArea();
        jLabelEstadoConsultaDisponiblidad = new javax.swing.JLabel();
        jPanelConsultaHuespedes = new javax.swing.JPanel();
        jButtonConsultaHuespedes = new javax.swing.JButton();
        jLabelEstadoConsultaHuespedes = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaConsultaHuespedes = new javax.swing.JTextArea();

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
        jLabelTitulo.setText("Consultas");

        jPanelConsultaHuesped.setBackground(new java.awt.Color(255, 163, 51));
        jPanelConsultaHuesped.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "Consultar Huésped", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N

        jLabelNombreHuesped.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelNombreHuesped.setText("Nombre:");

        jLabelApellidoHuesped.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelApellidoHuesped.setText("Apellido:");

        jTextFieldNombreHuesped.setBackground(new java.awt.Color(255, 232, 205));
        jTextFieldNombreHuesped.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldNombreHuesped.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreHuespedKeyTyped(evt);
            }
        });

        jTextFieldApellidoHuesped.setBackground(new java.awt.Color(255, 232, 205));
        jTextFieldApellidoHuesped.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldApellidoHuesped.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoHuespedKeyTyped(evt);
            }
        });

        jButtonConsultaHuesped.setBackground(new java.awt.Color(228, 130, 0));
        jButtonConsultaHuesped.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonConsultaHuesped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/search.png"))); // NOI18N
        jButtonConsultaHuesped.setText("Consultar");
        jButtonConsultaHuesped.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButtonConsultaHuesped.setBorderPainted(false);
        jButtonConsultaHuesped.setContentAreaFilled(false);
        jButtonConsultaHuesped.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConsultaHuesped.setFocusPainted(false);
        jButtonConsultaHuesped.setOpaque(true);
        jButtonConsultaHuesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConsultaHuespedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConsultaHuespedMouseExited(evt);
            }
        });
        jButtonConsultaHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaHuespedActionPerformed(evt);
            }
        });

        jTextAreaConsultaHuesped.setEditable(false);
        jTextAreaConsultaHuesped.setBackground(new java.awt.Color(255, 232, 205));
        jTextAreaConsultaHuesped.setColumns(20);
        jTextAreaConsultaHuesped.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextAreaConsultaHuesped.setForeground(new java.awt.Color(175, 87, 0));
        jTextAreaConsultaHuesped.setRows(5);
        jScrollPane1.setViewportView(jTextAreaConsultaHuesped);

        jLabelEstadoConsultaHuesped.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelEstadoConsultaHuesped.setText("Estado De La Consulta");

        javax.swing.GroupLayout jPanelConsultaHuespedLayout = new javax.swing.GroupLayout(jPanelConsultaHuesped);
        jPanelConsultaHuesped.setLayout(jPanelConsultaHuespedLayout);
        jPanelConsultaHuespedLayout.setHorizontalGroup(
            jPanelConsultaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaHuespedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultaHuespedLayout.createSequentialGroup()
                        .addGroup(jPanelConsultaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreHuesped)
                            .addComponent(jLabelApellidoHuesped))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelConsultaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombreHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTextFieldApellidoHuesped)))
                    .addComponent(jButtonConsultaHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConsultaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addGroup(jPanelConsultaHuespedLayout.createSequentialGroup()
                        .addComponent(jLabelEstadoConsultaHuesped)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelConsultaHuespedLayout.setVerticalGroup(
            jPanelConsultaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaHuespedLayout.createSequentialGroup()
                .addComponent(jLabelEstadoConsultaHuesped)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConsultaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultaHuespedLayout.createSequentialGroup()
                        .addGroup(jPanelConsultaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombreHuesped)
                            .addComponent(jTextFieldNombreHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelConsultaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelApellidoHuesped)
                            .addComponent(jTextFieldApellidoHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConsultaHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelConsultaHabitacion.setBackground(new java.awt.Color(255, 163, 51));
        jPanelConsultaHabitacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "Consultar Habitación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N

        jLabelNumeroHabitacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelNumeroHabitacion.setText("Número de habitación:");

        jButtonConsultaHabitacion.setBackground(new java.awt.Color(228, 130, 0));
        jButtonConsultaHabitacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonConsultaHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/search.png"))); // NOI18N
        jButtonConsultaHabitacion.setText("Consultar");
        jButtonConsultaHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButtonConsultaHabitacion.setBorderPainted(false);
        jButtonConsultaHabitacion.setContentAreaFilled(false);
        jButtonConsultaHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConsultaHabitacion.setFocusPainted(false);
        jButtonConsultaHabitacion.setOpaque(true);
        jButtonConsultaHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConsultaHabitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConsultaHabitacionMouseExited(evt);
            }
        });
        jButtonConsultaHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaHabitacionActionPerformed(evt);
            }
        });

        jTextFieldNumeroHabitacion.setBackground(new java.awt.Color(255, 232, 205));
        jTextFieldNumeroHabitacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldNumeroHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroHabitacionKeyTyped(evt);
            }
        });

        jTextFieldConsultaHabitacion.setBackground(new java.awt.Color(255, 232, 205));
        jTextFieldConsultaHabitacion.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextFieldConsultaHabitacion.setForeground(new java.awt.Color(175, 87, 0));
        jTextFieldConsultaHabitacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelEstadoConsultaHabitacion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelEstadoConsultaHabitacion.setText("Estado De La Consulta");

        javax.swing.GroupLayout jPanelConsultaHabitacionLayout = new javax.swing.GroupLayout(jPanelConsultaHabitacion);
        jPanelConsultaHabitacion.setLayout(jPanelConsultaHabitacionLayout);
        jPanelConsultaHabitacionLayout.setHorizontalGroup(
            jPanelConsultaHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldConsultaHabitacion)
                    .addGroup(jPanelConsultaHabitacionLayout.createSequentialGroup()
                        .addGroup(jPanelConsultaHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelConsultaHabitacionLayout.createSequentialGroup()
                                .addComponent(jLabelNumeroHabitacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonConsultaHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEstadoConsultaHabitacion))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelConsultaHabitacionLayout.setVerticalGroup(
            jPanelConsultaHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroHabitacion)
                    .addComponent(jTextFieldNumeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelEstadoConsultaHabitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldConsultaHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButtonConsultaHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelConsultaDisponibilidad.setBackground(new java.awt.Color(255, 163, 51));
        jPanelConsultaDisponibilidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "Consultar Disponibilidad", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N

        jLabelNumeroPiso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelNumeroPiso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumeroPiso.setText("Número de piso:");

        jRadioButtonPiso1.setBackground(new java.awt.Color(255, 163, 51));
        buttonGroupPiso.add(jRadioButtonPiso1);
        jRadioButtonPiso1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jRadioButtonPiso1.setSelected(true);
        jRadioButtonPiso1.setText("Primer piso");
        jRadioButtonPiso1.setFocusPainted(false);
        jRadioButtonPiso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPiso1ActionPerformed(evt);
            }
        });

        jRadioButtonPiso2.setBackground(new java.awt.Color(255, 163, 51));
        buttonGroupPiso.add(jRadioButtonPiso2);
        jRadioButtonPiso2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jRadioButtonPiso2.setText("Segundo piso");
        jRadioButtonPiso2.setFocusPainted(false);
        jRadioButtonPiso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPiso2ActionPerformed(evt);
            }
        });

        jButtonConsultaDisponibilidad.setBackground(new java.awt.Color(228, 130, 0));
        jButtonConsultaDisponibilidad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonConsultaDisponibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/search.png"))); // NOI18N
        jButtonConsultaDisponibilidad.setText("Consultar");
        jButtonConsultaDisponibilidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButtonConsultaDisponibilidad.setBorderPainted(false);
        jButtonConsultaDisponibilidad.setContentAreaFilled(false);
        jButtonConsultaDisponibilidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConsultaDisponibilidad.setFocusPainted(false);
        jButtonConsultaDisponibilidad.setOpaque(true);
        jButtonConsultaDisponibilidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConsultaDisponibilidadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConsultaDisponibilidadMouseExited(evt);
            }
        });
        jButtonConsultaDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaDisponibilidadActionPerformed(evt);
            }
        });

        jTextAreaConsultaDisponibilidad.setBackground(new java.awt.Color(255, 232, 205));
        jTextAreaConsultaDisponibilidad.setColumns(20);
        jTextAreaConsultaDisponibilidad.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextAreaConsultaDisponibilidad.setForeground(new java.awt.Color(175, 87, 0));
        jTextAreaConsultaDisponibilidad.setRows(5);
        jScrollPane2.setViewportView(jTextAreaConsultaDisponibilidad);

        jLabelEstadoConsultaDisponiblidad.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelEstadoConsultaDisponiblidad.setText("Estado De La Consulta");

        javax.swing.GroupLayout jPanelConsultaDisponibilidadLayout = new javax.swing.GroupLayout(jPanelConsultaDisponibilidad);
        jPanelConsultaDisponibilidad.setLayout(jPanelConsultaDisponibilidadLayout);
        jPanelConsultaDisponibilidadLayout.setHorizontalGroup(
            jPanelConsultaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaDisponibilidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultaDisponibilidadLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelConsultaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelConsultaDisponibilidadLayout.createSequentialGroup()
                                .addComponent(jLabelNumeroPiso)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelConsultaDisponibilidadLayout.createSequentialGroup()
                                .addGroup(jPanelConsultaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonPiso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelConsultaDisponibilidadLayout.createSequentialGroup()
                                        .addGroup(jPanelConsultaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelEstadoConsultaDisponiblidad)
                                            .addComponent(jRadioButtonPiso2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(62, 62, 62))))
                    .addGroup(jPanelConsultaDisponibilidadLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaDisponibilidadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConsultaDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelConsultaDisponibilidadLayout.setVerticalGroup(
            jPanelConsultaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaDisponibilidadLayout.createSequentialGroup()
                .addComponent(jLabelNumeroPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonPiso1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonPiso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEstadoConsultaDisponiblidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonConsultaDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jPanelConsultaHuespedes.setBackground(new java.awt.Color(255, 163, 51));
        jPanelConsultaHuespedes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "Consultar Huéspedes", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N

        jButtonConsultaHuespedes.setBackground(new java.awt.Color(228, 130, 0));
        jButtonConsultaHuespedes.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonConsultaHuespedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/search.png"))); // NOI18N
        jButtonConsultaHuespedes.setText("Consultar");
        jButtonConsultaHuespedes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButtonConsultaHuespedes.setBorderPainted(false);
        jButtonConsultaHuespedes.setContentAreaFilled(false);
        jButtonConsultaHuespedes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConsultaHuespedes.setFocusPainted(false);
        jButtonConsultaHuespedes.setOpaque(true);
        jButtonConsultaHuespedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConsultaHuespedesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConsultaHuespedesMouseExited(evt);
            }
        });
        jButtonConsultaHuespedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaHuespedesActionPerformed(evt);
            }
        });

        jLabelEstadoConsultaHuespedes.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelEstadoConsultaHuespedes.setText("Estado De La Consulta");

        jTextAreaConsultaHuespedes.setBackground(new java.awt.Color(255, 232, 205));
        jTextAreaConsultaHuespedes.setColumns(20);
        jTextAreaConsultaHuespedes.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextAreaConsultaHuespedes.setForeground(new java.awt.Color(175, 87, 0));
        jTextAreaConsultaHuespedes.setRows(5);
        jScrollPane3.setViewportView(jTextAreaConsultaHuespedes);

        javax.swing.GroupLayout jPanelConsultaHuespedesLayout = new javax.swing.GroupLayout(jPanelConsultaHuespedes);
        jPanelConsultaHuespedes.setLayout(jPanelConsultaHuespedesLayout);
        jPanelConsultaHuespedesLayout.setHorizontalGroup(
            jPanelConsultaHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaHuespedesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addGroup(jPanelConsultaHuespedesLayout.createSequentialGroup()
                        .addGroup(jPanelConsultaHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEstadoConsultaHuespedes)
                            .addComponent(jButtonConsultaHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelConsultaHuespedesLayout.setVerticalGroup(
            jPanelConsultaHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaHuespedesLayout.createSequentialGroup()
                .addComponent(jLabelEstadoConsultaHuespedes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonConsultaHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
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
                        .addGap(341, 341, 341)
                        .addComponent(jLabelTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBaseLayout.createSequentialGroup()
                                .addComponent(jPanelConsultaHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelConsultaHuespedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanelConsultaHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelConsultaDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jPanelConsultaDisponibilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelConsultaHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelConsultaHuespedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelConsultaHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    //-Cerrar el menú de las consultas-//.
    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    //-Indicar que el cursor se ha posicionado en el botón para consultar algún huésped-//.
    private void jButtonConsultaHuespedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultaHuespedMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonConsultaHuesped.setBackground(color);
    }//GEN-LAST:event_jButtonConsultaHuespedMouseEntered

    //-Indicar que el cursor dejó de posicionarse en el botón para consultar algún huésped-//.
    private void jButtonConsultaHuespedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultaHuespedMouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonConsultaHuesped.setBackground(color);
    }//GEN-LAST:event_jButtonConsultaHuespedMouseExited

    //-A partir de la información de la base de datos, se muestran las habitaciones reservadas por un huésped-//.
    private void jButtonConsultaHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaHuespedActionPerformed
        if(this.jTextFieldNombreHuesped.getText().length() > 0 && this.jTextFieldApellidoHuesped.getText().length() > 0) {
            ConexionMySQL conexion = null;
            ArrayList<String> listaHabitaciones = new ArrayList<>();

            this.jTextAreaConsultaHuesped.setText("");

            try {
                //Conexión a la base de datos.
                conexion = new ConexionMySQL();

                try {
                    String nombreCompleto = this.jTextFieldNombreHuesped.getText().trim() + " "
                    + this.jTextFieldApellidoHuesped.getText().trim();

                    //Consultar en la base de datos las habitaciones reservadas por un huésped.
                    ResultSet consulta = conexion.consultarTabla("huespedes",
                    "room_id", " WHERE name = '" + nombreCompleto + "' AND active = 1");

                    //Se genera una lista de todas las habitaciones reservadas por el huésped.
                    while(consulta.next()) {
                        listaHabitaciones.add(Integer.toString(consulta.getInt("room_id")));
                    }

                    //Se verifica si el huésped reservó habitaciones.
                    if(!listaHabitaciones.isEmpty()) {
                        this.jTextAreaConsultaHuesped.append(String.format("Huésped: %-15s\n\n", nombreCompleto));

                        for(String idHabitacion : listaHabitaciones) {
                            this.jTextAreaConsultaHuesped.append("Habitación: " + idHabitacion + "\n");

                            //Se indica que la habitación pertenece al primer o segundo piso.
                            if(idHabitacion.charAt(0) == '1') {
                                this.jTextAreaConsultaHuesped.append("Piso: 1\n\n");
                            } 
                            else {
                                this.jTextAreaConsultaHuesped.append("Piso: 2\n\n");
                            }
                        }
                    } 
                    else {
                        this.jTextAreaConsultaHuesped.setText("Huésped no registrado\nen el sistema.");
                    }
                }
                catch(SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Ocurrió un error durante la "
                    + "realización de la consulta.\nSQLException: " + ex.getMessage()
                    + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                    "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "No fue posible realizar la "
                + "conexión con la base de datos.\n" + "Verifique si el servidor "
                + "XAMPP o MySQL local se encuentra activado.", "Error", JOptionPane.ERROR_MESSAGE);
            } 
            finally {
                if(conexion != null) {
                    conexion.cerrarConexion();
                }
            }
        } 
        else {
            JOptionPane.showMessageDialog(this, "Es necesario introducir "
            + "nombre y apellido.\n", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConsultaHuespedActionPerformed

    //-Evento para verificar que el nombre del huesped no exceda los 10 caracteres-//.
    private void jTextFieldNombreHuespedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreHuespedKeyTyped
        this.jTextAreaConsultaHuesped.setText("");

        if (this.jTextFieldNombreHuesped.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreHuespedKeyTyped

    //-Evento para verificar que el apellido del huesped no exceda los 10 caracteres-//.
    private void jTextFieldApellidoHuespedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoHuespedKeyTyped
        this.jTextAreaConsultaHuesped.setText("");

        if (this.jTextFieldApellidoHuesped.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldApellidoHuespedKeyTyped

    //-Indicar que el cursor se ha posicionado en el botón para consultar alguna habitación-//.
    private void jButtonConsultaHabitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultaHabitacionMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonConsultaHabitacion.setBackground(color);
    }//GEN-LAST:event_jButtonConsultaHabitacionMouseEntered

    //-Indicar que el cursor dejó de posicionarse en el botón para consultar alguna habitación-//.
    private void jButtonConsultaHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultaHabitacionMouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonConsultaHabitacion.setBackground(color);
    }//GEN-LAST:event_jButtonConsultaHabitacionMouseExited

    //-A partir de la información de la base de datos, se verifica si hay, o no, un huésped que reservó una habitación específica-//.
    private void jButtonConsultaHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaHabitacionActionPerformed
        if (this.jTextFieldNumeroHabitacion.getText().length() > 0) {
            ConexionMySQL conexion = null;

            try {
                //Conexión a la base de datos.
                conexion = new ConexionMySQL();

                try {
                    String habitacion = this.jTextFieldNumeroHabitacion.getText().trim();

                    //Consultar en la base de datos si la habitación está reservada o no.
                    ResultSet consulta = conexion.consultarTabla("huespedes",
                    "name", " WHERE room_id = '" + habitacion + "' AND active = 1 LIMIT 1");

                    //Se verifica si la habitación está reservada.
                    if(consulta.next()) {
                        this.jTextFieldConsultaHabitacion.setText("Reservada por " + consulta.getString("name"));
                    } 
                    else {
                        try {
                            int numero = Integer.parseInt(habitacion);

                            if(numero <= 215 && numero >= 201) {
                                this.jTextFieldConsultaHabitacion.setText("Habitación disponible (segundo piso)");
                            } 
                            else if(numero <= 115 && numero >= 101) {
                                this.jTextFieldConsultaHabitacion.setText("Habitación disponible (primer piso)");
                            } 
                            else {
                                this.jTextFieldConsultaHabitacion.setText("Habitación inexistente");
                            }
                        } 
                        catch(NumberFormatException ex) {
                            JOptionPane.showMessageDialog(this, "La entrada es inválida.\n"
                            + "Solo es posible introducir números.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } 
                catch(SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Ocurrió un error durante la "
                    + "realización de la consulta.\nSQLException: " + ex.getMessage()
                    + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                    "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            catch(Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "No fue posible realizar la "
                + "conexión con la base de datos.\n" + "Verifique si el servidor "
                + "XAMPP o MySQL local se encuentra activado.", "Error", JOptionPane.ERROR_MESSAGE);
            } 
            finally {
                if(conexion != null) {
                    conexion.cerrarConexion();
                }
            }
        } 
        else {
            JOptionPane.showMessageDialog(this, "Es necesario introducir "
            + "el número de la habitación a buscar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConsultaHabitacionActionPerformed

    //-Evento para verificar que la búsqueda de la habitación no exceda los 3 caracteres-//.
    private void jTextFieldNumeroHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroHabitacionKeyTyped
        if (this.jTextFieldNumeroHabitacion.getText().length() > 2) {
            evt.consume();
        } 
        else {
            this.jTextFieldConsultaHabitacion.setText("");
        }
    }//GEN-LAST:event_jTextFieldNumeroHabitacionKeyTyped

    //-Al cambiar el número de piso, borrar el contenido del JTextArea-//.
    private void jRadioButtonPiso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPiso1ActionPerformed
        this.jTextAreaConsultaDisponibilidad.setText("");
    }//GEN-LAST:event_jRadioButtonPiso1ActionPerformed

    //-Al cambiar el número de piso, borrar el contenido del JTextArea-//.
    private void jRadioButtonPiso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPiso2ActionPerformed
        this.jTextAreaConsultaDisponibilidad.setText("");
    }//GEN-LAST:event_jRadioButtonPiso2ActionPerformed

    //-Indicar que el cursor se ha posicionado en el botón para consultar la disponibilidad-//.
    private void jButtonConsultaDisponibilidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultaDisponibilidadMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonConsultaDisponibilidad.setBackground(color);
    }//GEN-LAST:event_jButtonConsultaDisponibilidadMouseEntered

    //-Indicar que el cursor dejó de posicionarse en el botón para consultar la disponibilidad-//.
    private void jButtonConsultaDisponibilidadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultaDisponibilidadMouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonConsultaDisponibilidad.setBackground(color);
    }//GEN-LAST:event_jButtonConsultaDisponibilidadMouseExited

    //-Imprimir todas las habitaciones disponibles, separadas por tipo-//.
    private void jButtonConsultaDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaDisponibilidadActionPerformed
        ConexionMySQL conexion = null;
        int numeroPiso;

        //Vaciar el JTextArea.
        this.jTextAreaConsultaDisponibilidad.setText("");

        //Se verifica si se seleccionó el primer piso para la búsqueda de habitaciones.
        if (this.jRadioButtonPiso1.isSelected()) {
            numeroPiso = 1;
        } 
        else {
            numeroPiso = 2;
        }
        this.habitacionesSimples.clear();
        this.habitacionesDobles.clear();
        this.habitacionesTriples.clear();
        this.inicializarVectores(numeroPiso);

        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();

            try {
                //Consultar en la base de datos las habitaciones reservadas simples del piso correspondiente.
                ResultSet consulta = conexion.consultarTabla("huespedes",
                "room_id", " WHERE room_type = 'S' AND active = 1 AND floor = " + numeroPiso);

                //Se eliminan todas las habitaciones reservadas simples del piso correspondiente.
                while(consulta.next()) {
                    int numeroHabitacion = consulta.getInt("room_id");

                    if(this.habitacionesSimples.contains(numeroHabitacion)) {
                        this.habitacionesSimples.removeAll(Arrays.asList(numeroHabitacion));
                    }
                }

                //Consultar en la base de datos las habitaciones reservadas dobles del piso correspondiente.
                consulta = conexion.consultarTabla("huespedes",
                "room_id", " WHERE room_type = 'D' AND active = 1 AND floor = " + numeroPiso);

                //Se eliminan todas las habitaciones reservadas dobles del piso correspondiente.
                while(consulta.next()) {
                    int numeroHabitacion = consulta.getInt("room_id");

                    if(this.habitacionesDobles.contains(numeroHabitacion)) {
                        this.habitacionesDobles.removeAll(Arrays.asList(numeroHabitacion));
                    }
                }

                //Consultar en la base de datos las habitaciones reservadas triples del piso correspondiente.
                consulta = conexion.consultarTabla("huespedes",
                "room_id", " WHERE room_type = 'T' AND active = 1 AND floor = " + numeroPiso);

                //Se eliminan todas las habitaciones reservadas triples del piso correspondiente.
                while(consulta.next()) {
                    int numeroHabitacion = consulta.getInt("room_id");

                    if (this.habitacionesTriples.contains(numeroHabitacion)) {
                        this.habitacionesTriples.removeAll(Arrays.asList(numeroHabitacion));
                    }
                }

                //Se verifica si hay habitaciones disponibles o no.
                this.jTextAreaConsultaDisponibilidad.setForeground(new Color(Integer.parseInt("AF5700", 16)));
                if(this.habitacionesSimples.isEmpty() && this.habitacionesDobles.isEmpty() && this.habitacionesTriples.isEmpty()) {
                    this.jTextAreaConsultaDisponibilidad.setText("**No hay  habitaciones**\n"
                    + "       disponibles");
                } 
                else {
                    if(!this.habitacionesSimples.isEmpty()) {
                        this.jTextAreaConsultaDisponibilidad.append("**Habitaciones Simples**\n");
                        for(Integer entero : this.habitacionesSimples) {
                            this.jTextAreaConsultaDisponibilidad.append(" Habitación número " + entero + ".\n");
                        }
                        this.jTextAreaConsultaDisponibilidad.append("************************\n");
                    }
                    if(!this.habitacionesDobles.isEmpty()) {
                        this.jTextAreaConsultaDisponibilidad.append("**Habitaciones  Dobles**\n");
                        for(Integer entero : this.habitacionesDobles) {
                            this.jTextAreaConsultaDisponibilidad.append(" Habitación número " + entero + ".\n");
                        }
                        this.jTextAreaConsultaDisponibilidad.append("************************\n");
                    }
                    if(!this.habitacionesTriples.isEmpty()) {
                        this.jTextAreaConsultaDisponibilidad.append("**Habitaciones Triples**\n");
                        for(Integer entero : this.habitacionesTriples) {
                            this.jTextAreaConsultaDisponibilidad.append(" Habitación número " + entero + ".\n");
                        }
                        this.jTextAreaConsultaDisponibilidad.append("************************\n");
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
        catch(Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No fue posible realizar la "
            + "conexión con la base de datos.\n" + "Verifique si el servidor "
            + "XAMPP o MySQL local se encuentra activado.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        finally {
            if (conexion != null) {
                conexion.cerrarConexion();
            }
        }
    }//GEN-LAST:event_jButtonConsultaDisponibilidadActionPerformed

    //-Indicar que el cursor se ha posicionado en el botón para consultar algún huésped-//.
    private void jButtonConsultaHuespedesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultaHuespedesMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonConsultaHuespedes.setBackground(color);
    }//GEN-LAST:event_jButtonConsultaHuespedesMouseEntered

    //-Indicar que el cursor se dejó de posicionar en el botón para consultar algún huésped-//.
    private void jButtonConsultaHuespedesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultaHuespedesMouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonConsultaHuespedes.setBackground(color);
    }//GEN-LAST:event_jButtonConsultaHuespedesMouseExited

    //-A partir de la información de la base de datos, se obtienen los huéspedes actuales-//.
    private void jButtonConsultaHuespedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaHuespedesActionPerformed
        ConexionMySQL conexion = null;

        this.jTextAreaConsultaHuespedes.setText("");

        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();

            try {
                //Consultar en la base de datos los huéspedes actuales.
                ResultSet consulta = conexion.consultarTabla("huespedes",
                "name, room_id", " WHERE active = 1 ORDER BY name ASC");

                if(!consulta.first()) {
                    this.jTextAreaConsultaHuespedes.setText("No hay huéspedes registrados.");
                } 
                else {
                    consulta.previous();
                    while(consulta.next()) {
                        this.jTextAreaConsultaHuespedes.append(String.format("%-20s\t%d\n",
                        consulta.getString("name"), consulta.getInt("room_id")));
                    }
                }
            } 
            catch(SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ocurrió un error durante la "
                + "realización de la consulta.\nSQLException: " + ex.getMessage()
                + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch(Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No fue posible realizar la "
            + "conexión con la base de datos.\n" + "Verifique si el servidor "
            + "XAMPP o MySQL local se encuentra activado.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        finally {
            if(conexion != null) {
                conexion.cerrarConexion();
            }
        }
    }//GEN-LAST:event_jButtonConsultaHuespedesActionPerformed

    //-Se genera una serie de listas con las habitaciones disponibles, según el tipo, en cada piso-//.
    private void inicializarVectores(int numeroPiso) {
        if (numeroPiso == 1) {
            //Definir las habitaciones simples del primer piso.
            this.habitacionesSimples.add(101);
            this.habitacionesSimples.add(104);
            this.habitacionesSimples.add(107);
            this.habitacionesSimples.add(110);
            this.habitacionesSimples.add(113);

            //Definir las habitaciones dobles del primer piso.
            this.habitacionesDobles.add(102);
            this.habitacionesDobles.add(105);
            this.habitacionesDobles.add(108);
            this.habitacionesDobles.add(111);
            this.habitacionesDobles.add(114);

            //Definir las habitaciones triples del primer piso.
            this.habitacionesTriples.add(103);
            this.habitacionesTriples.add(106);
            this.habitacionesTriples.add(109);
            this.habitacionesTriples.add(112);
            this.habitacionesTriples.add(115);
        } 
        else {
            //Definir las habitaciones simples del segundo piso.
            this.habitacionesSimples.add(202);
            this.habitacionesSimples.add(208);
            this.habitacionesSimples.add(211);
            this.habitacionesSimples.add(213);

            //Definir las habitaciones dobles del segundo piso.
            this.habitacionesDobles.add(205);
            this.habitacionesDobles.add(206);
            this.habitacionesDobles.add(209);
            this.habitacionesDobles.add(212);

            //Definir las habitaciones triples del segundo piso.
            this.habitacionesTriples.add(201);
            this.habitacionesTriples.add(203);
            this.habitacionesTriples.add(204);
            this.habitacionesTriples.add(207);
            this.habitacionesTriples.add(210);
            this.habitacionesTriples.add(214);
            this.habitacionesTriples.add(215);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPiso;
    private javax.swing.JButton jButtonConsultaDisponibilidad;
    private javax.swing.JButton jButtonConsultaHabitacion;
    private javax.swing.JButton jButtonConsultaHuesped;
    private javax.swing.JButton jButtonConsultaHuespedes;
    private javax.swing.JLabel jLabelApellidoHuesped;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelEstadoConsultaDisponiblidad;
    private javax.swing.JLabel jLabelEstadoConsultaHabitacion;
    private javax.swing.JLabel jLabelEstadoConsultaHuesped;
    private javax.swing.JLabel jLabelEstadoConsultaHuespedes;
    private javax.swing.JLabel jLabelNombreHuesped;
    private javax.swing.JLabel jLabelNumeroHabitacion;
    private javax.swing.JLabel jLabelNumeroPiso;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelConsultaDisponibilidad;
    private javax.swing.JPanel jPanelConsultaHabitacion;
    private javax.swing.JPanel jPanelConsultaHuesped;
    private javax.swing.JPanel jPanelConsultaHuespedes;
    private javax.swing.JRadioButton jRadioButtonPiso1;
    private javax.swing.JRadioButton jRadioButtonPiso2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaConsultaDisponibilidad;
    private javax.swing.JTextArea jTextAreaConsultaHuesped;
    private javax.swing.JTextArea jTextAreaConsultaHuespedes;
    private javax.swing.JTextField jTextFieldApellidoHuesped;
    private javax.swing.JTextField jTextFieldConsultaHabitacion;
    private javax.swing.JTextField jTextFieldNombreHuesped;
    private javax.swing.JTextField jTextFieldNumeroHabitacion;
    // End of variables declaration//GEN-END:variables
}