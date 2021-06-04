//---Paquete---//.
package com.operaciones;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import java.awt.Color;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

//---Clase pública---//.
public class CheckOut extends javax.swing.JInternalFrame {

    //---Atributos adicionales---//.
    private PDRectangle contorno;
    private float alturaHorizontal;
    private PDPageContentStream contenido;
    private String nombreCompleto;
    private String ciudad;
    private Calendar diaActual;
    private Calendar fechaIngreso;
    private Calendar fechaSalida;
    private int diasHospedaje;
    private String numeroHabitacion;
    private String tipoHabitacion;
    private double precioPorHabitacion;
    private double precioSinExtra;
    private double precioTotal;
    private ArrayList<String> cargosExtra = new ArrayList<>();
    
    //---Constructor---//.
    public CheckOut() {
        initComponents();
        extraInitProcess();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCheckOut = new javax.swing.JPanel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldHabitacion = new javax.swing.JTextField();
        jLabelHabitación = new javax.swing.JLabel();
        jButtonCuenta = new javax.swing.JButton();
        jButtonRecibo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCuenta = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jPanelCheckOut.setBackground(new java.awt.Color(255, 232, 205));

        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/close.png"))); // NOI18N
        jLabelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(72, 72, 72));
        jLabelTitulo.setText("Check Out");

        jTextFieldHabitacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextFieldHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHabitacionKeyTyped(evt);
            }
        });

        jLabelHabitación.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelHabitación.setText("Número de habitación:");

        jButtonCuenta.setBackground(new java.awt.Color(228, 130, 0));
        jButtonCuenta.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/invoice.png"))); // NOI18N
        jButtonCuenta.setText("Generar cuenta");
        jButtonCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButtonCuenta.setBorderPainted(false);
        jButtonCuenta.setContentAreaFilled(false);
        jButtonCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCuenta.setFocusPainted(false);
        jButtonCuenta.setOpaque(true);
        jButtonCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCuentaMouseExited(evt);
            }
        });
        jButtonCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuentaActionPerformed(evt);
            }
        });

        jButtonRecibo.setBackground(new java.awt.Color(228, 130, 0));
        jButtonRecibo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonRecibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/text-file.png"))); // NOI18N
        jButtonRecibo.setText("Generar Recibo");
        jButtonRecibo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButtonRecibo.setBorderPainted(false);
        jButtonRecibo.setContentAreaFilled(false);
        jButtonRecibo.setEnabled(false);
        jButtonRecibo.setFocusPainted(false);
        jButtonRecibo.setOpaque(true);
        jButtonRecibo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonReciboMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonReciboMouseExited(evt);
            }
        });
        jButtonRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReciboActionPerformed(evt);
            }
        });

        jTextAreaCuenta.setEditable(false);
        jTextAreaCuenta.setColumns(20);
        jTextAreaCuenta.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextAreaCuenta.setRows(5);
        jScrollPane1.setViewportView(jTextAreaCuenta);

        javax.swing.GroupLayout jPanelCheckOutLayout = new javax.swing.GroupLayout(jPanelCheckOut);
        jPanelCheckOut.setLayout(jPanelCheckOutLayout);
        jPanelCheckOutLayout.setHorizontalGroup(
            jPanelCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckOutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCheckOutLayout.createSequentialGroup()
                        .addComponent(jLabelCerrar)
                        .addGap(341, 341, 341)
                        .addComponent(jLabelTitulo)
                        .addGap(0, 378, Short.MAX_VALUE))
                    .addGroup(jPanelCheckOutLayout.createSequentialGroup()
                        .addGroup(jPanelCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanelCheckOutLayout.createSequentialGroup()
                                .addComponent(jLabelHabitación)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCheckOutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCheckOutLayout.setVerticalGroup(
            jPanelCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckOutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelCerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHabitación)
                    .addComponent(jTextFieldHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCuenta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRecibo)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-Validación para evitar que se introduzcan más de tres caracteres en el JTextField.
    private void jTextFieldHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHabitacionKeyTyped
        if(this.jTextFieldHabitacion.getText().length() > 2) {
            evt.consume();
        }
        else {
            this.jTextAreaCuenta.setText("");
            if(!this.jButtonCuenta.isEnabled()) this.jButtonCuenta.setEnabled(true);
            if(this.jButtonRecibo.isEnabled()) this.jButtonRecibo.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldHabitacionKeyTyped

    //-Generar el recibo, en un documento .pdf, de lo que el huésped debe pagar.
    private void jButtonReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReciboActionPerformed
        ConexionMySQL conexion = null;
        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();
            
            try {
                DecimalFormat formato = new DecimalFormat("###,##0.00");
                DecimalFormat formato2 = new DecimalFormat("######.##");
                        
                //El respectivo registro se inhabilita en la base de datos.
                //Se almacena el costo total a pagar.
                conexion.actualizarDatos("huespedes", "active = 0, expense = " + formato2.format(this.precioTotal), 
                " WHERE room_id = " + this.numeroHabitacion + " AND active = 1");
                
                try{  
                    //Definición de la estructura del documento.
                    PDDocument documento = new PDDocument();
                    PDPage pagina = new PDPage(PDRectangle.A4);
                    this.contorno = pagina.getCropBox();
                    this.alturaHorizontal = contorno.getHeight();
                    documento.addPage(pagina);

                    //Manipulación del contenido de la primera página del documento.
                    this.contenido = new PDPageContentStream(documento, pagina);

                    //Dibujar la firma del gerente.
                    PDImageXObject firma = PDImageXObject.createFromFile("src/img/recibo/firma.png", documento);
                    contenido.drawImage(firma, 91, pagina.getMediaBox().getHeight() - 800);

                    //Dibujar el logotipo del hotel.
                    PDImageXObject logo = PDImageXObject.createFromFile("src/img/recibo/logo.png", documento);
                    contenido.drawImage(logo, (pagina.getMediaBox().getWidth() - logo.getWidth()) / 2, pagina.getMediaBox().getHeight() - 120);

                    //Imprimir el texto del documento.
                    this.imprimirTextoCentrado("Sábanas limpias, agua caliente y tragos fuertes", 24, 140, PDType1Font.TIMES_BOLD_ITALIC);
                    this.imprimirTextoCentrado("Ubicación: Blvrd Riviera AJEI 254, Nuevo Vallarta, Nayarit", 16, 165, PDType1Font.TIMES_BOLD);
                    this.imprimirTexto(this.generarFecha("actual", this.diaActual, this.diaActual.getTime()), 14, 60, 210, PDType1Font.COURIER);
                    this.imprimirTexto("Nombre del huésped: " + this.nombreCompleto, 14, 60, 230, PDType1Font.COURIER);
                    this.imprimirTexto("Ciudad de origen: " + this.ciudad, 14, 60, 250, PDType1Font.COURIER);
            
                    this.imprimirTexto(this.generarFecha("de ingreso", this.fechaIngreso, this.fechaIngreso.getTime()), 14, 60, 285, PDType1Font.COURIER);
                    this.imprimirTexto(this.generarFecha("de salida", this.fechaSalida, this.fechaSalida.getTime()), 14, 60, 305, PDType1Font.COURIER);
                    this.imprimirTexto("Cantidad de días de hospedaje: " + this.diasHospedaje, 14, 60, 325, PDType1Font.COURIER);
            
                    switch(this.tipoHabitacion) {
                        case "S":
                            this.imprimirTexto("Tipo de habitación: Chaac Suite (simple)", 14, 60, 360, PDType1Font.COURIER);
                            break;
                
                        case "D":
                            this.imprimirTexto("Tipo de habitación: Itzamná Suite (doble)", 14, 60, 360, PDType1Font.COURIER);
                            break;
                
                        case "T":
                            this.imprimirTexto("Tipo de habitación: Kauil Suite (triple)", 14, 60, 360, PDType1Font.COURIER);
                            break;
                    }
                    this.imprimirTexto("Número de la habitación: " + this.numeroHabitacion, 14, 60, 380, PDType1Font.COURIER);
                    this.imprimirTexto("Costo de la habitación (por noche): $" + formato.format(this.precioPorHabitacion), 14, 60, 400, PDType1Font.COURIER);

                    this.imprimirTexto("Total a pagar (sin gastos extra): $" + formato.format(this.precioSinExtra), 14, 60, 435, PDType1Font.COURIER_BOLD_OBLIQUE);
                    this.imprimirTexto("Total a pagar (con gastos extra): $" + formato.format(this.precioTotal), 14, 60, 455, PDType1Font.COURIER_BOLD_OBLIQUE);

                    this.imprimirTexto("Lista de gastos extra:", 14, 60, 490, PDType1Font.COURIER);
                    for(int i = 0; i < this.cargosExtra.size(); i++) {
                        this.imprimirTexto(this.cargosExtra.get(i), 13, 80, 520 + (i * 20), PDType1Font.COURIER);
                    }
            
                    this.imprimirTexto("____________________", 16, 60, 780, PDType1Font.TIMES_BOLD);
                    this.imprimirTexto("Francisco de la Cruz Padilla", 13, 61, 800, PDType1Font.TIMES_BOLD);
                    this.imprimirTexto("Director de AJEI's Business", 11, 77, 814, PDType1Font.TIMES_ITALIC);
                    this.imprimirTexto("AJEI Resort agradece enormemente", 16, 285, 778, PDType1Font.TIMES_BOLD_ITALIC);
                    this.imprimirTexto("su estancia. ¡Vuelva pronto!", 16, 312, 798, PDType1Font.TIMES_BOLD_ITALIC);

                    contenido.close();
                    String ruta = "doc/Registros/Recibo " + this.nombreCompleto + ".pdf";
                    ruta = ruta.replace(' ', '-');
                    documento.save(ruta);
            
                    JOptionPane.showMessageDialog(this, "Recibo generado "
                    + "exitosamente.\nEste puede encontrarse en la carpeta doc/Registros/."
                    , "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            
                    //Se vacía la información previamente generada en el menú.
                    this.jTextFieldHabitacion.setText("");
                    this.jTextAreaCuenta.setText("");
                    this.jButtonCuenta.setEnabled(true);
                    this.jButtonRecibo.setEnabled(false);
                }
                catch(Exception ex) {
                    JOptionPane.showMessageDialog(this, "Errores ocurridos durante "
                    + "la generación del recibo en pdf y/o registro de información.\n"
                    , "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
            catch(SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ocurrió un error durante la "
                + " modificación del registro.\nSQLException: " + ex.getMessage()
                + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                "Error", JOptionPane.ERROR_MESSAGE);
            }       
        } 
        catch(Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No fue posible realizar la "
            + "conexión con la base de datos.\n" + "Verifique si el servidor "
            + "XAMPP o MySQL local se encuentra activado."
            , "Error", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            if(conexion != null) conexion.cerrarConexion();
        }
    }//GEN-LAST:event_jButtonReciboActionPerformed

    //-Generar la cuenta que el huésped pagará-//.
    private void jButtonCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuentaActionPerformed
        if(this.jTextFieldHabitacion.getText().length() > 0) {
            this.extraInitProcess();
            this.jTextAreaCuenta.setText("");
            ConexionMySQL conexion = null;
            
            try {
                //Conexión a la base de datos.
                conexion = new ConexionMySQL();
            
                try {
                    this.numeroHabitacion = this.jTextFieldHabitacion.getText().trim();
                
                    //Consultar en la base de datos todos los datos de los huéspedes alojados.
                    ResultSet consulta = conexion.consultarTabla("huespedes",
                    "a.name, a.city, a.check_in, a.check_out, a.days, "
                    + "a.room_type, a.extras, "
                    + "b.room_service, b.bar_access, b.cleaner_service, "
                    + "b.SPA_service, b.baby_sister_service, b.gym_access, "
                    + "b.gaming_access, b.tennis_access, b.bow_shooting, "
                    + "b.golf_access", " AS a JOIN servicios AS b ON a.guest_id "
                    + "= b.guest_id WHERE active = 1 AND room_id = '" + this.numeroHabitacion 
                    + "' LIMIT 1");

                    //Si la consulta fue exitosa, entonces los datos del huésped se almacenarán.
                    //La cantidad de dinero a pagar será calculada y mostrada.
                    if(consulta.next()) {
                        DecimalFormat formato = new DecimalFormat("###,##0.00");
                        
                        this.nombreCompleto = consulta.getString("a.name");
                        this.ciudad = consulta.getString("a.city");
                        
                        this.fechaIngreso = Calendar.getInstance();
                        this.fechaIngreso.setTimeInMillis(consulta.getDate("a.check_in").getTime());
                        this.fechaSalida = Calendar.getInstance();
                        this.fechaSalida.setTimeInMillis(consulta.getDate("a.check_out").getTime());
                        
                        this.diasHospedaje = consulta.getInt("a.days");
                        this.tipoHabitacion = consulta.getString("a.room_type");
                        
                        //Consultar en la base de datos el precio del tipo de habitación correspondiente.
                        ResultSet consulta2 = conexion.consultarTabla("precios",
                        "price", " WHERE room_type = '" + this.tipoHabitacion + "'");
                        
                        if(consulta2.next()) {
                            //Se calcula el precio total de la habitación, según los días de hospedaje.
                            this.precioPorHabitacion = consulta2.getDouble("price");
                            this.precioSinExtra = this.precioPorHabitacion * this.diasHospedaje;
                            this.precioTotal = this.precioSinExtra;
                            
                            //Se agregan los costos de los servicios extra correspondientes.
                            switch(consulta.getInt("a.extras")) {
                                case 1: 
                                    this.precioTotal += (714 * this.diasHospedaje);
                                    this.cargosExtra.add(0, "-Una persona extra  -----------------> $" + formato.format((this.diasHospedaje * 714)));
                                    break;   
                                    
                                case 2:
                                    this.precioTotal += 1428 * (this.diasHospedaje);
                                    this.cargosExtra.add(0, "-Dos personas extra  ----------------> $" + formato.format((this.diasHospedaje * 1428)));
                                    break;
                                    
                                default:
                                    this.cargosExtra.add(0, "-Ninguna persona extra  -------------> N/A");
                                    break;   
                            }

                            if(consulta.getInt("b.room_service") == 1){ 
                                this.precioTotal += 1051;
                                this.cargosExtra.set(1, this.cargosExtra.get(1).concat("$1,051.00"));
                            }
                            else {
                                this.cargosExtra.set(1, this.cargosExtra.get(1).concat("N/A"));
                            }
                            
                            if(consulta.getInt("b.bar_access") == 1){ 
                                this.precioTotal += 151.12;
                                this.cargosExtra.set(2, this.cargosExtra.get(2).concat("$151.12"));
                            }
                            else {
                                this.cargosExtra.set(2, this.cargosExtra.get(2).concat("N/A"));
                            }
                            
                            if(consulta.getInt("b.cleaner_service") == 1){ 
                                this.precioTotal += 51.76;
                                this.cargosExtra.set(3, this.cargosExtra.get(3).concat("$51.76"));
                            }
                            else {
                                this.cargosExtra.set(3, this.cargosExtra.get(3).concat("N/A"));
                            }
                            
                            if(consulta.getInt("b.SPA_service") == 1){ 
                                this.precioTotal += 371;
                                this.cargosExtra.set(4, this.cargosExtra.get(4).concat("$371.00"));
                            }
                            else {
                                this.cargosExtra.set(4, this.cargosExtra.get(4).concat("N/A"));
                            }
                            
                            if(consulta.getInt("b.baby_sister_service") == 1){ 
                                this.precioTotal += 1481;
                                this.cargosExtra.set(5, this.cargosExtra.get(5).concat("$1,481.00"));
                            }
                            else {
                                this.cargosExtra.set(5, this.cargosExtra.get(5).concat("N/A"));
                            }
                            
                            if(consulta.getInt("b.gym_access") == 1){ 
                                this.precioTotal += 312.61;
                                this.cargosExtra.set(6, this.cargosExtra.get(6).concat("$312.61"));
                            }
                            else {
                                this.cargosExtra.set(6, this.cargosExtra.get(6).concat("N/A")); 
                            }
                            
                            if(consulta.getInt("b.gaming_access") == 1){ 
                                this.precioTotal += 27.12;
                                this.cargosExtra.set(7, this.cargosExtra.get(7).concat("$27.12"));
                            }
                            else {
                                this.cargosExtra.set(7, this.cargosExtra.get(7).concat("N/A")); 
                            }
                            
                            if(consulta.getInt("b.tennis_access") == 1){ 
                                this.precioTotal += 199.92;
                                this.cargosExtra.set(8, this.cargosExtra.get(8).concat("$199.92"));
                            }
                            else {
                                this.cargosExtra.set(8, this.cargosExtra.get(8).concat("N/A")); 
                            }
                            
                            if(consulta.getInt("b.bow_shooting") == 1){ 
                                this.precioTotal += 541.42;
                                this.cargosExtra.set(9, this.cargosExtra.get(9).concat("$541.42"));
                            }
                            else {
                                this.cargosExtra.set(9, this.cargosExtra.get(9).concat("N/A")); 
                            }
                            
                            if(consulta.getInt("b.golf_access") == 1){ 
                                this.precioTotal += 661.13;
                                this.cargosExtra.set(10, this.cargosExtra.get(10).concat("$661.13"));
                            }
                            else {
                                this.cargosExtra.set(10, this.cargosExtra.get(10).concat("N/A")); 
                            }
                            
                            //Imprimir la cuenta a pagar.
                            //Imprimir el nombre del huésped.
                            this.jTextAreaCuenta.append("\nNombre del huésped: " + this.nombreCompleto + ".\n");
                            
                            //Imprimir la ciudad de origen.
                            this.jTextAreaCuenta.append("Ciudad de origen: " + this.ciudad + ".\n\n");
                            
                            //Imprimir la fecha actual.
                            this.diaActual = Calendar.getInstance();
                            this.diaActual.setTime(new Date());
                            this.jTextAreaCuenta.append(this.generarFecha("actual", this.diaActual, this.diaActual.getTime()) + ".\n");
                            
                            //Imprimir la fecha de ingreso.
                            this.jTextAreaCuenta.append(this.generarFecha("de ingreso", this.fechaIngreso, this.fechaIngreso.getTime()) + ".\n");
                            
                            //Imprimir la fecha de salida.
                            this.jTextAreaCuenta.append(this.generarFecha("de salida", this.fechaSalida, this.fechaSalida.getTime()) + ".\n\n");
                            
                            //Imprimir el número de habitación.
                            this.jTextAreaCuenta.append("Número de habitación: " + this.numeroHabitacion + ".\n");
                            
                            //Imprimir el tipo de habitación.
                            this.jTextAreaCuenta.append("Tipo de habitación: ");
                            switch(this.tipoHabitacion) {
                                case "S":
                                    this.jTextAreaCuenta.append("Chaac Suite (simple).\n");   
                                    break;
                
                                case "D":
                                    this.jTextAreaCuenta.append("Itzamná Suite (doble).\n");   
                                    break;
                
                                case "T":
                                    this.jTextAreaCuenta.append("Kauil Suite (triple).\n");   
                                    break;
                            }
                            
                            //Imprimir el costo de la habitación.
                            this.jTextAreaCuenta.append("Costo del tipo de habitación (por noche): $" + formato.format(this.precioPorHabitacion) + ".\n\n");
                            
                            //Imprimir los días de hospedaje.
                            this.jTextAreaCuenta.append("Días de hospedaje: " + this.diasHospedaje + ".\n");
                            
                            //Imprimir el costo de la estancia, sin incluir servicios extra.
                            this.jTextAreaCuenta.append("Total a pagar (sin gastos extra): $" + formato.format(this.precioSinExtra) + ".\n");
                            
                            //Imprimir el costo total de la estancia.
                            this.jTextAreaCuenta.append("Total a pagar (con gastos extra): $" + formato.format(this.precioTotal) + ".\n\n");
                            
                            //Imprimir la lista de cargos extra.
                            this.jTextAreaCuenta.append("Lista de gastos extra:\n\n");
                            for(int i = 0; i < this.cargosExtra.size(); i++) {
                                this.jTextAreaCuenta.append(this.cargosExtra.get(i) + ".\n");
                            }
                            
                            //Habilitar la opción para generar el recibo.
                            if(this.jButtonCuenta.isEnabled()) this.jButtonCuenta.setEnabled(false);
                            if(!this.jButtonRecibo.isEnabled()) this.jButtonRecibo.setEnabled(true);
                        }
                        else {
                            throw new SQLException();
                        }
                    }
                    else {
                        try {
                            int numero = Integer.parseInt(this.numeroHabitacion);
                        
                            if(numero <= 215 && numero >= 201 || numero <= 115 && numero >= 101) {
                                this.jTextAreaCuenta.setText("La habitación no se encuentra ocupada por algún huésped.");
                            }
                            else {
                                this.jTextAreaCuenta.setText("La habitación es inexistente.");
                            }
                        }
                        catch(NumberFormatException ex) {
                            JOptionPane.showMessageDialog(this, "La entrada es inválida.\n"
                            + "Solo es posible introducir números."
                            , "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                catch(SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Ocurrió un error durante la "
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
        else {
            JOptionPane.showMessageDialog(this, "Es necesario introducir "
            + "el número de la habitación a buscar."
            , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCuentaActionPerformed

    //-Cerrar el menú para realizar el check-out-//.
    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    //-Indicar que el cursor se ha posicionado en el botón para generar la cuenta-//.
    private void jButtonCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCuentaMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonCuenta.setBackground(color);
    }//GEN-LAST:event_jButtonCuentaMouseEntered

    //-Indicar que el cursor dejó de posicionarse en el botón para generar la cuenta-//.
    private void jButtonCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCuentaMouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonCuenta.setBackground(color);
    }//GEN-LAST:event_jButtonCuentaMouseExited

    //-Indicar que el cursor se ha posicionado en el botón para generar el recibo-//.
    private void jButtonReciboMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonReciboMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonRecibo.setBackground(color);
    }//GEN-LAST:event_jButtonReciboMouseEntered

    //-Indicar que el cursor dejó de posicionarse en el botón para generar el recibo-//.
    private void jButtonReciboMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonReciboMouseExited
        Color color = new Color(Integer.parseInt("E48200", 16));
        this.jButtonRecibo.setBackground(color);
    }//GEN-LAST:event_jButtonReciboMouseExited

    //-Se predefine la impresión de los servicios adicionales-//.
    private void extraInitProcess() {
        this.cargosExtra.clear();
        this.cargosExtra.add("-Atención al cuarto  ----------------> ");
        this.cargosExtra.add("-Servicio de bar  -------------------> ");
        this.cargosExtra.add("-Servicio de tintorería  ------------> ");
        this.cargosExtra.add("-Servicio de SPA  -------------------> ");
        this.cargosExtra.add("-Contratación de niñera  ------------> ");
        this.cargosExtra.add("-Acceso a gimnasio  -----------------> ");
        this.cargosExtra.add("-Acceso a zona de juegos  -----------> ");
        this.cargosExtra.add("-Acceso a canchas de tennis ---------> ");
        this.cargosExtra.add("-Acceso a campo de tiro con arco  ---> ");
        this.cargosExtra.add("-Acceso a campo de golf  ------------> ");
    }
    
    //-Se retorna la impresión de una fecha específica-//.
    private String generarFecha(String tipoFecha, Calendar calendario, Date fecha) {
        //Imprimir la fecha de salida.
        String mes;

        //Definir el mes.
        switch(calendario.get(Calendar.MONTH)) {
            case 0: mes = " enero "; break;
            case 1: mes = " febrero "; break;
            case 2: mes = " marzo "; break;
            case 3: mes = " abril "; break;
            case 4: mes = " mayo "; break;
            case 5: mes = " junio "; break;
            case 6: mes = " julio "; break;
            case 7: mes = " agosto "; break;
            case 8: mes = " septiembre "; break;
            case 9: mes = " octubre "; break;
            case 10: mes = " noviembre "; break;
            case 11: mes = " diciembre "; break;
            default: mes = " indefinido "; break;
        }

        SimpleDateFormat formato1 = new SimpleDateFormat("dd 'de'");
        SimpleDateFormat formato2 = new SimpleDateFormat("yyyy");
        return "Fecha " + tipoFecha + ": " + formato1.format(fecha) + mes + "de " + formato2.format(fecha);
    }
    
    //-Imprimir una línea horizontalmente centrada-//.
    private void imprimirTextoCentrado(String texto, int longitud, float posicionVertical, PDFont fuente) {
        float longitudTexto;
        float posicionX;
        try {
            this.contenido.beginText();
            longitudTexto = fuente.getStringWidth(texto) /1000 * longitud;
            posicionX = (this.contorno.getWidth() - longitudTexto) / 2;
            this.contenido.setFont(fuente, longitud);
            this.contenido.newLineAtOffset(posicionX, this.alturaHorizontal - posicionVertical);
            this.contenido.showText(texto);
            this.contenido.endText();
        } 
        catch(IOException ex) {
            System.out.println("Ocurrió un error al generar el texto centrado.");
            ex.printStackTrace();
        }    
    }
    
    //-Imprimir una línea de texto-//.
    private void imprimirTexto(String texto, int longitud, float posicionHorizontal, float posicionVertical, PDFont fuente) {
        try {
            this.contenido.beginText();
            this.contenido.setFont(fuente, longitud);
            this.contenido.newLineAtOffset(posicionHorizontal, alturaHorizontal - posicionVertical);
            this.contenido.showText(texto);
            this.contenido.endText();
        } 
        catch(IOException ex) {
            System.out.println("Ocurrió un error al generar el texto.");
            ex.printStackTrace();
        }    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCuenta;
    private javax.swing.JButton jButtonRecibo;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelHabitación;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCheckOut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaCuenta;
    private javax.swing.JTextField jTextFieldHabitacion;
    // End of variables declaration//GEN-END:variables
}