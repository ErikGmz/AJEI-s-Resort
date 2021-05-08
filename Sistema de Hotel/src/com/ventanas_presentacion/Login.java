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
        jLabelMusica = new javax.swing.JLabel();
        jPanelLogin = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelImagen = new javax.swing.JLabel();
        jPanelEntradas = new javax.swing.JPanel();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelClave = new javax.swing.JLabel();
        jPasswordFieldClave = new javax.swing.JPasswordField();
        jButtonIngresar = new javax.swing.JButton();
        jPanelHotel = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelNombreHotel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");
        setResizable(false);

        jPanelBase.setBackground(new java.awt.Color(255, 235, 197));
        jPanelBase.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));

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

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabelTitulo.setBackground(new java.awt.Color(64, 76, 144));
        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Inicio de sesión");
        jLabelTitulo.setOpaque(true);

        jLabelImagen.setBackground(new java.awt.Color(64, 76, 144));
        jLabelImagen.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabelImagen.setForeground(new java.awt.Color(255, 255, 255));
        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen.setOpaque(true);

        jPanelEntradas.setBackground(new java.awt.Color(251, 238, 255));
        jPanelEntradas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        jLabelCorreo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/usuario.png"))); // NOI18N
        jLabelCorreo.setText(" Correo electrónico");

        jTextFieldCorreo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCorreo.setToolTipText("");
        jTextFieldCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabelClave.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/codigo.png"))); // NOI18N
        jLabelClave.setText(" Contraseña");

        jPasswordFieldClave.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPasswordFieldClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldClave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButtonIngresar.setBackground(new java.awt.Color(239, 255, 233));
        jButtonIngresar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonIngresar.setText("Ingresar al sistema");
        jButtonIngresar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButtonIngresar.setFocusPainted(false);
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEntradasLayout = new javax.swing.GroupLayout(jPanelEntradas);
        jPanelEntradas.setLayout(jPanelEntradasLayout);
        jPanelEntradasLayout.setHorizontalGroup(
            jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEntradasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPasswordFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanelEntradasLayout.setVerticalGroup(
            jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEntradasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelClave, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanelEntradasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelCorreo, jPasswordFieldClave, jTextFieldCorreo});

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanelEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanelEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setText("Logo del hotel");
        jLabelLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelNombreHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreHotel.setText("AJEI Resort");

        javax.swing.GroupLayout jPanelHotelLayout = new javax.swing.GroupLayout(jPanelHotel);
        jPanelHotel.setLayout(jPanelHotelLayout);
        jPanelHotelLayout.setHorizontalGroup(
            jPanelHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHotelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(jLabelNombreHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanelHotelLayout.setVerticalGroup(
            jPanelHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHotelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNombreHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addComponent(jPanelHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMusica;
    private javax.swing.JLabel jLabelNombreHotel;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelEntradas;
    private javax.swing.JPanel jPanelHotel;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordFieldClave;
    private javax.swing.JTextField jTextFieldCorreo;
    // End of variables declaration//GEN-END:variables

}