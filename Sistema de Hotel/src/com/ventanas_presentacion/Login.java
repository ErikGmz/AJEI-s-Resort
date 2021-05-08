//---Paquete---//.
package com.ventanas_presentacion;

//---Sentencias import---//.
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import com.bases_de_datos.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//---Clase pública---//.
public class Login extends javax.swing.JFrame {
    
    //---Atributos adicionales---//.
    private ImageIcon pausar;
    private ImageIcon reproducir;
    //private Image logoHotel;
    private Clip musicaFondo;
    private long tiempoMusica;
    private boolean musicaIniciada;
    
    //---Constructor---//.
    public Login() {
        initComponents();
        extraInitProcess();
               
        //Reproducir la música de fondo.
        try {  
            AudioInputStream flujo = AudioSystem.getAudioInputStream(new File("src/sounds/hotel.wav"));
            this.musicaFondo = AudioSystem.getClip();
            this.musicaFondo.open(flujo);
            this.musicaIniciada = false;
        }
        catch(Exception ex){
            System.err.println("No se pudo reproducir el archivo de sonido.");
            System.err.println("Verifique si el fichero \"hotel.wav\" se encuentra en la carpeta /sounds.");
            ex.printStackTrace();       
            this.musicaFondo = null;
        } 
    }
    
    //---Métodos sobreescritos---//.
    //-Dibujar íconos e imágenes-//.
    @Override public void paint(Graphics g) {
        super.paint(g);
                
        //Dibujar el logo del hotel.
        //g.drawImage(this.logoHotel, 60, 60, this);
    } 

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jPanelLogin = new javax.swing.JPanel();
        jPanelEntradas = new javax.swing.JPanel();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelClave = new javax.swing.JLabel();
        jPasswordFieldClave = new javax.swing.JPasswordField();
        jButtonIngresar = new javax.swing.JButton();
        jLabelMusica = new javax.swing.JLabel();
        jLabelPalmaGIzq = new javax.swing.JLabel();
        jLabelPalmaGDer = new javax.swing.JLabel();
        jLabelPiramide1 = new javax.swing.JLabel();
        jLabelIniciaSesion = new javax.swing.JLabel();
        jLabelPalmaPII1 = new javax.swing.JLabel();
        jLabelPalmaPDI = new javax.swing.JLabel();
        jLabelpiramideizq = new javax.swing.JLabel();
        jLabelPalmaPID = new javax.swing.JLabel();
        jLabelPalmaPDD1 = new javax.swing.JLabel();
        jLabelpiramideDer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");
        setResizable(false);

        jPanelBase.setBackground(new java.awt.Color(255, 235, 197));
        jPanelBase.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 204));
        jPanelLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelEntradas.setBackground(new java.awt.Color(255, 255, 153));
        jPanelEntradas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jPanelEntradas.setForeground(new java.awt.Color(153, 153, 153));

        jLabelCorreo.setFont(new java.awt.Font("Century Schoolbook", 1, 16)); // NOI18N
        jLabelCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/usuario.png"))); // NOI18N
        jLabelCorreo.setText(" Correo electrónico");

        jTextFieldCorreo.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        jTextFieldCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCorreo.setToolTipText("");
        jTextFieldCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabelClave.setFont(new java.awt.Font("Century Schoolbook", 1, 16)); // NOI18N
        jLabelClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/codigo.png"))); // NOI18N
        jLabelClave.setText(" Contraseña");

        jPasswordFieldClave.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        jPasswordFieldClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldClave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButtonIngresar.setBackground(new java.awt.Color(239, 255, 233));
        jButtonIngresar.setFont(new java.awt.Font("Century Schoolbook", 1, 16)); // NOI18N
        jButtonIngresar.setText("Ingresar al sistema");
        jButtonIngresar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonIngresar.setFocusPainted(false);
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jLabelMusica.setBackground(new java.awt.Color(223, 46, 84));
        jLabelMusica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/reproducir.png"))); // NOI18N
        jLabelMusica.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelMusica.setOpaque(true);
        jLabelMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMusicaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelEntradasLayout = new javax.swing.GroupLayout(jPanelEntradas);
        jPanelEntradas.setLayout(jPanelEntradasLayout);
        jPanelEntradasLayout.setHorizontalGroup(
            jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEntradasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPasswordFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelClave, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEntradasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelEntradasLayout.setVerticalGroup(
            jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEntradasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabelClave, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );

        jPanelEntradasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelCorreo, jPasswordFieldClave, jTextFieldCorreo});

        jPanelLogin.add(jPanelEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 290, 280));

        jLabelPalmaGIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/palma1izq .png"))); // NOI18N
        jPanelLogin.add(jLabelPalmaGIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, -1));

        jLabelPalmaGDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/palma1der.png"))); // NOI18N
        jPanelLogin.add(jLabelPalmaGDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, -1, -1));

        jLabelPiramide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/Piramide1.png"))); // NOI18N
        jPanelLogin.add(jLabelPiramide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        jLabelIniciaSesion.setBackground(new java.awt.Color(255, 255, 204));
        jLabelIniciaSesion.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabelIniciaSesion.setText("               Inicio de sesión");
        jPanelLogin.add(jLabelIniciaSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 260, 28));

        jLabelPalmaPII1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/palma2izq.png"))); // NOI18N
        jPanelLogin.add(jLabelPalmaPII1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jLabelPalmaPDI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/palma2der.png"))); // NOI18N
        jPanelLogin.add(jLabelPalmaPDI, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, -1, -1));

        jLabelpiramideizq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/Piramide2.png"))); // NOI18N
        jPanelLogin.add(jLabelpiramideizq, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jLabelPalmaPID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/palma2izq.png"))); // NOI18N
        jPanelLogin.add(jLabelPalmaPID, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, -1, -1));

        jLabelPalmaPDD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/palma2der.png"))); // NOI18N
        jPanelLogin.add(jLabelPalmaPDD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 510, -1, -1));

        jLabelpiramideDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/Piramide2.png"))); // NOI18N
        jPanelLogin.add(jLabelpiramideDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, -1, -1));

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 1104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //-Botón para desactivar o reactivar la música-//.
    private void jLabelMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicaMouseClicked
        //Validar que la música haya sido cargada correctamente.
        if(this.musicaFondo != null) {
            
            if(this.musicaIniciada) {
                //Detener la música.
                this.musicaFondo.stop();
                this.musicaIniciada = false;
                
                //Cambiar el ícono para indicar que la música está pausada.
                this.jLabelMusica.setIcon(this.reproducir);
            }
            else {
                //Iniciar la música a partir del punto exacto de la reproducción previa.
                this.musicaFondo.start();
                this.musicaFondo.loop(Clip.LOOP_CONTINUOUSLY);
                this.musicaIniciada = true;
                
                //Cambiar el ícono para indicar que la música está inicializada.
                this.jLabelMusica.setIcon(this.pausar);
            }
        }
    }//GEN-LAST:event_jLabelMusicaMouseClicked

    //-Botón para realizar el proceso de login, realizando una consulta a la base de datos.-//.
    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        try {
            //Conexión a la base de datos.
            ConexionMySQL conexion = new ConexionMySQL();

            try {
                //Consultar email's y contraseñas de los usuarios registrados.
                ResultSet consulta = conexion.consultarTabla("usuarios",
                    "email, AES_DECRYPT(password, 'key') AS passwd, user_name", "");

                String email = this.jTextFieldCorreo.getText().trim();
                String clave = String.valueOf(this.jPasswordFieldClave.getPassword());

                //Comparar el email introducido y los registrados.
                while(consulta.next()) {
                    String campo_e = consulta.getString(1);
                    String campo_c = consulta.getString(2);
                    String campo_u = consulta.getString(3);

                    if(email.equals(campo_e)) {
                        //Se verifica si la contraseña introducida es correcta.
                        if(clave.equals(campo_c)) {
                            JOptionPane.showMessageDialog(this, "Login exitoso.\n"
                                + "Bienvenido al sistema, " + campo_u + ".\n"
                                , "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        else {
                            JOptionPane.showMessageDialog(this, "Contraseña incorrecta.\n"
                                + "Reintroduzca sus datos.\n"
                                , "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                }

                //El email no fue hallado en la consulta.
                JOptionPane.showMessageDialog(this, "Email inválido.\n"
                    + "Reintroduzca sus datos.\n"
                    , "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            catch(SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "La consulta no pudo ser "
                    + "realizada.\n" + "Verifique la conexión con la base de datos.\n"
                    , "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No fue posible realizar la "
                + "conexión con la base de datos.\n" + "Verifique si el servidor "
                + "XAMPP o MySQL local se encuentra activado."
                , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    //-Método principal-//.
    /*public static void main(String args[]) {     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }*/
    
    //-Configuración adicional de ciertos componentes-//.
    private void extraInitProcess() {
        //Centrar el JFrame.
        this.setLocationRelativeTo(this);
                
        //Abrir el archivo que contiene el ícono para reproducir la música.
        this.reproducir = new ImageIcon("src/img/login/reproducir.png");
        
        //Abrir el archivo que contiene el ícono para pausar la música.
        this.pausar = new ImageIcon("src/img/login/pausar.png");
        
        //Cargar el logo del login para el JFrame.
        try {
            super.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/login/logomail.png")));
        }
        catch(Exception ex) {
            System.err.println("Error al abrir el ícono.");
            ex.printStackTrace();
        }   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabelClave;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelIniciaSesion;
    private javax.swing.JLabel jLabelMusica;
    private javax.swing.JLabel jLabelPalmaGDer;
    private javax.swing.JLabel jLabelPalmaGIzq;
    private javax.swing.JLabel jLabelPalmaPDD1;
    private javax.swing.JLabel jLabelPalmaPDI;
    private javax.swing.JLabel jLabelPalmaPID;
    private javax.swing.JLabel jLabelPalmaPII1;
    private javax.swing.JLabel jLabelPiramide1;
    private javax.swing.JLabel jLabelpiramideDer;
    private javax.swing.JLabel jLabelpiramideizq;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelEntradas;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordFieldClave;
    private javax.swing.JTextField jTextFieldCorreo;
    // End of variables declaration//GEN-END:variables

}