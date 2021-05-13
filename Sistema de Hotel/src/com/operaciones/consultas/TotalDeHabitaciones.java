//---Paquete---//.
package com.operaciones.consultas;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;

//---Clase pública---//.
public class TotalDeHabitaciones extends javax.swing.JInternalFrame {
 
    //---Constructor---//.
    public TotalDeHabitaciones() {
        initComponents();
        extraInitProcess();
        rellenarInformacion();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jPanelGraficaHabitaciones = new javax.swing.JPanel();
        jButtonRegresar = new javax.swing.JButton();

        jPanelBase.setBackground(new java.awt.Color(255, 230, 198));

        jPanelGraficaHabitaciones.setOpaque(false);

        javax.swing.GroupLayout jPanelGraficaHabitacionesLayout = new javax.swing.GroupLayout(jPanelGraficaHabitaciones);
        jPanelGraficaHabitaciones.setLayout(jPanelGraficaHabitacionesLayout);
        jPanelGraficaHabitacionesLayout.setHorizontalGroup(
            jPanelGraficaHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );
        jPanelGraficaHabitacionesLayout.setVerticalGroup(
            jPanelGraficaHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
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
                        .addGap(245, 245, 245)
                        .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanelGraficaHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanelGraficaHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    //-Configuración adicional de ciertos componentes-//.
    private void extraInitProcess() {    
        //Predefinir el tamaño de la gráfica.
        this.jPanelGraficaHabitaciones.setSize(786, 433);
    }
    
    //-A partir de la información de la base de datos, se obtiene la cantidad total de habitaciones-//.
    private void rellenarInformacion() {
        ConexionMySQL conexion = null;
        ArrayList<Integer> totalesHabitaciones = new ArrayList<>();
        
        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();
            
            try {
                //Consultar en la base de datos la cantidad total de habitaciones.
                ResultSet consulta = conexion.consultarTabla("room_types",
                "rooms_count", "");
                
                while(consulta.next()){
                    totalesHabitaciones.add(consulta.getInt("rooms_count"));
                }
                
                //Generar una gráfica de barra correspondiente al total de
                //habitaciones de cada tipo.
                this.generarGraficaBarras(totalesHabitaciones, "Total de habitaciones");
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
    private void generarGraficaBarras(ArrayList<Integer> lista, String nombre) {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.setValue(lista.get(0), "", "Chaac Suite");
        datos.setValue(lista.get(1), "", "Itzamná Suite");
        datos.setValue(lista.get(2), "", "Kauil Suite");
        datos.setValue(30, "", "Total");
        
        JFreeChart grafico = ChartFactory.createBarChart(nombre, "Tipo de habitación", "Cantidad", datos, PlotOrientation.VERTICAL, false, false, true);
        grafico.setBorderVisible(true);
        grafico.getTitle().setFont(new Font("Arial", Font.BOLD, 20));
        grafico.setBorderStroke(new BasicStroke(3));
        
        CategoryPlot auxiliar = grafico.getCategoryPlot();
        auxiliar.setRangeGridlinePaint(Color.BLACK);
        auxiliar.setBackgroundPaint(new Color(255, 255, 255));
        auxiliar.getDomainAxis().setTickLabelFont(new Font("Arial", Font.PLAIN, 13));
        auxiliar.getRangeAxis().setTickLabelFont(new Font("Arial", Font.PLAIN, 13));
                
        BarRenderer renderizado = (BarRenderer) auxiliar.getRenderer();
        renderizado.setBarPainter(new StandardBarPainter());
       
        ChartPanel panel = new ChartPanel(grafico);
        panel.setSize(this.jPanelGraficaHabitaciones.getWidth(), this.jPanelGraficaHabitaciones.getHeight());
        this.jPanelGraficaHabitaciones.removeAll();
        this.jPanelGraficaHabitaciones.add(panel);
        this.jPanelGraficaHabitaciones.validate();
        
        this.pack();
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelGraficaHabitaciones;
    // End of variables declaration//GEN-END:variables
}