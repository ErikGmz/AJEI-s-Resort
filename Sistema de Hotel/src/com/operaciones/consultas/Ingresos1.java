//---Paquete---//.
package com.operaciones.consultas;

//---Sentencias import---//.
import com.operaciones.*;
import java.beans.PropertyVetoException;

//---Clase pública---//.
public class Ingresos1 extends javax.swing.JFrame {

    //---Constructor---//.
    public Ingresos1() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        //Cargar el JInternalFrame.
        Ingresos ingresos = new Ingresos();
        this.jDesktopPaneAltas.add(ingresos);
        ingresos.setVisible(true);
        
        //Ajustar el tamaño del JInternalFrame.
        try {
            ingresos.setMaximum(true);
        } catch (PropertyVetoException ex) {
            System.out.println("Error al ajustar el JInternalFrame.");
            ex.printStackTrace();
        }
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
            .addGap(0, 904, Short.MAX_VALUE)
        );
        jDesktopPaneAltasLayout.setVerticalGroup(
            jDesktopPaneAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
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

    //-Método principal-//.
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresos1().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPersonas;
    private javax.swing.JDesktopPane jDesktopPaneAltas;
    // End of variables declaration//GEN-END:variables
}