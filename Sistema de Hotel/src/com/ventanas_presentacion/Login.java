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
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//---Clase pública---//.
public class Login extends javax.swing.JFrame implements Runnable {

    //---Atributos adicionales---//.
    private Image logoHotel;
    private Image sloganHotel;
    private Image piramide;
    private Image palmeraIzquierda;
    private Image palmeraDerecha;
    private Clip musicaFondo;
    private Clip sonidoError;
    private boolean musicaIniciada;

    //---Constructor---//.
    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    //---Constructor con argumentos---//.
    public Login(Clip musicaFondo, boolean musicaIniciada) {
        this.musicaFondo = musicaFondo;
        this.musicaIniciada = musicaIniciada;
        initComponents();
        this.setLocationRelativeTo(this);
    }

    //---Métodos sobreescritos---//.
    //-Dibujar íconos e imágenes-//.
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //Dibujar el logo del hotel.
        g.drawImage(this.logoHotel, this.jPanelEntradas.getX() - 290, this.jPanelEntradas.getY() + 50, this);
        g.drawImage(this.logoHotel, this.jPanelEntradas.getX() + 446, this.jPanelEntradas.getY() + 50, this);
        
        //Dibujar los slogans del hotel.
        g.drawImage(this.sloganHotel, this.jPanelEntradas.getX() - 385, this.jPanelEntradas.getY() + 300, this);
        g.drawImage(this.sloganHotel, this.jPanelEntradas.getX() + 346, this.jPanelEntradas.getY() + 300, this);
        
        //Dibujar las pirámides.
        g.drawImage(this.piramide, this.jPanelEntradas.getX() - 315, this.jPanelEntradas.getY() + 100, this);
        g.drawImage(this.piramide, this.jPanelEntradas.getWidth() + this.jPanelEntradas.getX() + 76, this.jPanelEntradas.getY() + 100, this);
        
        //Dibujar las palmeras izquierdas.
        g.drawImage(this.palmeraIzquierda, this.jPanelEntradas.getX() - 380, this.jPanelEntradas.getY() + 185, this);
        g.drawImage(this.palmeraIzquierda, this.jPanelEntradas.getX() + 351, this.jPanelEntradas.getY() + 185, this);
        
        //Dibujar las palmeras derechas.
        g.drawImage(this.palmeraDerecha, this.jPanelEntradas.getX() - 150, this.jPanelEntradas.getY() + 185, this);
        g.drawImage(this.palmeraDerecha, this.jPanelEntradas.getX() + 581, this.jPanelEntradas.getY() + 185, this);
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabelConfiguracion = new javax.swing.JLabel();
        jLabelMusica = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");
        setResizable(false);

        jPanelLogin.setBackground(new java.awt.Color(255, 232, 205));

        jPanelEntradas.setBackground(new java.awt.Color(255, 186, 106));
        jPanelEntradas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jPanelEntradas.setForeground(new java.awt.Color(153, 153, 153));

        jLabelLogin.setBackground(new java.awt.Color(175, 87, 0));
        jLabelLogin.setFont(new java.awt.Font("Century Schoolbook", 1, 28)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogin.setText("Inicio de sesión");
        jLabelLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jLabelLogin.setOpaque(true);

        jPanelRedes.setBackground(new java.awt.Color(175, 87, 0));
        jPanelRedes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanelRedesLayout = new javax.swing.GroupLayout(jPanelRedes);
        jPanelRedes.setLayout(jPanelRedesLayout);
        jPanelRedesLayout.setHorizontalGroup(
            jPanelRedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelRedesLayout.setVerticalGroup(
            jPanelRedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        jButtonIngresar.setBackground(new java.awt.Color(255, 186, 106));
        jButtonIngresar.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jButtonIngresar.setText("Ingresar a AJEI's Business");
        jButtonIngresar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonIngresar.setContentAreaFilled(false);
        jButtonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIngresar.setFocusPainted(false);
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

        jPanelCampos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(137, 95, 20), 2, true), "Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Schoolbook", 1, 12), new java.awt.Color(137, 95, 20))); // NOI18N
        jPanelCampos.setOpaque(false);

        jLabelCorreo.setFont(new java.awt.Font("Century Schoolbook", 1, 17)); // NOI18N
        jLabelCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/correo.png"))); // NOI18N
        jLabelCorreo.setText(" Correo electrónico");

        jTextFieldCorreo.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jTextFieldCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCorreo.setToolTipText("");
        jTextFieldCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabelClave.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabelClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/key.png"))); // NOI18N
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
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCamposLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPasswordFieldClave)
                    .addComponent(jLabelClave, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanelCamposLayout.setVerticalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelClave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanelCamposLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPasswordFieldClave, jTextFieldCorreo});

        javax.swing.GroupLayout jPanelEntradasLayout = new javax.swing.GroupLayout(jPanelEntradas);
        jPanelEntradas.setLayout(jPanelEntradasLayout);
        jPanelEntradasLayout.setHorizontalGroup(
            jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelEntradasLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
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

        jLabelConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/cogwheel.png"))); // NOI18N
        jLabelConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConfiguracionMouseClicked(evt);
            }
        });

        jLabelMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/musicOff.png"))); // NOI18N
        jLabelMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMusicaMouseClicked(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(255, 186, 106));
        jButtonSalir.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jButtonSalir.setText("Salir del sistema");
        jButtonSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.setFocusPainted(false);
        jButtonSalir.setOpaque(true);
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseExited(evt);
            }
        });
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelConfiguracion)
                    .addComponent(jLabelMusica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 863, Short.MAX_VALUE)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(jPanelEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jPanelEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabelMusica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelConfiguracion)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-Botón para realizar el proceso de login, realizando una consulta a la base de datos-//.
    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        ConexionMySQL conexion = null;
        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();

            try {
                String email = this.jTextFieldCorreo.getText().trim();
                String clave = String.valueOf(this.jPasswordFieldClave.getPassword());

                //Consultar email's y contraseñas de los usuarios registrados.
                ResultSet consulta = conexion.consultarTabla("usuarios",
                "AES_DECRYPT(password, 'key') AS passwd, user_name", " WHERE email = '" + email + "' LIMIT 1");

                //Verificar si el email fue encontrado.
                if(consulta.next()) {
                    String campo_c = consulta.getString(1);
                    String campo_u = consulta.getString(2);

                    //Se verifica si la contraseña introducida es correcta.
                    if(clave.equals(campo_c)) {
                        JOptionPane.showMessageDialog(this, "Login exitoso.\n"
                        + "Bienvenido al sistema, " + campo_u + ".\n", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        
                        this.dispose();              
                        Index index = new Index(this.musicaFondo, this.musicaIniciada);
                        Thread t = new Thread(index);
                        t.start();
                        index.setVisible(true);
                    } 
                    else {
                        this.sonidoError.setMicrosecondPosition(0);
                        this.sonidoError.start();
                        JOptionPane.showMessageDialog(this, "Contraseña incorrecta.\n"
                        + "Reintroduzca sus datos.\n", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } 
                else {
                    //El email no fue hallado en la consulta.
                    this.sonidoError.setMicrosecondPosition(0);
                    this.sonidoError.start();
                    JOptionPane.showMessageDialog(this, "Email inválido.\n"
                    + "Reintroduzca sus datos.\n", "Error", JOptionPane.ERROR_MESSAGE);
                    this.sonidoError.stop();
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
            if (conexion != null) {
                conexion.cerrarConexion();
            }
        }
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    //-Se despliega u oculta el ícono de la música-//.
    private void jLabelConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConfiguracionMouseClicked
        //Se verificar si el ícono del sonido está visible o no.
        if(this.jLabelMusica.getX() >= 5) {
            Animacion.Animacion.mover_izquierda(this.jLabelMusica.getX(), -50, 2, 2, this.jLabelMusica);
        } 
        else {
            Animacion.Animacion.mover_derecha(this.jLabelMusica.getX(), 10, 2, 2, this.jLabelMusica);
        }
    }//GEN-LAST:event_jLabelConfiguracionMouseClicked

    //-Se gestiona la reproducción de la música-//.
    private void jLabelMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicaMouseClicked
        if(this.musicaFondo != null) {
            if(this.musicaIniciada) {
                //Detener la música.
                this.musicaFondo.stop();
                this.musicaIniciada = false;

                //Cambiar el ícono para indicar que la música está pausada.
                this.jLabelMusica.setIcon(new ImageIcon(getClass().getResource("/img/login/musicOff.png")));
            } 
            else {
                //Iniciar la música a partir del punto exacto de la reproducción previa.
                this.musicaFondo.start();
                this.musicaFondo.loop(Clip.LOOP_CONTINUOUSLY);
                this.musicaIniciada = true;

                //Cambiar el ícono para indicar que la música está inicializada.
                this.jLabelMusica.setIcon(new ImageIcon(getClass().getResource("/img/login/musicOn.png")));
            }
        }
    }//GEN-LAST:event_jLabelMusicaMouseClicked

    //-Indicar que el cursor se ha posicionado en el menú para iniciar sesión-//.
    private void jButtonIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresarMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonIngresar.setBackground(color);
    }//GEN-LAST:event_jButtonIngresarMouseEntered

    //-Indicar que el cursor dejó de posicionarse en el menú para iniciar sesión-//.
    private void jButtonIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresarMouseExited
        Color color = new Color(Integer.parseInt("FFBA6A", 16));
        this.jButtonIngresar.setBackground(color);
    }//GEN-LAST:event_jButtonIngresarMouseExited

    //-Finalizar la ejecución de todo el sistema-//.
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        if(JOptionPane.showConfirmDialog(this, "¿Desea finalizar el sistema?"
        , "Confirmación", JOptionPane.OK_CANCEL_OPTION) == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSalirActionPerformed

    //-Indicar que el cursor se ha posicionado en el botón para finalizar el sistema-//.
    private void jButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonSalir.setBackground(color);
    }//GEN-LAST:event_jButtonSalirMouseEntered

    //-Indicar que el cursor dejó de posicionarse en el menú para finalizar el sistema-//.
    private void jButtonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseExited
        Color color = new Color(Integer.parseInt("FFBA6A", 16));
        this.jButtonSalir.setBackground(color);
    }//GEN-LAST:event_jButtonSalirMouseExited

    //-Configuración adicional de ciertos componentes-//.
    private void extraInitProcess() {
        ImageIcon icono;
        
        //Centrar el JFrame.
        this.setLocationRelativeTo(this);

        //Abrir el archivo que contiene el logotipo del hotel.
        icono = new ImageIcon("src/img/login/screen/logoHotel.png");
        this.logoHotel = icono.getImage();
        
        //Abrir el archivo que contiene la imagen del slogan del hotel.
        icono = new ImageIcon("src/img/login/screen/sloganHotel.png");
        this.sloganHotel = icono.getImage();
        
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
            super.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/login/user.png")));
        } 
        catch (Exception ex) {
            System.err.println("Error al abrir el ícono.");
            ex.printStackTrace();
        }

        //Cargar la música de fondo.
        if(this.musicaFondo == null) {
            try {
                AudioInputStream flujo = AudioSystem.getAudioInputStream(new File("src/sounds/hotel.wav"));
                this.musicaFondo = AudioSystem.getClip();
                this.musicaFondo.open(flujo);
                this.musicaIniciada = false;
            } 
            catch (Exception ex) {
                System.err.println("No se pudo cargar la música de fondo.");
                System.err.println("Verifique si el fichero \"hotel.wav\" se encuentra en la carpeta /sounds.");
                ex.printStackTrace();
                this.musicaFondo = null;
            }
        }
        
        //Cambiar el tipo de ícono de la música, según sea el caso.
        if(this.musicaFondo != null) {
            if(this.musicaIniciada) {
                this.jLabelMusica.setIcon(new ImageIcon(getClass().getResource("/img/login/musicOn.png")));
            }
            else {
                this.jLabelMusica.setIcon(new ImageIcon(getClass().getResource("/img/login/musicOff.png")));
            }
        }
        
        //Cargar el sonido para notificar un error durante el login.
        try {
            AudioInputStream flujo = AudioSystem.getAudioInputStream(new File("src/sounds/error.wav"));
            this.sonidoError = AudioSystem.getClip();
            this.sonidoError.open(flujo);
        } 
        catch(Exception ex) {
            System.err.println("No se pudo cargar el sonido para notificar errores.");
            System.err.println("Verifique si el fichero \"error.wav\" se encuentra en la carpeta /sounds.");
            ex.printStackTrace();
        }
        this.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelClave;
    private javax.swing.JLabel jLabelConfiguracion;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelMusica;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JPanel jPanelEntradas;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelRedes;
    private javax.swing.JPasswordField jPasswordFieldClave;
    private javax.swing.JTextField jTextFieldCorreo;
    // End of variables declaration//GEN-END:variables

    //-Método para la ejecución del hilo-//.
    @Override public void run() {
        this.extraInitProcess();
    }

}