/*
 *  Proyecto Final: Administración de un hotel.
 *  Carrera: Ingeniería en Sistemas Computacionales.
 *  Semestre: 4ºA.
 *  Materia: Programación III.
 * 
 *  Equipo número 5. Integrantes:
 *
 *  -Erik Alejandro Gómez Martínez (jefe).
 *  -Ángel Gabriel Galindo López.
 *  -Israel Alejandro Mora González.
 *  -José Emmanuel Rodríguez López.
 */

//---Paquete---//.
package com.ventanas_presentacion;

//---Sentencias import---//.
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

//---Clase pública---//.
public class Portada extends javax.swing.JFrame {

    //---Atributos adicionales---//.
    private Image logoUAA;
    private Image logoCBB;
    private Image textoCBB;
    private Image iconoHotel;
    
    //---Constructor---//.
    public Portada() {
        initComponents();
        extraInitProcess();
    }
    
    //---Métodos sobreescritos---//.
    //-Dibujar íconos e imágenes-//.
    @Override public void paint(Graphics g) {
        super.paint(g);
                
        //Dibujar el logo de la UAA.
        g.drawImage(this.logoUAA, 60, 60, this);
        
        //Dibujar el logo y texto del Centro de Ciencias Básicas.
        g.drawImage(this.logoCBB, 60, 207, this);
        g.drawImage(this.textoCBB, 125, 190, this);
        
        //Dibujar el ícono del timbre.
        g.drawImage(this.iconoHotel, 142, 363, this);
    } 
    
    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jPanelPortada = new javax.swing.JPanel();
        jLabelUAA = new javax.swing.JLabel();
        jLabelCBB = new javax.swing.JLabel();
        jPanelDatos = new javax.swing.JPanel();
        jLabelMateria = new javax.swing.JLabel();
        jLabelProgramacion = new javax.swing.JLabel();
        jLabelGeorgina = new javax.swing.JLabel();
        jLabelDocente = new javax.swing.JLabel();
        jLabelEntrega = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jPanelIntegrantes = new javax.swing.JPanel();
        jLabelEquipo = new javax.swing.JLabel();
        jLabelErik = new javax.swing.JLabel();
        jLabelGabriel = new javax.swing.JLabel();
        jLabelIsrael = new javax.swing.JLabel();
        jLabelEmmanuel = new javax.swing.JLabel();
        jPanelSeccion = new javax.swing.JPanel();
        jButtonIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portada de presentación");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanelBase.setBackground(new java.awt.Color(225, 225, 255));

        jPanelPortada.setBackground(new java.awt.Color(255, 254, 242));
        jPanelPortada.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabelUAA.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelUAA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUAA.setText("Universidad Autónoma de Aguascalientes");

        jLabelCBB.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelCBB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCBB.setText("Centro de Ciencias Básicas");

        jPanelDatos.setOpaque(false);

        jLabelMateria.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelMateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMateria.setText("Materia:");

        jLabelProgramacion.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelProgramacion.setText("Programación III");

        jLabelGeorgina.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelGeorgina.setText("Georgina Salazar Partida");

        jLabelDocente.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelDocente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDocente.setText("Docente:");

        jLabelEntrega.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelEntrega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEntrega.setText("Fecha de entrega:");

        jLabelFecha.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelFecha.setText("16 de junio de 2021");

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabelDocente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelGeorgina))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabelMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelProgramacion))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabelEntrega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFecha)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProgramacion)
                    .addComponent(jLabelMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGeorgina)
                    .addComponent(jLabelDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelIntegrantes.setOpaque(false);

        jLabelEquipo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelEquipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEquipo.setText("Equipo número 5. Integrantes:");

        jLabelErik.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelErik.setText("Erik Alejandro Gómez Martínez (jefe)");

        jLabelGabriel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelGabriel.setText("Ángel Gabriel Galindo López");

        jLabelIsrael.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelIsrael.setText("Israel Alejandro Mora González");

        jLabelEmmanuel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelEmmanuel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmmanuel.setText("José Emmanuel Rodríguez López");

        javax.swing.GroupLayout jPanelIntegrantesLayout = new javax.swing.GroupLayout(jPanelIntegrantes);
        jPanelIntegrantes.setLayout(jPanelIntegrantesLayout);
        jPanelIntegrantesLayout.setHorizontalGroup(
            jPanelIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntegrantesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntegrantesLayout.createSequentialGroup()
                        .addComponent(jLabelEquipo)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntegrantesLayout.createSequentialGroup()
                        .addGroup(jPanelIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelErik)
                            .addGroup(jPanelIntegrantesLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabelIsrael)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntegrantesLayout.createSequentialGroup()
                        .addComponent(jLabelGabriel)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntegrantesLayout.createSequentialGroup()
                        .addComponent(jLabelEmmanuel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        jPanelIntegrantesLayout.setVerticalGroup(
            jPanelIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntegrantesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelErik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelGabriel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelIsrael)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmmanuel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanelSeccion.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(83, 83, 83), 2, true), "Siguiente sección", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanelSeccion.setOpaque(false);

        jButtonIniciar.setBackground(new java.awt.Color(255, 228, 189));
        jButtonIniciar.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jButtonIniciar.setText("Iniciar sistema del hotel");
        jButtonIniciar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonIniciar.setFocusPainted(false);
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSeccionLayout = new javax.swing.GroupLayout(jPanelSeccion);
        jPanelSeccion.setLayout(jPanelSeccionLayout);
        jPanelSeccionLayout.setHorizontalGroup(
            jPanelSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSeccionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelSeccionLayout.setVerticalGroup(
            jPanelSeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSeccionLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelPortadaLayout = new javax.swing.GroupLayout(jPanelPortada);
        jPanelPortada.setLayout(jPanelPortadaLayout);
        jPanelPortadaLayout.setHorizontalGroup(
            jPanelPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPortadaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanelSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanelPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCBB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelUAA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelIntegrantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanelPortadaLayout.setVerticalGroup(
            jPanelPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelPortadaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelUAA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCBB)
                .addGap(18, 18, 18)
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelIntegrantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelPortadaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPortada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPortada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-Botón para trasladarse al login del sistema-//.
    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        this.dispose();
        Login inicio = new Login();
        inicio.setVisible(true);
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    //-Configuración adicional de ciertos componentes-//.
    private void extraInitProcess() {
        //Centrar el jFrame.
        this.setLocationRelativeTo(this);
        
        //Abrir el archivo que contiene el logo de la UAA.
        ImageIcon icono = new ImageIcon("src/img/portada/logouaa.png");
        this.logoUAA = icono.getImage();
        
        //Abrir el archivo que contiene el logo del Centro de Ciencias Básicas.
        icono = new ImageIcon("src/img/portada/logocbb.png"); 
        this.logoCBB = icono.getImage();
        
        //Abrir el archivo que contiene el texto del Centro de Ciencias Básicas.
        icono = new ImageIcon("src/img/portada/textocbb.png"); 
        this.textoCBB = icono.getImage();
        
        //Abrir el archivo que contiene el ícono del hotel.
        icono = new ImageIcon("src/img/portada/hotel.png"); 
        this.iconoHotel = icono.getImage();
        
        //Cargar el logo del gallo UAA para el JFrame.
        try {
            super.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/portada/gallouaa.png")));
        }
        catch(Exception ex) {
            System.err.println("Error al abrir el ícono.");
            ex.printStackTrace();
        }
    }
    
    //-Método principal-//.
    public static void main(String args[]) {     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Portada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JLabel jLabelCBB;
    private javax.swing.JLabel jLabelDocente;
    private javax.swing.JLabel jLabelEmmanuel;
    private javax.swing.JLabel jLabelEntrega;
    private javax.swing.JLabel jLabelEquipo;
    private javax.swing.JLabel jLabelErik;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelGabriel;
    private javax.swing.JLabel jLabelGeorgina;
    private javax.swing.JLabel jLabelIsrael;
    private javax.swing.JLabel jLabelMateria;
    private javax.swing.JLabel jLabelProgramacion;
    private javax.swing.JLabel jLabelUAA;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelIntegrantes;
    private javax.swing.JPanel jPanelPortada;
    private javax.swing.JPanel jPanelSeccion;
    // End of variables declaration//GEN-END:variables

}