/*
 *  Proyecto Final: Administración de un hotel.
 *  Carrera: Ingeniería en Sistemas Computacionales.
 *  Semestre: 4ºA.
 *  Materia: Programación III.
 * 
 *  Equipo número 5. Integrantes:
 *
 *  -Erik Alejandro Gómez Martínez (jefe).
 *  -Ángel Gabriel Galindo López.
 *  -Israel Alejandro Mora González.
 *  -José Emmanuel Rodríguez López.
 */
//---Paquete---//.
package com.ventanas_presentacion;

//---Sentencias import---//.
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

//---Clase pública---//.
public class Portada extends javax.swing.JFrame {

    //---Atributos adicionales---//.
    private Image logoUAA;
    private boolean panelIngresarDesplegado;

    //---Constructor---//.
    public Portada() {
        initComponents();
        extraInitProcess();
    }

    //---Métodos sobreescritos---//.
    //-Dibujar íconos e imágenes-//.
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(new Color(Integer.parseInt("242C58", 16)));
        g.fillOval(this.jPanelPortada.getWidth() - 400, this.jPanelPortada.getHeight() - 400, 600, 600);

        g.setColor(Color.WHITE);
        g.setFont(new Font("Times New Roman", Font.BOLD, 36));
        g.drawString("Alumnos:", this.jPanelPortada.getWidth() - 250, this.jPanelPortada.getHeight() - 250);
        g.setFont(new Font("Times New Roman", Font.BOLD, 22));
        g.drawString("Erik Alejandro Gómez Martínez", this.jPanelPortada.getWidth() - 330, this.jPanelPortada.getHeight() - 200);
        g.drawString("Ángel Gabriel Galindo López", this.jPanelPortada.getWidth() - 315, this.jPanelPortada.getHeight() - 150);
        g.drawString("Israel Alejandro Mora González", this.jPanelPortada.getWidth() - 328, this.jPanelPortada.getHeight() - 100);
        g.drawString("José Emmanuel Rodríguez López", this.jPanelPortada.getWidth() - 335, this.jPanelPortada.getHeight() - 50);

        g.setColor(new Color(Integer.parseInt("242C58", 16)));
        g.fillOval(this.jPanelPortada.getWidth() - 800, this.jPanelPortada.getHeight() - 400, 350, 350);

        g.setColor(Color.WHITE);
        g.setFont(new Font("Times New Roman", Font.BOLD, 20));
        g.drawString("Carrera: ISC", this.jPanelPortada.getWidth() - 680, this.jPanelPortada.getHeight() - 350);
        g.drawString("Departamento de Sistemas", this.jPanelPortada.getWidth() - 730, this.jPanelPortada.getHeight() - 300);
        g.drawString("Electrónicos", this.jPanelPortada.getWidth() - 670, this.jPanelPortada.getHeight() - 270);
        g.drawString("Materia: Programación", this.jPanelPortada.getWidth() - 720, this.jPanelPortada.getHeight() - 220);
        g.drawString("Docente: Georgina Salazar Partida", this.jPanelPortada.getWidth() - 770, this.jPanelPortada.getHeight() - 170);
        g.drawString("Proyecto: Sistema Gestor", this.jPanelPortada.getWidth() - 730, this.jPanelPortada.getHeight() - 120);
        g.drawString("de Hotel", this.jPanelPortada.getWidth() - 660, this.jPanelPortada.getHeight() - 90);

        //Dibujar el logo de la UAA.
        g.drawImage(this.logoUAA, this.jPanelPortada.getWidth() - 500, this.jPanelPortada.getHeight() - 525, this);

        //Dibujar el logo y texto del Centro de Ciencias Básicas.
        //g.drawImage(this.logoCBB, 60, 207, this);
        //g.drawImage(this.textoCBB, 125, 190, this);
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPortada = new javax.swing.JPanel();
        jLabelDesplegar = new javax.swing.JLabel();
        jPanelIngresar = new javax.swing.JPanel();
        jButtonIngresar = new javax.swing.JButton();
        jLabelHotel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portada de presentación");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanelPortada.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPortada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDesplegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/portada/right-arrow.png"))); // NOI18N
        jLabelDesplegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelDesplegar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDesplegarMouseClicked(evt);
            }
        });
        jPanelPortada.add(jLabelDesplegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jPanelIngresar.setBackground(new java.awt.Color(36, 44, 88));

        jButtonIngresar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonIngresar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonIngresar.setText("Ingresar Al Sistema Del Hotel");
        jButtonIngresar.setAutoscrolls(true);
        jButtonIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButtonIngresar.setBorderPainted(false);
        jButtonIngresar.setContentAreaFilled(false);
        jButtonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIngresar.setFocusPainted(false);
        jButtonIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonIngresar.setIconTextGap(10);
        jButtonIngresar.setOpaque(true);
        jButtonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonIngresarMouseExited(evt);
            }
        });
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jLabelHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/portada/building.png"))); // NOI18N

        javax.swing.GroupLayout jPanelIngresarLayout = new javax.swing.GroupLayout(jPanelIngresar);
        jPanelIngresar.setLayout(jPanelIngresarLayout);
        jPanelIngresarLayout.setHorizontalGroup(
            jPanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelIngresarLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelHotel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelIngresarLayout.setVerticalGroup(
            jPanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIngresarLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabelHotel)
                .addGap(39, 39, 39)
                .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        jPanelPortada.add(jPanelIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 0, 220, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPortada, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPortada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresarMouseEntered
        this.jButtonIngresar.setBackground(new Color(Integer.parseInt("686868", 16)));
        this.jButtonIngresar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonIngresarMouseEntered

    private void jButtonIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresarMouseExited
        this.jButtonIngresar.setBackground(Color.WHITE);
        this.jButtonIngresar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonIngresarMouseExited

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        this.dispose();
        Login inicio = new Login();
        inicio.setVisible(true);
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jLabelDesplegarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDesplegarMouseClicked
        if (!this.panelIngresarDesplegado) {
            this.panelIngresarDesplegado = true;
            Animacion.Animacion.mover_derecha(10, 220, 2, 2, this.jLabelDesplegar);
            Animacion.Animacion.mover_derecha(-210, 0, 2, 2, this.jPanelIngresar);
            this.jLabelDesplegar.setIcon(new ImageIcon(getClass().getResource("/img/portada/left-arrow.png")));
        } else {
            this.panelIngresarDesplegado = false;
            Animacion.Animacion.mover_izquierda(220, 10, 2, 2, this.jLabelDesplegar);
            Animacion.Animacion.mover_izquierda(0, -210, 2, 2, this.jPanelIngresar);
            this.jLabelDesplegar.setIcon(new ImageIcon(getClass().getResource("/img/portada/right-arrow.png")));
        }
    }//GEN-LAST:event_jLabelDesplegarMouseClicked

    //-Configuración adicional de ciertos componentes-//.
    private void extraInitProcess() {
        //Centrar el jFrame.
        this.setLocationRelativeTo(this);
        
        this.panelIngresarDesplegado = false;

        //Abrir el archivo que contiene el logo de la UAA.
        ImageIcon icono = new ImageIcon("src/img/portada/logoCircular.png");
        this.logoUAA = icono.getImage();

        //Cargar el logo del gallo UAA para el JFrame.
        try {
            super.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/portada/gallouaa.png")));
        } catch (Exception ex) {
            System.err.println("Error al abrir el ícono.");
            ex.printStackTrace();
        }
    }

    //-Método principal-//.
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Portada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabelDesplegar;
    private javax.swing.JLabel jLabelHotel;
    private javax.swing.JPanel jPanelIngresar;
    private javax.swing.JPanel jPanelPortada;
    // End of variables declaration//GEN-END:variables

}
