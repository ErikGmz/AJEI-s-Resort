//---Paquete---//.
package com.operaciones.consultas;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//---Clase pública---//.
public class HuespedesActuales extends javax.swing.JInternalFrame {
 
    //---Constructor---//.
    public HuespedesActuales() {
        initComponents();
        rellenarInformacion();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jLabelBuscar = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jLabelLista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaHabitaciones = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaNombres = new javax.swing.JTextArea();

        jLabelBuscar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBuscar.setText("Huéspedes actuales");

        jButtonRegresar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonRegresar.setText("Regresar al menú principal");
        jButtonRegresar.setFocusPainted(false);
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jLabelLista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLista.setText("Lista de personas y habitaciones");

        jTextAreaHabitaciones.setEditable(false);
        jTextAreaHabitaciones.setColumns(20);
        jTextAreaHabitaciones.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextAreaHabitaciones.setRows(5);
        jScrollPane1.setViewportView(jTextAreaHabitaciones);

        jTextAreaNombres.setEditable(false);
        jTextAreaNombres.setColumns(20);
        jTextAreaNombres.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextAreaNombres.setRows(5);
        jScrollPane2.setViewportView(jTextAreaNombres);

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addComponent(jLabelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLista, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGap(456, 456, 456)
                        .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelLista, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
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

    //-A partir de la información de la base de datos, se obtienen los huéspedes actuales-//.
    private void rellenarInformacion() {
        ConexionMySQL conexion = null;
        
        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();
            
            try {
                //Consultar en la base de datos los huéspedes actuales.
                ResultSet consulta = conexion.consultarTabla("huespedes",
                "name, room_id", " WHERE active = 1 ORDER BY name ASC");
                
                if(!consulta.first()) {
                    this.jTextAreaNombres.setText("No hay huéspedes registrados.");
                }
                else {
                    consulta.previous();
                    while(consulta.next()) {
                        this.jTextAreaNombres.append(consulta.getString("name") + ".\n");
                        this.jTextAreaHabitaciones.append("Habitación " + consulta.getInt("room_id") + ".\n");
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelLista;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaHabitaciones;
    private javax.swing.JTextArea jTextAreaNombres;
    // End of variables declaration//GEN-END:variables
}