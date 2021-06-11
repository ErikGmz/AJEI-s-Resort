//---Paquete---//.
package com.operaciones;

//---Sentencias import---//.
import com.bases_de_datos.ConexionMySQL;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

//---Clase pública---//.
public class Estadisticas extends javax.swing.JInternalFrame implements Runnable {

    //---Constructor---//.
    public Estadisticas() {
        initComponents();
    }

    //---Métodos---//.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jPanelOcupacionHotelera = new javax.swing.JPanel();
        jLabelImgOcupacionHotelera = new javax.swing.JLabel();
        jPanelGraficosOcupacion = new javax.swing.JPanel();
        jButtonOcupacionTotal = new javax.swing.JButton();
        jLabelBtnOcup1 = new javax.swing.JLabel();
        jButtonOcupacionSimple = new javax.swing.JButton();
        jLabelBtnOcup2 = new javax.swing.JLabel();
        jButtonOcupacionDoble = new javax.swing.JButton();
        jLabelBtnOcup3 = new javax.swing.JLabel();
        jLabelBtnOcup4 = new javax.swing.JLabel();
        jButtonOcupacionTriple = new javax.swing.JButton();
        jLabelOcupacionHotelera = new javax.swing.JLabel();
        jPanelIngresosTotales = new javax.swing.JPanel();
        jLabelImgIngresosTotales = new javax.swing.JLabel();
        jLabelIngresosTotales = new javax.swing.JLabel();
        jLabelTxtIngresosTotales = new javax.swing.JLabel();
        jPanelTotalHuespedes = new javax.swing.JPanel();
        jLabelImgTotalHuespedes = new javax.swing.JLabel();
        jLabelTotalHuespedes = new javax.swing.JLabel();
        jLabelTxtIngresosTotales1 = new javax.swing.JLabel();
        jPanelServicios = new javax.swing.JPanel();
        jLabelServicios = new javax.swing.JLabel();
        jPanelGraficoServicios = new javax.swing.JPanel();
        jPanelTotalHabitaciones = new javax.swing.JPanel();
        jLabelTotalHabitaciones = new javax.swing.JLabel();
        jPanelGraficoTotalHabitaciones = new javax.swing.JPanel();
        jPanelPreciosHabitaciones = new javax.swing.JPanel();
        jPanelPrecioSencilla = new javax.swing.JPanel();
        jLabelTxtPrecioSencilla = new javax.swing.JLabel();
        jLabelPrecioSencilla = new javax.swing.JLabel();
        jLabelTxtPrecioSencilla2 = new javax.swing.JLabel();
        jPanelPrecioDoble = new javax.swing.JPanel();
        jLabelTxtPrecioDoble = new javax.swing.JLabel();
        jLabelTxtPrecioDoble2 = new javax.swing.JLabel();
        jLabelPrecioDoble = new javax.swing.JLabel();
        jPanelPrecioTriple = new javax.swing.JPanel();
        jLabelTxtPrecioTriple = new javax.swing.JLabel();
        jLabelTxtPrecioTriple2 = new javax.swing.JLabel();
        jLabelPrecioTriple = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        setPreferredSize(new java.awt.Dimension(880, 580));

        jPanelBase.setBackground(new java.awt.Color(255, 232, 205));

        jLabelTitulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(72, 72, 72));
        jLabelTitulo.setText("Estadísticas");

        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/close.png"))); // NOI18N
        jLabelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });

        jPanelOcupacionHotelera.setBackground(new java.awt.Color(255, 163, 51));

        jLabelImgOcupacionHotelera.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelImgOcupacionHotelera.setForeground(new java.awt.Color(0, 102, 0));
        jLabelImgOcupacionHotelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/pie-chart.png"))); // NOI18N
        jLabelImgOcupacionHotelera.setText("Ocupación Hotelera");

        jPanelGraficosOcupacion.setBackground(new java.awt.Color(255, 163, 51));

        javax.swing.GroupLayout jPanelGraficosOcupacionLayout = new javax.swing.GroupLayout(jPanelGraficosOcupacion);
        jPanelGraficosOcupacion.setLayout(jPanelGraficosOcupacionLayout);
        jPanelGraficosOcupacionLayout.setHorizontalGroup(
            jPanelGraficosOcupacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        jPanelGraficosOcupacionLayout.setVerticalGroup(
            jPanelGraficosOcupacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButtonOcupacionTotal.setBackground(new java.awt.Color(255, 163, 51));
        jButtonOcupacionTotal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonOcupacionTotal.setText("Total");
        jButtonOcupacionTotal.setAutoscrolls(true);
        jButtonOcupacionTotal.setBorder(null);
        jButtonOcupacionTotal.setBorderPainted(false);
        jButtonOcupacionTotal.setContentAreaFilled(false);
        jButtonOcupacionTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOcupacionTotal.setFocusPainted(false);
        jButtonOcupacionTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonOcupacionTotal.setIconTextGap(10);
        jButtonOcupacionTotal.setInheritsPopupMenu(true);
        jButtonOcupacionTotal.setOpaque(true);
        jButtonOcupacionTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonOcupacionTotalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonOcupacionTotalMouseExited(evt);
            }
        });
        jButtonOcupacionTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOcupacionTotalActionPerformed(evt);
            }
        });

        jLabelBtnOcup1.setBackground(new java.awt.Color(175, 87, 0));
        jLabelBtnOcup1.setToolTipText("");
        jLabelBtnOcup1.setOpaque(true);

        jButtonOcupacionSimple.setBackground(new java.awt.Color(255, 163, 51));
        jButtonOcupacionSimple.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonOcupacionSimple.setText("Chaac Suite");
        jButtonOcupacionSimple.setAutoscrolls(true);
        jButtonOcupacionSimple.setBorder(null);
        jButtonOcupacionSimple.setBorderPainted(false);
        jButtonOcupacionSimple.setContentAreaFilled(false);
        jButtonOcupacionSimple.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOcupacionSimple.setFocusPainted(false);
        jButtonOcupacionSimple.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonOcupacionSimple.setIconTextGap(10);
        jButtonOcupacionSimple.setInheritsPopupMenu(true);
        jButtonOcupacionSimple.setOpaque(true);
        jButtonOcupacionSimple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonOcupacionSimpleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonOcupacionSimpleMouseExited(evt);
            }
        });
        jButtonOcupacionSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOcupacionSimpleActionPerformed(evt);
            }
        });

        jLabelBtnOcup2.setBackground(new java.awt.Color(175, 87, 0));
        jLabelBtnOcup2.setToolTipText("");
        jLabelBtnOcup2.setOpaque(true);

        jButtonOcupacionDoble.setBackground(new java.awt.Color(255, 163, 51));
        jButtonOcupacionDoble.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonOcupacionDoble.setText("Itzamná Suite");
        jButtonOcupacionDoble.setAutoscrolls(true);
        jButtonOcupacionDoble.setBorder(null);
        jButtonOcupacionDoble.setBorderPainted(false);
        jButtonOcupacionDoble.setContentAreaFilled(false);
        jButtonOcupacionDoble.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOcupacionDoble.setFocusPainted(false);
        jButtonOcupacionDoble.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonOcupacionDoble.setIconTextGap(10);
        jButtonOcupacionDoble.setInheritsPopupMenu(true);
        jButtonOcupacionDoble.setOpaque(true);
        jButtonOcupacionDoble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonOcupacionDobleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonOcupacionDobleMouseExited(evt);
            }
        });
        jButtonOcupacionDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOcupacionDobleActionPerformed(evt);
            }
        });

        jLabelBtnOcup3.setBackground(new java.awt.Color(175, 87, 0));
        jLabelBtnOcup3.setToolTipText("");
        jLabelBtnOcup3.setOpaque(true);

        jLabelBtnOcup4.setBackground(new java.awt.Color(175, 87, 0));
        jLabelBtnOcup4.setToolTipText("");
        jLabelBtnOcup4.setOpaque(true);

        jButtonOcupacionTriple.setBackground(new java.awt.Color(255, 163, 51));
        jButtonOcupacionTriple.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonOcupacionTriple.setText("Kauil Suite");
        jButtonOcupacionTriple.setAutoscrolls(true);
        jButtonOcupacionTriple.setBorder(null);
        jButtonOcupacionTriple.setBorderPainted(false);
        jButtonOcupacionTriple.setContentAreaFilled(false);
        jButtonOcupacionTriple.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOcupacionTriple.setFocusPainted(false);
        jButtonOcupacionTriple.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonOcupacionTriple.setIconTextGap(10);
        jButtonOcupacionTriple.setInheritsPopupMenu(true);
        jButtonOcupacionTriple.setOpaque(true);
        jButtonOcupacionTriple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonOcupacionTripleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonOcupacionTripleMouseExited(evt);
            }
        });
        jButtonOcupacionTriple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOcupacionTripleActionPerformed(evt);
            }
        });

        jLabelOcupacionHotelera.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelOcupacionHotelera.setForeground(new java.awt.Color(0, 102, 0));
        jLabelOcupacionHotelera.setText("0.00 %");

        javax.swing.GroupLayout jPanelOcupacionHoteleraLayout = new javax.swing.GroupLayout(jPanelOcupacionHotelera);
        jPanelOcupacionHotelera.setLayout(jPanelOcupacionHoteleraLayout);
        jPanelOcupacionHoteleraLayout.setHorizontalGroup(
            jPanelOcupacionHoteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOcupacionHoteleraLayout.createSequentialGroup()
                .addGroup(jPanelOcupacionHoteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOcupacionHoteleraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelImgOcupacionHotelera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelOcupacionHotelera))
                    .addGroup(jPanelOcupacionHoteleraLayout.createSequentialGroup()
                        .addGroup(jPanelOcupacionHoteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelOcupacionHoteleraLayout.createSequentialGroup()
                                .addComponent(jLabelBtnOcup1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButtonOcupacionTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelOcupacionHoteleraLayout.createSequentialGroup()
                                .addComponent(jLabelBtnOcup2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButtonOcupacionSimple))
                            .addGroup(jPanelOcupacionHoteleraLayout.createSequentialGroup()
                                .addComponent(jLabelBtnOcup3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButtonOcupacionDoble))
                            .addGroup(jPanelOcupacionHoteleraLayout.createSequentialGroup()
                                .addComponent(jLabelBtnOcup4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButtonOcupacionTriple)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelGraficosOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanelOcupacionHoteleraLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonOcupacionDoble, jButtonOcupacionSimple, jButtonOcupacionTotal, jButtonOcupacionTriple});

        jPanelOcupacionHoteleraLayout.setVerticalGroup(
            jPanelOcupacionHoteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOcupacionHoteleraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOcupacionHoteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelImgOcupacionHotelera)
                    .addComponent(jLabelOcupacionHotelera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOcupacionHoteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOcupacionHoteleraLayout.createSequentialGroup()
                        .addGroup(jPanelOcupacionHoteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelBtnOcup1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOcupacionTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelOcupacionHoteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelBtnOcup2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOcupacionSimple, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelOcupacionHoteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelBtnOcup3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOcupacionDoble, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelOcupacionHoteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelBtnOcup4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOcupacionTriple, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelGraficosOcupacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelIngresosTotales.setBackground(new java.awt.Color(255, 163, 51));
        jPanelIngresosTotales.setPreferredSize(new java.awt.Dimension(160, 70));

        jLabelImgIngresosTotales.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelImgIngresosTotales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/Money-bag-dollar.png"))); // NOI18N

        jLabelIngresosTotales.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelIngresosTotales.setForeground(new java.awt.Color(0, 102, 255));
        jLabelIngresosTotales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIngresosTotales.setText("$ 0.00");

        jLabelTxtIngresosTotales.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelTxtIngresosTotales.setForeground(new java.awt.Color(0, 102, 255));
        jLabelTxtIngresosTotales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTxtIngresosTotales.setText("Ingresos Totales");

        javax.swing.GroupLayout jPanelIngresosTotalesLayout = new javax.swing.GroupLayout(jPanelIngresosTotales);
        jPanelIngresosTotales.setLayout(jPanelIngresosTotalesLayout);
        jPanelIngresosTotalesLayout.setHorizontalGroup(
            jPanelIngresosTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIngresosTotalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImgIngresosTotales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelIngresosTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIngresosTotales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTxtIngresosTotales, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
        );
        jPanelIngresosTotalesLayout.setVerticalGroup(
            jPanelIngresosTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIngresosTotalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIngresosTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImgIngresosTotales)
                    .addGroup(jPanelIngresosTotalesLayout.createSequentialGroup()
                        .addComponent(jLabelTxtIngresosTotales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelIngresosTotales)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTotalHuespedes.setBackground(new java.awt.Color(255, 163, 51));
        jPanelTotalHuespedes.setPreferredSize(new java.awt.Dimension(160, 70));

        jLabelImgTotalHuespedes.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelImgTotalHuespedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/Persons.png"))); // NOI18N

        jLabelTotalHuespedes.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelTotalHuespedes.setForeground(new java.awt.Color(162, 3, 34));
        jLabelTotalHuespedes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotalHuespedes.setText("0");
        jLabelTotalHuespedes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelTxtIngresosTotales1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelTxtIngresosTotales1.setForeground(new java.awt.Color(162, 3, 34));
        jLabelTxtIngresosTotales1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTxtIngresosTotales1.setText("Total De Huéspedes");

        javax.swing.GroupLayout jPanelTotalHuespedesLayout = new javax.swing.GroupLayout(jPanelTotalHuespedes);
        jPanelTotalHuespedes.setLayout(jPanelTotalHuespedesLayout);
        jPanelTotalHuespedesLayout.setHorizontalGroup(
            jPanelTotalHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTotalHuespedesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelImgTotalHuespedes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelTotalHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTotalHuespedes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTxtIngresosTotales1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanelTotalHuespedesLayout.setVerticalGroup(
            jPanelTotalHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTotalHuespedesLayout.createSequentialGroup()
                .addGroup(jPanelTotalHuespedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTotalHuespedesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTxtIngresosTotales1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTotalHuespedes))
                    .addGroup(jPanelTotalHuespedesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelImgTotalHuespedes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelServicios.setBackground(new java.awt.Color(255, 163, 51));

        jLabelServicios.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelServicios.setForeground(new java.awt.Color(0, 0, 105));
        jLabelServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/bar-chart.png"))); // NOI18N
        jLabelServicios.setText("Estadísticas De Servicios");

        jPanelGraficoServicios.setBackground(new java.awt.Color(255, 163, 51));

        javax.swing.GroupLayout jPanelGraficoServiciosLayout = new javax.swing.GroupLayout(jPanelGraficoServicios);
        jPanelGraficoServicios.setLayout(jPanelGraficoServiciosLayout);
        jPanelGraficoServiciosLayout.setHorizontalGroup(
            jPanelGraficoServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelGraficoServiciosLayout.setVerticalGroup(
            jPanelGraficoServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelServiciosLayout = new javax.swing.GroupLayout(jPanelServicios);
        jPanelServicios.setLayout(jPanelServiciosLayout);
        jPanelServiciosLayout.setHorizontalGroup(
            jPanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServiciosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelGraficoServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelServiciosLayout.createSequentialGroup()
                        .addComponent(jLabelServicios)
                        .addGap(0, 209, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanelServiciosLayout.setVerticalGroup(
            jPanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServiciosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelServicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelGraficoServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTotalHabitaciones.setBackground(new java.awt.Color(255, 163, 51));

        jLabelTotalHabitaciones.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelTotalHabitaciones.setForeground(new java.awt.Color(0, 153, 153));
        jLabelTotalHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/operaciones/ring-chart.png"))); // NOI18N
        jLabelTotalHabitaciones.setText("Total De Habitaciones");

        jPanelGraficoTotalHabitaciones.setBackground(new java.awt.Color(255, 163, 51));

        javax.swing.GroupLayout jPanelGraficoTotalHabitacionesLayout = new javax.swing.GroupLayout(jPanelGraficoTotalHabitaciones);
        jPanelGraficoTotalHabitaciones.setLayout(jPanelGraficoTotalHabitacionesLayout);
        jPanelGraficoTotalHabitacionesLayout.setHorizontalGroup(
            jPanelGraficoTotalHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );
        jPanelGraficoTotalHabitacionesLayout.setVerticalGroup(
            jPanelGraficoTotalHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelTotalHabitacionesLayout = new javax.swing.GroupLayout(jPanelTotalHabitaciones);
        jPanelTotalHabitaciones.setLayout(jPanelTotalHabitacionesLayout);
        jPanelTotalHabitacionesLayout.setHorizontalGroup(
            jPanelTotalHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTotalHabitacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTotalHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTotalHabitaciones)
                    .addComponent(jPanelGraficoTotalHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTotalHabitacionesLayout.setVerticalGroup(
            jPanelTotalHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTotalHabitacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTotalHabitaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelGraficoTotalHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelPreciosHabitaciones.setBackground(new java.awt.Color(255, 232, 205));

        jPanelPrecioSencilla.setBackground(new java.awt.Color(255, 163, 51));
        jPanelPrecioSencilla.setPreferredSize(new java.awt.Dimension(0, 50));

        jLabelTxtPrecioSencilla.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelTxtPrecioSencilla.setForeground(new java.awt.Color(153, 0, 51));
        jLabelTxtPrecioSencilla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTxtPrecioSencilla.setText("Costo");

        jLabelPrecioSencilla.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecioSencilla.setForeground(new java.awt.Color(153, 0, 51));
        jLabelPrecioSencilla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrecioSencilla.setText("$ 0.00");

        jLabelTxtPrecioSencilla2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelTxtPrecioSencilla2.setForeground(new java.awt.Color(153, 0, 51));
        jLabelTxtPrecioSencilla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTxtPrecioSencilla2.setText("Chaac Suite");

        javax.swing.GroupLayout jPanelPrecioSencillaLayout = new javax.swing.GroupLayout(jPanelPrecioSencilla);
        jPanelPrecioSencilla.setLayout(jPanelPrecioSencillaLayout);
        jPanelPrecioSencillaLayout.setHorizontalGroup(
            jPanelPrecioSencillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrecioSencillaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrecioSencillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTxtPrecioSencilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTxtPrecioSencilla2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(jLabelPrecioSencilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPrecioSencillaLayout.setVerticalGroup(
            jPanelPrecioSencillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrecioSencillaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTxtPrecioSencilla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTxtPrecioSencilla2)
                .addGap(18, 18, 18)
                .addComponent(jLabelPrecioSencilla)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanelPrecioDoble.setBackground(new java.awt.Color(255, 163, 51));

        jLabelTxtPrecioDoble.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelTxtPrecioDoble.setForeground(new java.awt.Color(102, 102, 0));
        jLabelTxtPrecioDoble.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTxtPrecioDoble.setText("Costo");

        jLabelTxtPrecioDoble2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelTxtPrecioDoble2.setForeground(new java.awt.Color(102, 102, 0));
        jLabelTxtPrecioDoble2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTxtPrecioDoble2.setText("Itzamná Suite");

        jLabelPrecioDoble.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecioDoble.setForeground(new java.awt.Color(73, 73, 0));
        jLabelPrecioDoble.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrecioDoble.setText("$ 0.00");

        javax.swing.GroupLayout jPanelPrecioDobleLayout = new javax.swing.GroupLayout(jPanelPrecioDoble);
        jPanelPrecioDoble.setLayout(jPanelPrecioDobleLayout);
        jPanelPrecioDobleLayout.setHorizontalGroup(
            jPanelPrecioDobleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrecioDobleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrecioDobleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTxtPrecioDoble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTxtPrecioDoble2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(jLabelPrecioDoble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPrecioDobleLayout.setVerticalGroup(
            jPanelPrecioDobleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrecioDobleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTxtPrecioDoble)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTxtPrecioDoble2)
                .addGap(18, 18, 18)
                .addComponent(jLabelPrecioDoble)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPrecioTriple.setBackground(new java.awt.Color(255, 163, 51));

        jLabelTxtPrecioTriple.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelTxtPrecioTriple.setForeground(new java.awt.Color(102, 0, 51));
        jLabelTxtPrecioTriple.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTxtPrecioTriple.setText("Costo");

        jLabelTxtPrecioTriple2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelTxtPrecioTriple2.setForeground(new java.awt.Color(102, 0, 51));
        jLabelTxtPrecioTriple2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTxtPrecioTriple2.setText("kauil Suite");

        jLabelPrecioTriple.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecioTriple.setForeground(new java.awt.Color(102, 0, 51));
        jLabelPrecioTriple.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrecioTriple.setText("$ 0.00");

        javax.swing.GroupLayout jPanelPrecioTripleLayout = new javax.swing.GroupLayout(jPanelPrecioTriple);
        jPanelPrecioTriple.setLayout(jPanelPrecioTripleLayout);
        jPanelPrecioTripleLayout.setHorizontalGroup(
            jPanelPrecioTripleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrecioTripleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrecioTripleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTxtPrecioTriple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTxtPrecioTriple2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(jLabelPrecioTriple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPrecioTripleLayout.setVerticalGroup(
            jPanelPrecioTripleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrecioTripleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTxtPrecioTriple)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTxtPrecioTriple2)
                .addGap(18, 18, 18)
                .addComponent(jLabelPrecioTriple)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPreciosHabitacionesLayout = new javax.swing.GroupLayout(jPanelPreciosHabitaciones);
        jPanelPreciosHabitaciones.setLayout(jPanelPreciosHabitacionesLayout);
        jPanelPreciosHabitacionesLayout.setHorizontalGroup(
            jPanelPreciosHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPreciosHabitacionesLayout.createSequentialGroup()
                .addComponent(jPanelPrecioSencilla, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPrecioDoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPrecioTriple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelPreciosHabitacionesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanelPrecioDoble, jPanelPrecioSencilla, jPanelPrecioTriple});

        jPanelPreciosHabitacionesLayout.setVerticalGroup(
            jPanelPreciosHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrecioSencilla, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
            .addComponent(jPanelPrecioDoble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPrecioTriple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addComponent(jLabelCerrar)
                        .addGap(318, 318, 318)
                        .addComponent(jLabelTitulo)
                        .addGap(0, 371, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelOcupacionHotelera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanelTotalHabitaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanelPreciosHabitaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBaseLayout.createSequentialGroup()
                                .addComponent(jPanelIngresosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelTotalHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCerrar)
                    .addComponent(jLabelTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelTotalHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelIngresosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelPreciosHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelOcupacionHotelera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTotalHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    //-Cerrar el menú de las estadísticas-//.
    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    //-Indicar que el cursor se ha posicionado en el botón para generar la gráfica de la ocupación total-//.
    private void jButtonOcupacionTotalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOcupacionTotalMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonOcupacionTotal.setBackground(color);
    }//GEN-LAST:event_jButtonOcupacionTotalMouseEntered

    //-Indicar que el cursor se dejó de posicionar en el botón para generar la gráfica de la ocupación total-//.
    private void jButtonOcupacionTotalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOcupacionTotalMouseExited
        Color color = new Color(Integer.parseInt("FFA333", 16));
        this.jButtonOcupacionTotal.setBackground(color);
    }//GEN-LAST:event_jButtonOcupacionTotalMouseExited

    //-Generar la gráfica para indicar la ocupación total del hotel-//.
    private void jButtonOcupacionTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOcupacionTotalActionPerformed
        this.rellenarInformacion_PanelOcupacion(0);
    }//GEN-LAST:event_jButtonOcupacionTotalActionPerformed

    //-Indicar que el cursor se ha posicionado en el botón para generar la gráfica de la ocupación de habitaciones simples-//.
    private void jButtonOcupacionSimpleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOcupacionSimpleMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonOcupacionSimple.setBackground(color);
    }//GEN-LAST:event_jButtonOcupacionSimpleMouseEntered

    //-Indicar que el cursor dejó de posicionarse en el botón para generar la gráfica de la ocupación de habitaciones simples-//.
    private void jButtonOcupacionSimpleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOcupacionSimpleMouseExited
        Color color = new Color(Integer.parseInt("FFA333", 16));
        this.jButtonOcupacionSimple.setBackground(color);
    }//GEN-LAST:event_jButtonOcupacionSimpleMouseExited

    //-Generar la gráfica para indicar la ocupación de habitaciones simples-//.
    private void jButtonOcupacionSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOcupacionSimpleActionPerformed
        this.rellenarInformacion_PanelOcupacion(1);
    }//GEN-LAST:event_jButtonOcupacionSimpleActionPerformed

    //-Indicar que el cursor se ha posicionado en el botón para generar la gráfica de la ocupación de habitaciones dobles-//.
    private void jButtonOcupacionDobleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOcupacionDobleMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonOcupacionDoble.setBackground(color);
    }//GEN-LAST:event_jButtonOcupacionDobleMouseEntered

    //-Indicar que el cursor dejó de posicionarse en el botón para generar la gráfica de la ocupación de habitaciones dobles-//.
    private void jButtonOcupacionDobleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOcupacionDobleMouseExited
        Color color = new Color(Integer.parseInt("FFA333", 16));
        this.jButtonOcupacionDoble.setBackground(color);
    }//GEN-LAST:event_jButtonOcupacionDobleMouseExited

    //-Generar la gráfica para indicar la ocupación de habitaciones dobles-//.
    private void jButtonOcupacionDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOcupacionDobleActionPerformed
        this.rellenarInformacion_PanelOcupacion(2);
    }//GEN-LAST:event_jButtonOcupacionDobleActionPerformed

    //-Indicar que el cursor se ha posicionado en el botón para generar la gráfica de la ocupación de habitaciones triples-//.
    private void jButtonOcupacionTripleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOcupacionTripleMouseEntered
        Color color = new Color(Integer.parseInt("AF5700", 16));
        this.jButtonOcupacionTriple.setBackground(color);
    }//GEN-LAST:event_jButtonOcupacionTripleMouseEntered

    //-Indicar que el cursor dejó de posicionarse en el botón para generar la gráfica de la ocupación de habitaciones triples-//.
    private void jButtonOcupacionTripleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOcupacionTripleMouseExited
        Color color = new Color(Integer.parseInt("FFA333", 16));
        this.jButtonOcupacionTriple.setBackground(color);
    }//GEN-LAST:event_jButtonOcupacionTripleMouseExited

    //-Generar la gráfica para indicar la ocupación de habitaciones triples-//.
    private void jButtonOcupacionTripleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOcupacionTripleActionPerformed
        this.rellenarInformacion_PanelOcupacion(3);
    }//GEN-LAST:event_jButtonOcupacionTripleActionPerformed

    //-LLamada a los métodos para rellenar toda la sección de estadísticas del hotel-//.
    private void rellenaInformacion() {
        this.rellenarInformacion_PanelOcupacion(0);
        this.rellenarInformacion_PanelIngresosTotales();
        this.rellenarInformacion_PanelTotalHuespedes();
        this.rellenarInformacion_PanelPreciosHabitaciones();
        this.rellenarInformacion_PanelServicios();
        this.rellenarInformacion_PanelTotalHabitaciones();
    }

    //-A partir de la información de la base de datos, se calculan los porcentajes de ocupación-//.
    private void rellenarInformacion_PanelOcupacion(int tipo) {
        ConexionMySQL conexion = null;
        int habitacionesOcupadas;
        int habitacionesLibres;
        double totalHuespedes = 0;

        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();

            // Se calcula el total de huespedes y se muestra la 
            // ocupación del hotel en porcentaje...
            try {
                //Consultar en la base de datos los huéspedes actuales.
                ResultSet consulta = conexion.consultarTabla("huespedes",
                "guests, extras", " WHERE active = 1");
                
                while(consulta.next()) {
                    totalHuespedes += consulta.getInt("guests");
                    totalHuespedes += consulta.getInt("extras");
                }
                this.jLabelOcupacionHotelera.setText(totalHuespedes * 100 / 80 + " %");
            } 
            catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ocurrió un error durante la "
                + "realización de la consulta.\nSQLException: " + ex.getMessage()
                + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                "Error", JOptionPane.ERROR_MESSAGE);
            }

            switch (tipo) {
                case 0:
                    try {
                        //Consultar en la base de datos las habitaciones ocupadas en todo el hotel.
                        ResultSet consulta = conexion.consultarTabla("huespedes",
                        "COUNT(room_id) AS c_room", " WHERE active = 1");

                        if(consulta.next()) {
                            habitacionesOcupadas = consulta.getInt("c_room");

                            //Hay un total de 30 habitaciones en el hotel.
                            habitacionesLibres = 30 - habitacionesOcupadas;
                        } 
                        else {
                            throw new SQLException();
                        }
                        
                        //Generar una gráfica de pastel correspondiente al porcentaje de ocupación de 
                        //todas las habitaciones del hotel.
                        this.generarGraficaCircular(habitacionesOcupadas, habitacionesLibres, "Ocupación Total",
                        this.jPanelGraficosOcupacion, new Color(Integer.parseInt("7D9707", 16)), new Color(Integer.parseInt("C84404", 16)));
                    } 
                    catch(SQLException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(this, "Ocurrió un error durante la "
                        + "realización de la consulta.\nSQLException: " + ex.getMessage()
                        + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                        "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 1:
                    try {
                        //Consultar en la base de datos las habitaciones simples ocupadas en todo el hotel.
                        ResultSet consulta = conexion.consultarTabla("huespedes",
                        "COUNT(room_id) AS c_simple_room", " WHERE active = 1 AND room_type = 'S'");

                        if(consulta.next()) {
                            habitacionesOcupadas = consulta.getInt("c_simple_room");

                            //Hay un total de 9 habitaciones simples en el hotel.
                            habitacionesLibres = 9 - habitacionesOcupadas;
                        } 
                        else {
                            throw new SQLException();
                        }

                        //Generar una gráfica de pastel correspondiente al porcentaje de ocupación de 
                        //porcentaje de ocupación de habitaciones simples.
                        this.generarGraficaCircular(habitacionesOcupadas, habitacionesLibres, "Habitaciones Chaac Suite (simples)",
                        this.jPanelGraficosOcupacion, new Color(Integer.parseInt("7D9707", 16)), new Color(Integer.parseInt("C84404", 16)));
                    } 
                    catch(SQLException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(this, "Ocurrió un error durante la "
                        + "realización de la consulta.\nSQLException: " + ex.getMessage()
                        + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                        "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 2:
                    try {
                        //Consultar en la base de datos las habitaciones dobles ocupadas en todo el hotel.
                        ResultSet consulta = conexion.consultarTabla("huespedes",
                        "COUNT(room_id) AS c_double_room", " WHERE active = 1 AND room_type = 'D'");

                        if(consulta.next()) {
                            habitacionesOcupadas = consulta.getInt("c_double_room");

                            //Hay un total de 9 habitaciones dobles en el hotel.
                            habitacionesLibres = 9 - habitacionesOcupadas;
                        } 
                        else {
                            throw new SQLException();
                        }

                        //Generar una gráfica de pastel correspondiente al porcentaje de ocupación de 
                        //porcentaje de ocupación de habitaciones dobles.
                        this.generarGraficaCircular(habitacionesOcupadas, habitacionesLibres, "Habitaciones Itzamná Suite (dobles)",
                        this.jPanelGraficosOcupacion, new Color(Integer.parseInt("7D9707", 16)), new Color(Integer.parseInt("C84404", 16)));
                    } 
                    catch(SQLException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(this, "Ocurrió un error durante la "
                        + "realización de la consulta.\nSQLException: " + ex.getMessage()
                        + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                        "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 3:
                    try {
                        //Consultar en la base de datos las habitaciones triples ocupadas en todo el hotel.
                        ResultSet consulta = conexion.consultarTabla("huespedes",
                        "COUNT(room_id) AS c_triple_room", " WHERE active = 1 AND room_type = 'T'");

                        if (consulta.next()) {
                            habitacionesOcupadas = consulta.getInt("c_triple_room");

                            //Hay un total de 12 habitaciones triples en el hotel.
                            habitacionesLibres = 12 - habitacionesOcupadas;
                        } 
                        else {
                            throw new SQLException();
                        }

                        //Generar una gráfica de pastel correspondiente al porcentaje de ocupación de 
                        //porcentaje de ocupación de habitaciones triples.
                        this.generarGraficaCircular(habitacionesOcupadas, habitacionesLibres, "Habitaciones Kauil Suite (triples)",
                        this.jPanelGraficosOcupacion, new Color(Integer.parseInt("7D9707", 16)), new Color(Integer.parseInt("C84404", 16)));
                    } 
                    catch(SQLException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(this, "Ocurrió un error durante la "
                        + "realización de la consulta.\nSQLException: " + ex.getMessage()
                        + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                        "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }
        } 
        catch(Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No fue posible realizar la "
            + "conexión con la base de datos.\n" + "Verifique si el servidor "
            + "XAMPP o MySQL local se encuentra activado.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        finally {
            if(conexion != null) {
                conexion.cerrarConexion();
            }
        }
    }

    //-Generar una gráfica de pastel a partir de ciertos datos y un JPanel-//.
    private void generarGraficaCircular(int habitacionesOcupadas, int habitacionesLibres, String nombre, JPanel jPanel, Color primerColor, Color segundoColor) {
        DefaultPieDataset<String> datos = new DefaultPieDataset<String>();
        datos.setValue("Ocupadas", habitacionesOcupadas);
        datos.setValue("No ocupadas", habitacionesLibres);

        JFreeChart grafico = ChartFactory.createPieChart(nombre, datos, true, false, true);
        grafico.setBackgroundPaint(new Color(Integer.parseInt("FFA333", 16)));
        grafico.getTitle().setFont(new Font("SansSerif", Font.BOLD, 14));
        grafico.getTitle().setPaint(new Color(Integer.parseInt("006600", 16)));

        PiePlot<String> plot = (PiePlot<String>) grafico.getPlot();
        plot.setBackgroundPaint(new Color(Integer.parseInt("FFA333", 16)));
        plot.setSectionOutlinesVisible(false);
        plot.setSectionPaint("Ocupadas", primerColor);
        plot.setSectionPaint("No ocupadas", segundoColor);
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 10));
        plot.setLabelBackgroundPaint(new Color(255, 242, 255));

        PieSectionLabelGenerator generador = new StandardPieSectionLabelGenerator("{0}: {1} ({2})", NumberFormat.getInstance(), NumberFormat.getPercentInstance());
        plot.setLabelGenerator(generador);

        ChartPanel panel = new ChartPanel(grafico);
        panel.setSize(jPanel.getWidth(), jPanel.getHeight());

        jPanel.removeAll();
        jPanel.add(panel);

        this.repaint();
    }

    //-A partir de la información de la base de datos, se calculan los ingresos del hotel-//.
    private void rellenarInformacion_PanelIngresosTotales() {
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

                // se realiza la suma de las cuentas de cada huésped.
                while(consulta.next()) {
                    double ingresosHuesped = consulta.getDouble("expense");
                    ingresosTotales += ingresosHuesped;
                }
                this.jLabelIngresosTotales.setText("$ " + formato1.format(ingresosTotales));
            } 
            catch(SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ocurrió un error durante la "
                + "realización de la consulta.\nSQLException: " + ex.getMessage()
                + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch(Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No fue posible realizar la "
            + "conexión con la base de datos.\n" + "Verifique si el servidor "
            + "XAMPP o MySQL local se encuentra activado.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        finally {
            if(conexion != null) {
                conexion.cerrarConexion();
            }
        }
    }

    //-A partir de la información de la base de datos, se obtienen los huéspedes actuales-//.
    private void rellenarInformacion_PanelTotalHuespedes() {
        ConexionMySQL conexion = null;
        int totalHuespedes = 0;

        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();

            try {
                //Consultar en la base de datos los huéspedes actuales.
                ResultSet consulta = conexion.consultarTabla("huespedes",
                "guests, extras", " WHERE active = 1");
                
                while(consulta.next()) {
                    totalHuespedes += consulta.getInt("guests");
                    totalHuespedes += consulta.getInt("extras");
                }
                this.jLabelTotalHuespedes.setText("" + totalHuespedes);
            } 
            catch(SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ocurrió un error durante la "
                + "realización de la consulta.\nSQLException: " + ex.getMessage()
                + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch(Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No fue posible realizar la "
            + "conexión con la base de datos.\n" + "Verifique si el servidor "
            + "XAMPP o MySQL local se encuentra activado.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        finally {
            if(conexion != null) {
                conexion.cerrarConexion();
            }
        }
    }

    //-A partir de la información de la base de datos, se mostrarán los precios de las habitaciones-//.
    private void rellenarInformacion_PanelPreciosHabitaciones() {
        ConexionMySQL conexion = null;
        ArrayList<Double> listaPrecios = new ArrayList<Double>();

        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();

            try {
                //Consultar en la base de datos los precios de cada habitación.
                ResultSet consulta = conexion.consultarTabla("precios", "price", "");
                DecimalFormat formato = new DecimalFormat("$0,000.00");

                while(consulta.next()) {
                    listaPrecios.add(consulta.getDouble("price"));
                }
                this.jLabelPrecioSencilla.setText(formato.format(listaPrecios.get(0)));
                this.jLabelPrecioDoble.setText(formato.format(listaPrecios.get(1)));
                this.jLabelPrecioTriple.setText(formato.format(listaPrecios.get(2)));
            } 
            catch(SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ocurrió un error durante la "
                + "realización de la consulta.\nSQLException: " + ex.getMessage()
                + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch(Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No fue posible realizar la "
            + "conexión con la base de datos.\n" + "Verifique si el servidor "
            + "XAMPP o MySQL local se encuentra activado.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        finally {
            if(conexion != null) {
                conexion.cerrarConexion();
            }
        }
    }

    //-A partir de la información de la base de datos, se mostrarán las veces que cada servicio ha sido contratado-//.
    private void rellenarInformacion_PanelServicios() {
        ConexionMySQL conexion = null;
        HashMap<String, Integer> servicios = new HashMap<String, Integer>();

        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();

            try {
                //Consultar en la base de datos la cantidad de contrataciones del servicio de atención al cuarto.
                ResultSet consulta = conexion.consultarTabla("servicios",
                "COUNT(room_service) AS r_count", " WHERE room_service = 1 LIMIT 1");
                
                if(consulta.next()) {
                    servicios.put("Atencion Al Cuarto", consulta.getInt(1));
                } 
                else {
                    servicios.put("Atencion Al Cuarto", 0);
                }
                
                //Consultar en la base de datos la cantidad de contrataciones del servicio de acceso al bar.
                consulta = conexion.consultarTabla("servicios",
                "COUNT(bar_access) AS b_count", " WHERE bar_access = 1 LIMIT 1");
                
                if(consulta.next()) {
                    servicios.put("Acceso Al Bar", consulta.getInt(1));
                } 
                else {
                    servicios.put("Acceso Al Bar", 0);
                }
                
                //Consultar en la base de datos la cantidad de contrataciones del servicio de tintorería.
                consulta = conexion.consultarTabla("servicios",
                "COUNT(cleaner_service) AS c_count", " WHERE cleaner_service = 1 LIMIT 1");
                
                if(consulta.next()) {
                    servicios.put("Servicio De Tintorería", consulta.getInt(1));
                } 
                else {
                    servicios.put("Servico de Tintorería", 0);
                }
                
                //Consultar en la base de datos la cantidad de contrataciones del servicio de SPA.
                consulta = conexion.consultarTabla("servicios",
                "COUNT(SPA_service) AS s_count", " WHERE SPA_service = 1 LIMIT 1");
                
                if(consulta.next()) {
                    servicios.put("Servicio De SPA", consulta.getInt(1));
                } 
                else {
                    servicios.put("Servicio De SPA", 0);
                }
                
                //Consultar en la base de datos la cantidad de contrataciones del servicio de niñera.
                consulta = conexion.consultarTabla("servicios",
                "COUNT(baby_sister_service) AS bs_count", " WHERE baby_sister_service = 1 LIMIT 1");
                
                if(consulta.next()) {
                    servicios.put("Contratación De Niñera", consulta.getInt(1));
                } 
                else {
                    servicios.put("Contratación De Niñera", 0);
                }
                
                //Consultar en la base de datos la cantidad de contrataciones del servicio de acceso al gimnasio.
                consulta = conexion.consultarTabla("servicios",
                "COUNT(gym_access) AS g_count", " WHERE gym_access = 1 LIMIT 1");
                
                if(consulta.next()) {
                    servicios.put("Acceso Al Gimnasio", consulta.getInt(1));
                } 
                else {
                    servicios.put("Acceso Al Gimnasio", 0);
                }
                
                //Consultar en la base de datos la cantidad de contrataciones del servicio de acceso a la zona de juegos.
                consulta = conexion.consultarTabla("servicios",
                "COUNT(gaming_access) AS ga_count", " WHERE gaming_access = 1 LIMIT 1");
                
                if(consulta.next()) {
                    servicios.put("Acceso A Zona De Juegos", consulta.getInt(1));
                } 
                else {
                    servicios.put("Acceso A Zona De Juegos", 0);
                }
                
                //Consultar en la base de datos la cantidad de contrataciones del servicio de acceso a las canchas de tennis.
                consulta = conexion.consultarTabla("servicios",
                "COUNT(tennis_access) AS t_count", " WHERE tennis_access = 1 LIMIT 1");
                
                if(consulta.next()) {
                    servicios.put("Acceso A Canchas De Tenis", consulta.getInt(1));
                } 
                else {
                    servicios.put("Acceso A Canchas De Tenis", 0);
                }
                
                //Consultar en la base de datos la cantidad de contrataciones del servicio de acceso al campo de tiro con arco.
                consulta = conexion.consultarTabla("servicios",
                "COUNT(bow_shooting) AS bw_count", " WHERE bow_shooting = 1 LIMIT 1");
                
                if(consulta.next()) {
                    servicios.put("Acceso A Campo De Tiro Con Arco", consulta.getInt(1));
                } 
                else {
                    servicios.put("Acceso A Campo De Tiro Con Arco", 0);
                }
                
                //Consultar en la base de datos la cantidad de contrataciones del servicio de acceso al campo de golf.
                consulta = conexion.consultarTabla("servicios",
                "COUNT(golf_access) AS gf_count", " WHERE golf_access = 1 LIMIT 1");
                
                if (consulta.next()) {
                    servicios.put("Acceso A Campo De Golf", consulta.getInt(1));
                } 
                else {
                    servicios.put("Acceso A Campo De Golf", 0);
                }
                this.generarGraficoServicios(servicios);
            } 
            catch(SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ocurrió un error durante la "
                + "realización de la consulta.\nSQLException: " + ex.getMessage()
                + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch(Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No fue posible realizar la "
            + "conexión con la base de datos.\n" + "Verifique si el servidor "
            + "XAMPP o MySQL local se encuentra activado.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        finally {
            if(conexion != null) {
                conexion.cerrarConexion();
            }
        }
    }

    //- Apartir de la informacion de un HashMap, se genera una grafica de barras -//.
    private void generarGraficoServicios(HashMap<String, Integer> servicios) {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        Iterator it = servicios.keySet().iterator();
        
        while(it.hasNext()) {
            String clave = (String) it.next();
            datos.setValue(servicios.get(clave), "Contrataciones", clave);
        }

        JFreeChart grafico = ChartFactory.createBarChart("",
        "Servicios", "No. De Contrataciones", datos, PlotOrientation.HORIZONTAL, true, true, false);
        grafico.setBackgroundPaint(new Color(Integer.parseInt("FFA333", 16)));
        
        String auxiliar = null;
        grafico.setTitle(auxiliar);
        
        CategoryPlot plot = grafico.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);
        plot.setBackgroundPaint(new Color(Integer.parseInt("FFA333", 16)));
        plot.getDomainAxis().setLabelPaint(new Color(Integer.parseInt("000069", 16)));
        plot.getRangeAxis().setLabelPaint(new Color(Integer.parseInt("000069", 16)));
        plot.getDomainAxis().setTickLabelFont(new Font("SansSerif", Font.PLAIN, 8));
        plot.getRangeAxis().setTickLabelFont(new Font("SansSerif", Font.BOLD, 12));
        plot.getDomainAxis().setTickLabelPaint(new Color(Integer.parseInt("000069", 16)));

        BarRenderer renderizado = (BarRenderer) plot.getRenderer();
        renderizado.setSeriesPaint(0, new Color(Integer.parseInt("000069", 16)));
        renderizado.setBarPainter(new StandardBarPainter());

        ChartPanel panel = new ChartPanel(grafico);
        panel.setSize(this.jPanelGraficoServicios.getWidth(), this.jPanelGraficoServicios.getHeight());

        this.jPanelGraficoServicios.removeAll();
        this.jPanelGraficoServicios.add(panel);

        this.repaint();
    }

    //-A partir de la información de la base de datos, se obtiene la cantidad total de habitaciones-//.
    private void rellenarInformacion_PanelTotalHabitaciones() {
        ConexionMySQL conexion = null;
        ArrayList<Integer> totalesHabitaciones = new ArrayList<>();

        try {
            //Conexión a la base de datos.
            conexion = new ConexionMySQL();

            try {
                //Consultar en la base de datos la cantidad total de habitaciones.
                ResultSet consulta = conexion.consultarTabla("habitaciones",
                "rooms_count", "");

                while(consulta.next()) {
                    totalesHabitaciones.add(consulta.getInt("rooms_count"));
                }

                //Generar una gráfica de anillo correspondiente al total de
                //habitaciones de cada tipo.
                this.generarGraficoTotalHabitaciones(totalesHabitaciones);
            } 
            catch(SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ocurrió un error durante la "
                + "realización de la consulta.\nSQLException: " + ex.getMessage()
                + ".\nSQLState: " + ex.getSQLState() + ".\nError: " + ex.getErrorCode() + ".",
                "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No fue posible realizar la "
            + "conexión con la base de datos.\n" + "Verifique si el servidor "
            + "XAMPP o MySQL local se encuentra activado.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        finally {
            if(conexion != null) {
                conexion.cerrarConexion();
            }
        }
    }

    //-A partir de la información de un ArrayList, se genera un gráfico de anillo-//.
    private void generarGraficoTotalHabitaciones(ArrayList<Integer> totalesHabitaciones) {
        DefaultPieDataset<String> datos = new DefaultPieDataset<String>();
        datos.setValue("Chaac Suite", totalesHabitaciones.get(0));
        datos.setValue("Itzamná Suite", totalesHabitaciones.get(1));
        datos.setValue("Kauil Suite", totalesHabitaciones.get(2));

        JFreeChart grafico = ChartFactory.createRingChart("Total De Habitaciones", datos, true, false, true);
        grafico.setBackgroundPaint(new Color(Integer.parseInt("FFA333", 16)));
        grafico.getTitle().setFont(new Font("SansSerif", Font.BOLD, 14));
        grafico.getTitle().setPaint(new Color(Integer.parseInt("009999", 16)));
        
        RingPlot plot = (RingPlot) grafico.getPlot();
        plot.setBackgroundPaint(new Color(Integer.parseInt("FFA333", 16)));
        plot.setSectionOutlinesVisible(false);
        plot.setSectionPaint("Chaac Suite", new Color(Integer.parseInt("7D9707", 16)));
        plot.setSectionPaint("Itzamná Suite", new Color(Integer.parseInt("009999", 16)));
        plot.setSectionPaint("Kauil Suite", new Color(Integer.parseInt("FF0033", 16)));
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 10));
        plot.setLabelBackgroundPaint(new Color(255, 242, 255));

        PieSectionLabelGenerator generador = new StandardPieSectionLabelGenerator("{0}: {1} ({2})", NumberFormat.getInstance(), NumberFormat.getPercentInstance());
        plot.setLabelGenerator(generador);

        ChartPanel panel = new ChartPanel(grafico);
        panel.setSize(this.jPanelGraficoTotalHabitaciones.getWidth(), this.jPanelGraficoTotalHabitaciones.getHeight());
        
        this.jPanelGraficoTotalHabitaciones.removeAll();
        this.jPanelGraficoTotalHabitaciones.add(panel);

        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOcupacionDoble;
    private javax.swing.JButton jButtonOcupacionSimple;
    private javax.swing.JButton jButtonOcupacionTotal;
    private javax.swing.JButton jButtonOcupacionTriple;
    private javax.swing.JLabel jLabelBtnOcup1;
    private javax.swing.JLabel jLabelBtnOcup2;
    private javax.swing.JLabel jLabelBtnOcup3;
    private javax.swing.JLabel jLabelBtnOcup4;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelImgIngresosTotales;
    private javax.swing.JLabel jLabelImgOcupacionHotelera;
    private javax.swing.JLabel jLabelImgTotalHuespedes;
    private javax.swing.JLabel jLabelIngresosTotales;
    private javax.swing.JLabel jLabelOcupacionHotelera;
    private javax.swing.JLabel jLabelPrecioDoble;
    private javax.swing.JLabel jLabelPrecioSencilla;
    private javax.swing.JLabel jLabelPrecioTriple;
    private javax.swing.JLabel jLabelServicios;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTotalHabitaciones;
    private javax.swing.JLabel jLabelTotalHuespedes;
    private javax.swing.JLabel jLabelTxtIngresosTotales;
    private javax.swing.JLabel jLabelTxtIngresosTotales1;
    private javax.swing.JLabel jLabelTxtPrecioDoble;
    private javax.swing.JLabel jLabelTxtPrecioDoble2;
    private javax.swing.JLabel jLabelTxtPrecioSencilla;
    private javax.swing.JLabel jLabelTxtPrecioSencilla2;
    private javax.swing.JLabel jLabelTxtPrecioTriple;
    private javax.swing.JLabel jLabelTxtPrecioTriple2;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelGraficoServicios;
    private javax.swing.JPanel jPanelGraficoTotalHabitaciones;
    private javax.swing.JPanel jPanelGraficosOcupacion;
    private javax.swing.JPanel jPanelIngresosTotales;
    private javax.swing.JPanel jPanelOcupacionHotelera;
    private javax.swing.JPanel jPanelPrecioDoble;
    private javax.swing.JPanel jPanelPrecioSencilla;
    private javax.swing.JPanel jPanelPrecioTriple;
    private javax.swing.JPanel jPanelPreciosHabitaciones;
    private javax.swing.JPanel jPanelServicios;
    private javax.swing.JPanel jPanelTotalHabitaciones;
    private javax.swing.JPanel jPanelTotalHuespedes;
    // End of variables declaration//GEN-END:variables

    //-Método diseñado para ser ejecutado por un hilo-//.
    @Override public void run() {
        this.rellenaInformacion();
    }
}
