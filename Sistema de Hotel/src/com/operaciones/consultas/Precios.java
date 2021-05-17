//---Paquete---//.
package com.operaciones.consultas;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//---Clase pública---//.
public class Precios extends javax.swing.JInternalFrame {
 
    //---Constructor---//.
    public Precios() {
        initComponents();
        rellenarInformacion();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jLabelCostos = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jTextFieldChaac = new javax.swing.JTextField();
        jTextFieldItzamna = new javax.swing.JTextField();
        jLabelItzamna = new javax.swing.JLabel();
        jTextFieldKauil = new javax.swing.JTextField();
        jLabelKauil = new javax.swing.JLabel();
        jLabelChaac = new javax.swing.JLabel();

        jLabelCostos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCostos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCostos.setText("Costos de las habitaciones (por noche de hospedaje)");

        jButtonRegresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRegresar.setText("Regresar al menú principal");
        jButtonRegresar.setFocusPainted(false);
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jTextFieldChaac.setEditable(false);
        jTextFieldChaac.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldChaac.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTextFieldItzamna.setEditable(false);
        jTextFieldItzamna.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldItzamna.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabelItzamna.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelItzamna.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelItzamna.setText("Iztamná Suite (doble):");

        jTextFieldKauil.setEditable(false);
        jTextFieldKauil.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldKauil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabelKauil.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelKauil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelKauil.setText("Kauil Suite (triple):");

        jLabelChaac.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelChaac.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelChaac.setText("Chaac Suite (simple):");

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCostos, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelItzamna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelChaac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelKauil, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldItzamna, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldChaac, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldKauil, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(217, 217, 217))
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCostos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelChaac, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldChaac, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelItzamna, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldItzamna, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKauil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldKauil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(265, 265, 265)
                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-Regresar al menú principal-//.
    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    //-A partir de la información de la base de datos, se mostrarán los precios de las habitaciones-//.
    private void rellenarInformacion() {
        ConexionMySQL conexion = null;
        ArrayList<Double> listaPrecios = new ArrayList<>();
        
        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();
            
            try {
                //Consultar en la base de datos los precios de cada habitación.
                ResultSet consulta = conexion.consultarTabla("precios",
                "price", "");
                
                DecimalFormat formato = new DecimalFormat("$0,000.00");
                
                while(consulta.next()) {
                    listaPrecios.add(consulta.getDouble("price"));
                }
                this.jTextFieldChaac.setText(formato.format(listaPrecios.get(0)));
                this.jTextFieldItzamna.setText(formato.format(listaPrecios.get(1)));
                this.jTextFieldKauil.setText(formato.format(listaPrecios.get(2)));
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
    private javax.swing.JLabel jLabelChaac;
    private javax.swing.JLabel jLabelCostos;
    private javax.swing.JLabel jLabelItzamna;
    private javax.swing.JLabel jLabelKauil;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JTextField jTextFieldChaac;
    private javax.swing.JTextField jTextFieldItzamna;
    private javax.swing.JTextField jTextFieldKauil;
    // End of variables declaration//GEN-END:variables
}