//---Paquete---//.
package com.operaciones.consultas;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//---Clase pública---//.
public class HabitacionesDisponibles extends javax.swing.JInternalFrame {
 
    //---Constructor---//.
    public HabitacionesDisponibles() {
        initComponents();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jLabelBuscar = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jTextFieldHabitacion = new javax.swing.JTextField();
        jLabelResultado = new javax.swing.JLabel();
        jLabelHabitacion = new javax.swing.JLabel();
        jButtonBusqueda = new javax.swing.JButton();
        jTextFieldResultado = new javax.swing.JTextField();

        jLabelBuscar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBuscar.setText("Buscar habitación");

        jButtonRegresar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonRegresar.setText("Regresar al menú principal");
        jButtonRegresar.setFocusPainted(false);
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jTextFieldHabitacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldHabitacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHabitacionKeyTyped(evt);
            }
        });

        jLabelResultado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultado.setText("Resultado de la búsqueda");

        jLabelHabitacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitacion.setText("Número de habitación");

        jButtonBusqueda.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonBusqueda.setText("Realizar búsqueda");
        jButtonBusqueda.setFocusPainted(false);
        jButtonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaActionPerformed(evt);
            }
        });

        jTextFieldResultado.setEditable(false);
        jTextFieldResultado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldResultado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldResultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldResultadoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelHabitacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(jTextFieldHabitacion, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(jTextFieldResultado)
                    .addComponent(jButtonRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jButtonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButtonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256)
                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
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

     //-A partir de la información de la base de datos, se verifica si hay, o no, un huésped que reservó una habitación específica-//.
    private void jButtonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaActionPerformed
        if(this.jTextFieldHabitacion.getText().length() > 0) {
            ConexionMySQL conexion = null;
            
            try {
                //Conexión a la base de datos.
                conexion = new ConexionMySQL();
            
                try {
                    String habitacion = this.jTextFieldHabitacion.getText().trim();
                
                    //Consultar en la base de datos si la habitación está reservada o no.
                    ResultSet consulta = conexion.consultarTabla("huespedes",
                    "name", " WHERE room_id = '" + habitacion + "' AND active = 1 LIMIT 1");

                    //Se verifica si la habitación está reservada.
                    if(consulta.next()) {
                        this.jTextFieldResultado.setText("Reservada por " + consulta.getString("name"));
                    }
                    else {
                        try {
                            int numero = Integer.parseInt(habitacion);
                        
                            if(numero <= 215 && numero >= 201) {
                                this.jTextFieldResultado.setText("Habitación disponible (segundo piso)");
                            }
                            else if(numero <= 115 && numero >= 101) {
                                this.jTextFieldResultado.setText("Habitación disponible (primer piso)");
                            }
                            else {
                                this.jTextFieldResultado.setText("Habitación inexistente");
                            }
                        }
                        catch(NumberFormatException ex) {
                            JOptionPane.showMessageDialog(this, "La entrada es inválida.\n"
                            + "Solo es posible introducir números."
                            , "Error", JOptionPane.ERROR_MESSAGE);
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
        else {
            JOptionPane.showMessageDialog(this, "Es necesario introducir "
            + "el número de la habitación a buscar."
            , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBusquedaActionPerformed

    //-Evento para verificar que la búsqueda de la habitación no exceda los 3 caracteres-//.
    private void jTextFieldHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHabitacionKeyTyped
        if(this.jTextFieldHabitacion.getText().length() > 2) {
            evt.consume();
        }
        else {
            this.jTextFieldResultado.setText("");
        }
    }//GEN-LAST:event_jTextFieldHabitacionKeyTyped

    private void jTextFieldResultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldResultadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldResultadoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBusqueda;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelHabitacion;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JTextField jTextFieldHabitacion;
    private javax.swing.JTextField jTextFieldResultado;
    // End of variables declaration//GEN-END:variables
}