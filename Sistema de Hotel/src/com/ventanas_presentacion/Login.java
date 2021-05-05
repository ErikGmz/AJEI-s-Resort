//---Paquete---//.
package com.ventanas_presentacion;

//---Clase pública---//.
public class Login extends javax.swing.JFrame {

    //---Constructor---//.
    public Login() {
        initComponents();
        extraInitProcess();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");
        setPreferredSize(new java.awt.Dimension(913, 537));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 913, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-Configuración adicional de ciertos componentes-//.
    private void extraInitProcess() {
        //Centrar el jFrame.
        this.setLocationRelativeTo(this);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}