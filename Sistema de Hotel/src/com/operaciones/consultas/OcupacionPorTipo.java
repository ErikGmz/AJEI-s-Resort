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
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

//---Clase pública---//.
public class OcupacionPorTipo extends javax.swing.JInternalFrame {
 
    //---Constructor---//.
    public OcupacionPorTipo() {
        initComponents();
        extraInitProcess();
        rellenarInformacion();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jPanelOcupacionSimple = new javax.swing.JPanel();
        jPanelOcupacionDoble = new javax.swing.JPanel();
        jPanelOcupacionTriple = new javax.swing.JPanel();
        jButtonRegresar = new javax.swing.JButton();

        jPanelBase.setBackground(new java.awt.Color(255, 230, 198));

        jPanelOcupacionSimple.setOpaque(false);

        javax.swing.GroupLayout jPanelOcupacionSimpleLayout = new javax.swing.GroupLayout(jPanelOcupacionSimple);
        jPanelOcupacionSimple.setLayout(jPanelOcupacionSimpleLayout);
        jPanelOcupacionSimpleLayout.setHorizontalGroup(
            jPanelOcupacionSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        jPanelOcupacionSimpleLayout.setVerticalGroup(
            jPanelOcupacionSimpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        jPanelOcupacionDoble.setOpaque(false);

        javax.swing.GroupLayout jPanelOcupacionDobleLayout = new javax.swing.GroupLayout(jPanelOcupacionDoble);
        jPanelOcupacionDoble.setLayout(jPanelOcupacionDobleLayout);
        jPanelOcupacionDobleLayout.setHorizontalGroup(
            jPanelOcupacionDobleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        jPanelOcupacionDobleLayout.setVerticalGroup(
            jPanelOcupacionDobleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelOcupacionTriple.setOpaque(false);

        javax.swing.GroupLayout jPanelOcupacionTripleLayout = new javax.swing.GroupLayout(jPanelOcupacionTriple);
        jPanelOcupacionTriple.setLayout(jPanelOcupacionTripleLayout);
        jPanelOcupacionTripleLayout.setHorizontalGroup(
            jPanelOcupacionTripleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelOcupacionTripleLayout.setVerticalGroup(
            jPanelOcupacionTripleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
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
                .addGap(39, 39, 39)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelOcupacionSimple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOcupacionTriple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOcupacionDoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelOcupacionSimple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOcupacionDoble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelOcupacionTriple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
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
        this.jPanelOcupacionSimple.setSize(373, 235);
        this.jPanelOcupacionDoble.setSize(373, 235);
        this.jPanelOcupacionTriple.setSize(373, 235);
    }
    
    //-A partir de la información de la base de datos, se calculan los porcentajes de ocupación-//.
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
                "COUNT(room_id) AS c_simple_room", " WHERE active = 1 AND room_type = 'S'");
                
                if(consulta.next()){
                    habitacionesOcupadas = consulta.getInt("c_simple_room");
                    
                    //Hay un total de 9 habitaciones simples en el hotel.
                    habitacionesLibres = 9 - habitacionesOcupadas;
                }
                else {
                    throw new SQLException();
                }
                
                //Generar una gráfica de pastel correspondiente al porcentaje de ocupación de 
                //porcentaje de ocupación de habitaciones simples.
                this.generarGraficaPastel(habitacionesOcupadas, habitacionesLibres, "Habitaciones Chaac Suite (simples)", 
                this.jPanelOcupacionSimple, new Color(185, 255, 123), new Color(169, 145, 255)); 
                
                //Consultar en la base de datos las habitaciones dobles ocupadas en todo el hotel.
                consulta = conexion.consultarTabla("huespedes",
                "COUNT(room_id) AS c_double_room", " WHERE active = 1 AND room_type = 'D'");
                
                if(consulta.next()){
                    habitacionesOcupadas = consulta.getInt("c_double_room");
                    
                    //Hay un total de 9 habitaciones dobles en el hotel.
                    habitacionesLibres = 9 - habitacionesOcupadas;
                }
                else {
                    throw new SQLException();
                }
                
                //Generar una gráfica de pastel correspondiente al porcentaje de ocupación de 
                //porcentaje de ocupación de habitaciones dobles.
                this.generarGraficaPastel(habitacionesOcupadas, habitacionesLibres, "Habitaciones Itzamná Suite (dobles)", 
                this.jPanelOcupacionDoble, new Color(244, 219, 255), new Color(191, 255, 232));
                
                //Consultar en la base de datos las habitaciones triples ocupadas en todo el hotel.
                consulta = conexion.consultarTabla("huespedes",
                "COUNT(room_id) AS c_triple_room", " WHERE active = 1 AND room_type = 'T'");
                
                if(consulta.next()){
                    habitacionesOcupadas = consulta.getInt("c_triple_room");
                    
                    //Hay un total de 12 habitaciones triples en el hotel.
                    habitacionesLibres = 12 - habitacionesOcupadas;
                }
                else {
                    throw new SQLException();
                }
                
                //Generar una gráfica de pastel correspondiente al porcentaje de ocupación de 
                //porcentaje de ocupación de habitaciones triples.
                this.generarGraficaPastel(habitacionesOcupadas, habitacionesLibres, "Habitaciones Kauil Suite (triples)", 
                this.jPanelOcupacionTriple, new Color(240, 220, 139), new Color(244, 164, 96));
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
    private void generarGraficaPastel(int habitacionesOcupadas, int habitacionesLibres, String nombre, JPanel jPanel, Color primerColor, Color segundoColor) {
        DefaultPieDataset<String> datos = new DefaultPieDataset<>();
        datos.setValue("Ocupadas", habitacionesOcupadas);
        datos.setValue("No ocupadas", habitacionesLibres);      
        JFreeChart grafico = ChartFactory.createPieChart(nombre, datos, true, false, true);
        grafico.setBorderVisible(true);
        grafico.setBorderStroke(new BasicStroke(3));
        grafico.getTitle().setFont(new Font("Arial", Font.BOLD, 15));
                
        PiePlot<String> seccion = (PiePlot) grafico.getPlot();
        seccion.setBackgroundPaint(new Color(0, 0, 0, 0));
        seccion.setSectionPaint("Ocupadas", primerColor);
        seccion.setSectionPaint("No ocupadas", segundoColor);
        seccion.setLabelBackgroundPaint(new Color(255, 242, 255));
        seccion.setSectionOutlinePaint("Ocupadas", Color.BLACK);
        seccion.setSectionOutlinePaint("No ocupadas", Color.BLACK);
        
        PieSectionLabelGenerator generador = new StandardPieSectionLabelGenerator("{0}: {1} ({2})", NumberFormat.getInstance(), NumberFormat.getPercentInstance());
        seccion.setLabelGenerator(generador);
       
        ChartPanel panel = new ChartPanel(grafico);
        panel.setSize(jPanel.getWidth(), jPanel.getHeight());
        jPanel.removeAll();
        jPanel.add(panel);
        jPanel.validate();
        
        this.pack();
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelOcupacionDoble;
    private javax.swing.JPanel jPanelOcupacionSimple;
    private javax.swing.JPanel jPanelOcupacionTriple;
    // End of variables declaration//GEN-END:variables
}