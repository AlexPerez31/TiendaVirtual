/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import javax.swing.ImageIcon;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import tienda.Productos;
/**
 *
 * @author Jordan y Freddy
 */
public class interfaz extends javax.swing.JFrame {
    DefaultListModel modeloLista;
    
    Productos ObjetoProductos= new Productos();
    int cant=0;
    
    int cswich=0;
    int cps4=0;
    int cones=0;
    int conex=0;
    int cpsv=0;
    int czelda=0;
    int cgod=0;
    int cred=0;
    int cds=0;
    
    int ctotal=0;
    
    int tswich=1049900;
    int tps4=1099000 ;
    int tones=1199000 ;
    int tonex=1785400;
    int tpsv=754900;
    int tzelda=135900;
    int tgod=159800;
    int tred=365990;
    int tds=599900;
    
    int totalp=0;
 
    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        modeloLista=new DefaultListModel();
        jlista.setModel(modeloLista);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jlista = new javax.swing.JList<>();
        SWITCH = new javax.swing.JButton();
        PS4 = new javax.swing.JButton();
        ONES = new javax.swing.JButton();
        DS = new javax.swing.JButton();
        PSV = new javax.swing.JButton();
        ONEX = new javax.swing.JButton();
        ZELDA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        GOD = new javax.swing.JButton();
        RED = new javax.swing.JButton();
        COMPRAR = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPane9 = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextPane10 = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextPane11 = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextPane12 = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextPane13 = new javax.swing.JTextPane();
        COMPRASS = new javax.swing.JLabel();
        MAS = new javax.swing.JLabel();
        TOTAL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tienda de Videojuegos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane1.setViewportView(jlista);

        SWITCH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/switch.png"))); // NOI18N
        SWITCH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SWITCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SWITCHActionPerformed(evt);
            }
        });

        PS4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ps4.png"))); // NOI18N
        PS4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PS4ActionPerformed(evt);
            }
        });

        ONES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ones.png"))); // NOI18N
        ONES.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ONES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONESActionPerformed(evt);
            }
        });

        DS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3ds.png"))); // NOI18N
        DS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSActionPerformed(evt);
            }
        });

        PSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/psv.png"))); // NOI18N
        PSV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSVActionPerformed(evt);
            }
        });

        ONEX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/onex.png"))); // NOI18N
        ONEX.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ONEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONEXActionPerformed(evt);
            }
        });

        ZELDA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zelda.png"))); // NOI18N
        ZELDA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ZELDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZELDAActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("CARRITO DE COMPRAS");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("PRODUCTOS");

        GOD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gow4.png"))); // NOI18N
        GOD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        GOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GODActionPerformed(evt);
            }
        });

        RED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/red.png"))); // NOI18N
        RED.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REDActionPerformed(evt);
            }
        });

        COMPRAR.setBackground(new java.awt.Color(255, 204, 0));
        COMPRAR.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        COMPRAR.setText("REALIZAR COMPRAS");
        COMPRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPRARActionPerformed(evt);
            }
        });

        SALIR.setFont(new java.awt.Font("Verdana", 3, 10)); // NOI18N
        SALIR.setText("CANCELAR Y SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });

        jTextPane5.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jTextPane5.setText("PlayStation 4 1 Tera\n$1.099.000\n");
        jScrollPane6.setViewportView(jTextPane5);

        jTextPane6.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jTextPane6.setText("Xbox One S 1 Tb\n$1.199.000 ");
        jScrollPane7.setViewportView(jTextPane6);

        jTextPane7.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jTextPane7.setText("Nintendo 3ds Xl\n$599.900\n");
        jScrollPane8.setViewportView(jTextPane7);

        jTextPane8.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jTextPane8.setText("Sony PS Vita\n$754.900\n");
        jScrollPane9.setViewportView(jTextPane8);

        jTextPane9.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jTextPane9.setText("Xbox One X 1 Tb\n$1.785.400\n");
        jScrollPane10.setViewportView(jTextPane9);

        jTextPane10.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jTextPane10.setText("TLZ Breath The Wild\n$135.900\n");
        jScrollPane11.setViewportView(jTextPane10);

        jTextPane11.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jTextPane11.setText("God Of War 4\n$159.800\n");
        jScrollPane12.setViewportView(jTextPane11);

        jTextPane12.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jTextPane12.setText("Red Dead Redención 2\n$365.990\n");
        jScrollPane13.setViewportView(jTextPane12);

        jTextPane13.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jTextPane13.setText("Nintendo Switch JoY-Con\n$1.049.900\n");
        jScrollPane14.setViewportView(jTextPane13);

        COMPRASS.setText("Cantidad de compras:");

        MAS.setText("Prducto mas Vendido:");

        TOTAL.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        TOTAL.setForeground(new java.awt.Color(51, 51, 255));
        TOTAL.setText("Precio TOTAL: $");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Alex Jordan Perez Rojas ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DS, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SWITCH, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8)
                            .addComponent(ZELDA, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane14))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PSV, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PS4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane6))
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GOD, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RED, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ONES, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ONEX, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(COMPRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                    .addComponent(MAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(COMPRASS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TOTAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(174, 174, 174))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PS4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SWITCH, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ONES, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane7)
                            .addComponent(jScrollPane14))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PSV, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DS, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GOD, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(ONEX, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ZELDA, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RED, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane13)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MAS, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(COMPRASS, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(COMPRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SALIR)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PS4ActionPerformed
           cant = Integer.parseInt(JOptionPane.showInputDialog("Cauntos elementos desea agregar al carrito?"));
        if(cant>0){
            tps4=tps4*cant;
            cps4= cps4+cant;
            ctotal=ctotal+cant;
            totalp=totalp+tps4;
            modeloLista.addElement(ObjetoProductos.getPs4()+cant);
        } 
    }//GEN-LAST:event_PS4ActionPerformed

    private void SWITCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SWITCHActionPerformed
        cant = Integer.parseInt(JOptionPane.showInputDialog("Cauntos elementos desea agregar al carrito?"));
        if(cant>0){
            tswich=tswich*cant;
            cswich= cswich+cant;
            ctotal=ctotal+cant;
            totalp=totalp+tswich;
            modeloLista.addElement(ObjetoProductos.getSwich()+cant);
        }
    }//GEN-LAST:event_SWITCHActionPerformed

    private void ZELDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZELDAActionPerformed
        cant = Integer.parseInt(JOptionPane.showInputDialog("Cauntos elementos desea agregar al carrito?"));
        if(cant>0){
            tzelda=tzelda*cant;
            czelda= czelda+cant;
            ctotal=ctotal+cant;
            totalp=totalp+tzelda;
            modeloLista.addElement(ObjetoProductos.getZelda()+cant);
        }
    }//GEN-LAST:event_ZELDAActionPerformed

    private void ONESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONESActionPerformed
        cant = Integer.parseInt(JOptionPane.showInputDialog("Cauntos elementos desea agregar al carrito?"));
        if(cant>0){
            tones=tones*cant;
            cones= cones+cant;
            ctotal=ctotal+cant;
            totalp=totalp+tones;
            modeloLista.addElement(ObjetoProductos.getOnes()+cant);
        }
    }//GEN-LAST:event_ONESActionPerformed

    private void DSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSActionPerformed
        cant = Integer.parseInt(JOptionPane.showInputDialog("Cauntos elementos desea agregar al carrito?"));
        if(cant>0){
            tds=tds*cant;
            cds= cds+cant;
            ctotal=ctotal+cant;
            totalp=totalp+tds;
            modeloLista.addElement(ObjetoProductos.getDs()+cant);
        }
    }//GEN-LAST:event_DSActionPerformed

    private void PSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PSVActionPerformed
        cant = Integer.parseInt(JOptionPane.showInputDialog("Cauntos elementos desea agregar al carrito?"));
        if(cant>0){
            tpsv=tpsv*cant;
            cpsv= cpsv+cant;
            ctotal=ctotal+cant;
            totalp=totalp+tpsv;
            modeloLista.addElement(ObjetoProductos.getPsv()+cant);
        }
    }//GEN-LAST:event_PSVActionPerformed

    private void ONEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONEXActionPerformed
        cant = Integer.parseInt(JOptionPane.showInputDialog("Cauntos elementos desea agregar al carrito?"));
        if(cant>0){
            tonex=tonex*cant;
            conex= conex+cant;
            ctotal=ctotal+cant;
            totalp=totalp+tonex;
            modeloLista.addElement(ObjetoProductos.getOnex()+cant);
        }
    }//GEN-LAST:event_ONEXActionPerformed

    private void GODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GODActionPerformed
        cant = Integer.parseInt(JOptionPane.showInputDialog("Cauntos elementos desea agregar al carrito?"));
        if(cant>0){
            tgod=tgod*cant;
            cgod= cgod+cant;
            ctotal=ctotal+cant;
            totalp=totalp+tgod;
            modeloLista.addElement(ObjetoProductos.getGod()+cant);
        }
    }//GEN-LAST:event_GODActionPerformed

    private void REDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REDActionPerformed
        cant = Integer.parseInt(JOptionPane.showInputDialog("Cauntos elementos desea agregar al carrito?"));
        if(cant>0){
            tred=tred*cant;
            cred= cred+cant;
            ctotal=ctotal+cant;
            totalp=totalp+tred;
            modeloLista.addElement(ObjetoProductos.getRed()+cant);
        }
    }//GEN-LAST:event_REDActionPerformed

    private void COMPRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPRARActionPerformed
        String T= Long.toString(totalp);
        String C= Integer.toString(ctotal);
        
        TOTAL.setText("Precio TOTAL: $"+T);
        COMPRASS.setText("Cantidad de compras: "+C);
        
        if ((cswich>cps4) && (cswich>cones) && (cswich>conex) && (cswich>cpsv) && (cswich>czelda) && (cswich>cgod) && (cswich>cred) && (cswich>cds)){
            MAS.setText("Prducto mas Vendido: "+ObjetoProductos.getSwich()+cswich);
        } else if((cps4>cswich) && (cps4>cones) && (cps4>conex) && (cps4>cpsv) && (cps4>czelda) && (cps4>cgod) && (cps4>cred) && (cps4>cds)){
            MAS.setText("Prducto mas Vendido: "+ObjetoProductos.getPs4()+cps4);
        } else if((cones>cswich) && (cones>cps4) && (cones>conex) && (cones>cpsv) && (cones>czelda) && (cones>cgod) && (cones>cred) && (cones>cds)){
            MAS.setText("Prducto mas Vendido: "+ObjetoProductos.getOnes()+cones);
        } else if((conex>cswich) && (conex>cones) && (conex>cones) && (conex>cpsv) && (conex>czelda) && (conex>cgod) && (conex>cred) && (conex>cds)){
            MAS.setText("Prducto mas Vendido: "+ObjetoProductos.getOnex()+conex);
        } else if((cpsv>cswich) && (cpsv>cones) && (cpsv>conex) && (cpsv>cps4) && (cpsv>czelda) && (cpsv>cgod) && (cpsv>cred) && (cpsv>cds)){
            MAS.setText("Prducto mas Vendido: "+ObjetoProductos.getPsv()+cpsv);
        } else if((czelda>cswich) && (czelda>cones) && (czelda>conex) && (czelda>cpsv) && (czelda>cps4) && (czelda>cgod) && (czelda>cred) && (czelda>cds)){
            MAS.setText("Prducto mas Vendido: "+ObjetoProductos.getZelda()+czelda);
        } else if((cgod>cswich) && (cgod>cones) && (cgod>conex) && (cgod>cpsv) && (cgod>czelda) && (cgod>cps4) && (cgod>cred) && (cgod>cds)){
            MAS.setText("Prducto mas Vendido: "+ObjetoProductos.getGod()+cgod);
        } else if((cred>cswich) && (cred>cones) && (cred>conex) && (cred>cpsv) && (cred>czelda) && (cred>cgod) && (cred>cps4) && (cred>cds)){
            MAS.setText("Prducto mas Vendido: "+ObjetoProductos.getRed()+cred);
        } else if((cds>cswich) && (cds>cones) && (cds>conex) && (cds>cpsv) && (cds>czelda) && (cds>cgod) && (cds>cred) && (cds>cps4)){
            MAS.setText("Prducto mas Vendido: "+ObjetoProductos.getDs()+cds);
        }  else {
            MAS.setText("DOS O MAS PRODUCTOS TIENEN LA MISMA CANTIDAD DE VENTAS");
        }
        
            
    
        
    }//GEN-LAST:event_COMPRARActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_SALIRActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton COMPRAR;
    private javax.swing.JLabel COMPRASS;
    private javax.swing.JButton DS;
    private javax.swing.JButton GOD;
    private javax.swing.JLabel MAS;
    private javax.swing.JButton ONES;
    private javax.swing.JButton ONEX;
    private javax.swing.JButton PS4;
    private javax.swing.JButton PSV;
    private javax.swing.JButton RED;
    private javax.swing.JButton SALIR;
    private javax.swing.JButton SWITCH;
    private javax.swing.JLabel TOTAL;
    private javax.swing.JButton ZELDA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane jTextPane10;
    private javax.swing.JTextPane jTextPane11;
    private javax.swing.JTextPane jTextPane12;
    private javax.swing.JTextPane jTextPane13;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    private javax.swing.JTextPane jTextPane9;
    private javax.swing.JList<String> jlista;
    // End of variables declaration//GEN-END:variables
}
