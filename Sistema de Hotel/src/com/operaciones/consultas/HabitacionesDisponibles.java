//---Paquete---//.
package com.operaciones.consultas;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

//---Clase pública---//.
public class HabitacionesDisponibles extends javax.swing.JInternalFrame {
 
    //---Atributos adicionales---//.
    private ArrayList<Integer> habitacionesSimples = new ArrayList<>();
    private ArrayList<Integer> habitacionesDobles = new ArrayList<>();
    private ArrayList<Integer> habitacionesTriples = new ArrayList<>();
    
    //---Constructor---//.
    public HabitacionesDisponibles() {
        initComponents();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPiso = new javax.swing.ButtonGroup();
        jPanelBase = new javax.swing.JPanel();
        jLabelDisponibles = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jLabelPiso = new javax.swing.JLabel();
        jLabelResultados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultados = new javax.swing.JTextArea();
        jRadioButtonPiso1 = new javax.swing.JRadioButton();
        jRadioButtonPiso2 = new javax.swing.JRadioButton();
        jButtonRegresar1 = new javax.swing.JButton();

        jLabelDisponibles.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelDisponibles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDisponibles.setText("Habitaciones disponibles");

        jButtonRegresar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonRegresar.setText("Regresar al menú principal");
        jButtonRegresar.setFocusPainted(false);
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jLabelPiso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPiso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPiso.setText("Número de piso");

        jLabelResultados.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelResultados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultados.setText("Resultados");

        jTextAreaResultados.setEditable(false);
        jTextAreaResultados.setColumns(20);
        jTextAreaResultados.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextAreaResultados.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultados);

        buttonGroupPiso.add(jRadioButtonPiso1);
        jRadioButtonPiso1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRadioButtonPiso1.setSelected(true);
        jRadioButtonPiso1.setText("Primer piso");
        jRadioButtonPiso1.setFocusPainted(false);
        jRadioButtonPiso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPiso1ActionPerformed(evt);
            }
        });

        buttonGroupPiso.add(jRadioButtonPiso2);
        jRadioButtonPiso2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRadioButtonPiso2.setText("Segundo piso");
        jRadioButtonPiso2.setFocusPainted(false);
        jRadioButtonPiso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPiso2ActionPerformed(evt);
            }
        });

        jButtonRegresar1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonRegresar1.setText("Imprimir habitaciones disponibles");
        jButtonRegresar1.setFocusPainted(false);
        jButtonRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jRadioButtonPiso1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jRadioButtonPiso2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(153, 153, 153))
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPiso, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(jButtonRegresar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61)))
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(jLabelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jRadioButtonPiso1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonPiso2)
                        .addGap(56, 56, 56)
                        .addComponent(jButtonRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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

    //-Imprimir todas las habitaciones disponibles, separadas por tipo-//.
    private void jButtonRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresar1ActionPerformed
        //Vaciar el JTextArea.
        this.jTextAreaResultados.setText("");
        
        ConexionMySQL conexion = null;
        int numeroPiso;
        ArrayList<Integer> habitacionesSimples = new ArrayList<>();
        ArrayList<Integer> habitacionesDobles = new ArrayList<>();
        ArrayList<Integer> habitacionesTriples = new ArrayList<>();
        
        //Se verifica si se seleccionó el primer piso para la búsqueda de habitaciones.
        if(this.jRadioButtonPiso1.isSelected()) {
            numeroPiso = 1;
        }
        else {
            numeroPiso = 2;
        }
        this.habitacionesSimples.clear();
        this.habitacionesDobles.clear();
        this.habitacionesTriples.clear();
        this.inicializarVectores(numeroPiso);
        
        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();
            
            try {
                //Consultar en la base de datos las habitaciones reservadas simples del piso correspondiente.
                ResultSet consulta = conexion.consultarTabla("huespedes",
                "room_id", " WHERE room_type = 'S' AND active = 1 AND floor = " + numeroPiso);

                //Se eliminan todas las habitaciones reservadas simples del piso correspondiente.
                while(consulta.next()) {
                    int numeroHabitacion = consulta.getInt("room_id");
                    
                    if (this.habitacionesSimples.contains(numeroHabitacion)) {
                        this.habitacionesSimples.removeAll(Arrays.asList(numeroHabitacion));
                    }
                }
                
                //Consultar en la base de datos las habitaciones reservadas dobles del piso correspondiente.
                consulta = conexion.consultarTabla("huespedes",
                "room_id", " WHERE room_type = 'D' AND active = 1 AND floor = " + numeroPiso);

                //Se eliminan todas las habitaciones reservadas dobles del piso correspondiente.
                while(consulta.next()) {
                    int numeroHabitacion = consulta.getInt("room_id");
                    
                    if (this.habitacionesDobles.contains(numeroHabitacion)) {
                        this.habitacionesDobles.removeAll(Arrays.asList(numeroHabitacion));
                    }
                }
                
                //Consultar en la base de datos las habitaciones reservadas triples del piso correspondiente.
                consulta = conexion.consultarTabla("huespedes",
                "room_id", " WHERE room_type = 'T' AND active = 1 AND floor = " + numeroPiso);

                //Se eliminan todas las habitaciones reservadas triples del piso correspondiente.
                while(consulta.next()) {
                    int numeroHabitacion = consulta.getInt("room_id");
                    
                    if (this.habitacionesTriples.contains(numeroHabitacion)) {
                        this.habitacionesTriples.removeAll(Arrays.asList(numeroHabitacion));
                    }
                }

                //Se verifica si hay habitaciones disponibles o no.
                if(this.habitacionesSimples.isEmpty() && this.habitacionesDobles.isEmpty() && this.habitacionesTriples.isEmpty()) {
                    this.jTextAreaResultados.setText("No hay habitaciones disponibles");
                }
                else {
                    if(!this.habitacionesSimples.isEmpty()) {
                        this.jTextAreaResultados.append("Habitaciones simples:\n");
                        for(Integer entero : this.habitacionesSimples) {
                            this.jTextAreaResultados.append("Habitación número " + entero + ".\n");   
                        }
                        this.jTextAreaResultados.append("\n");
                    }
                    if(!this.habitacionesDobles.isEmpty()) {
                        this.jTextAreaResultados.append("Habitaciones dobles:\n");
                        for(Integer entero : this.habitacionesDobles) {
                            this.jTextAreaResultados.append("Habitación número " + entero + ".\n");   
                        }
                        this.jTextAreaResultados.append("\n");
                    }
                    if(!this.habitacionesTriples.isEmpty()) {
                        this.jTextAreaResultados.append("Habitaciones triples:\n");
                        for(Integer entero : this.habitacionesTriples) {
                            this.jTextAreaResultados.append("Habitación número " + entero + ".\n");   
                        }
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
    }//GEN-LAST:event_jButtonRegresar1ActionPerformed

    //-Al cambiar el número de piso, borrar el contenido del JTextArea-//.
    private void jRadioButtonPiso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPiso1ActionPerformed
        this.jTextAreaResultados.setText("");
    }//GEN-LAST:event_jRadioButtonPiso1ActionPerformed

     //-Al cambiar el número de piso, borrar el contenido del JTextArea-//.
    private void jRadioButtonPiso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPiso2ActionPerformed
        this.jTextAreaResultados.setText("");
    }//GEN-LAST:event_jRadioButtonPiso2ActionPerformed

    //-Se genera una serie de listas con las habitaciones disponibles, según el tipo, en cada piso-//.
    private void inicializarVectores(int numeroPiso) {
        if(numeroPiso == 1) {
            //Definir las habitaciones simples del primer piso.
            this.habitacionesSimples.add(101);
            this.habitacionesSimples.add(104);
            this.habitacionesSimples.add(107);
            this.habitacionesSimples.add(110);
            this.habitacionesSimples.add(113); 
            
            //Definir las habitaciones dobles del primer piso.
            this.habitacionesDobles.add(102);
            this.habitacionesDobles.add(105);
            this.habitacionesDobles.add(108);
            this.habitacionesDobles.add(111);
            this.habitacionesDobles.add(114); 
            
            //Definir las habitaciones triples del primer piso.
            this.habitacionesTriples.add(103);
            this.habitacionesTriples.add(106);
            this.habitacionesTriples.add(109);
            this.habitacionesTriples.add(112);
            this.habitacionesTriples.add(115); 
        }
        else {
            //Definir las habitaciones simples del segundo piso.
            this.habitacionesSimples.add(202);
            this.habitacionesSimples.add(208);
            this.habitacionesSimples.add(211);
            this.habitacionesSimples.add(213);
            
            //Definir las habitaciones dobles del segundo piso.
            this.habitacionesDobles.add(205);
            this.habitacionesDobles.add(206);
            this.habitacionesDobles.add(209);
            this.habitacionesDobles.add(212);
            
            //Definir las habitaciones triples del segundo piso.
            this.habitacionesTriples.add(201);
            this.habitacionesTriples.add(203);
            this.habitacionesTriples.add(204);
            this.habitacionesTriples.add(207);
            this.habitacionesTriples.add(210);
            this.habitacionesTriples.add(214);
            this.habitacionesTriples.add(215);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPiso;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonRegresar1;
    private javax.swing.JLabel jLabelDisponibles;
    private javax.swing.JLabel jLabelPiso;
    private javax.swing.JLabel jLabelResultados;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JRadioButton jRadioButtonPiso1;
    private javax.swing.JRadioButton jRadioButtonPiso2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResultados;
    // End of variables declaration//GEN-END:variables
}