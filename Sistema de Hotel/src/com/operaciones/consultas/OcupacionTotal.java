//---Paquete---//.
package com.operaciones.consultas;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

//---Clase pública---//.
public class OcupacionTotal extends javax.swing.JInternalFrame {
 
    //---Constructor---//.
    public OcupacionTotal() {
        initComponents();
        extraInitProcess();
        rellenarInformacion();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jPanelGrafica = new javax.swing.JPanel();
        jButtonRegresar = new javax.swing.JButton();

        jPanelBase.setBackground(new java.awt.Color(255, 230, 198));

        jPanelGrafica.setOpaque(false);

        javax.swing.GroupLayout jPanelGraficaLayout = new javax.swing.GroupLayout(jPanelGrafica);
        jPanelGrafica.setLayout(jPanelGraficaLayout);
        jPanelGraficaLayout.setHorizontalGroup(
            jPanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );
        jPanelGraficaLayout.setVerticalGroup(
            jPanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        jButtonRegresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRegresar.setText("Regresar al menú principal");
        jButtonRegresar.setFocusPainted(false);
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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

    //-Regresar al menú principal-//.
    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    //-Configuración adicional de ciertos componentes-//.
    private void extraInitProcess() {    
        //Predefinir los tamaños de las gráficas.
        this.jPanelGrafica.setSize(806, 439);
    }
    
    //-A partir de la información de la base de datos, se calculará la ocupación total del hotel-//.
    private void rellenarInformacion() {
        ConexionMySQL conexion = null;
        int habitacionesOcupadas;
        int habitacionesLibres;
        
        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();
            
            try {
                //Consultar en la base de datos las habitaciones simples ocupadas en todo el hotel.
                ResultSet consulta = conexion.consultarTabla("huespedes",
                "COUNT(room_id) AS c_room", " WHERE active = 1");
                
                if(consulta.next()){
                    habitacionesOcupadas = consulta.getInt("c_room");
                    
                    //Hay un total de 15 habitaciones en el hotel.
                    habitacionesLibres = 15 - habitacionesOcupadas;
                }
                else {
                    throw new SQLException();
                }
                
                //Generar una gráfica de pastel correspondiente al porcentaje de ocupación de 
                //todas las habitaciones del hotel.
                this.generarGraficaPastel(habitacionesOcupadas, habitacionesLibres, 
                new Color(255, 178, 178), new Color(227, 255, 161)); 
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
    
    //-Generar una gráfica de pastel, a partir de ciertos datos y un JPanel-//.
    private void generarGraficaPastel(int habitacionesOcupadas, int habitacionesLibres, Color primerColor, Color segundoColor) {
        DefaultPieDataset<String> datos = new DefaultPieDataset<>();
        datos.setValue("Ocupadas", habitacionesOcupadas);
        datos.setValue("No ocupadas", habitacionesLibres);      
        JFreeChart grafico = ChartFactory.createPieChart("Ocupación de todas las habitaciones", datos, true, false, true);
        grafico.setBorderVisible(true);
        grafico.setBorderStroke(new BasicStroke(3));
        grafico.getTitle().setFont(new Font("Arial", Font.BOLD, 30));
                
        PiePlot<String> seccion = (PiePlot) grafico.getPlot();
        seccion.setBackgroundPaint(new Color(0, 0, 0, 0));
        seccion.setSectionPaint("Ocupadas", primerColor);
        seccion.setSectionPaint("No ocupadas", segundoColor);
        seccion.setLabelBackgroundPaint(new Color(255, 242, 255));
        seccion.setLabelFont(new Font("Tahoma", Font.PLAIN, 12));
        seccion.setSectionOutlinePaint("Ocupadas", Color.BLACK);
        seccion.setSectionOutlinePaint("No ocupadas", Color.BLACK);
        
        PieSectionLabelGenerator generador = new StandardPieSectionLabelGenerator("{0}: {1} ({2})", NumberFormat.getInstance(), NumberFormat.getPercentInstance());
        seccion.setLabelGenerator(generador);
       
        ChartPanel panel = new ChartPanel(grafico);
        panel.setSize(this.jPanelGrafica.getWidth(), this.jPanelGrafica.getHeight());
        this.jPanelGrafica.removeAll();
        this.jPanelGrafica.add(panel);
        this.jPanelGrafica.validate();
        
        this.pack();
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelGrafica;
    // End of variables declaration//GEN-END:variables
}