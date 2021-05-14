//---Paquete---//.
package com.operaciones.consultas;

//---Sentencias import---//.
import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;

//---Clase pública---//.
public class Consultas extends javax.swing.JFrame {

    //---Constructor---//.
    public Consultas() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        //Cargar el JInternalFrame.
        //this.cargarVentana(new Ingresos());
        //this.cargarVentana(new OcupacionPorTipo());
        //this.cargarVentana(new OcupacionTotal());
        //this.cargarVentana(new TotalDeHabitaciones());
        //this.cargarVentana(new Precios());
        //this.cargarVentana(new ConsultarHuesped());
        //this.cargarVentana(new ConsultarHabitacion());
        //this.cargarVentana(new HabitacionesDisponibles());
        this.cargarVentana(new HuespedesActuales());
    }
    
    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPersonas = new javax.swing.ButtonGroup();
        jDesktopPaneAltas = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPaneAltas.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jDesktopPaneAltasLayout = new javax.swing.GroupLayout(jDesktopPaneAltas);
        jDesktopPaneAltas.setLayout(jDesktopPaneAltasLayout);
        jDesktopPaneAltasLayout.setHorizontalGroup(
            jDesktopPaneAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jDesktopPaneAltasLayout.setVerticalGroup(
            jDesktopPaneAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPaneAltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPaneAltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-Método para cargar un JInternalFrame-//.
    private void cargarVentana(JInternalFrame ventana) {
        this.jDesktopPaneAltas.add(ventana);
        ventana.setVisible(true);
        
        //Ajustar el tamaño del JInternalFrame.
        try {
            ventana.setMaximum(true);
        } catch (PropertyVetoException ex) {
            System.out.println("Error al ajustar el JInternalFrame.");
            ex.printStackTrace();
        }
    }
    
    //-Método principal-//.
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPersonas;
    private javax.swing.JDesktopPane jDesktopPaneAltas;
    // End of variables declaration//GEN-END:variables
}