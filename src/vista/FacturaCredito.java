/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author edwin
 */
public class FacturaCredito extends javax.swing.JPanel {

    /**
     * Creates new form FacturaCredito
     */
    public FacturaCredito() {
        initComponents();
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
        jpanelEsquinasRedondas1 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas13 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas14 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas15 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        clienteFacturaContado4 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        direccionFacturaCredito = new javax.swing.JTextField();
        clienteFacturaCredito = new javax.swing.JTextField();
        jpanelEsquinasRedondas16 = new Estilos_panel.jpanelEsquinasRedondas();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableFacturaCredito = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        firmaFacturaCredito = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        totalFacturaCredito = new javax.swing.JTextField();

        jpanelEsquinasRedondas1.setBackground(new java.awt.Color(255, 255, 255));

        jpanelEsquinasRedondas13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelEsquinasRedondas14.setBackground(new java.awt.Color(217, 217, 246));

        jpanelEsquinasRedondas15.setBackground(new java.awt.Color(153, 153, 255));
        jpanelEsquinasRedondas15.setPreferredSize(new java.awt.Dimension(1018, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FACTURA AL CREDITO");

        javax.swing.GroupLayout jpanelEsquinasRedondas15Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas15);
        jpanelEsquinasRedondas15.setLayout(jpanelEsquinasRedondas15Layout);
        jpanelEsquinasRedondas15Layout.setHorizontalGroup(
            jpanelEsquinasRedondas15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas15Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelEsquinasRedondas15Layout.setVerticalGroup(
            jpanelEsquinasRedondas15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Fecha");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("No.");

        javax.swing.GroupLayout jpanelEsquinasRedondas14Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas14);
        jpanelEsquinasRedondas14.setLayout(jpanelEsquinasRedondas14Layout);
        jpanelEsquinasRedondas14Layout.setHorizontalGroup(
            jpanelEsquinasRedondas14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas15, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
            .addGroup(jpanelEsquinasRedondas14Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jpanelEsquinasRedondas14Layout.setVerticalGroup(
            jpanelEsquinasRedondas14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas14Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelEsquinasRedondas14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanelEsquinasRedondas13.add(jpanelEsquinasRedondas14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        clienteFacturaContado4.setForeground(new java.awt.Color(204, 204, 204));
        clienteFacturaContado4.setBorder(null);
        jpanelEsquinasRedondas13.add(clienteFacturaContado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 146, 191, 30));

        jPanel7.setBackground(new java.awt.Color(217, 217, 246));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Cliente (a)");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jpanelEsquinasRedondas13.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, -1, -1));

        jPanel8.setBackground(new java.awt.Color(217, 217, 246));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Direccion");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jpanelEsquinasRedondas13.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 182, -1, -1));

        direccionFacturaCredito.setForeground(new java.awt.Color(204, 204, 204));
        direccionFacturaCredito.setBorder(null);
        jpanelEsquinasRedondas13.add(direccionFacturaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 220, 191, 30));

        clienteFacturaCredito.setForeground(new java.awt.Color(204, 204, 204));
        clienteFacturaCredito.setBorder(null);
        jpanelEsquinasRedondas13.add(clienteFacturaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, 191, 30));

        tableFacturaCredito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tableFacturaCredito);

        javax.swing.GroupLayout jpanelEsquinasRedondas16Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas16);
        jpanelEsquinasRedondas16.setLayout(jpanelEsquinasRedondas16Layout);
        jpanelEsquinasRedondas16Layout.setHorizontalGroup(
            jpanelEsquinasRedondas16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );
        jpanelEsquinasRedondas16Layout.setVerticalGroup(
            jpanelEsquinasRedondas16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas16Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpanelEsquinasRedondas13.add(jpanelEsquinasRedondas16, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 114, -1, -1));

        jPanel9.setBackground(new java.awt.Color(217, 217, 246));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Firma");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel26)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jpanelEsquinasRedondas13.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 262, -1, -1));

        firmaFacturaCredito.setForeground(new java.awt.Color(204, 204, 204));
        firmaFacturaCredito.setBorder(null);
        firmaFacturaCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmaFacturaCreditoActionPerformed(evt);
            }
        });
        jpanelEsquinasRedondas13.add(firmaFacturaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 294, 191, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel27.setText("Total");
        jpanelEsquinasRedondas13.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 331, 40, -1));

        totalFacturaCredito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        totalFacturaCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFacturaCreditoActionPerformed(evt);
            }
        });
        jpanelEsquinasRedondas13.add(totalFacturaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 361, 100, 30));

        javax.swing.GroupLayout jpanelEsquinasRedondas1Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas1);
        jpanelEsquinasRedondas1.setLayout(jpanelEsquinasRedondas1Layout);
        jpanelEsquinasRedondas1Layout.setHorizontalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jpanelEsquinasRedondas13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(475, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas1Layout.setVerticalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelEsquinasRedondas13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        jScrollPane1.setViewportView(jpanelEsquinasRedondas1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firmaFacturaCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmaFacturaCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firmaFacturaCreditoActionPerformed

    private void totalFacturaCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFacturaCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFacturaCreditoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField clienteFacturaContado4;
    public javax.swing.JTextField clienteFacturaCredito;
    public javax.swing.JTextField direccionFacturaCredito;
    public javax.swing.JTextField firmaFacturaCredito;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas1;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas13;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas14;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas15;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas16;
    private javax.swing.JTable tableFacturaCredito;
    public javax.swing.JTextField totalFacturaCredito;
    // End of variables declaration//GEN-END:variables
}
