//---Paquete---//.
package com.operaciones.consultas;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

//---Clase pública---//.
public class Ingresos extends javax.swing.JInternalFrame {
 
    //---Constructor---//.
    public Ingresos() {
        initComponents();
        rellenarInformacion();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jLabelIngresosTotales = new javax.swing.JLabel();
        jLabelLista = new javax.swing.JLabel();
        jTextFieldIngresosTotales = new javax.swing.JTextField();
        jButtonRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaNombres = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaPagos = new javax.swing.JTextArea();

        jLabelIngresosTotales.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelIngresosTotales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIngresosTotales.setText("Ingresos totales del hotel");

        jLabelLista.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLista.setText("Lista de ingresos por cada check-out");

        jTextFieldIngresosTotales.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldIngresosTotales.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonRegresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRegresar.setText("Regresar al menú principal");
        jButtonRegresar.setFocusPainted(false);
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jTextAreaNombres.setEditable(false);
        jTextAreaNombres.setColumns(20);
        jTextAreaNombres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaNombres.setLineWrap(true);
        jTextAreaNombres.setRows(5);
        jScrollPane2.setViewportView(jTextAreaNombres);

        jTextAreaPagos.setEditable(false);
        jTextAreaPagos.setColumns(20);
        jTextAreaPagos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaPagos.setLineWrap(true);
        jTextAreaPagos.setRows(5);
        jScrollPane3.setViewportView(jTextAreaPagos);

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldIngresosTotales, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIngresosTotales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLista)
                    .addComponent(jLabelIngresosTotales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addComponent(jTextFieldIngresosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(388, 388, 388)
                        .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    //-A partir de la información de la base de datos, se calculan los ingresos del hotel-//.
    private void rellenarInformacion() {
        ConexionMySQL conexion = null;
        double ingresosTotales = 0;
        
        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();
            
            try {
                //Consultar en la base de datos lo que cada huésped ha pagado tras realizar el check-out.
                ResultSet consulta = conexion.consultarTabla("huespedes",
                "name, expense", " WHERE active = 0");
                
                DecimalFormat formato1 = new DecimalFormat("###,###.00");
                DecimalFormat formato2 = new DecimalFormat("###,###,###,###,##0.00");
                
                //Se imprimen los gastos de cada huésped previamente alojado.
                while(consulta.next()) {
                    double ingresosHuesped = consulta.getDouble("expense");
                    ingresosTotales += ingresosHuesped;
                    this.jTextAreaNombres.append(consulta.getString("name"));
                    this.jTextAreaPagos.append("$" + formato1.format(ingresosHuesped));
                }
                if(ingresosTotales == 0){
                    this.jTextAreaNombres.append("No hay ningún registro.");
                }
                this.jTextFieldIngresosTotales.setText("$" + formato2.format(ingresosTotales));
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
    private javax.swing.JLabel jLabelIngresosTotales;
    private javax.swing.JLabel jLabelLista;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaNombres;
    private javax.swing.JTextArea jTextAreaPagos;
    private javax.swing.JTextField jTextFieldIngresosTotales;
    // End of variables declaration//GEN-END:variables
}