//---Paquete---//.
package com.operaciones.consultas;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import com.clases_auxiliares.Imagen;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//---Clase pública---//.
public class Galeria extends javax.swing.JInternalFrame {
 
    //---Atributos adicionales---//.
    private ArrayList<Imagen> imagenes = new ArrayList<>();
    private int indiceActual = 0;
    
    //---Constructor---//.
    public Galeria() {
        initComponents();
        extraInitProcess();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jLabelGaleria = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        jLabelImagenActual = new javax.swing.JLabel();
        jButtonAnterior = new javax.swing.JButton();
        jLabelDescripcion = new javax.swing.JLabel();

        jLabelGaleria.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelGaleria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGaleria.setText("Galería de fotos");

        jButtonRegresar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonRegresar.setText("Regresar al menú principal");
        jButtonRegresar.setFocusPainted(false);
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jButtonSiguiente.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonSiguiente.setText("Siguiente imagen");
        jButtonSiguiente.setFocusPainted(false);
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jLabelImagenActual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonAnterior.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonAnterior.setText("Imagen anterior");
        jButtonAnterior.setFocusPainted(false);
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jLabelDescripcion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGaleria, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelImagenActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGaleria, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelImagenActual, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-Regresar al menú principal-//.
    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    //-Mostrar la siguiente imagen de la lista-//.
    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        this.indiceActual++;
        if(this.indiceActual > 9) this.indiceActual = 0;
        
        //Establecer la imagen y descripción actuales.
        this.jLabelDescripcion.setText(this.imagenes.get(this.indiceActual).getDescripcion());
        this.jLabelImagenActual.setIcon(this.imagenes.get(this.indiceActual).getImagen());
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    //-Mostrar la imagen anterior de la lista-//.
    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        this.indiceActual--;
        if(this.indiceActual < 0) this.indiceActual = 9;
        
        //Establecer la imagen y descripción actuales.
        this.jLabelDescripcion.setText(this.imagenes.get(this.indiceActual).getDescripcion());
        this.jLabelImagenActual.setIcon(this.imagenes.get(this.indiceActual).getImagen());
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

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
                    new ImageIcon(imagen.getImage().getScaledInstance(446, 316, 0))));
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
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelGaleria;
    private javax.swing.JLabel jLabelImagenActual;
    private javax.swing.JPanel jPanelBase;
    // End of variables declaration//GEN-END:variables
}