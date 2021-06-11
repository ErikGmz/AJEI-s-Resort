//---Paquete---//.
package com.operaciones;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import com.clases_auxiliares.Imagen;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//---Clase pública---//.
public class Inicio extends javax.swing.JInternalFrame {

    //---Atributos adicionales---//.
    private ArrayList<Imagen> imagenes = new ArrayList<>();
    private int indiceActual = 0;
    
    //---Constructor---//.
    public Inicio() {
        initComponents();
        extraInitProcess();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInicio = new javax.swing.JPanel();
        jPanelGaleria = new javax.swing.JPanel();
        jButtonRegresar = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        jPanelImagenes = new javax.swing.JPanel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelImagenActual = new javax.swing.JLabel();
        jPanelLogoHotel = new javax.swing.JPanel();
        jLabelLogoHotel1 = new javax.swing.JLabel();
        jLabelLogoHotel = new javax.swing.JLabel();
        jLabelUbicacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jPanelInicio.setBackground(new java.awt.Color(255, 232, 205));

        jPanelGaleria.setBackground(new java.awt.Color(255, 163, 51));

        jButtonRegresar.setBackground(new java.awt.Color(228, 130, 0));
        jButtonRegresar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/left-arrows.png"))); // NOI18N
        jButtonRegresar.setBorder(null);
        jButtonRegresar.setBorderPainted(false);
        jButtonRegresar.setContentAreaFilled(false);
        jButtonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegresar.setFocusPainted(false);
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

        jButtonSiguiente.setBackground(new java.awt.Color(228, 130, 0));
        jButtonSiguiente.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/right-arrows.png"))); // NOI18N
        jButtonSiguiente.setBorder(null);
        jButtonSiguiente.setBorderPainted(false);
        jButtonSiguiente.setContentAreaFilled(false);
        jButtonSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSiguiente.setFocusPainted(false);
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

        jPanelImagenes.setBackground(new java.awt.Color(255, 232, 205));

        jLabelDescripcion.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(175, 87, 0));
        jLabelDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelImagenesLayout = new javax.swing.GroupLayout(jPanelImagenes);
        jPanelImagenes.setLayout(jPanelImagenesLayout);
        jPanelImagenesLayout.setHorizontalGroup(
            jPanelImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImagenesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(jLabelImagenActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelImagenesLayout.setVerticalGroup(
            jPanelImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagenesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImagenActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelLogoHotel.setBackground(new java.awt.Color(255, 232, 205));

        jLabelLogoHotel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/logoHotel.png"))); // NOI18N

        javax.swing.GroupLayout jPanelLogoHotelLayout = new javax.swing.GroupLayout(jPanelLogoHotel);
        jPanelLogoHotel.setLayout(jPanelLogoHotelLayout);
        jPanelLogoHotelLayout.setHorizontalGroup(
            jPanelLogoHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoHotelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogoHotel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLogoHotelLayout.setVerticalGroup(
            jPanelLogoHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoHotelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabelLogoHotel1)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelGaleriaLayout = new javax.swing.GroupLayout(jPanelGaleria);
        jPanelGaleria.setLayout(jPanelGaleriaLayout);
        jPanelGaleriaLayout.setHorizontalGroup(
            jPanelGaleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGaleriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLogoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanelGaleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelGaleriaLayout.createSequentialGroup()
                        .addComponent(jButtonRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelGaleriaLayout.setVerticalGroup(
            jPanelGaleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGaleriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGaleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelLogoHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelGaleriaLayout.createSequentialGroup()
                        .addComponent(jPanelImagenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelGaleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabelLogoHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/index/logo.png"))); // NOI18N

        jLabelUbicacion.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabelUbicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/placeholder.png"))); // NOI18N
        jLabelUbicacion.setText(" Blvrd Riviera AJEI 254, Nuevo Vallarta, Nayarit");
        jLabelUbicacion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/phone.png"))); // NOI18N
        jLabel1.setText("322 226 4000");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelGaleria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInicioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUbicacion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLogoHotel)))
                .addContainerGap())
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLogoHotel)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelUbicacion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelGaleria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-Indicar que el cursor se ha posicionado en la flecha izquierda-//.
    private void jButtonRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonRegresar.setBackground(color);
    }//GEN-LAST:event_jButtonRegresarMouseEntered

    //-Indicar que el cursor dejó de posicionarse en la flecha izquierda-//.
    private void jButtonRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonRegresar.setBackground(color);
    }//GEN-LAST:event_jButtonRegresarMouseExited

    //-Mostrar la imagen anterior de la lista-//.
    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        this.indiceActual--;
        if(this.indiceActual < 0) this.indiceActual = 15;
        
        //Establecer la imagen y descripción actuales.
        this.jLabelDescripcion.setText(this.imagenes.get(this.indiceActual).getDescripcion());
        this.jLabelImagenActual.setIcon(this.imagenes.get(this.indiceActual).getImagen());
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    //-Indicar que el cursor se ha posicionado en la flecha derecha-//.
    private void jButtonSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSiguienteMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonSiguiente.setBackground(color);
    }//GEN-LAST:event_jButtonSiguienteMouseEntered

    //-Indicar que el cursor dejó de posicionarse en la flecha derecha-//.
    private void jButtonSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSiguienteMouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonSiguiente.setBackground(color);
    }//GEN-LAST:event_jButtonSiguienteMouseExited

    //-Mostrar la siguiente imagen de la lista-//.
    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        this.indiceActual++;
        if(this.indiceActual > 15) this.indiceActual = 0;
        
        //Establecer la imagen y descripción actuales.
        this.jLabelDescripcion.setText(this.imagenes.get(this.indiceActual).getDescripcion());
        this.jLabelImagenActual.setIcon(this.imagenes.get(this.indiceActual).getImagen());
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    //-En un ArrayList se almacenan todas las imágenes de la base de datos-//.
    private void extraInitProcess() {
        ConexionMySQL conexion = null;
        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();
            
            try {
                //Consultar en la base de datos las imágenes de la galería.
                ResultSet resultados = conexion.consultarTabla("galeria", 
                "description, image_path", "");

                //Almacenar las imágenes.
                while(resultados.next()) {
                    ImageIcon imagen = new ImageIcon(resultados.getString("image_path"));
                    this.imagenes.add(new Imagen(resultados.getString("description"),
                    new ImageIcon(imagen.getImage().getScaledInstance(580, 287, 0))));
                }            
                
                //Establecer la imagen y descripción actuales.
                this.jLabelDescripcion.setText(this.imagenes.get(this.indiceActual).getDescripcion());
                this.jLabelImagenActual.setIcon(this.imagenes.get(this.indiceActual).getImagen());
            }
            catch(SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ocurrió un error durante la "
                + "realización de la consulta.\nSQLException: " + ex.getMessage()
                + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                "Error", JOptionPane.ERROR_MESSAGE);
            }       
        } 
        catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No fue posible realizar la "
            + "conexión con la base de datos.\n" + "Verifique si el servidor "
            + "XAMPP o MySQL local se encuentra activado."
            , "Error", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            if(conexion != null) conexion.cerrarConexion();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelImagenActual;
    private javax.swing.JLabel jLabelLogoHotel;
    private javax.swing.JLabel jLabelLogoHotel1;
    private javax.swing.JLabel jLabelUbicacion;
    private javax.swing.JPanel jPanelGaleria;
    private javax.swing.JPanel jPanelImagenes;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelLogoHotel;
    // End of variables declaration//GEN-END:variables
}