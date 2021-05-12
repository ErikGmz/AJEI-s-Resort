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
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//---Clase pública---//.
public class Login extends javax.swing.JFrame {
    
    //---Atributos adicionales---//.
    private ImageIcon pausar;
    private ImageIcon reproducir;
    //private Image logoHotel;
    private Image piramide;
    private Image palmeraIzquierda;
    private Image palmeraDerecha;
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
        
        //Dibujar la pirámide.
        g.drawImage(this.piramide, 92, 313, this);
        
        //Dibujar la palmera izquierda.
        g.drawImage(this.palmeraIzquierda, 22, 396, this);
        
        //Dibujar la palmera derecha.
        g.drawImage(this.palmeraDerecha, 262, 396, this);
    } 

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jPanelLogin = new javax.swing.JPanel();
        jPanelEntradas = new javax.swing.JPanel();
        jLabelLogin = new javax.swing.JLabel();
        jPanelRedes = new javax.swing.JPanel();
        jButtonIngresar = new javax.swing.JButton();
        jPanelCampos = new javax.swing.JPanel();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelClave = new javax.swing.JLabel();
        jPasswordFieldClave = new javax.swing.JPasswordField();
        jLabelMusica = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");
        setResizable(false);

        jPanelBase.setBackground(new java.awt.Color(255, 250, 224));
        jPanelBase.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        jPanelLogin.setBackground(new java.awt.Color(255, 238, 221));
        jPanelLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(150, 150, 150), 2, true));

        jPanelEntradas.setBackground(new java.awt.Color(255, 242, 250));
        jPanelEntradas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanelEntradas.setForeground(new java.awt.Color(153, 153, 153));

        jLabelLogin.setBackground(new java.awt.Color(186, 33, 56));
        jLabelLogin.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogin.setText("Inicio de sesión");
        jLabelLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jLabelLogin.setOpaque(true);

        jPanelRedes.setBackground(new java.awt.Color(193, 71, 26));
        jPanelRedes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanelRedesLayout = new javax.swing.GroupLayout(jPanelRedes);
        jPanelRedes.setLayout(jPanelRedesLayout);
        jPanelRedesLayout.setHorizontalGroup(
            jPanelRedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanelRedesLayout.setVerticalGroup(
            jPanelRedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        jButtonIngresar.setBackground(new java.awt.Color(224, 253, 227));
        jButtonIngresar.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jButtonIngresar.setText("Ingresar a AJEI's Business");
        jButtonIngresar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonIngresar.setFocusPainted(false);
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jPanelCampos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(137, 95, 20), 2, true), "Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Schoolbook", 1, 12), new java.awt.Color(137, 95, 20))); // NOI18N
        jPanelCampos.setOpaque(false);

        jLabelCorreo.setFont(new java.awt.Font("Century Schoolbook", 1, 17)); // NOI18N
        jLabelCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/user/logomail.png"))); // NOI18N
        jLabelCorreo.setText(" Correo electrónico");

        jTextFieldCorreo.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jTextFieldCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCorreo.setToolTipText("");
        jTextFieldCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabelClave.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabelClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/user/codigo.png"))); // NOI18N
        jLabelClave.setText(" Contraseña");

        jPasswordFieldClave.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jPasswordFieldClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldClave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanelCamposLayout = new javax.swing.GroupLayout(jPanelCampos);
        jPanelCampos.setLayout(jPanelCamposLayout);
        jPanelCamposLayout.setHorizontalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCorreo)
                    .addComponent(jLabelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCamposLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPasswordFieldClave)
                    .addComponent(jLabelClave, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanelCamposLayout.setVerticalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelClave, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanelCamposLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelCorreo, jTextFieldCorreo});

        javax.swing.GroupLayout jPanelEntradasLayout = new javax.swing.GroupLayout(jPanelEntradas);
        jPanelEntradas.setLayout(jPanelEntradasLayout);
        jPanelEntradasLayout.setHorizontalGroup(
            jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelEntradasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEntradasLayout.setVerticalGroup(
            jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEntradasLayout.createSequentialGroup()
                .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanelRedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabelMusica.setBackground(new java.awt.Color(223, 46, 84));
        jLabelMusica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/user/reproducir.png"))); // NOI18N
        jLabelMusica.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabelMusica.setOpaque(true);
        jLabelMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMusicaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 455, Short.MAX_VALUE)
                .addComponent(jPanelEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    public static void main(String args[]) {     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    //-Configuración adicional de ciertos componentes-//.
    private void extraInitProcess() {
        ImageIcon icono;
        
        //Centrar el JFrame.
        this.setLocationRelativeTo(this);
                
        //Abrir el archivo que contiene el ícono para reproducir la música.
        this.reproducir = new ImageIcon("src/img/login/user/reproducir.png");
        
        //Abrir el archivo que contiene el ícono para pausar la música.
        this.pausar = new ImageIcon("src/img/login/user/pausar.png");
        
        //Abrir el archivo que contiene el logotipo del hotel.
        //ImageIcon icono = new ImageIcon("src/img/login/logohotel.png");
        //this.logoHotel = icono.getImage();
        
        //Abrir el archivo que contiene la imagen de una pirámide.
        icono = new ImageIcon("src/img/login/screen/piramide.png");
        this.piramide = icono.getImage();
        
        //Abrir el archivo que contiene la imagen de una palmera orientada hacia la derecha.
        icono = new ImageIcon("src/img/login/screen/palmaizq.png");
        this.palmeraIzquierda = icono.getImage();
        
        //Abrir el archivo que contiene la imagen de una palmera orientada hacia la izquierda.
        icono = new ImageIcon("src/img/login/screen/palmader.png");
        this.palmeraDerecha = icono.getImage();
        
        //Cargar el logo del login para el JFrame.
        try {
            super.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/login/usuario.png")));
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
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelMusica;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JPanel jPanelEntradas;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelRedes;
    private javax.swing.JPasswordField jPasswordFieldClave;
    private javax.swing.JTextField jTextFieldCorreo;
    // End of variables declaration//GEN-END:variables

}