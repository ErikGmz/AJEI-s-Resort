//---Paquete---//.
package com.operaciones.consultas;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//---Clase pública---//.
public class ConsultarHuesped extends javax.swing.JInternalFrame {
 
    //---Constructor---//.
    public ConsultarHuesped() {
        initComponents();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jLabelBuscar = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelResultados = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultados = new javax.swing.JTextArea();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabelHuesped2 = new javax.swing.JLabel();
        jButtonBusqueda = new javax.swing.JButton();

        jLabelBuscar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBuscar.setText("Buscar huésped");

        jButtonRegresar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonRegresar.setText("Regresar al menú principal");
        jButtonRegresar.setFocusPainted(false);
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jTextFieldNombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jLabelResultados.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelResultados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultados.setText("Resultados de la búsqueda");

        jLabelNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("Nombre");

        jTextAreaResultados.setEditable(false);
        jTextAreaResultados.setColumns(20);
        jTextAreaResultados.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextAreaResultados.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultados);

        jTextFieldApellido.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });

        jLabelHuesped2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelHuesped2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHuesped2.setText("Primer apellido");

        jButtonBusqueda.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonBusqueda.setText("Realizar búsqueda");
        jButtonBusqueda.setFocusPainted(false);
        jButtonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaActionPerformed(evt);
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
                    .addComponent(jButtonBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHuesped2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(jLabelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabelHuesped2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(jButtonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
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

     //-A partir de la información de la base de datos, se muestran las habitaciones reservadas por un huésped-//.
    private void jButtonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaActionPerformed
        if(this.jTextFieldNombre.getText().length() > 0 && this.jTextFieldApellido.getText().length() > 0) {
            ConexionMySQL conexion = null;
            ArrayList<String> listaHabitaciones = new ArrayList<>();
        
            try {
                //Conexión a la base de datos.
                conexion = new ConexionMySQL();
            
                try {
                    String nombreCompleto = this.jTextFieldNombre.getText().trim() + " "
                    + this.jTextFieldApellido.getText().trim();
                
                    //Consultar en la base de datos las habitaciones reservadas por un huésped.
                    ResultSet consulta = conexion.consultarTabla("huespedes",
                    "room_id", " WHERE name = '" + nombreCompleto + "' AND active = 1");

                    //Se genera una lista de todas las habitaciones reservadas por el huésped.
                    while(consulta.next()) {
                        listaHabitaciones.add(Integer.toString(consulta.getInt("room_id")));
                    }
                
                    //Se verifica si el huésped reservó habitaciones.
                    if(!listaHabitaciones.isEmpty()) {
                        this.jTextAreaResultados.append("Nombre del huésped: " + nombreCompleto + ".\n\n");
                    
                        for(String idHabitacion : listaHabitaciones) {
                            this.jTextAreaResultados.append("Número de habitación: " + idHabitacion + ".\n");
                        
                            //Se indica que la habitación pertenece al primer o segundo piso.
                            if(idHabitacion.charAt(0) == '1') {
                                this.jTextAreaResultados.append("Piso número 1.\n\n");
                            }
                            else {
                                this.jTextAreaResultados.append("Piso número 2.\n\n"); 
                            }
                        }
                    }
                    else {
                        this.jTextAreaResultados.setText("Huésped no registrado en el sistema.");
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
            + "nombre y apellido.\n"
            , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBusquedaActionPerformed

    //-Evento para verificar que el nombre no exceda los 10 caracteres-//.
    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        this.jTextAreaResultados.setText("");
        
        if(this.jTextFieldNombre.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    //-Evento para verificar que el apellido no exceda los 10 caracteres-//.
    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
        this.jTextAreaResultados.setText("");
        
        if(this.jTextFieldApellido.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBusqueda;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelHuesped2;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelResultados;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResultados;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}