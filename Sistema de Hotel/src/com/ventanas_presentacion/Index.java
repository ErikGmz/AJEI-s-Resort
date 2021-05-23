//---Paquete---//.
package com.ventanas_presentacion;

//---Sentencias import---//.
import com.operaciones.Estadisticas;
import com.operaciones.*;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

//---Clase pública---//.
public class Index extends javax.swing.JFrame {

    //---Atributos Adicionales---//.
    private Clip musicaFondo;
    private boolean musicaIniciada;

    //---Constructor---//.
    public Index() {
        initComponents();
        this.extraInitProcess();
        this.musicaIniciada = true;
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jButtonEstadisticas = new javax.swing.JButton();
        jButtonCheckIn = new javax.swing.JButton();
        jButtonCheckOut = new javax.swing.JButton();
        jLabelBtn1 = new javax.swing.JLabel();
        jLabelBtn2 = new javax.swing.JLabel();
        jLabelBtn3 = new javax.swing.JLabel();
        jLabelConfiguracion = new javax.swing.JLabel();
        jLabelMusica = new javax.swing.JLabel();
        jLabelMenu = new javax.swing.JLabel();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabelBtn4 = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jButtonModificaciones = new javax.swing.JButton();
        jLabelBtn5 = new javax.swing.JLabel();
        jPanelContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1100, 580));
        setResizable(false);

        jPanelMenu.setBackground(new java.awt.Color(255, 186, 106));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(220, 580));

        jButtonEstadisticas.setBackground(new java.awt.Color(255, 186, 106));
        jButtonEstadisticas.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/index/chart-line.png"))); // NOI18N
        jButtonEstadisticas.setText("Estadísticas");
        jButtonEstadisticas.setAutoscrolls(true);
        jButtonEstadisticas.setBorder(null);
        jButtonEstadisticas.setBorderPainted(false);
        jButtonEstadisticas.setContentAreaFilled(false);
        jButtonEstadisticas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEstadisticas.setFocusPainted(false);
        jButtonEstadisticas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonEstadisticas.setIconTextGap(10);
        jButtonEstadisticas.setInheritsPopupMenu(true);
        jButtonEstadisticas.setOpaque(true);
        jButtonEstadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEstadisticasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEstadisticasMouseExited(evt);
            }
        });
        jButtonEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstadisticasActionPerformed(evt);
            }
        });

        jButtonCheckIn.setBackground(new java.awt.Color(255, 186, 106));
        jButtonCheckIn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/index/sign-in.png"))); // NOI18N
        jButtonCheckIn.setText("Check In");
        jButtonCheckIn.setAutoscrolls(true);
        jButtonCheckIn.setBorder(null);
        jButtonCheckIn.setBorderPainted(false);
        jButtonCheckIn.setContentAreaFilled(false);
        jButtonCheckIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCheckIn.setFocusPainted(false);
        jButtonCheckIn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonCheckIn.setIconTextGap(10);
        jButtonCheckIn.setInheritsPopupMenu(true);
        jButtonCheckIn.setOpaque(true);
        jButtonCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCheckInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCheckInMouseExited(evt);
            }
        });
        jButtonCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckInActionPerformed(evt);
            }
        });

        jButtonCheckOut.setBackground(new java.awt.Color(255, 186, 106));
        jButtonCheckOut.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonCheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/index/sign-out.png"))); // NOI18N
        jButtonCheckOut.setText("Check Out");
        jButtonCheckOut.setAutoscrolls(true);
        jButtonCheckOut.setBorder(null);
        jButtonCheckOut.setBorderPainted(false);
        jButtonCheckOut.setContentAreaFilled(false);
        jButtonCheckOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCheckOut.setFocusPainted(false);
        jButtonCheckOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonCheckOut.setIconTextGap(10);
        jButtonCheckOut.setInheritsPopupMenu(true);
        jButtonCheckOut.setOpaque(true);
        jButtonCheckOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCheckOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCheckOutMouseExited(evt);
            }
        });
        jButtonCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckOutActionPerformed(evt);
            }
        });

        jLabelBtn1.setBackground(new java.awt.Color(175, 87, 0));
        jLabelBtn1.setToolTipText("");
        jLabelBtn1.setOpaque(true);

        jLabelBtn2.setBackground(new java.awt.Color(175, 87, 0));
        jLabelBtn2.setToolTipText("");
        jLabelBtn2.setOpaque(true);

        jLabelBtn3.setBackground(new java.awt.Color(175, 87, 0));
        jLabelBtn3.setToolTipText("");
        jLabelBtn3.setOpaque(true);

        jLabelConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/index/cogwheel.png"))); // NOI18N
        jLabelConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConfiguracionMouseClicked(evt);
            }
        });

        jLabelMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/index/musicOn.png"))); // NOI18N
        jLabelMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMusicaMouseClicked(evt);
            }
        });

        jLabelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/index/bar-menu.png"))); // NOI18N
        jLabelMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuMouseClicked(evt);
            }
        });

        jButtonCerrarSesion.setBackground(new java.awt.Color(255, 186, 106));
        jButtonCerrarSesion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/index/exit-symbol.png"))); // NOI18N
        jButtonCerrarSesion.setText("Cerrar Sesión");
        jButtonCerrarSesion.setAutoscrolls(true);
        jButtonCerrarSesion.setBorder(null);
        jButtonCerrarSesion.setBorderPainted(false);
        jButtonCerrarSesion.setContentAreaFilled(false);
        jButtonCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCerrarSesion.setFocusPainted(false);
        jButtonCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonCerrarSesion.setIconTextGap(10);
        jButtonCerrarSesion.setInheritsPopupMenu(true);
        jButtonCerrarSesion.setOpaque(true);
        jButtonCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCerrarSesionMouseExited(evt);
            }
        });
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        jLabelBtn4.setBackground(new java.awt.Color(175, 87, 0));
        jLabelBtn4.setToolTipText("");
        jLabelBtn4.setOpaque(true);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/index/logo.png"))); // NOI18N

        jButtonModificaciones.setBackground(new java.awt.Color(255, 186, 106));
        jButtonModificaciones.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonModificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/index/edit.png"))); // NOI18N
        jButtonModificaciones.setText("Modificaciones");
        jButtonModificaciones.setAutoscrolls(true);
        jButtonModificaciones.setBorder(null);
        jButtonModificaciones.setBorderPainted(false);
        jButtonModificaciones.setContentAreaFilled(false);
        jButtonModificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModificaciones.setFocusPainted(false);
        jButtonModificaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonModificaciones.setIconTextGap(10);
        jButtonModificaciones.setInheritsPopupMenu(true);
        jButtonModificaciones.setOpaque(true);
        jButtonModificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonModificacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonModificacionesMouseExited(evt);
            }
        });
        jButtonModificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificacionesActionPerformed(evt);
            }
        });

        jLabelBtn5.setBackground(new java.awt.Color(175, 87, 0));
        jLabelBtn5.setToolTipText("");
        jLabelBtn5.setOpaque(true);

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addComponent(jLabelBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMenu)
                .addContainerGap())
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addComponent(jLabelLogo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addComponent(jLabelBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButtonModificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelConfiguracion)
                    .addComponent(jLabelMusica))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMenu)
                .addGap(1, 1, 1)
                .addComponent(jLabelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabelMusica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelConfiguracion)
                .addGap(28, 28, 28))
        );

        jPanelContenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 580, Short.MAX_VALUE)
            .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1116, 619);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEstadisticasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEstadisticasMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonEstadisticas.setBackground(color);
    }//GEN-LAST:event_jButtonEstadisticasMouseEntered

    private void jButtonEstadisticasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEstadisticasMouseExited
        Color color = new Color(Integer.parseInt("FFBA6A", 16));
        this.jButtonEstadisticas.setBackground(color);
    }//GEN-LAST:event_jButtonEstadisticasMouseExited

    private void jButtonCheckInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCheckInMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonCheckIn.setBackground(color);
    }//GEN-LAST:event_jButtonCheckInMouseEntered

    private void jButtonCheckInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCheckInMouseExited
        Color color = new Color(Integer.parseInt("FFBA6A", 16));
        this.jButtonCheckIn.setBackground(color);
    }//GEN-LAST:event_jButtonCheckInMouseExited

    private void jButtonCheckOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCheckOutMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonCheckOut.setBackground(color);
    }//GEN-LAST:event_jButtonCheckOutMouseEntered

    private void jButtonCheckOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCheckOutMouseExited
        Color color = new Color(Integer.parseInt("FFBA6A", 16));
        this.jButtonCheckOut.setBackground(color);
    }//GEN-LAST:event_jButtonCheckOutMouseExited

    //---Bootón del menú deslizable---//.
    private void jLabelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMouseClicked
        if (this.jPanelMenu.getWidth() == 60) {
            this.jPanelMenu.setSize(220, this.jPanelMenu.getHeight());
            this.jPanelContenedor.setSize(this.jPanelContenedor.getWidth() - 160, this.jPanelContenedor.getHeight());
            this.jPanelContenedor.setLocation(this.jPanelContenedor.getX() + 160, this.jPanelContenedor.getY());
            if (this.jPanelContenedor.getComponentCount() > 0) {
                this.jPanelContenedor.getComponent(0).setSize(this.jPanelContenedor.getSize());
            }
            this.jLabelMenu.setLocation(165, this.jLabelMenu.getY());
        } else if (this.jPanelMenu.getWidth() == 220) {
            this.jPanelMenu.setSize(60, this.jPanelMenu.getHeight());
            this.jPanelContenedor.setSize(this.jPanelContenedor.getWidth() + 160, this.jPanelContenedor.getHeight());
            this.jPanelContenedor.setLocation(this.jPanelContenedor.getX() - 160, this.jPanelContenedor.getY());
            if (this.jPanelContenedor.getComponentCount() > 0) {
                this.jPanelContenedor.getComponent(0).setSize(this.jPanelContenedor.getSize());
            }
            this.jLabelMenu.setLocation(5, this.jLabelMenu.getY());
        }
    }//GEN-LAST:event_jLabelMenuMouseClicked

    private void jLabelConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConfiguracionMouseClicked
        if (this.jLabelMusica.getX() >= 5) {
            Animacion.Animacion.mover_izquierda(this.jLabelMusica.getX(), -50, 2, 2, this.jLabelMusica);
        } else {
            Animacion.Animacion.mover_derecha(this.jLabelMusica.getX(), 10, 2, 2, this.jLabelMusica);
        }
    }//GEN-LAST:event_jLabelConfiguracionMouseClicked

    private void jLabelMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicaMouseClicked
        if (this.musicaFondo != null) {
            if (this.musicaIniciada) {
                //Detener la música.
                this.musicaFondo.stop();
                this.musicaIniciada = false;

                //Cambiar el ícono para indicar que la música está pausada.
                this.jLabelMusica.setIcon(new ImageIcon(getClass().getResource("/img/login/musicOff.png")));
            } else {
                //Iniciar la música a partir del punto exacto de la reproducción previa.
                this.musicaFondo.start();
                this.musicaFondo.loop(Clip.LOOP_CONTINUOUSLY);
                this.musicaIniciada = true;

                //Cambiar el ícono para indicar que la música está inicializada.
                this.jLabelMusica.setIcon(new ImageIcon(getClass().getResource("/img/login/musicOn.png")));
            }
        }
    }//GEN-LAST:event_jLabelMusicaMouseClicked

    private void jButtonEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstadisticasActionPerformed
        this.abrirJFrameEnPanelContenedor(new Estadisticas());
    }//GEN-LAST:event_jButtonEstadisticasActionPerformed

    private void jButtonCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckOutActionPerformed
        this.abrirJFrameEnPanelContenedor(new CheckOut());
    }//GEN-LAST:event_jButtonCheckOutActionPerformed

    private void jButtonCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckInActionPerformed
        this.abrirJFrameEnPanelContenedor(new CheckIn());
    }//GEN-LAST:event_jButtonCheckInActionPerformed

    private void jButtonCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonCerrarSesion.setBackground(color);
    }//GEN-LAST:event_jButtonCerrarSesionMouseEntered

    private void jButtonCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionMouseExited
        Color color = new Color(Integer.parseInt("FFBA6A", 16));
        this.jButtonCerrarSesion.setBackground(color);
    }//GEN-LAST:event_jButtonCerrarSesionMouseExited

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Esta seguro de que desea\nabandonar"
                + " la sesión?", "Cerrar Sesión", JOptionPane.OK_CANCEL_OPTION) == 0) {
            this.musicaFondo.stop();
            this.musicaFondo.close();
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jButtonModificacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificacionesMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonModificaciones.setBackground(color);
    }//GEN-LAST:event_jButtonModificacionesMouseEntered

    private void jButtonModificacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificacionesMouseExited
        Color color = new Color(Integer.parseInt("FFBA6A", 16));
        this.jButtonModificaciones.setBackground(color);
    }//GEN-LAST:event_jButtonModificacionesMouseExited

    private void jButtonModificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificacionesActionPerformed
        this.abrirJFrameEnPanelContenedor(new Modificaciones());
    }//GEN-LAST:event_jButtonModificacionesActionPerformed

    //---Abrir IntrenalJFrames dentro del panel contenedor----//.
    private void abrirJFrameEnPanelContenedor(Object jF) {
        // si existe algún componente en la
        // en el panel contenedor, lo removemos
        if (this.jPanelContenedor.getComponentCount() > 0) {
            this.jPanelContenedor.removeAll();
        }

        JInternalFrame jFHijo = (JInternalFrame) jF;

        ((javax.swing.plaf.basic.BasicInternalFrameUI) jFHijo.getUI()).setNorthPane(null);
        jFHijo.setSize(this.jPanelContenedor.getSize());

        this.jPanelContenedor.add(jFHijo);
        jFHijo.setVisible(true);
    }

    //---Procesos iniciales extras---//.
    private void extraInitProcess() {
        // Configuraciones básicas del JFrame.
        this.setLocationRelativeTo(this);
        try {
            super.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/index/house.png")));
        } catch (Exception ex) {
            System.err.println("Error al abrir el ícono.");
            ex.printStackTrace();
        }

        //Reproducir la música de fondo.
        try {
            AudioInputStream flujo = AudioSystem.getAudioInputStream(new File("src/sounds/hotel.wav"));
            this.musicaFondo = AudioSystem.getClip();
            this.musicaFondo.open(flujo);
            this.musicaFondo.start();
            this.musicaIniciada = true;
        } catch (Exception ex) {
            System.err.println("No se pudo reproducir el archivo de sonido.");
            System.err.println("Verifique si el fichero \"hotel.wav\" se encuentra en la carpeta /sounds.");
            ex.printStackTrace();
            this.musicaFondo = null;
        }
    }

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Index().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonCheckIn;
    private javax.swing.JButton jButtonCheckOut;
    private javax.swing.JButton jButtonEstadisticas;
    private javax.swing.JButton jButtonModificaciones;
    private javax.swing.JLabel jLabelBtn1;
    private javax.swing.JLabel jLabelBtn2;
    private javax.swing.JLabel jLabelBtn3;
    private javax.swing.JLabel jLabelBtn4;
    private javax.swing.JLabel jLabelBtn5;
    private javax.swing.JLabel jLabelConfiguracion;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelMusica;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JPanel jPanelMenu;
    // End of variables declaration//GEN-END:variables
}
